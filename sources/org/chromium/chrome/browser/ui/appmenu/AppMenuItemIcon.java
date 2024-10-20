package org.chromium.chrome.browser.ui.appmenu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
class AppMenuItemIcon extends ChromeImageView implements Checkable {
    public static final int[] j = {R.attr.state_checked};
    public boolean i;

    public AppMenuItemIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z == this.i) {
            return;
        }
        this.i = z;
        refreshDrawableState();
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.i) {
            View.mergeDrawableStates(onCreateDrawableState, j);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }
}
