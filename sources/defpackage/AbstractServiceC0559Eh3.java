package defpackage;

import android.content.Context;
import org.chromium.base.BundleUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTaskScheduler;
import org.chromium.chrome.browser.offlinepages.TriggerConditions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0559Eh3 extends AX0 {
    public final String m = "yM";
    public C11741yM n;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        C11741yM c11741yM = (C11741yM) BundleUtils.e(b, this.m);
        this.n = c11741yM;
        c11741yM.a = this;
        super.attachBaseContext(b);
    }

    @Override // defpackage.AX0
    public final int c(LF3 lf3) {
        final C11741yM c11741yM = this.n;
        c11741yM.getClass();
        final AbstractServiceC0559Eh3 abstractServiceC0559Eh3 = c11741yM.a;
        QF3 qf3 = AbstractC5103f04.a;
        final String str = lf3.a;
        PostTask.d(qf3, new Runnable(str, abstractServiceC0559Eh3) { // from class: xM
            public final /* synthetic */ String g;

            @Override // java.lang.Runnable
            public final void run() {
                char c;
                C11741yM.this.getClass();
                String str2 = this.g;
                str2.getClass();
                int hashCode = str2.hashCode();
                if (hashCode == 694178979) {
                    if (str2.equals("BackgroundSync Event")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 694350810) {
                    if (hashCode == 902055135 && str2.equals("OfflinePageUtils")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str2.equals("Servicification Startup Task")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    BackgroundSyncBackgroundTaskScheduler.getInstance().scheduleOneOffTask(0, 360000L);
                    return;
                }
                if (c == 1) {
                    AbstractC4851eH1.d("BackgroundService", "Launching browser", new Object[0]);
                    C7629mN.a().d(false);
                } else if (c == 2) {
                    AbstractC1779Ns.a(new TriggerConditions(0, false, false), 300000L, false);
                } else {
                    AbstractC4851eH1.d("BackgroundService", "Unknown task tag ".concat(str2), new Object[0]);
                }
            }
        });
        return 0;
    }

    @Override // defpackage.AX0
    public final void b() {
        this.n.getClass();
        BackgroundSyncBackgroundTaskScheduler.getInstance().scheduleOneOffTask(0, 360000L);
    }
}
