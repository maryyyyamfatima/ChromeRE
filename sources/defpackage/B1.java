package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelListItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B1 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AccessibilityTabModelListItem a;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.a;
        if (accessibilityTabModelListItem.C.a.h.z(accessibilityTabModelListItem.z.getId())) {
            return false;
        }
        accessibilityTabModelListItem.F.g = false;
        accessibilityTabModelListItem.setTranslationX(accessibilityTabModelListItem.getTranslationX() + (motionEvent2.getX() - motionEvent.getX()));
        accessibilityTabModelListItem.setAlpha(1.0f - Math.abs(accessibilityTabModelListItem.getTranslationX() / accessibilityTabModelListItem.getWidth()));
        return true;
    }

    public B1(AccessibilityTabModelListItem accessibilityTabModelListItem) {
        this.a = accessibilityTabModelListItem;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AccessibilityTabModelListItem accessibilityTabModelListItem = this.a;
        if (Math.abs(accessibilityTabModelListItem.getTranslationX()) < accessibilityTabModelListItem.k) {
            return false;
        }
        accessibilityTabModelListItem.d(Math.min(((long) Math.abs(accessibilityTabModelListItem.getWidth() / Math.sqrt((f2 * f2) + (f * f)))) * 150, accessibilityTabModelListItem.g));
        accessibilityTabModelListItem.F.g = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.performClick();
        return true;
    }
}
