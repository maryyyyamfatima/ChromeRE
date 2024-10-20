package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R41 extends ViewGroup.MarginLayoutParams {
    public static final int c = 1;
    public U41 a;
    public U41 b;

    public R41(U41 u41, U41 u412) {
        super(-2, -2);
        U41 u413 = U41.e;
        this.a = u413;
        this.b = u413;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = u41;
        this.b = u412;
    }

    public R41(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        U41 u41 = U41.e;
        this.a = u41;
        this.b = u41;
    }

    public R41(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        U41 u41 = U41.e;
        this.a = u41;
        this.b = u41;
    }

    public R41(R41 r41) {
        super((ViewGroup.MarginLayoutParams) r41);
        U41 u41 = U41.e;
        this.a = u41;
        this.b = u41;
        this.a = r41.a;
        this.b = r41.b;
    }

    public R41(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        U41 u41 = U41.e;
        this.a = u41;
        this.b = u41;
        int[] iArr = JG2.Y;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
            ((ViewGroup.MarginLayoutParams) this).leftMargin = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) this).topMargin = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) this).rightMargin = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int i = obtainStyledAttributes.getInt(10, 0);
                int i2 = obtainStyledAttributes.getInt(7, Integer.MIN_VALUE);
                int i3 = c;
                this.b = GridLayout.l(i2, obtainStyledAttributes.getInt(8, i3), GridLayout.d(i, true), obtainStyledAttributes.getFloat(9, 0.0f));
                this.a = GridLayout.l(obtainStyledAttributes.getInt(11, Integer.MIN_VALUE), obtainStyledAttributes.getInt(12, i3), GridLayout.d(i, false), obtainStyledAttributes.getFloat(13, 0.0f));
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i, -2);
        ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i2, -2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R41)) {
            return false;
        }
        R41 r41 = (R41) obj;
        return this.b.equals(r41.b) && this.a.equals(r41.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
