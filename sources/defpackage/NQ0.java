package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NQ0 extends AbstractC3359Zw {
    public final DV0 k;

    public NQ0(AbstractC3359Zw abstractC3359Zw, DV0 dv0) {
        super(abstractC3359Zw);
        this.k = dv0;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        if (this.i) {
            return;
        }
        int i = this.j;
        AbstractC3359Zw abstractC3359Zw = this.a;
        if (i != 0) {
            ((NQ0) abstractC3359Zw).d(null);
            return;
        }
        try {
            Object apply = this.k.apply(obj);
            Q82.a(apply, "The mapper function returned a null value.");
            ((NQ0) abstractC3359Zw).d(apply);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.g.cancel();
            onError(th);
        }
    }

    @Override // defpackage.AbstractC3359Zw
    public final boolean f(Object obj) {
        if (this.i) {
            return false;
        }
        try {
            Object apply = this.k.apply(obj);
            Q82.a(apply, "The mapper function returned a null value.");
            return this.a.f(apply);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.g.cancel();
            onError(th);
            return true;
        }
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        CG2 cg2 = this.h;
        if (cg2 == null || (i & 4) != 0) {
            return 0;
        }
        int e = cg2.e(i);
        if (e == 0) {
            return e;
        }
        this.j = e;
        return e;
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
