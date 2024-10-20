package org.chromium.chrome.browser.customtabs.features.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.C5380fp1;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class InterceptTouchLayout extends FrameLayout {
    public final GestureDetector a;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public InterceptTouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new GestureDetector(getContext(), new C5380fp1(), ThreadUtils.b());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
