package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class I4 extends ViewGroup.MarginLayoutParams {
    public int a;

    public I4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public I4() {
        super(-2, -2);
        this.a = 8388627;
    }

    public I4(I4 i4) {
        super((ViewGroup.MarginLayoutParams) i4);
        this.a = 0;
        this.a = i4.a;
    }

    public I4(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
