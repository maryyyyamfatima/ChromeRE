package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Hp4 {
    public final C5389fq4 a;
    public C2141Qm1[] b;

    public abstract C5389fq4 b();

    public void d(C2141Qm1 c2141Qm1) {
    }

    public abstract void e(C2141Qm1 c2141Qm1);

    public void f(C2141Qm1 c2141Qm1) {
    }

    public abstract void g(C2141Qm1 c2141Qm1);

    public void h(C2141Qm1 c2141Qm1) {
    }

    public Hp4() {
        this(new C5389fq4());
    }

    public Hp4(C5389fq4 c5389fq4) {
        this.a = c5389fq4;
    }

    public void c(C2141Qm1 c2141Qm1) {
        if (this.b == null) {
            this.b = new C2141Qm1[9];
        }
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                this.b[Vp4.a(i)] = c2141Qm1;
            }
        }
    }

    public final void a() {
        C2141Qm1[] c2141Qm1Arr = this.b;
        if (c2141Qm1Arr != null) {
            C2141Qm1 c2141Qm1 = c2141Qm1Arr[Vp4.a(1)];
            C2141Qm1 c2141Qm12 = this.b[Vp4.a(2)];
            C5389fq4 c5389fq4 = this.a;
            if (c2141Qm12 == null) {
                c2141Qm12 = c5389fq4.a.f(2);
            }
            if (c2141Qm1 == null) {
                c2141Qm1 = c5389fq4.a.f(1);
            }
            g(C2141Qm1.a(c2141Qm1, c2141Qm12));
            C2141Qm1 c2141Qm13 = this.b[Vp4.a(16)];
            if (c2141Qm13 != null) {
                f(c2141Qm13);
            }
            C2141Qm1 c2141Qm14 = this.b[Vp4.a(32)];
            if (c2141Qm14 != null) {
                d(c2141Qm14);
            }
            C2141Qm1 c2141Qm15 = this.b[Vp4.a(64)];
            if (c2141Qm15 != null) {
                h(c2141Qm15);
            }
        }
    }
}
