package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8135nq0 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final InterfaceC11303x40 g;
    public final H4 h;
    public InterfaceC6416iq0 i;

    public C8135nq0(InterfaceC11128wa2 interfaceC11128wa2, InterfaceC11303x40 interfaceC11303x40, H4 h4) {
        this.a = interfaceC11128wa2;
        this.g = interfaceC11303x40;
        this.h = h4;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        try {
            this.g.accept(interfaceC6416iq0);
            if (EnumC7791mq0.g(this.i, interfaceC6416iq0)) {
                this.i = interfaceC6416iq0;
                interfaceC11128wa2.c(this);
            }
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            interfaceC6416iq0.dispose();
            this.i = EnumC7791mq0.a;
            EnumC7565mA0.a(th, interfaceC11128wa2);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        InterfaceC6416iq0 interfaceC6416iq0 = this.i;
        EnumC7791mq0 enumC7791mq0 = EnumC7791mq0.a;
        if (interfaceC6416iq0 != enumC7791mq0) {
            this.i = enumC7791mq0;
            this.a.onError(th);
        } else {
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        InterfaceC6416iq0 interfaceC6416iq0 = this.i;
        EnumC7791mq0 enumC7791mq0 = EnumC7791mq0.a;
        if (interfaceC6416iq0 != enumC7791mq0) {
            this.i = enumC7791mq0;
            this.a.b();
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        InterfaceC6416iq0 interfaceC6416iq0 = this.i;
        EnumC7791mq0 enumC7791mq0 = EnumC7791mq0.a;
        if (interfaceC6416iq0 != enumC7791mq0) {
            this.i = enumC7791mq0;
            try {
                this.h.run();
            } catch (Throwable th) {
                AbstractC4148cE0.a(th);
                MR2.b(th);
            }
            interfaceC6416iq0.dispose();
        }
    }
}
