package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mQ0 */
/* loaded from: classes.dex */
public final class C7645mQ0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Matrix m;
    public final /* synthetic */ AbstractC10390uQ0 n;

    public C7645mQ0(AbstractC10390uQ0 abstractC10390uQ0, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.n = abstractC10390uQ0;
        this.a = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC10390uQ0 abstractC10390uQ0 = this.n;
        abstractC10390uQ0.r.setAlpha(AbstractC0270Cc.a(this.a, this.g, 0.0f, 0.2f, floatValue));
        FloatingActionButton floatingActionButton = abstractC10390uQ0.r;
        float f = this.i;
        float f2 = this.h;
        floatingActionButton.setScaleX(((f - f2) * floatValue) + f2);
        FloatingActionButton floatingActionButton2 = abstractC10390uQ0.r;
        float f3 = this.j;
        floatingActionButton2.setScaleY(((f - f3) * floatValue) + f3);
        float f4 = this.l;
        float f5 = this.k;
        abstractC10390uQ0.o = AbstractC2277Rn2.a(f4, f5, floatValue, f5);
        float a = AbstractC2277Rn2.a(f4, f5, floatValue, f5);
        Matrix matrix = this.m;
        abstractC10390uQ0.a(a, matrix);
        abstractC10390uQ0.r.setImageMatrix(matrix);
    }
}
