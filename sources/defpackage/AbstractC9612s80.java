package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9612s80 extends AbstractC11245wu {
    public final E90 g;
    public transient InterfaceC8927q80 h;

    public AbstractC9612s80(InterfaceC8927q80 interfaceC8927q80, E90 e90) {
        super(interfaceC8927q80);
        this.g = e90;
    }

    public AbstractC9612s80(InterfaceC8927q80 interfaceC8927q80) {
        this(interfaceC8927q80, interfaceC8927q80 != null ? interfaceC8927q80.getContext() : null);
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        E90 e90 = this.g;
        AbstractC0087Ar1.b(e90);
        return e90;
    }

    @Override // defpackage.AbstractC11245wu
    public final void h() {
        InterfaceC8927q80 interfaceC8927q80 = this.h;
        if (interfaceC8927q80 != null && interfaceC8927q80 != this) {
            E90 e90 = this.g;
            AbstractC0087Ar1.b(e90);
            int i = InterfaceC10298u80.c;
            B90 b = e90.b(C9955t80.a);
            AbstractC0087Ar1.b(b);
            ((C0726Fp0) interfaceC8927q80).k();
        }
        this.h = NZ.a;
    }
}
