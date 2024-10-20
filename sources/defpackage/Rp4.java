package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Rp4 extends Mp4 {
    public C2141Qm1 n;
    public C2141Qm1 o;
    public C2141Qm1 p;

    @Override // defpackage.Jp4, defpackage.Up4
    public final void q(C2141Qm1 c2141Qm1) {
    }

    public Rp4(C5389fq4 c5389fq4, WindowInsets windowInsets) {
        super(c5389fq4, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.Up4
    public final C2141Qm1 i() {
        Insets systemGestureInsets;
        if (this.n == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.n = C2141Qm1.c(systemGestureInsets);
        }
        return this.n;
    }

    @Override // defpackage.Up4
    public final C2141Qm1 g() {
        Insets mandatorySystemGestureInsets;
        if (this.o == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.o = C2141Qm1.c(mandatorySystemGestureInsets);
        }
        return this.o;
    }

    @Override // defpackage.Up4
    public final C2141Qm1 k() {
        Insets tappableElementInsets;
        if (this.p == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.p = C2141Qm1.c(tappableElementInsets);
        }
        return this.p;
    }

    @Override // defpackage.Ip4, defpackage.Up4
    public final C5389fq4 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return C5389fq4.g(null, inset);
    }
}
