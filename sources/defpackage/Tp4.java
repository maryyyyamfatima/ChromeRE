package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Tp4 extends Rp4 {
    public static final C5389fq4 q = C5389fq4.g(null, WindowInsets.CONSUMED);

    @Override // defpackage.Ip4, defpackage.Up4
    public final void d(View view) {
    }

    public Tp4(C5389fq4 c5389fq4, WindowInsets windowInsets) {
        super(c5389fq4, windowInsets);
    }

    @Override // defpackage.Ip4, defpackage.Up4
    public final C2141Qm1 f(int i) {
        Insets insets;
        insets = this.c.getInsets(AbstractC5045eq4.a(i));
        return C2141Qm1.c(insets);
    }
}
