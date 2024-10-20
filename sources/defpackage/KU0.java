package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KU0 extends AbstractC2126Qj1 {
    public final ZX1 e;
    public final C3976bk1 f;
    public C2776Vj1 g;

    public KU0(Context context, C3166Yj1 c3166Yj1, InterfaceC3036Xj1 interfaceC3036Xj1, Runnable runnable, ZX1 zx1, C3976bk1 c3976bk1) {
        super(context, c3166Yj1, interfaceC3036Xj1, runnable);
        this.e = zx1;
        this.f = c3976bk1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ak1] */
    @Override // defpackage.InterfaceC1477Lj1
    public final void b() {
        final C3976bk1 c3976bk1 = this.f;
        c3976bk1.getClass();
        a(new ZC1() { // from class: ak1
            @Override // defpackage.ZC1
            public final /* synthetic */ LI2 a(View view) {
                return YC1.a(view);
            }

            @Override // defpackage.ZC1
            public final TC1 b() {
                return C3976bk1.this.i;
            }
        }, true);
        View view = this.d;
        ZX1 zx1 = this.e;
        C2776Vj1 c2776Vj1 = new C2776Vj1(zx1, view);
        this.g = c2776Vj1;
        zx1.k(1, 3, c2776Vj1.b, false);
    }

    @Override // defpackage.InterfaceC1477Lj1
    public final void hide(int i) {
        C2776Vj1 c2776Vj1 = this.g;
        c2776Vj1.a.c(i, c2776Vj1.b);
        this.c.b();
    }
}
