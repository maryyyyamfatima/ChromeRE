package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d63 */
/* loaded from: classes.dex */
public final class C4451d63 extends AbstractC11937yv {
    public final C5817h50 w;

    public C4451d63(JJ1 jj1, C2456Sx1 c2456Sx1) {
        super(jj1, c2456Sx1);
        C5817h50 c5817h50 = new C5817h50(jj1, this, new C3420a63("__container", c2456Sx1.a, false));
        this.w = c5817h50;
        c5817h50.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.AbstractC11937yv
    public final void k(Canvas canvas, Matrix matrix, int i) {
        this.w.g(canvas, matrix, i);
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.w.d(rectF, this.l, z);
    }

    @Override // defpackage.AbstractC11937yv
    public final void o(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        this.w.c(c8847pu1, i, arrayList, c8847pu12);
    }
}
