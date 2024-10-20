package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC2461Sy1;
import defpackage.OP0;
import defpackage.S61;
import defpackage.T61;
import defpackage.U61;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SurveyPromptBannerWrapper extends FrameLayout {
    public SurveyPromptBannerWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = OP0.b;
        ((U61) ((T61) S61.g.a.get())).getClass();
        if (OP0.c(((Boolean) U61.b.a(context)).booleanValue())) {
            i2 = AbstractC2461Sy1.a(this, findViewById(R.id.survey_prompt_banner), i, i2, findViewById(R.id.survey_prompt_header), null);
        }
        super.onMeasure(i, i2);
    }
}
