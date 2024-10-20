package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4164cH1 implements JO2, InterfaceC9316rH0 {
    public static final C8974qH0 j = AbstractC10002tH0.a(20, new C3821bH1());
    public final C10503uk3 a = new C10503uk3();
    public JO2 g;
    public boolean h;
    public boolean i;

    public final synchronized void a() {
        this.a.a();
        if (!this.h) {
            throw new IllegalStateException("Already unlocked");
        }
        this.h = false;
        if (this.i) {
            b();
        }
    }

    @Override // defpackage.JO2
    public final Class e() {
        return this.g.e();
    }

    @Override // defpackage.JO2
    public final Object get() {
        return this.g.get();
    }

    @Override // defpackage.JO2
    public final int d() {
        return this.g.d();
    }

    @Override // defpackage.JO2
    public final synchronized void b() {
        this.a.a();
        this.i = true;
        if (!this.h) {
            this.g.b();
            this.g = null;
            j.a(this);
        }
    }

    @Override // defpackage.InterfaceC9316rH0
    public final C10503uk3 c() {
        return this.a;
    }
}
