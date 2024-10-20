package defpackage;

import android.view.WindowInsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Jp4 extends Ip4 {
    public C2141Qm1 m;

    public Jp4(C5389fq4 c5389fq4, WindowInsets windowInsets) {
        super(c5389fq4, windowInsets);
        this.m = null;
    }

    @Override // defpackage.Up4
    public final boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.Up4
    public final C5389fq4 b() {
        return C5389fq4.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.Up4
    public final C5389fq4 c() {
        return C5389fq4.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.Up4
    public final C2141Qm1 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = C2141Qm1.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.Up4
    public void q(C2141Qm1 c2141Qm1) {
        this.m = c2141Qm1;
    }
}
