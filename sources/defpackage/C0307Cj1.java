package defpackage;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.util.Pair;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0307Cj1 extends AbstractC0819Gh3 {
    @Override // defpackage.AbstractC0819Gh3
    public final void a(Intent intent) {
        PostTask.f(AbstractC5103f04.a, new RunnableC12210zj1());
        File[] listFiles = OA3.a().listFiles();
        boolean z = true;
        if (listFiles != null) {
            boolean z2 = true;
            for (File file : listFiles) {
                Pair b = QA3.b(file.getName());
                if ((b != null && ((Boolean) b.second).booleanValue()) && !((z2 = z2 & file.delete()))) {
                    AbstractC4851eH1.a("IncognitoFileDelete", "File " + file.getAbsolutePath() + " deletion unsuccessful.", new Object[0]);
                }
            }
            z = z2;
        }
        EI2.b("Android.IncognitoNotification.FileNotDeleted", !z);
        if (z) {
            QF3 qf3 = AbstractC5103f04.a;
            PostTask.f(qf3, new Runnable() { // from class: Aj1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AbstractC11530xk1.b()) {
                        return;
                    }
                    AbstractC11524xj1.a();
                    if (RC.a().e()) {
                        Profile d = Profile.d();
                        if (N.MrGvO7pv(d.b, d)) {
                            Profile f = Profile.d().f(false);
                            N.MScIZBOB(f.b, f);
                        }
                    }
                }
            });
            PostTask.f(qf3, new Runnable() { // from class: Bj1
                @Override // java.lang.Runnable
                public final void run() {
                    C0307Cj1.this.getClass();
                    HashSet hashSet = new HashSet();
                    Iterator it = ApplicationStatus.b().iterator();
                    while (it.hasNext()) {
                        Activity activity = (Activity) it.next();
                        int c = ApplicationStatus.c(activity);
                        if (c != 5 && c != 6) {
                            hashSet.add(Integer.valueOf(activity.getTaskId()));
                        }
                    }
                    HashSet hashSet2 = new HashSet(ChromeTabbedActivity.N1);
                    hashSet2.add(ChromeLauncherActivity.class.getName());
                    Iterator it2 = AbstractC2599Ua.b(V60.a, hashSet2).iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        if (!hashSet.contains(Integer.valueOf(((ActivityManager.RecentTaskInfo) pair.second).id))) {
                            ((ActivityManager.AppTask) pair.first).finishAndRemoveTask();
                        }
                    }
                }
            });
        }
    }
}
