package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import org.chromium.base.BundleUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.services.gcm.GCMBackgroundService;
import org.chromium.components.background_task_scheduler.TaskInfo;
import org.chromium.components.gcm_driver.GCMDriver;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0429Dh3 extends FirebaseMessagingService {
    public final String l = "YN";
    public YN m;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        YN yn = (YN) BundleUtils.e(b, this.l);
        this.m = yn;
        yn.getClass();
        super.attachBaseContext(b);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.m.getClass();
        RB2.a().e();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e() {
        this.m.getClass();
        EI2.h(0, 4, "Invalidations.GCMUpstreamRequest");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void g(String str, C11986z33 c11986z33) {
        this.m.getClass();
        AbstractC4851eH1.f("ChromeGcmListener", "Error in sending message. Message id: %s", str, c11986z33);
        EI2.h(3, 4, "Invalidations.GCMUpstreamRequest");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c() {
        this.m.getClass();
        AbstractC4851eH1.f("ChromeGcmListener", "Push messages were deleted, but we can't tell the Service Worker as we don'tknow what subtype (app ID) it occurred for.", new Object[0]);
        EI2.c(0, "GCM.DeletedMessagesReceived");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void f() {
        this.m.getClass();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(RemoteMessage remoteMessage) {
        Bundle bundle = remoteMessage.a;
        final String string = bundle.getString("from");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        final Bundle extras = intent.getExtras();
        this.m.getClass();
        boolean z = !TextUtils.isEmpty(extras.getString("collapse_key"));
        EI2.b("GCM.DataMessageReceivedHasRegisteredApp", true);
        EI2.e(1, "GCM.DataMessageReceived");
        EI2.b("GCM.DataMessageReceivedHasCollapseKey", z);
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: XN
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                boolean z3 = false;
                try {
                    C10763vW0 c10763vW0 = new C10763vW0(string, extras);
                    String str = c10763vW0.b;
                    Object obj = ThreadUtils.a;
                    if (str.startsWith("wp:")) {
                        boolean isDeviceIdleMode = ((PowerManager) V60.a.getSystemService("power")).isDeviceIdleMode();
                        int i = c10763vW0.b() == 2 ? 1 : 0;
                        if (isDeviceIdleMode) {
                            i = i != 0 ? 3 : 2;
                        }
                        EI2.h(i, 4, "GCM.WebPushReceived.DeviceState");
                    }
                    boolean z4 = C7629mN.a().f;
                    String str2 = c10763vW0.a;
                    if (z4) {
                        z2 = false;
                    } else {
                        String a = AbstractC7156kz1.a(str, str2);
                        z2 = AbstractC7156kz1.d(a) && !(c10763vW0.b() == 2);
                        if (z2) {
                            SharedPreferences sharedPreferences = V60.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0);
                            try {
                                JSONArray jSONArray = new JSONArray(sharedPreferences.getString(a, "[]"));
                                String str3 = c10763vW0.d;
                                if (str3 != null) {
                                    jSONArray = AbstractC7156kz1.c(jSONArray, str3);
                                }
                                if (jSONArray.length() == 3) {
                                    AbstractC4851eH1.f("LazySubscriptions", "Dropping GCM Message due queue size limit. Sender id:" + jSONArray.getJSONObject(0).optString("senderId", null), new Object[0]);
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (int i2 = 1; i2 < 3; i2++) {
                                        jSONArray2.put(jSONArray.get(i2));
                                    }
                                    jSONArray = jSONArray2;
                                }
                                jSONArray.put((JSONObject) c10763vW0.c(new C9734sW0()));
                                sharedPreferences.edit().putString(a, jSONArray.toString()).apply();
                                AbstractC7156kz1.e(a, true);
                            } catch (JSONException e) {
                                AbstractC4851eH1.a("LazySubscriptions", "Error when parsing the persisted message queue for subscriber:" + a + ":" + e.getMessage(), new Object[0]);
                            }
                        }
                    }
                    if (z2) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        Object obj2 = ThreadUtils.a;
                        C7629mN.a().d(false);
                        GCMDriver.a(c10763vW0);
                        return;
                    }
                    if (c10763vW0.b() == 2) {
                        String a2 = AbstractC7848n0.a(str, str2);
                        C7432ln3 c = C7432ln3.c();
                        try {
                            boolean z5 = (V60.a.getSharedPreferences("org.chromium.components.gcm_driver.subscription_flags", 0).getInt(a2, 0) & 2) == 2;
                            c.close();
                            if (z5) {
                                try {
                                    Context context = V60.a;
                                    Intent intent2 = new Intent(context, (Class<?>) GCMBackgroundService.class);
                                    intent2.putExtras((Bundle) c10763vW0.c(new C9049qW0()));
                                    context.startService(intent2);
                                    z3 = true;
                                } catch (IllegalStateException e2) {
                                    AbstractC4851eH1.a("ChromeGcmListener", "Could not start background service", e2);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                c.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    if (z3) {
                        return;
                    }
                    EF3 ef3 = new EF3();
                    ef3.b = 0L;
                    FF3 ff3 = new FF3(ef3);
                    BF3 bf3 = new BF3(1);
                    bf3.g = ff3;
                    bf3.b = (Bundle) c10763vW0.c(new C9049qW0());
                    AbstractC7808mt.b().b(V60.a, new TaskInfo(bf3));
                } catch (IllegalArgumentException e3) {
                    AbstractC4851eH1.a("ChromeGcmListener", "Received an invalid GCM Message", e3);
                }
            }
        });
    }
}
