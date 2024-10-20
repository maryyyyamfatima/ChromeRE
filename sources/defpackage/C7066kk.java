package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7066kk extends FrameLayout.LayoutParams {
    public final float a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    public C7066kk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.p);
        this.a = obtainStyledAttributes.getFraction(0, 1, 1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public C7066kk() {
        super(-1, -1);
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((FrameLayout.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
        int layoutDimension = typedArray.getLayoutDimension(i2, 0);
        ((FrameLayout.LayoutParams) this).height = layoutDimension;
        this.f = ((FrameLayout.LayoutParams) this).width;
        this.g = layoutDimension;
    }
}
