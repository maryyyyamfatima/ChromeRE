package org.chromium.chrome.browser.download.service;

import defpackage.AbstractC7808mt;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadTaskScheduler {
    public static void cancelTask(int i) {
        AbstractC7808mt.b().a(V60.a, i != 0 ? i != 1 ? i != 2 ? i != 3 ? -1 : 57 : 56 : 54 : 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:            if (r8 != 3) goto L94;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void scheduleTask(int r8, boolean r9, boolean r10, int r11, long r12, long r14) {
        /*
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "extra_task_type"
            r0.putInt(r1, r8)
            java.lang.String r1 = "extra_optimal_battery_percentage"
            r0.putInt(r1, r11)
            java.lang.String r11 = "extra_battery_requires_charging"
            r0.putBoolean(r11, r10)
            rt r11 = defpackage.AbstractC7808mt.b()
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r8 == 0) goto L2f
            if (r8 == r4) goto L2c
            if (r8 == r3) goto L29
            if (r8 == r2) goto L26
            r5 = r1
            goto L31
        L26:
            r5 = 57
            goto L31
        L29:
            r5 = 56
            goto L31
        L2c:
            r5 = 54
            goto L31
        L2f:
            r5 = 53
        L31:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r6
            long r14 = r14 * r6
            BF3 r12 = org.chromium.components.background_task_scheduler.TaskInfo.a(r5, r12, r14)
            if (r8 == 0) goto L46
            if (r8 == r4) goto L44
            if (r8 == r3) goto L46
            if (r8 == r2) goto L42
            goto L49
        L42:
            r1 = r4
            goto L49
        L44:
            r1 = 0
            goto L49
        L46:
            if (r9 == 0) goto L42
            r1 = r3
        L49:
            r12.c = r1
            r12.d = r10
            r12.f = r4
            r12.e = r4
            r12.b = r0
            org.chromium.components.background_task_scheduler.TaskInfo r8 = new org.chromium.components.background_task_scheduler.TaskInfo
            r8.<init>(r12)
            android.content.Context r9 = defpackage.V60.a
            r11.b(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.download.service.DownloadTaskScheduler.scheduleTask(int, boolean, boolean, int, long, long):void");
    }
}
