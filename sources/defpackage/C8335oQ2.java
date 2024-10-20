package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oQ2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8335oQ2 {
    public static final int[] g = {R.attr.state_pressed};
    public static final int[] h = {R.attr.state_selected};
    public static final int[] i = {R.attr.state_selected, R.attr.state_pressed};
    public final View a;
    public ColorStateList b;
    public ColorStateList c;
    public GradientDrawable d;
    public GradientDrawable e;
    public LayerDrawable f;

    public C8335oQ2(View view, int i2, int i3, float[] fArr, int i4, int i5, int i6) {
        this.a = view;
        ColorStateList b = Y50.b(view.getContext(), i3);
        ColorStateList b2 = Y50.b(view.getContext(), i4);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(i5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.d = gradientDrawable;
        gradientDrawable.setCornerRadii(fArr);
        if (dimensionPixelSize > 0) {
            this.d.setStroke(dimensionPixelSize, b2);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.e = gradientDrawable2;
        gradientDrawable2.setCornerRadii(fArr);
        this.e.setStroke(dimensionPixelSize, 0);
        this.f = new LayerDrawable(new Drawable[]{this.d, this.e});
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadii(fArr);
        gradientDrawable3.setColor(-1);
        int[][] iArr = {h, StateSet.NOTHING};
        int colorForState = b.getColorForState(i, b.getDefaultColor());
        int colorForState2 = b.getColorForState(g, b.getDefaultColor());
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{AbstractC4242cX.g(colorForState, Math.min(Color.alpha(colorForState) * 2, 255)), AbstractC4242cX.g(colorForState2, Math.min(Color.alpha(colorForState2) * 2, 255))});
        Drawable drawable = this.f;
        view.setBackground(new RippleDrawable(colorStateList, i6 != 0 ? new InsetDrawable(drawable, 0, i6, 0, i6) : drawable, gradientDrawable3));
        a(Y50.b(view.getContext(), i2));
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList == this.b) {
            return;
        }
        this.b = colorStateList;
        if (Build.VERSION.SDK_INT < 26) {
            this.f.setDrawable(0, this.d);
        }
        this.d.setColor(colorStateList);
    }
}
