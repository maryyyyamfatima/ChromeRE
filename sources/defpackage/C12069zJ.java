package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zJ */
/* loaded from: classes.dex */
public final class C12069zJ extends AbstractC11241wt1 {
    public final NF j;

    @Override // defpackage.InterfaceC7670mV0
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        m((Throwable) obj);
        return C8546p14.a;
    }

    public C12069zJ(NF nf) {
        this.j = nf;
    }

    @Override // defpackage.AbstractC0097At1
    public final void m(Throwable th) {
        InterfaceC7447lq0 interfaceC7447lq0;
        C0617Et1 l = l();
        NF nf = this.j;
        nf.getClass();
        CancellationException i = l.i();
        if (!nf.o() ? false : ((C0726Fp0) nf.i).j(i)) {
            return;
        }
        nf.i(i);
        if (nf.o() || (interfaceC7447lq0 = nf.k) == null) {
            return;
        }
        interfaceC7447lq0.dispose();
        nf.k = F52.a;
    }
}
