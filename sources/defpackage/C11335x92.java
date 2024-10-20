package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11335x92 extends AbstractC4052bx implements InterfaceC11128wa2 {
    public final InterfaceC11128wa2 a;
    public final DV0 h;
    public final boolean i;
    public InterfaceC6416iq0 k;
    public volatile boolean l;
    public final C0965Hl g = new C0965Hl();
    public final H10 j = new H10();

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        return i & 2;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        return null;
    }

    public C11335x92(InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0, boolean z) {
        this.a = interfaceC11128wa2;
        this.h = dv0;
        this.i = z;
        lazySet(1);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.k, interfaceC6416iq0)) {
            this.k = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        try {
            AZ az = (AZ) this.h.apply(obj);
            Q82.a(az, "The mapper returned a null CompletableSource");
            getAndIncrement();
            C10992w92 c10992w92 = new C10992w92(this);
            if (this.l || !this.j.a(c10992w92)) {
                return;
            }
            az.b(c10992w92);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.k.dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        C0965Hl c0965Hl = this.g;
        if (c0965Hl.a(th)) {
            boolean z = this.i;
            InterfaceC11128wa2 interfaceC11128wa2 = this.a;
            if (z) {
                if (decrementAndGet() == 0) {
                    interfaceC11128wa2.onError(c0965Hl.b());
                    return;
                }
                return;
            } else {
                dispose();
                if (getAndSet(0) > 0) {
                    interfaceC11128wa2.onError(c0965Hl.b());
                    return;
                }
                return;
            }
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (decrementAndGet() == 0) {
            Throwable b = this.g.b();
            InterfaceC11128wa2 interfaceC11128wa2 = this.a;
            if (b != null) {
                interfaceC11128wa2.onError(b);
            } else {
                interfaceC11128wa2.b();
            }
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.l = true;
        this.k.dispose();
        this.j.dispose();
    }
}
