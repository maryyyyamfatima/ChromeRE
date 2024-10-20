package org.chromium.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeImageView extends AppCompatImageView {
    public ChromeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 24 && (drawable = getDrawable()) != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
        super.drawableStateChanged();
    }

    public ChromeImageView(Context context) {
        super(context, null);
    }
}
