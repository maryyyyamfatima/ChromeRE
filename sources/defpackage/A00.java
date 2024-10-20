package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A00 extends AbstractC2704Uv {
    public final WZ c;
    public final C5524gE1 d;

    @Override // defpackage.AbstractC2704Uv, defpackage.InterfaceC7976nN2
    public final C6206iD0 a() {
        return null;
    }

    @Override // defpackage.InterfaceC7976nN2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.AbstractC2704Uv, defpackage.InterfaceC7976nN2
    public final String o() {
        return null;
    }

    public static A00 r() {
        C11622y00 c11622y00 = new C11622y00();
        c11622y00.b = new C11965z00();
        return new A00(c11622y00);
    }

    public A00(C11622y00 c11622y00) {
        super(c11622y00);
        WZ wz = c11622y00.b;
        if (wz == null) {
            throw new IllegalStateException("Component must be provided.");
        }
        this.c = wz;
        this.d = c11622y00.c;
    }

    @Override // defpackage.AbstractC2704Uv, defpackage.InterfaceC7976nN2
    public final WZ j() {
        return this.c;
    }

    @Override // defpackage.AbstractC2704Uv, defpackage.InterfaceC7976nN2
    public final C5524gE1 d() {
        return this.d;
    }

    @Override // defpackage.InterfaceC7976nN2
    public final String getName() {
        return this.c.c0();
    }
}
