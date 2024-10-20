package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6873k92 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final InterfaceC11303x40 g;
    public final InterfaceC11303x40 h;
    public final H4 i;
    public final H4 j;
    public InterfaceC6416iq0 k;
    public boolean l;

    public C6873k92(InterfaceC11128wa2 interfaceC11128wa2, InterfaceC11303x40 interfaceC11303x40, InterfaceC11303x40 interfaceC11303x402, H4 h4, H4 h42) {
        this.a = interfaceC11128wa2;
        this.g = interfaceC11303x40;
        this.h = interfaceC11303x402;
        this.i = h4;
        this.j = h42;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.k, interfaceC6416iq0)) {
            this.k = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.k.dispose();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.l) {
            return;
        }
        try {
            this.g.accept(obj);
            this.a.d(obj);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.k.dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.l) {
            MR2.b(th);
            return;
        }
        this.l = true;
        try {
            this.h.accept(th);
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            th = new M10(th, th2);
        }
        this.a.onError(th);
        try {
            this.j.run();
        } catch (Throwable th3) {
            AbstractC4148cE0.a(th3);
            MR2.b(th3);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.l) {
            return;
        }
        try {
            this.i.run();
            this.l = true;
            this.a.b();
            try {
                this.j.run();
            } catch (Throwable th) {
                AbstractC4148cE0.a(th);
                MR2.b(th);
            }
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            onError(th2);
        }
    }
}
