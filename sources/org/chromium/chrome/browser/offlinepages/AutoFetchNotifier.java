package org.chromium.chrome.browser.offlinepages;

import J.N;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.chrome.R;
import defpackage.AbstractC2217Rb2;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.C1761No1;
import defpackage.C4705dr2;
import defpackage.C6861k72;
import defpackage.C7629mN;
import defpackage.C7893n72;
import defpackage.EI2;
import defpackage.K62;
import defpackage.O83;
import defpackage.PO;
import defpackage.Q83;
import defpackage.U72;
import defpackage.V60;
import defpackage.W72;
import defpackage.X72;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.offlinepages.AutoFetchNotifier;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutoFetchNotifier {
    public static boolean autoFetchInProgressNotificationCanceled() {
        return O83.a.f(5, "offline_auto_fetch_user_cancel_action_in_progress") != 5;
    }

    public static void cancellationComplete() {
        Q83 q83 = O83.a;
        int f = q83.f(5, "offline_auto_fetch_user_cancel_action_in_progress");
        if (f == 5) {
            return;
        }
        EI2.h(f, 5, "OfflinePages.AutoFetch.InProgressNotificationAction");
        q83.m("offline_auto_fetch_user_cancel_action_in_progress");
    }

    public static void updateInProgressNotificationCountIfShowing(int i) {
        if (i == 0) {
            Q83 q83 = O83.a;
            if (q83.e("offline_auto_fetch_showing_in_progress", false)) {
                EI2.h(1, 5, "OfflinePages.AutoFetch.InProgressNotificationAction");
            }
            ((NotificationManager) V60.a.getSystemService("notification")).cancel("OfflinePageAutoFetchInProgressNotification", 0);
            q83.p("offline_auto_fetch_showing_in_progress", false);
            return;
        }
        if (O83.a.e("offline_auto_fetch_showing_in_progress", false)) {
            showInProgressNotification(i);
        }
    }

    public static void showInProgressNotification(int i) {
        Context context = V60.a;
        Intent intent = new Intent(context, (Class<?>) InProgressCancelReceiver.class);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("notification_action", 2);
        intent.setPackage(context.getPackageName());
        Intent intent2 = new Intent(context, (Class<?>) InProgressCancelReceiver.class);
        intent2.putExtra("com.android.browser.application_id", context.getPackageName());
        intent2.putExtra("notification_action", 3);
        intent2.setPackage(context.getPackageName());
        String quantityString = context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120025, i);
        PO a = X72.a("downloads", new C7893n72(14, "OfflinePageAutoFetchInProgressNotification", 0));
        a.a.f(quantityString);
        K62 k62 = a.a;
        k62.r = "OfflinePageAutoFetchNotification";
        k62.k = -1;
        a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        a.a(0, context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4), C4705dr2.b(context, 0, intent, 0, false), 16);
        a.i(C4705dr2.b(context, 0, intent2, 0, false));
        C6861k72 c6861k72 = new C6861k72(context);
        W72 d = a.d();
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(14, notification);
        EI2.h(0, 5, "OfflinePages.AutoFetch.InProgressNotificationAction");
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class InProgressCancelReceiver extends BroadcastReceiver {
        public static final /* synthetic */ int a = 0;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int p = AbstractC2281Ro1.p(5, intent, "notification_action");
            if (p == 2 || p == 3) {
                Q83 q83 = O83.a;
                q83.q(p, "offline_auto_fetch_user_cancel_action_in_progress");
                C7629mN.a().f(new Runnable() { // from class: Cn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = AutoFetchNotifier.InProgressCancelReceiver.a;
                        N.MytEgqET(Profile.d());
                    }
                });
                ((NotificationManager) V60.a.getSystemService("notification")).cancel("OfflinePageAutoFetchInProgressNotification", 0);
                q83.p("offline_auto_fetch_showing_in_progress", false);
            }
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class CompleteNotificationReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int p = AbstractC2281Ro1.p(5, intent, "notification_action");
            if (p == 4 || p == 3) {
                EI2.h(p, 5, "OfflinePages.AutoFetch.CompleteNotificationAction");
                if (p != 4) {
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.offlinepages.URL")));
                intent2.putExtras(intent);
                intent2.setPackage(context.getPackageName());
                intent2.setFlags(268435456);
                C1761No1.y(null, intent2, null);
            }
        }
    }

    public static void showCompleteNotification(final String str, final String str2, final String str3, final int i, final long j) {
        AbstractC2217Rb2.b(j, 1, new Callback() { // from class: Bn
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Context context = V60.a;
                Intent intent = new Intent(context, (Class<?>) AutoFetchNotifier.CompleteNotificationReceiver.class);
                intent.putExtra("org.chromium.chrome.browser.offlinepages.URL", str3);
                intent.putExtra("REUSE_TAB_ORIGINAL_URL", str2);
                C1761No1.w(((LoadUrlParams) obj).f, intent);
                intent.putExtra("REUSE_TAB_MATCHING_ID", i);
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                intent.putExtra("notification_action", 4);
                intent.putExtra("org.chromium.chrome.browser.tab_launch_type", 2);
                intent.setPackage(context.getPackageName());
                int i2 = (int) j;
                C4705dr2 b = C4705dr2.b(context, i2, intent, 0, false);
                Intent intent2 = new Intent(context, (Class<?>) AutoFetchNotifier.CompleteNotificationReceiver.class);
                intent2.putExtra("com.android.browser.application_id", context.getPackageName());
                intent2.putExtra("notification_action", 3);
                intent2.setPackage(context.getPackageName());
                PO a = X72.a("downloads", new C7893n72(14, "OfflinePageAutoFetchNotification", i2));
                a.a.d(true);
                a.f(b);
                String str4 = str;
                K62 k62 = a.a;
                k62.f(str4);
                k62.e(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140715));
                k62.r = "OfflinePageAutoFetchNotification";
                k62.k = -1;
                a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
                a.i(C4705dr2.b(context, 0, intent2, 0, false));
                W72 d = a.d();
                C6861k72 c6861k72 = new C6861k72(context);
                Notification notification = d.a;
                if (notification == null) {
                    AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
                } else {
                    C7893n72 c7893n72 = d.b;
                    c6861k72.c(c7893n72.b, c7893n72.c, notification);
                }
                U72.a.b(14, notification);
                EI2.h(0, 5, "OfflinePages.AutoFetch.CompleteNotificationAction");
            }
        }, Profile.d());
    }
}
