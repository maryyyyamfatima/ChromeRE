package org.chromium.chrome.browser.privacy_review;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrivacyReviewExplanationHeading extends LinearLayout {
    public PrivacyReviewExplanationHeading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f59980_resource_name_obfuscated_res_0x7f0e021d, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.B0, 0, 0);
        ((TextView) inflate.findViewById(R.id.title)).setText(obtainStyledAttributes.getText(0));
        obtainStyledAttributes.recycle();
    }
}
