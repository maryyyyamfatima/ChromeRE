package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j33, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6494j33 implements InterfaceC6152i33 {
    public final InterfaceC6152i33 a;
    public final InterfaceC6152i33 b;

    public C6494j33(InterfaceC6152i33 interfaceC6152i33, E70 e70) {
        this.a = interfaceC6152i33;
        this.b = e70;
    }

    @Override // defpackage.InterfaceC6152i33
    public final void f(String str) {
        this.a.f(str);
        this.b.f(str);
    }

    @Override // defpackage.InterfaceC6152i33
    public final void a(int i, float f, float f2) {
        this.a.a(i, f, f2);
        this.b.a(i, f, f2);
    }

    @Override // defpackage.InterfaceC6152i33
    public final void c(C8551p23 c8551p23) {
        this.a.c(c8551p23);
        this.b.c(c8551p23);
    }

    @Override // defpackage.InterfaceC6152i33
    public final boolean d(boolean z) {
        return this.a.d(z);
    }

    @Override // defpackage.InterfaceC6152i33
    public final void e() {
        this.a.e();
        this.b.e();
    }

    @Override // defpackage.InterfaceC6152i33
    public final InterfaceC7870n33 b() {
        return this.a.b();
    }
}
