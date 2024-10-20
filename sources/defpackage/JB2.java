package defpackage;

import J.N;
import java.io.File;
import java.io.IOException;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;
import org.chromium.ui.base.SelectFileDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JB2 implements Runnable {
    public final /* synthetic */ RB2 a;

    @Override // java.lang.Runnable
    public final void run() {
        RB2 rb2 = this.a;
        rb2.getClass();
        GB2 gb2 = new GB2(rb2);
        ExecutorC11534xl executorC11534xl = AbstractC0185Bl.e;
        gb2.c(executorC11534xl);
        synchronized (AbstractC6717jj0.a) {
            if (AbstractC6717jj0.b == null) {
                C3969bj0 c3969bj0 = new C3969bj0();
                AbstractC6717jj0.b = c3969bj0;
                c3969bj0.c(executorC11534xl);
            }
        }
        N.MSOABg7U();
        PartnerBrowserCustomizations.b().g(new IB2());
        AbstractC0185Bl.f.execute(new P63());
        String[] strArr = SelectFileDialog.q;
        QF3 qf3 = QF3.h;
        PostTask.c(qf3, new Runnable() { // from class: v23
            @Override // java.lang.Runnable
            public final void run() {
                File[] listFiles;
                String[] strArr2 = SelectFileDialog.q;
                try {
                    File c = AbstractC8540p04.c(V60.a);
                    if (c.isDirectory() && (listFiles = c.listFiles()) != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        for (File file : listFiles) {
                            if (currentTimeMillis - file.lastModified() > SelectFileDialog.p && !file.delete()) {
                                AbstractC4851eH1.a("SelectFileDialog", "Failed to delete: " + file, new Object[0]);
                            }
                        }
                    }
                } catch (IOException e) {
                    AbstractC4851eH1.f("SelectFileDialog", "Failed to delete captured camera files.", e);
                }
            }
        });
        Object obj = VI.e;
        VI vi = UI.a;
        if (vi.c && vi.b.f(-1, "channels_version_key") != vi.d) {
            PostTask.b(qf3, new Runnable() { // from class: uB2
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj2 = VI.e;
                    UI.a.a();
                }
            }, 0L);
        }
    }

    public JB2(RB2 rb2) {
        this.a = rb2;
    }
}
