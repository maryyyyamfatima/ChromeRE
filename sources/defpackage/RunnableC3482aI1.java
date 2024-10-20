package defpackage;

import java.io.File;
import org.chromium.chrome.browser.crash.MinidumpUploadServiceImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aI1 */
/* loaded from: classes.dex */
public final class RunnableC3482aI1 implements Runnable {
    public final File a;
    public final ZH1 g;

    public RunnableC3482aI1(File file) {
        ZH1 zh1 = new ZH1();
        this.a = file;
        this.g = zh1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0781Ga0 c0781Ga0 = new C0781Ga0(V60.a.getCacheDir());
        this.g.getClass();
        ZH1.a(this.a, c0781Ga0);
        try {
            MinidumpUploadServiceImpl.f();
        } catch (SecurityException e) {
            AbstractC4851eH1.f("LogcatExtraction", e.toString(), new Object[0]);
            throw e;
        }
    }
}
