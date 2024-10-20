package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FM1 extends C10475ug {
    public FM1(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue a = AbstractC6594jM1.a(context2, com.android.chrome.R.attr.f13890_resource_name_obfuscated_res_0x7f05049a);
        if ((a != null && a.type == 18 && a.data == 0) ? false : true) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = JG2.p0;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int h = h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                g(resourceId, theme);
            }
        }
    }

    @Override // defpackage.C10475ug, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedValue a = AbstractC6594jM1.a(context, com.android.chrome.R.attr.f13890_resource_name_obfuscated_res_0x7f05049a);
        if ((a != null && a.type == 18 && a.data == 0) ? false : true) {
            g(i, context.getTheme());
        }
    }

    public final void g(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, JG2.o0);
        int h = h(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (h >= 0) {
            GJ3.c(h, this);
        }
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }
}
