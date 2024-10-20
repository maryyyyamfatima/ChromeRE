package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.chromium.base.library_loader.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5380fp1 extends GestureDetector.SimpleOnGestureListener {
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (b.n.f()) {
            FI2.a("CustomTabs.TapUrlBar");
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
