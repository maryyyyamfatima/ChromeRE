package org.chromium.ui.widget;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.android.chrome.R;
import defpackage.C4287cf;
import defpackage.C8335oQ2;
import defpackage.JG2;
import defpackage.Y50;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ButtonCompat extends C4287cf {
    public final C8335oQ2 i;

    public ButtonCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.f96330_resource_name_obfuscated_res_0x7f1501c7);
    }

    public ButtonCompat(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, i), attributeSet, android.R.attr.buttonStyle);
        float[] fArr;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, JG2.v, android.R.attr.buttonStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(2, R.color.f16790_resource_name_obfuscated_res_0x7f070081);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, R.color.f18940_resource_name_obfuscated_res_0x7f07019f);
        int resourceId3 = obtainStyledAttributes.getResourceId(0, android.R.color.transparent);
        int resourceId4 = obtainStyledAttributes.getResourceId(1, R.dimen.f30550_resource_name_obfuscated_res_0x7f080182);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.f28690_resource_name_obfuscated_res_0x7f0800a1));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f28700_resource_name_obfuscated_res_0x7f0800a2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize2);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, dimensionPixelSize2);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize2);
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize2);
        int resourceId5 = obtainStyledAttributes.getResourceId(4, -1);
        if (resourceId5 != -1) {
            setTextColor(Y50.b(getContext(), resourceId5));
        }
        if (getLayoutDirection() == 1) {
            float f = dimensionPixelSize4;
            float f2 = dimensionPixelSize3;
            float f3 = dimensionPixelSize5;
            float f4 = dimensionPixelSize6;
            fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        } else {
            float f5 = dimensionPixelSize3;
            float f6 = dimensionPixelSize4;
            float f7 = dimensionPixelSize6;
            float f8 = dimensionPixelSize5;
            fArr = new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
        }
        obtainStyledAttributes.recycle();
        this.i = new C8335oQ2(this, resourceId, resourceId2, fArr, resourceId3, resourceId4, dimensionPixelSize);
        if (z) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(null, new int[]{android.R.attr.stateListAnimator}, 0, android.R.style.Widget.Material.Button);
            int resourceId6 = obtainStyledAttributes2.getResourceId(0, 0);
            obtainStyledAttributes2.recycle();
            setStateListAnimator(resourceId6 != 0 ? AnimatorInflater.loadStateListAnimator(getContext(), resourceId6) : null);
            return;
        }
        setElevation(0.0f);
        setStateListAnimator(null);
    }
}
