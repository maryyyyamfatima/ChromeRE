package org.chromium.components.browser_ui.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TouchRestrictingFrameLayout extends FrameLayout {
    public BottomSheet a;

    public TouchRestrictingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null || bottomSheet.r == 4) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        BottomSheet bottomSheet = this.a;
        if (bottomSheet == null || bottomSheet.r == 4) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
