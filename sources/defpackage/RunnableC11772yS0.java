package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11772yS0 implements Runnable {
    public final /* synthetic */ AbstractViewOnTouchListenerC12115zS0 a;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC12115zS0 abstractViewOnTouchListenerC12115zS0 = this.a;
        abstractViewOnTouchListenerC12115zS0.a();
        View view = abstractViewOnTouchListenerC12115zS0.i;
        if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC12115zS0.c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            abstractViewOnTouchListenerC12115zS0.l = true;
        }
    }

    public RunnableC11772yS0(AbstractViewOnTouchListenerC12115zS0 abstractViewOnTouchListenerC12115zS0) {
        this.a = abstractViewOnTouchListenerC12115zS0;
    }
}
