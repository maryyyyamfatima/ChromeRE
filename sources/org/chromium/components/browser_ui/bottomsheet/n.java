package org.chromium.components.browser_ui.bottomsheet;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import defpackage.C5168fC;
import defpackage.InterfaceC4824eC;
import defpackage.JM1;
import defpackage.PB;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C5168fC a;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        return ((BottomSheet) this.a.b).u(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null) {
            return false;
        }
        C5168fC c5168fC = this.a;
        if (!((BottomSheet) c5168fC.b).u(motionEvent2) || !c5168fC.d) {
            return false;
        }
        c5168fC.d = false;
        InterfaceC4824eC interfaceC4824eC = c5168fC.b;
        BottomSheet bottomSheet = (BottomSheet) interfaceC4824eC;
        bottomSheet.r(JM1.b((((-f2) * 218.0f) / 2000.0f) + ((BottomSheet) interfaceC4824eC).q, bottomSheet.h(), ((BottomSheet) interfaceC4824eC).f()), true);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a.d = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null) {
            C5168fC c5168fC = this.a;
            if (((BottomSheet) c5168fC.b).u(motionEvent2)) {
                float abs = Math.abs(f) > 0.0f ? Math.abs(f2) / Math.abs(f) : 2.0f;
                boolean z = c5168fC.d;
                VelocityTracker velocityTracker = c5168fC.c;
                if (!z && abs < 2.0f) {
                    velocityTracker.clear();
                    return false;
                }
                velocityTracker.addMovement(motionEvent2);
                InterfaceC4824eC interfaceC4824eC = c5168fC.b;
                BottomSheet bottomSheet = (BottomSheet) interfaceC4824eC;
                boolean a = JM1.a(bottomSheet.q, bottomSheet.f());
                BottomSheet bottomSheet2 = (BottomSheet) interfaceC4824eC;
                TouchRestrictingFrameLayout touchRestrictingFrameLayout = bottomSheet2.x;
                int[] iArr = bottomSheet2.i;
                touchRestrictingFrameLayout.getLocationInWindow(iArr);
                if (!(((float) (bottomSheet2.x.getHeight() + iArr[1])) > motionEvent2.getRawY()) && a) {
                    PB pb = ((BottomSheet) interfaceC4824eC).u;
                    if (!(pb == null || pb.b() <= 0)) {
                        return false;
                    }
                }
                if (a && f2 > 0.0f) {
                    return false;
                }
                BottomSheet bottomSheet3 = (BottomSheet) interfaceC4824eC;
                if (JM1.a(bottomSheet3.q, bottomSheet3.h()) && f2 < 0.0f) {
                    return false;
                }
                BottomSheet bottomSheet4 = (BottomSheet) interfaceC4824eC;
                float f3 = bottomSheet4.q + f2;
                c5168fC.d = true;
                bottomSheet4.r(JM1.b(f3, bottomSheet4.h(), ((BottomSheet) interfaceC4824eC).f()), false);
                return true;
            }
        }
        return false;
    }

    public n(C5168fC c5168fC) {
        this.a = c5168fC;
    }
}
