package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class US2 extends SR2 {
    public final /* synthetic */ VS2 a;

    public US2(VS2 vs2) {
        this.a = vs2;
    }

    @Override // defpackage.SR2
    public final void f(int i) {
        Runnable runnable;
        BK3 bk3 = this.a.a;
        synchronized (bk3.j) {
            runnable = (Runnable) bk3.h.remove(Integer.valueOf(i));
        }
        if (runnable == null) {
            AbstractC4508dH1.e("unexpected sequence point " + i + " discarded");
            return;
        }
        AbstractC4508dH1.c("executing flush action for sequence point " + i);
        runnable.run();
    }
}
