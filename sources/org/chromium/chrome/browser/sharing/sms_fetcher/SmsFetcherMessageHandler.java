package org.chromium.chrome.browser.sharing.sms_fetcher;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.chrome.R;
import defpackage.AbstractC8192o0;
import defpackage.C1226Jl0;
import defpackage.C4705dr2;
import defpackage.C7928nE;
import defpackage.EI2;
import defpackage.R83;
import defpackage.UN;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SmsFetcherMessageHandler {
    public static long a;
    public static String b;
    public static String c;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class NotificationReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            boolean z = SmsFetcherMessageHandler.a == 0;
            EI2.b("Sharing.SmsFetcherTapWithChromeDestroyed", z);
            R83.a(15, "SmsFetcher");
            if (z) {
                return;
            }
            action.getClass();
            if (action.equals("sms_fetcher_notification.confirm")) {
                N.MXRanUGo(SmsFetcherMessageHandler.a, SmsFetcherMessageHandler.b, SmsFetcherMessageHandler.c);
            } else if (action.equals("sms_fetcher_notification.cancel")) {
                N.MOhxjMCQ(SmsFetcherMessageHandler.a, SmsFetcherMessageHandler.b, SmsFetcherMessageHandler.c);
            }
        }
    }

    public static void showNotification(String str, String str2, String str3, String str4, long j) {
        String string;
        String string2;
        String str5;
        b = str2;
        c = str3;
        a = j;
        Context context = V60.a;
        EI2.b("Sharing.SmsFetcherScreenOnAndUnlocked", C1226Jl0.c(context));
        C4705dr2 b2 = C4705dr2.b(context, 0, new Intent(context, (Class<?>) NotificationReceiver.class).setAction("sms_fetcher_notification.confirm"), 134217728, false);
        C4705dr2 b3 = C4705dr2.b(context, 0, new Intent(context, (Class<?>) NotificationReceiver.class).setAction("sms_fetcher_notification.cancel"), 134217728, false);
        context.getResources();
        Resources resources = V60.a.getResources();
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("WebOtpCrossDeviceSimpleString")) {
            string = resources.getString(R.string.f87420_resource_name_obfuscated_res_0x7f140a82, str, str4);
        } else if (str3 == null) {
            string = resources.getString(R.string.f87430_resource_name_obfuscated_res_0x7f140a83, str, str2);
        } else {
            string = resources.getString(R.string.f87430_resource_name_obfuscated_res_0x7f140a83, str, str3);
        }
        String str6 = string;
        Resources resources2 = V60.a.getResources();
        if (N.M09VlOh_("WebOtpCrossDeviceSimpleString")) {
            if (str3 == null) {
                str5 = str4;
                R83.b(29, "SmsFetcher", 15, null, b3, b2, b3, str6, str5, R.drawable.f47180_resource_name_obfuscated_res_0x7f0901d9, 0, R.color.f17700_resource_name_obfuscated_res_0x7f070112, false);
            }
            string2 = AbstractC8192o0.a(str2, " · ", str4);
        } else if (str3 == null) {
            string2 = resources2.getString(R.string.f87400_resource_name_obfuscated_res_0x7f140a80, str2);
        } else {
            string2 = resources2.getString(R.string.f87410_resource_name_obfuscated_res_0x7f140a81, str2, str3);
        }
        str5 = string2;
        R83.b(29, "SmsFetcher", 15, null, b3, b2, b3, str6, str5, R.drawable.f47180_resource_name_obfuscated_res_0x7f0901d9, 0, R.color.f17700_resource_name_obfuscated_res_0x7f070112, false);
    }

    public static void dismissNotification() {
        R83.a(15, "SmsFetcher");
    }

    public static void reset() {
        a = 0L;
        b = null;
        c = null;
    }
}
