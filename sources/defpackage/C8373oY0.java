package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8373oY0 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ AbstractC9059qY0 c;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC9059qY0 abstractC9059qY0 = this.c;
        if (!abstractC9059qY0.j) {
            return true;
        }
        motionEvent.getX();
        motionEvent.getY();
        float f3 = abstractC9059qY0.a;
        abstractC9059qY0.g.l0(f * f3, f2 * f3);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC9059qY0 abstractC9059qY0 = this.c;
        if (!abstractC9059qY0.l) {
            abstractC9059qY0.l = true;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            if (sqrt > 0.0f) {
                float max = Math.max(0.0f, sqrt - abstractC9059qY0.i) / sqrt;
                float f3 = 1.0f - max;
                this.a = (f * f3) + motionEvent.getX();
                this.b = (f3 * f2) + motionEvent.getY();
                f *= max;
            }
        }
        if (abstractC9059qY0.j) {
            float x = motionEvent2.getX() - this.a;
            float y = motionEvent2.getY() - this.b;
            InterfaceC9401rY0 interfaceC9401rY0 = abstractC9059qY0.g;
            float x2 = motionEvent2.getX();
            float f4 = abstractC9059qY0.a;
            interfaceC9401rY0.h0(x2 * f4, motionEvent2.getY() * f4, (-f) * f4, x * f4, y * f4);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AbstractC9059qY0 abstractC9059qY0 = this.c;
        if (abstractC9059qY0.j && !abstractC9059qY0.k) {
            abstractC9059qY0.g.W(abstractC9059qY0.m, motionEvent.getX() * abstractC9059qY0.a, motionEvent.getY() * abstractC9059qY0.a, motionEvent.getToolType(0) == 3);
        }
        return true;
    }

    public C8373oY0(AbstractC9059qY0 abstractC9059qY0) {
        this.c = abstractC9059qY0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int buttonState = motionEvent.getButtonState();
        AbstractC9059qY0 abstractC9059qY0 = this.c;
        abstractC9059qY0.m = buttonState;
        abstractC9059qY0.k = false;
        abstractC9059qY0.l = false;
        if (abstractC9059qY0.j) {
            abstractC9059qY0.g.Z(abstractC9059qY0.m, motionEvent.getX() * abstractC9059qY0.a, motionEvent.getY() * abstractC9059qY0.a, motionEvent.getToolType(0) == 3);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        AbstractC9059qY0 abstractC9059qY0 = this.c;
        if (abstractC9059qY0.j) {
            abstractC9059qY0.k = true;
            float x = motionEvent.getX();
            float f = abstractC9059qY0.a;
            float y = motionEvent.getY() * f;
            abstractC9059qY0.g.g0(x * f, y);
        }
    }
}
