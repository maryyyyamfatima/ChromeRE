package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC5241fQ2;
import defpackage.AbstractC7239lD3;
import org.chromium.components.browser_ui.widget.RoundedCornerImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabGridThumbnailView extends RoundedCornerImageView {
    public TabGridThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int c = (int) ((measuredWidth * 1.0d) / AbstractC7239lD3.c(getContext()));
        if (AbstractC5177fD3.c() || AbstractC5241fQ2.d(getContext())) {
            if (getDrawable() == null || (getDrawable() instanceof ColorDrawable)) {
                measuredHeight = c;
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
