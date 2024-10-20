package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UB3 implements InterfaceC7458ls, InterfaceC7064kj3, InterfaceC1292Jy1 {
    public final InterfaceC0408Dd2 a;
    public final InterfaceC0408Dd2 g;
    public final Runnable h;
    public final C8385oa2 i = new C8385oa2();

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    public UB3(C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, RunnableC5931hR runnableC5931hR) {
        c0538Ed2.j(new Callback() { // from class: SB3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                UB3 ub3 = UB3.this;
                ub3.getClass();
                ((C9897sy1) ((InterfaceC1422Ky1) obj)).e(ub3);
                ub3.e();
            }
        });
        c0538Ed22.j(new Callback() { // from class: TB3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                UB3 ub3 = UB3.this;
                ub3.getClass();
                ((C10154tj3) ((InterfaceC7408lj3) obj)).c.l.a(ub3);
                ub3.e();
            }
        });
        this.a = c0538Ed2;
        this.g = c0538Ed22;
        this.h = runnableC5931hR;
        e();
    }

    @Override // defpackage.InterfaceC7064kj3
    public final void b(int i, boolean z) {
        e();
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        e();
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.h.run();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.i;
    }

    public final void e() {
        InterfaceC1422Ky1 interfaceC1422Ky1 = (InterfaceC1422Ky1) this.a.get();
        boolean z = true;
        boolean z2 = interfaceC1422Ky1 != null && ((C9897sy1) interfaceC1422Ky1).G(2);
        C8385oa2 c8385oa2 = this.i;
        if (!z2) {
            c8385oa2.p(Boolean.FALSE);
            return;
        }
        InterfaceC7408lj3 interfaceC7408lj3 = (InterfaceC7408lj3) this.g.get();
        if (interfaceC7408lj3 != null && ((C10154tj3) interfaceC7408lj3).c.w != 2) {
            z = false;
        }
        c8385oa2.p(Boolean.valueOf(z));
    }
}
