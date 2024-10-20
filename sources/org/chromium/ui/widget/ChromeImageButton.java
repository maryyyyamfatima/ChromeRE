package org.chromium.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.C1844Of;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeImageButton extends C1844Of {
    public ChromeImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.C1844Of, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 24 && (drawable = getDrawable()) != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
        super.drawableStateChanged();
    }

    public ChromeImageButton(Context context) {
        super(context, null);
    }
}
