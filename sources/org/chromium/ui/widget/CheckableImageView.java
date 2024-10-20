package org.chromium.ui.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CheckableImageView extends ChromeImageView implements Checkable {
    public static final int[] j = {R.attr.state_checked};
    public boolean i;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return !isChecked() ? super.onCreateDrawableState(i) : View.mergeDrawableStates(super.onCreateDrawableState(i + 1), j);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == getDrawable()) {
            return;
        }
        super.setImageDrawable(drawable);
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        refreshDrawableState();
    }
}
