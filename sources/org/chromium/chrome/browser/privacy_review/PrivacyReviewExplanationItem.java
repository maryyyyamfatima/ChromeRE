package org.chromium.chrome.browser.privacy_review;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrivacyReviewExplanationItem extends LinearLayout {
    public PrivacyReviewExplanationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f59990_resource_name_obfuscated_res_0x7f0e021e, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.C0, 0, 0);
        TextView textView = (TextView) inflate.findViewById(R.id.summary);
        textView.setText(obtainStyledAttributes.getText(2));
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (drawable != null && colorStateList != null) {
            drawable.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        obtainStyledAttributes.recycle();
    }
}
