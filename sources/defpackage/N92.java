package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N92 extends AbstractC3708ax {
    public final DV0 k;

    public N92(InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0) {
        super(interfaceC11128wa2);
        this.k = dv0;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.i) {
            return;
        }
        int i = this.j;
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        if (i != 0) {
            interfaceC11128wa2.d(null);
            return;
        }
        try {
            Object apply = this.k.apply(obj);
            Q82.a(apply, "The mapper function returned a null value.");
            interfaceC11128wa2.d(apply);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.g.dispose();
            onError(th);
        }
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        return a(i);
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        Object poll = this.h.poll();
        if (poll == null) {
            return null;
        }
        Object apply = this.k.apply(poll);
        Q82.a(apply, "The mapper function returned a null value.");
        return apply;
    }
}
