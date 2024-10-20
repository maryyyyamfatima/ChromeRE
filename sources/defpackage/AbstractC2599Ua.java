package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ua, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2599Ua {
    public static void a(int i, Uri uri) {
        if (uri == null) {
            return;
        }
        String uri2 = uri.toString();
        ActivityManager activityManager = (ActivityManager) V60.a.getSystemService("activity");
        ArrayList arrayList = new ArrayList();
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            ActivityManager.RecentTaskInfo d = d(appTask);
            if (d != null) {
                int i2 = d.id;
                Intent intent = d.baseIntent;
                if (TextUtils.equals(uri2, intent == null ? null : intent.getDataString()) && (i2 == -1 || i2 != i)) {
                    arrayList.add(appTask);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.AppTask appTask2 = (ActivityManager.AppTask) it.next();
            Objects.toString(appTask2);
            d(appTask2);
            appTask2.finishAndRemoveTask();
        }
    }

    public static ActivityManager.RecentTaskInfo d(ActivityManager.AppTask appTask) {
        try {
            return appTask.getTaskInfo();
        } catch (IllegalArgumentException e) {
            Log.e("DocumentUtilities", "Failed to retrieve task info: ", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashSet b(android.content.Context r5, java.util.HashSet r6) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getAppTasks()
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r2 = d(r1)
            if (r2 != 0) goto L28
            goto L15
        L28:
            android.app.ActivityManager$RecentTaskInfo r3 = d(r1)
            if (r3 != 0) goto L2f
            goto L4a
        L2f:
            android.content.Intent r3 = r3.baseIntent
            if (r3 != 0) goto L34
            goto L4a
        L34:
            android.content.ComponentName r4 = r3.getComponent()
            if (r4 == 0) goto L43
            android.content.ComponentName r3 = r3.getComponent()
            java.lang.String r3 = r3.getClassName()
            goto L50
        L43:
            r4 = 0
            android.content.pm.ResolveInfo r3 = defpackage.AbstractC3017Xf2.c(r3, r4)
            if (r3 != 0) goto L4c
        L4a:
            r3 = 0
            goto L50
        L4c:
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.name
        L50:
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L15
            android.util.Pair r1 = android.util.Pair.create(r1, r2)
            r0.add(r1)
            goto L15
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2599Ua.b(android.content.Context, java.util.HashSet):java.util.HashSet");
    }

    public static HashSet c(Activity activity, C11766yR c11766yR) {
        HashSet hashSet = new HashSet();
        List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) activity.getSystemService("activity")).getRecentTasks(100, 0);
        if (recentTasks != null) {
            for (ActivityManager.RecentTaskInfo recentTaskInfo : recentTasks) {
                ComponentName component = recentTaskInfo.baseIntent.getComponent();
                if (component != null && c11766yR.contains(component.getClassName()) && component.getPackageName().equals(activity.getPackageName())) {
                    hashSet.add(recentTaskInfo);
                }
            }
        }
        return hashSet;
    }
}
