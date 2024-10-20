package org.chromium.components.gcm_driver;

import J.N;
import android.content.SharedPreferences;
import android.os.SystemClock;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7156kz1;
import defpackage.C10763vW0;
import defpackage.C7432ln3;
import defpackage.C8019nW0;
import defpackage.C8363oW0;
import defpackage.C9391rW0;
import defpackage.K21;
import defpackage.QF3;
import defpackage.T60;
import defpackage.V60;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class GCMDriver {
    public static GCMDriver c;
    public long a;
    public final K21 b = new K21();

    public GCMDriver(long j) {
        this.a = j;
    }

    public final void replayPersistedMessages(String str) {
        C10763vW0[] c10763vW0Arr;
        HashSet hashSet = new HashSet(T60.a.getStringSet("subscriptions_with_persisted_messages", Collections.emptySet()));
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith(str)) {
                hashSet2.add(str2);
            }
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            try {
                JSONArray jSONArray = new JSONArray(V60.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0).getString(str3, "[]"));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        C10763vW0 a = C10763vW0.a(jSONArray.getJSONObject(i), new C9391rW0());
                        if (a == null) {
                            AbstractC4851eH1.a("LazySubscriptions", "Persisted GCM Message is invalid. Sender id:" + jSONArray.getJSONObject(i).optString("senderId", null), new Object[0]);
                        } else {
                            arrayList.add(a);
                        }
                    } catch (JSONException e) {
                        AbstractC4851eH1.a("LazySubscriptions", "Error when creating a GCMMessage from a JSONObject:" + e.getMessage(), new Object[0]);
                    }
                }
                c10763vW0Arr = (C10763vW0[]) arrayList.toArray(new C10763vW0[arrayList.size()]);
            } catch (JSONException unused) {
                AbstractC4851eH1.a("LazySubscriptions", AbstractC4809e90.a("Error when parsing the persisted message queue for subscriber:", str3), new Object[0]);
                c10763vW0Arr = new C10763vW0[0];
            }
            for (C10763vW0 c10763vW0 : c10763vW0Arr) {
                a(c10763vW0);
            }
            AbstractC7156kz1.b(str3);
        }
        final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        PostTask.c(QF3.h, new Runnable() { // from class: mW0
            @Override // java.lang.Runnable
            public final void run() {
                EI2.n(elapsedRealtime2, "PushMessaging.TimeToReadPersistedMessages");
            }
        });
    }

    public static GCMDriver create(long j) {
        if (c != null) {
            throw new IllegalStateException("Already instantiated");
        }
        c = new GCMDriver(j);
        SharedPreferences sharedPreferences = T60.a;
        if (sharedPreferences.getBoolean("has_persisted_messages", false)) {
            C7432ln3 c2 = C7432ln3.c();
            try {
                HashSet hashSet = new HashSet(V60.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0).getStringSet("fcm_lazy_subscriptions", Collections.emptySet()));
                c2.close();
                sharedPreferences.edit().putStringSet("subscriptions_with_persisted_messages", hashSet).apply();
                sharedPreferences.edit().remove("has_persisted_messages").apply();
            } catch (Throwable th) {
                try {
                    c2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        return c;
    }

    public final void destroy() {
        c = null;
        this.a = 0L;
    }

    public final void register(String str, String str2) {
        new C8019nW0(this, str, str2).c(AbstractC0185Bl.e);
    }

    public final void unregister(String str, String str2) {
        new C8363oW0(this, str, str2).c(AbstractC0185Bl.e);
    }

    public static void a(C10763vW0 c10763vW0) {
        Object obj = ThreadUtils.a;
        GCMDriver gCMDriver = c;
        if (gCMDriver == null) {
            throw new RuntimeException("Failed to instantiate GCMDriver.");
        }
        N.M6eL4wmM(gCMDriver.a, gCMDriver, c10763vW0.b, c10763vW0.a, c10763vW0.c, c10763vW0.d, c10763vW0.e, c10763vW0.g);
    }
}
