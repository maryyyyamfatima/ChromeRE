package defpackage;

import java.io.File;
import org.chromium.chrome.browser.crash.MinidumpUploadServiceImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oX1 */
/* loaded from: classes2.dex */
public final class RunnableC8369oX1 implements Runnable {
    public final C9055qX1 a;
    public final /* synthetic */ C8712pX1 g;

    public RunnableC8369oX1(C8712pX1 c8712pX1, C9055qX1 c9055qX1) {
        this.g = c8712pX1;
        this.a = c9055qX1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File cacheDir = ((KO) this.g.a).a.getCacheDir();
        if (!cacheDir.isDirectory()) {
            AbstractC4851eH1.a("MDUploadJobImpl", "Parent crash directory doesn't exist!", new Object[0]);
            this.a.a(false);
            return;
        }
        this.g.getClass();
        C0781Ga0 c0781Ga0 = new C0781Ga0(cacheDir);
        if (!c0781Ga0.d().isDirectory()) {
            AbstractC4851eH1.a("MDUploadJobImpl", "Crash directory doesn't exist!", new Object[0]);
            this.a.a(false);
            return;
        }
        File[] e = c0781Ga0.e();
        AbstractC4851eH1.d("MDUploadJobImpl", "Attempting to upload %d minidumps.", Integer.valueOf(e.length));
        for (File file : e) {
            AbstractC4851eH1.d("MDUploadJobImpl", "Attempting to upload " + file.getName(), new Object[0]);
            C8712pX1 c8712pX1 = this.g;
            File file2 = new File(c0781Ga0.d(), "uploads.log");
            KO ko = (KO) c8712pX1.a;
            ko.getClass();
            int intValue = new CallableC8025nX1(file, file2, new JO(ko)).call().intValue();
            if (intValue == 0) {
                ((KO) this.g.a).getClass();
                MinidumpUploadServiceImpl.e(file.getAbsolutePath());
            } else if (intValue == 1) {
                int h = C0781Ga0.h(file.getName());
                if (h < 0) {
                    h = 0;
                }
                if (h + 1 == 3) {
                    ((KO) this.g.a).getClass();
                    MinidumpUploadServiceImpl.d(file.getAbsolutePath());
                }
            }
            if (this.g.b) {
                return;
            }
            if (intValue == 1 && C0781Ga0.j(file) == null) {
                AbstractC4851eH1.f("MDUploadJobImpl", TM0.a("Failed to increment attempt number of ", file), new Object[0]);
            }
        }
        c0781Ga0.a();
        this.a.a(c0781Ga0.e().length > 0);
    }
}
