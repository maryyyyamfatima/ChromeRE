package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class X13 implements Runnable {
    public final /* synthetic */ C3396a23 a;
    public final /* synthetic */ QB g;

    public /* synthetic */ X13(C3396a23 c3396a23, QB qb) {
        this.a = c3396a23;
        this.g = qb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3396a23 c3396a23 = this.a;
        Runnable runnable = c3396a23.c;
        if (runnable != null) {
            runnable.run();
            c3396a23.c = null;
        }
        m mVar = (m) this.g;
        mVar.o(c3396a23.e);
        mVar.l(c3396a23.f, true, 0);
    }
}
