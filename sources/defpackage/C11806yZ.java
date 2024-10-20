package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11806yZ implements InterfaceC10434uZ, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;
    public InterfaceC6416iq0 g;
    public final /* synthetic */ C12149zZ h;

    public C11806yZ(C12149zZ c12149zZ, InterfaceC10434uZ interfaceC10434uZ) {
        this.h = c12149zZ;
        this.a = interfaceC10434uZ;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        InterfaceC10434uZ interfaceC10434uZ = this.a;
        try {
            this.h.b.accept(interfaceC6416iq0);
            if (EnumC7791mq0.g(this.g, interfaceC6416iq0)) {
                this.g = interfaceC6416iq0;
                interfaceC10434uZ.c(this);
            }
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            interfaceC6416iq0.dispose();
            this.g = EnumC7791mq0.a;
            interfaceC10434uZ.c(EnumC7565mA0.INSTANCE);
            interfaceC10434uZ.onError(th);
        }
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        C12149zZ c12149zZ = this.h;
        if (this.g == EnumC7791mq0.a) {
            MR2.b(th);
            return;
        }
        try {
            c12149zZ.c.accept(th);
            c12149zZ.e.run();
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            th = new M10(th, th2);
        }
        this.a.onError(th);
        try {
            c12149zZ.f.run();
        } catch (Throwable th3) {
            AbstractC4148cE0.a(th3);
            MR2.b(th3);
        }
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        InterfaceC10434uZ interfaceC10434uZ = this.a;
        C12149zZ c12149zZ = this.h;
        if (this.g == EnumC7791mq0.a) {
            return;
        }
        try {
            c12149zZ.d.run();
            c12149zZ.e.run();
            interfaceC10434uZ.b();
            try {
                c12149zZ.f.run();
            } catch (Throwable th) {
                AbstractC4148cE0.a(th);
                MR2.b(th);
            }
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            interfaceC10434uZ.onError(th2);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        try {
            this.h.g.run();
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            MR2.b(th);
        }
        this.g.dispose();
    }
}
