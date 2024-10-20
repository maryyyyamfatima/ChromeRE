package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class O13 implements Runnable {
    public final /* synthetic */ R13 a;
    public final /* synthetic */ UD2 g;
    public final /* synthetic */ QB h;

    public /* synthetic */ O13(R13 r13, UD2 ud2, QB qb) {
        this.a = r13;
        this.g = ud2;
        this.h = qb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R13 r13 = this.a;
        r13.getClass();
        this.g.b();
        m mVar = (m) this.h;
        mVar.o(r13.e);
        mVar.l(r13.f, true, 0);
    }
}
