package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsets$Builder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Ep4 extends Hp4 {
    public final WindowInsets$Builder c;

    public Ep4() {
        this.c = new WindowInsets$Builder();
    }

    public Ep4(C5389fq4 c5389fq4) {
        super(c5389fq4);
        WindowInsets$Builder windowInsets$Builder;
        WindowInsets f = c5389fq4.f();
        if (f != null) {
            windowInsets$Builder = new WindowInsets$Builder(f);
        } else {
            windowInsets$Builder = new WindowInsets$Builder();
        }
        this.c = windowInsets$Builder;
    }

    @Override // defpackage.Hp4
    public final void g(C2141Qm1 c2141Qm1) {
        this.c.setSystemWindowInsets(c2141Qm1.d());
    }

    @Override // defpackage.Hp4
    public final void f(C2141Qm1 c2141Qm1) {
        this.c.setSystemGestureInsets(c2141Qm1.d());
    }

    @Override // defpackage.Hp4
    public final void d(C2141Qm1 c2141Qm1) {
        this.c.setMandatorySystemGestureInsets(c2141Qm1.d());
    }

    @Override // defpackage.Hp4
    public final void h(C2141Qm1 c2141Qm1) {
        this.c.setTappableElementInsets(c2141Qm1.d());
    }

    @Override // defpackage.Hp4
    public final void e(C2141Qm1 c2141Qm1) {
        this.c.setStableInsets(c2141Qm1.d());
    }

    @Override // defpackage.Hp4
    public final C5389fq4 b() {
        WindowInsets build;
        a();
        build = this.c.build();
        C5389fq4 g = C5389fq4.g(null, build);
        g.a.o(this.b);
        return g;
    }
}
