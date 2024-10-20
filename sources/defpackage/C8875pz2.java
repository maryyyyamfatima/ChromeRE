package defpackage;

import J.N;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.price_tracking.PriceDropNotificationManagerImpl$DismissNotificationChromeActivity;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pz2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8875pz2 implements InterfaceC6813jz2 {
    public final Context a;
    public final InterfaceC7205l72 b;
    public final Q83 c = O83.a;

    public C8875pz2(Context context, C7549m72 c7549m72) {
        this.a = context;
        this.b = c7549m72;
    }

    public final Intent c(int i, String str) {
        Intent data = new Intent().setAction("android.intent.action.VIEW").setData(Uri.parse(str));
        Context context = this.a;
        Intent putExtra = data.setClass(context, PriceDropNotificationManagerImpl$DismissNotificationChromeActivity.class).addFlags(268959744).putExtra("com.android.browser.application_id", context.getPackageName()).putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true).putExtra("org.chromium.chrome.browser.price_tracking.NOTIFICATION_ID", i);
        AbstractC2281Ro1.a(putExtra);
        return putExtra;
    }

    public final boolean a() {
        return ((C7549m72) this.b).a.a();
    }

    public final void d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            b();
        }
        Intent intent = new Intent();
        Context context = this.a;
        if (i >= 26) {
            if (a()) {
                intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", "shopping_price_drop_alerts");
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            }
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
        AbstractC2077Pz2.a.p("Chrome.PriceTracking.PriceAlerts", false);
    }

    public final void b() {
        NotificationChannel notificationChannel;
        InterfaceC7205l72 interfaceC7205l72 = this.b;
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = ((C7549m72) interfaceC7205l72).a;
        if (i < 26) {
            c6861k72.getClass();
            notificationChannel = null;
        } else {
            notificationChannel = c6861k72.b.getNotificationChannel("shopping_price_drop_alerts");
        }
        if (notificationChannel != null) {
            return;
        }
        new TI(interfaceC7205l72, this.a.getResources()).a(Collections.emptyList(), Collections.singletonList("shopping_price_drop_alerts"));
    }

    public final int e(int i, boolean z) {
        Q83 q83 = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        JSONArray jSONArray = new JSONArray();
        String str = "";
        try {
            if (i == 32) {
                str = q83.i("Chrome.PriceTracking.ChromeManagedNotificationsTimestamps", "");
            } else if (i == 33) {
                str = q83.i("Chrome.PriceTracking.UserManagedNotificationsTimestamps", "");
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                long j = jSONArray2.getLong(i2);
                long j2 = currentTimeMillis - j;
                int millis = (int) TimeUnit.DAYS.toMillis(1L);
                if (AbstractC8293oI0.a()) {
                    C7928nE c7928nE = UN.a;
                    millis = N.M37SqSAy("CommercePriceTracking", "notification_timestamps_store_window_ms", millis);
                }
                if (j2 <= millis) {
                    jSONArray.put(j);
                }
            }
        } catch (JSONException e) {
            AbstractC4851eH1.a("PriceDropNotif", String.format(Locale.US, "Failed to parse notification timestamps. Details: %s", e.getMessage()), new Object[0]);
            jSONArray = new JSONArray();
        }
        if (z) {
            jSONArray.put(currentTimeMillis);
        }
        String jSONArray3 = jSONArray.toString();
        if (i == 32) {
            q83.t("Chrome.PriceTracking.ChromeManagedNotificationsTimestamps", jSONArray3);
        } else if (i == 33) {
            q83.t("Chrome.PriceTracking.UserManagedNotificationsTimestamps", jSONArray3);
        }
        return jSONArray.length();
    }
}
