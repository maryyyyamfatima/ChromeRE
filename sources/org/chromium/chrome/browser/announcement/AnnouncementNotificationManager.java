package org.chromium.chrome.browser.announcement;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import defpackage.AbstractC10385uP0;
import defpackage.AbstractC4851eH1;
import defpackage.C1310Kc;
import defpackage.C4705dr2;
import defpackage.C6861k72;
import defpackage.C7629mN;
import defpackage.C7893n72;
import defpackage.K62;
import defpackage.PO;
import defpackage.U72;
import defpackage.V60;
import defpackage.W72;
import defpackage.X72;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AnnouncementNotificationManager {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C1310Kc c1310Kc = new C1310Kc(intent, context);
            C7629mN.a().c(c1310Kc);
            C7629mN.a().b(true, c1310Kc);
        }
    }

    public static void showNotification(String str) {
        Context context = V60.a;
        PO a = X72.a("announcement", new C7893n72(21, "announcement_notification", 100));
        a.a.f(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b40));
        a.f(a(1, context, str));
        a.i(a(2, context, str));
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b3e);
        K62 k62 = a.a;
        k62.e(string);
        a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        k62.l = false;
        k62.d(true);
        k62.t = true;
        a.a(0, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b3d), a(3, context, str), 13);
        a.a(0, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b3f), a(4, context, str), 14);
        C6861k72 c6861k72 = new C6861k72(context);
        W72 d = a.d();
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(21, notification);
    }

    public static C4705dr2 a(int i, Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) Receiver.class);
        intent.putExtra("org.chromium.chrome.browser.announcement.EXTRA_INTENT_TYPE", i);
        intent.putExtra("org.chromium.chrome.browser.announcement.EXTRA_URL", str);
        return C4705dr2.b(context, i, intent, 134217728, false);
    }

    public static boolean isFirstRun() {
        return !AbstractC10385uP0.a() || AbstractC10385uP0.a;
    }
}
