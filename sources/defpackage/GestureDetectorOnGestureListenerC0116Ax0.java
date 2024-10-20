package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ax0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC0116Ax0 implements GestureDetector.OnGestureListener {
    public final C11949yx0 a;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnGestureListenerC0116Ax0(C11949yx0 c11949yx0) {
        this.a = c11949yx0;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        List list;
        C11949yx0 c11949yx0 = this.a;
        if (!(c11949yx0.f != null) || (list = c11949yx0.h) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC6801jx0) it.next()).a((View) c11949yx0.a.get(), new C1629Mo(motionEvent.getX(), motionEvent.getY()));
        }
    }
}
