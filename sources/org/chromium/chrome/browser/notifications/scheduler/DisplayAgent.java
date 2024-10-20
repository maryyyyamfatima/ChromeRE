package org.chromium.chrome.browser.notifications.scheduler;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.C1376Kp0;
import defpackage.C1506Lp0;
import defpackage.C1635Mp0;
import defpackage.C4705dr2;
import defpackage.C6861k72;
import defpackage.C7629mN;
import defpackage.C7893n72;
import defpackage.PO;
import defpackage.U72;
import defpackage.V60;
import defpackage.W72;
import defpackage.X72;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DisplayAgent {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class NotificationData {
        public final String a;
        public final String b;
        public final HashMap c = new HashMap();
        public final ArrayList d = new ArrayList();

        public NotificationData(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static void addButton(NotificationData notificationData, String str, int i, String str2) {
        notificationData.d.add(new C1376Kp0(i, str, str2));
    }

    public static void addIcon(NotificationData notificationData, int i, Bitmap bitmap, int i2) {
        if (i2 != 0) {
            notificationData.c.put(Integer.valueOf(i), new C1506Lp0(i2));
        } else {
            notificationData.c.put(Integer.valueOf(i), new C1506Lp0(bitmap));
        }
    }

    public static NotificationData buildNotificationData(String str, String str2) {
        return new NotificationData(str, str2);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class SystemData {
        public final int a;
        public final String b;

        public SystemData(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public static SystemData buildSystemData(int i, String str) {
        return new SystemData(i, str);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C1635Mp0 c1635Mp0 = new C1635Mp0(intent);
            C7629mN.a().c(c1635Mp0);
            C7629mN.a().b(true, c1635Mp0);
        }
    }

    public static void showNotification(NotificationData notificationData, SystemData systemData) {
        int i = systemData.a;
        String str = i == 5 ? "chrome_tips" : "browser";
        int i2 = i == 5 ? 34 : -1;
        Context context = V60.a;
        String str2 = systemData.b;
        PO a = X72.a(str, new C7893n72(i2, "NotificationSchedulerDisplayAgent", str2.hashCode()));
        a.h(notificationData.a);
        a.g(notificationData.b);
        HashMap hashMap = notificationData.c;
        boolean containsKey = hashMap.containsKey(1);
        if (containsKey && ((C1506Lp0) hashMap.get(1)).a != null) {
            a.m(Icon.createWithBitmap(((C1506Lp0) hashMap.get(1)).a));
        } else {
            a.l((!containsKey || ((C1506Lp0) hashMap.get(1)).b == 0) ? R.drawable.0_resource_name_obfuscated_res_0x7f0901d9 : ((C1506Lp0) hashMap.get(1)).b);
        }
        if (hashMap.containsKey(2) && ((C1506Lp0) hashMap.get(2)).a != null) {
            a.j(((C1506Lp0) hashMap.get(2)).a);
        }
        Intent a2 = a(context, 0, systemData);
        int hashCode = str2.hashCode();
        a.f(C4705dr2.b(context, (hashCode * 31) + 0 + hashCode, a2, 134217728, false));
        Intent a3 = a(context, 2, systemData);
        int hashCode2 = str2.hashCode();
        a.i(C4705dr2.b(context, (hashCode2 * 31) + 2 + hashCode2, a3, 134217728, false));
        int i3 = 0;
        while (true) {
            ArrayList arrayList = notificationData.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            C1376Kp0 c1376Kp0 = (C1376Kp0) arrayList.get(i3);
            Intent a4 = a(context, 1, systemData);
            a4.putExtra("org.chromium.chrome.browser.notifications.scheduler.EXTRA_ACTION_BUTTON_TYPE", c1376Kp0.b);
            a4.putExtra("org.chromium.chrome.browser.notifications.scheduler.EXTRA_ACTION_BUTTON_ID", c1376Kp0.c);
            int hashCode3 = str2.hashCode();
            a.a(0, c1376Kp0.a, C4705dr2.b(context, (hashCode3 * 31) + 1 + hashCode3, a4, 134217728, false), -1);
            i3++;
        }
        W72 d = a.d();
        C6861k72 c6861k72 = new C6861k72(V60.a);
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(i2, notification);
    }

    public static Intent a(Context context, int i, SystemData systemData) {
        Intent intent = new Intent(context, (Class<?>) Receiver.class);
        intent.putExtra("org.chromium.chrome.browser.notifications.scheduler.EXTRA_INTENT_TYPE", i);
        intent.putExtra("org.chromium.chrome.browser.notifications.scheduler.EXTRA_SCHEDULER_CLIENT_TYPE ", systemData.a);
        intent.putExtra("org.chromium.chrome.browser.notifications.scheduler.EXTRA_GUID", systemData.b);
        return intent;
    }
}
