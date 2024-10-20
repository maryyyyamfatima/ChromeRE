package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.AbstractC5246fR2;
import defpackage.C4902eR2;
import defpackage.Ec4;
import defpackage.JG2;
import defpackage.LG;
import defpackage.MG;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public final boolean a;
    public final boolean g;
    public final Rect h;
    public final Rect i;
    public final LG j;

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        new MG();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.android.chrome.R.attr.f3680_resource_name_obfuscated_res_0x7f05009d);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        LG lg = new LG(this);
        this.j = lg;
        int[] iArr = JG2.y;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.android.chrome.R.style.f95970_resource_name_obfuscated_res_0x7f1501a0);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, i, com.android.chrome.R.style.f95970_resource_name_obfuscated_res_0x7f1501a0);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.android.chrome.R.color.f16990_resource_name_obfuscated_res_0x7f07009b);
            } else {
                color = getResources().getColor(com.android.chrome.R.color.f16980_resource_name_obfuscated_res_0x7f07009a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        boolean z = obtainStyledAttributes.getBoolean(7, false);
        this.a = z;
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        this.g = z2;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C4902eR2 c4902eR2 = new C4902eR2(dimension, valueOf);
        lg.a = c4902eR2;
        setBackgroundDrawable(c4902eR2);
        setClipToOutline(true);
        setElevation(dimension2);
        C4902eR2 c4902eR22 = (C4902eR2) lg.a;
        if (dimension3 != c4902eR22.e || c4902eR22.f != z || c4902eR22.g != z2) {
            c4902eR22.e = dimension3;
            c4902eR22.f = z;
            c4902eR22.g = z2;
            c4902eR22.b(null);
            c4902eR22.invalidateSelf();
        }
        if (!z) {
            lg.a(0, 0, 0, 0);
            return;
        }
        C4902eR2 c4902eR23 = (C4902eR2) lg.a;
        float f = c4902eR23.e;
        float f2 = c4902eR23.a;
        int ceil = (int) Math.ceil(AbstractC5246fR2.a(f, f2, z2));
        int ceil2 = (int) Math.ceil(AbstractC5246fR2.b(f, f2, z2));
        lg.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }
}
