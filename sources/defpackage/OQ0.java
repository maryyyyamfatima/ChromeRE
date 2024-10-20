package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OQ0 implements QQ0, CG2 {
    public final InterfaceC0334Co3 a;
    public InterfaceC0724Fo3 g;
    public CG2 h;
    public boolean i;
    public int j;
    public final DV0 k;

    public OQ0(InterfaceC0334Co3 interfaceC0334Co3, DV0 dv0) {
        this.a = interfaceC0334Co3;
        this.k = dv0;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        if (this.i) {
            return;
        }
        int i = this.j;
        InterfaceC0334Co3 interfaceC0334Co3 = this.a;
        if (i != 0) {
            interfaceC0334Co3.d(null);
            return;
        }
        try {
            Object apply = this.k.apply(obj);
            Q82.a(apply, "The mapper function returned a null value.");
            interfaceC0334Co3.d(apply);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.g.cancel();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.g, interfaceC0724Fo3)) {
            this.g = interfaceC0724Fo3;
            if (interfaceC0724Fo3 instanceof CG2) {
                this.h = (CG2) interfaceC0724Fo3;
            }
            this.a.c(this);
        }
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

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        if (this.i) {
            MR2.b(th);
        } else {
            this.i = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.b();
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

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        this.g.a(j);
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        this.g.cancel();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.h.clear();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
