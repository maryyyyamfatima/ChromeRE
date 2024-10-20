package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MaterialCardViewNoShadow extends FrameLayout {
    public MaterialCardViewNoShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackgroundResource(R.drawable.f45290_resource_name_obfuscated_res_0x7f0900e0);
        ((GradientDrawable) getBackground()).setColor(AbstractC11746yN.c(getContext(), R.dimen.f28750_resource_name_obfuscated_res_0x7f0800a7));
    }
}
