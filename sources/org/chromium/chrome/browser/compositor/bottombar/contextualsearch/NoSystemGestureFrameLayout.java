package org.chromium.chrome.browser.compositor.bottombar.contextualsearch;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NoSystemGestureFrameLayout extends FrameLayout {
    public NoSystemGestureFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, Math.abs(i3 - i), Math.abs(i2 - i4))));
        }
    }
}
