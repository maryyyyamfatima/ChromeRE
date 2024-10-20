package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9059qY0 extends AbstractC5518gD0 {
    public final int e;
    public final GestureDetector f;
    public final InterfaceC9401rY0 g;
    public final boolean h;
    public final int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public final RunnableC8716pY0 n;
    public final Handler o;

    public AbstractC9059qY0(Context context, InterfaceC9401rY0 interfaceC9401rY0) {
        super(context, false);
        this.j = true;
        this.n = new RunnableC8716pY0(this);
        this.o = new Handler();
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = ViewConfiguration.getLongPressTimeout();
        this.h = false;
        this.g = interfaceC9401rY0;
        context.getResources();
        GestureDetector gestureDetector = new GestureDetector(context, new C8373oY0(this));
        this.f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    @Override // defpackage.AbstractC5518gD0
    public void c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = this.h;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            RunnableC8716pY0 runnableC8716pY0 = this.n;
            Handler handler = this.o;
            if (pointerCount > 1) {
                if (runnableC8716pY0.g) {
                    handler.removeCallbacks(runnableC8716pY0);
                    runnableC8716pY0.g = false;
                }
            } else if (actionMasked == 0) {
                if (runnableC8716pY0.g) {
                    handler.removeCallbacks(runnableC8716pY0);
                    runnableC8716pY0.g = false;
                }
                MotionEvent motionEvent2 = runnableC8716pY0.a;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                runnableC8716pY0.a = MotionEvent.obtain(motionEvent);
                runnableC8716pY0.g = true;
                handler.postDelayed(runnableC8716pY0, this.e);
            } else if (actionMasked == 1 || actionMasked == 3) {
                handler.removeCallbacks(runnableC8716pY0);
                runnableC8716pY0.g = false;
            } else if (runnableC8716pY0.g) {
                MotionEvent motionEvent3 = runnableC8716pY0.a;
                float x = motionEvent3.getX() - motionEvent.getX();
                float y = motionEvent3.getY() - motionEvent.getY();
                float f = (y * y) + (x * x);
                int i = this.i;
                if (f > i * i) {
                    handler.removeCallbacks(runnableC8716pY0);
                    runnableC8716pY0.g = false;
                }
            }
        }
        int pointerCount2 = motionEvent.getPointerCount();
        GestureDetector gestureDetector = this.f;
        InterfaceC9401rY0 interfaceC9401rY0 = this.g;
        if (pointerCount2 > 1) {
            motionEvent.getX(0);
            motionEvent.getY(0);
            motionEvent.getX(1);
            motionEvent.getY(1);
            interfaceC9401rY0.n0();
            gestureDetector.setIsLongpressEnabled(false);
            this.j = false;
        } else {
            gestureDetector.setIsLongpressEnabled(z);
            this.j = true;
        }
        gestureDetector.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            interfaceC9401rY0.u();
        }
    }
}
