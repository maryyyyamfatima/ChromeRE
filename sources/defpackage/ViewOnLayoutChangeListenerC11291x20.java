package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x20 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC11291x20 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C11634y20 a;

    public ViewOnLayoutChangeListenerC11291x20(C11634y20 c11634y20) {
        this.a = c11634y20;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        C11634y20 c11634y20 = this.a;
        MotionEvent motionEvent = c11634y20.a.T;
        if (motionEvent == null) {
            return;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(0);
        c11634y20.a.dispatchTouchEvent(obtain);
        for (int i9 = 1; i9 < c11634y20.a.T.getPointerCount(); i9++) {
            MotionEvent obtain2 = MotionEvent.obtain(c11634y20.a.T);
            obtain2.setAction((i9 << 8) | 5);
            c11634y20.a.dispatchTouchEvent(obtain2);
        }
    }
}
