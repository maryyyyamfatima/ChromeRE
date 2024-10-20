package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lw2 */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC7485lw2 implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
    public final GestureDetector a;
    public final ScaleGestureDetector b;
    public final boolean c;
    public final C7829mw2 d;
    public GestureDetectorOnGestureListenerC7485lw2 e;
    public float f;
    public float g;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Runnable runnable;
        C9888sw2 c9888sw2 = this.d.b;
        c9888sw2.d.forceFinished(true);
        boolean b = c9888sw2.b(f, f2);
        if (b && (runnable = c9888sw2.i) != null) {
            runnable.run();
        }
        if (b) {
            this.f = 0.0f;
            this.g = 0.0f;
            return true;
        }
        float f3 = this.f + f;
        this.f = f3;
        float f4 = this.g + f2;
        this.g = f4;
        GestureDetectorOnGestureListenerC7485lw2 gestureDetectorOnGestureListenerC7485lw2 = this.e;
        if (gestureDetectorOnGestureListenerC7485lw2 != null && gestureDetectorOnGestureListenerC7485lw2.onScroll(motionEvent, motionEvent2, f3, f4)) {
            return true;
        }
        this.f = 0.0f;
        this.g = 0.0f;
        return false;
    }

    public GestureDetectorOnGestureListenerC7485lw2(Context context, boolean z, C7829mw2 c7829mw2) {
        this.a = new GestureDetector(context, this);
        this.b = new ScaleGestureDetector(context, this);
        this.c = z;
        this.d = c7829mw2;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        Runnable runnable;
        C9888sw2 c9888sw2 = this.d.b;
        if (c9888sw2.k) {
            C11603xw2 c11603xw2 = c9888sw2.f;
            float b = c11603xw2.b();
            Size size = c9888sw2.g;
            int width = (int) (size.getWidth() * b);
            int height = (int) (size.getHeight() * b);
            OverScroller overScroller = c9888sw2.d;
            overScroller.forceFinished(true);
            Rect a = c11603xw2.a();
            c9888sw2.d.fling(a.left, a.top, (int) (-f), (int) (-f2), 0, width - a.width(), 0, height - a.height());
            if (!overScroller.isFinished() && (runnable = c9888sw2.j) != null) {
                runnable.run();
            }
            c9888sw2.e.post(new RunnableC9545rw2(c9888sw2));
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        GestureDetectorOnGestureListenerC7485lw2 gestureDetectorOnGestureListenerC7485lw2 = this.e;
        if (gestureDetectorOnGestureListenerC7485lw2 != null) {
            return gestureDetectorOnGestureListenerC7485lw2.onFling(motionEvent, motionEvent2, f, f2);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ((C8173nw2) this.d.c).c((int) motionEvent.getX(), (int) motionEvent.getY(), false);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        C2062Pw2 c2062Pw2 = ((C8173nw2) this.d.c).q.c;
        if (c2062Pw2 != null) {
            c2062Pw2.a.run();
        }
        HashMap hashMap = AbstractC1932Ow2.a;
        FI2.a("PaintPreview.Player.LongPress");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:            if (r7 <= 5.0f) goto L229;     */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onScale(android.view.ScaleGestureDetector r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GestureDetectorOnGestureListenerC7485lw2.onScale(android.view.ScaleGestureDetector):boolean");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ArrayList arrayList;
        scaleGestureDetector.getScaleFactor();
        scaleGestureDetector.getFocusX();
        scaleGestureDetector.getFocusY();
        C9203qw2 c9203qw2 = this.d.a;
        float b = c9203qw2.b.b();
        C8173nw2 c8173nw2 = (C8173nw2) c9203qw2.e;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = c8173nw2.c.size();
            arrayList = c8173nw2.e;
            if (i2 >= size) {
                break;
            }
            ((C8173nw2) arrayList.get(i2)).g(b);
            i2++;
        }
        c8173nw2.j(true);
        while (true) {
            ArrayList arrayList2 = c8173nw2.c;
            if (i >= arrayList2.size()) {
                break;
            }
            if (((View) arrayList2.get(i)).getVisibility() == 0) {
                ((C8173nw2) arrayList.get(i)).a();
            }
            i++;
        }
        c9203qw2.a = 0.0f;
        Callback callback = c9203qw2.g;
        if (callback != null) {
            callback.onResult(Boolean.TRUE);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        TraceEvent.b("PlayerFrameGestureDetector.onTouchEvent", null);
        if (this.c) {
            this.b.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            C9888sw2 c9888sw2 = this.d.b;
            C1802Nw2 c1802Nw2 = c9888sw2.a;
            if (c1802Nw2 != null && c9888sw2.b) {
                c1802Nw2.a.e(true);
                c9888sw2.b = false;
                c9888sw2.c = 0.0f;
            }
            GestureDetectorOnGestureListenerC7485lw2 gestureDetectorOnGestureListenerC7485lw2 = this.e;
            if (gestureDetectorOnGestureListenerC7485lw2 != null) {
                gestureDetectorOnGestureListenerC7485lw2.a(motionEvent);
            }
        }
        boolean onTouchEvent = this.a.onTouchEvent(motionEvent);
        TraceEvent.c("PlayerFrameGestureDetector.onTouchEvent");
        return onTouchEvent;
    }
}
