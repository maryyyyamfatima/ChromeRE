package org.chromium.chrome.browser.share.send_tab_to_self;

import J.N;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.C4705dr2;
import defpackage.C6861k72;
import defpackage.C7893n72;
import defpackage.K62;
import defpackage.L72;
import defpackage.O83;
import defpackage.PO;
import defpackage.Q83;
import defpackage.U72;
import defpackage.V60;
import defpackage.W72;
import defpackage.X72;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationManager {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean hideNotification(java.lang.String r8) {
        /*
            K72 r0 = defpackage.L72.a(r8)
            r1 = 0
            if (r8 != 0) goto L8
            goto L10
        L8:
            Q83 r2 = defpackage.O83.a
            K72 r8 = defpackage.L72.a(r8)
            if (r8 != 0) goto L12
        L10:
            r8 = r1
            goto L50
        L12:
            r3 = 0
            java.lang.String r4 = "send_tab_to_self.notification.active"
            java.util.Set r3 = r2.k(r4, r3)
            if (r3 != 0) goto L21
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            goto L27
        L21:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            r3 = r5
        L27:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r8.c
            r5.append(r6)
            java.lang.String r6 = "_"
            r5.append(r6)
            int r7 = r8.a
            r5.append(r7)
            r5.append(r6)
            java.lang.String r8 = r8.b
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            boolean r8 = r3.remove(r8)
            if (r8 == 0) goto L50
            r2.u(r4, r3)
        L50:
            if (r8 != 0) goto L53
            return r1
        L53:
            android.content.Context r8 = defpackage.V60.a
            k72 r1 = new k72
            r1.<init>(r8)
            int r8 = r0.a
            java.lang.String r0 = "SendTabToSelf"
            r1.b(r8, r0)
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.share.send_tab_to_self.NotificationManager.hideNotification(java.lang.String):boolean");
    }

    public static boolean showNotification(String str, String str2, String str3, String str4, long j, Class cls) {
        HashSet hashSet;
        if (L72.a(str) != null) {
            return false;
        }
        Context context = V60.a;
        C6861k72 c6861k72 = new C6861k72(context);
        Q83 q83 = O83.a;
        int f = q83.f(-1, "send_tab_to_self.notification.next_id");
        if (f >= 2147483646) {
            f = -1;
        }
        int i = f + 1;
        q83.q(i, "send_tab_to_self.notification.next_id");
        Uri parse = Uri.parse(str2);
        C4705dr2 b = C4705dr2.b(context, i, new Intent(context, (Class<?>) cls).setData(parse).setAction("send_tab_to_self.tap").putExtra("send_tab_to_self.notification.guid", str), 0, false);
        C4705dr2 b2 = C4705dr2.b(context, i, new Intent(context, (Class<?>) cls).setData(parse).setAction("send_tab_to_self.dismiss").putExtra("send_tab_to_self.notification.guid", str), 0, false);
        String string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1409f4, parse.getHost(), str4);
        PO a = X72.a("sharing", new C7893n72(15, "SendTabToSelf", i));
        a.f(b);
        a.i(b2);
        K62 k62 = a.a;
        k62.f(str3);
        k62.e(string);
        k62.r = "SendTabToSelf";
        k62.k = 1;
        k62.E.vibrate = new long[0];
        a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        k62.g(-1);
        W72 d = a.d();
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(15, notification);
        Set k = q83.k("send_tab_to_self.notification.active", null);
        if (k == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(k);
        }
        if (hashSet.add("1_" + i + "_" + str)) {
            q83.u("send_tab_to_self.notification.active", hashSet);
        }
        if (j != Long.MAX_VALUE) {
            ((AlarmManager) context.getSystemService("alarm")).set(1, j, PendingIntent.getBroadcast(context, i, new Intent(context, (Class<?>) cls).setData(Uri.parse(str2)).setAction("send_tab_to_self.timeout").putExtra("send_tab_to_self.notification.guid", str), 134217728 | AbstractC2281Ro1.d(false)));
        }
        N.MMVA7qry();
        return true;
    }
}
