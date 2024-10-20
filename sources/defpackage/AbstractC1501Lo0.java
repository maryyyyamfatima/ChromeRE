package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lo0 */
/* loaded from: classes.dex */
public abstract class AbstractC1501Lo0 implements V02, InterfaceC6377ij3 {
    public final C6314iY3 a;
    public final C9766sc0 g;
    public boolean h;

    public abstract boolean a();

    public abstract void b();

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
    }

    public abstract boolean h();

    public AbstractC1501Lo0(C6314iY3 c6314iY3, I5 i5, C9766sc0 c9766sc0, String str) {
        this.a = c6314iY3;
        this.g = c9766sc0;
        c6314iY3.o(C6314iY3.f, this);
        c6314iY3.o(C6314iY3.g, str);
        c9766sc0.j.a(new Runnable() { // from class: Ko0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1501Lo0 abstractC1501Lo0 = AbstractC1501Lo0.this;
                C9423rc0 c9423rc0 = abstractC1501Lo0.g.i;
                boolean z = (c9423rc0 == null || c9423rc0.b == 2) ? false : true;
                PD2 pd2 = C6314iY3.d;
                C6314iY3 c6314iY32 = abstractC1501Lo0.a;
                if (z) {
                    c6314iY32.o(pd2, c9423rc0.a);
                    abstractC1501Lo0.j();
                    return;
                }
                c6314iY32.o(pd2, null);
                ND2 nd2 = C6314iY3.c;
                if (c6314iY32.h(nd2) == 1) {
                    c6314iY32.m(nd2, 0);
                }
            }
        });
        i5.b(this);
    }

    @Override // defpackage.V02
    public final void U() {
        this.h = h();
        C9423rc0 c9423rc0 = this.g.i;
        if ((c9423rc0 == null || c9423rc0.b == 2) ? false : true) {
            j();
        }
    }

    public void d() {
        this.a.k(C6314iY3.e, false);
    }

    public final void j() {
        ND2 nd2 = C6314iY3.c;
        C6314iY3 c6314iY3 = this.a;
        if ((c6314iY3.h(nd2) == 1) || !h()) {
            return;
        }
        c6314iY3.k(C6314iY3.e, a());
        c6314iY3.m(nd2, 1);
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        if (!this.h || h()) {
            return;
        }
        b();
        this.h = false;
    }
}
