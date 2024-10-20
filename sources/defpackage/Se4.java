package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Se4 extends Re4 {
    @Override // defpackage.Ke4
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.Ke4
    public final float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.Re4, defpackage.Te4
    public final void a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.Pe4
    public final void f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.Ne4
    public final void d(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.Ne4
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
