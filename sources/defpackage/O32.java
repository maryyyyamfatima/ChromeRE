package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.chrome.browser.ntp.NewTabPageScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O32 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ NewTabPageScrollView a;

    public O32(NewTabPageScrollView newTabPageScrollView) {
        this.a = newTabPageScrollView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        this.a.requestFocus();
        return onSingleTapUp;
    }
}
