package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import com.android.chrome.R;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import java.util.Iterator;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MP implements InterfaceC7371ld2 {
    public final /* synthetic */ NP a;

    public MP(NP np) {
        this.a = np;
    }

    @Override // defpackage.InterfaceC7371ld2
    public final void a(Object obj) {
        boolean z = ((GmsDeviceComplianceResponse) obj).g;
        final NP np = this.a;
        if (z) {
            np.getClass();
            EI2.h(1, 3, "Android.ChromeStartupDelegate.Result");
            return;
        }
        np.getClass();
        EI2.h(2, 3, "Android.ChromeStartupDelegate.Result");
        QF3 qf3 = AbstractC5103f04.c;
        PostTask.c(qf3, new Runnable() { // from class: JP
            @Override // java.lang.Runnable
            public final void run() {
                ZN3.b(R.string.f72090_resource_name_obfuscated_res_0x7f1403f4, 1, V60.a).d();
            }
        });
        PostTask.b(qf3, new Runnable() { // from class: KP
            @Override // java.lang.Runnable
            public final void run() {
                NP.this.getClass();
                ActivityManager activityManager = (ActivityManager) V60.a.getSystemService("activity");
                Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
                while (it.hasNext()) {
                    it.next().finishAndRemoveTask();
                }
                int myPid = Process.myPid();
                Iterator<ActivityManager.RunningAppProcessInfo> it2 = activityManager.getRunningAppProcesses().iterator();
                while (it2.hasNext()) {
                    int i = it2.next().pid;
                    if (i != myPid) {
                        Process.killProcess(i);
                    }
                }
                Process.killProcess(myPid);
            }
        }, 4000L);
    }
}
