package defpackage;

import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8716pY0 implements Runnable {
    public MotionEvent a;
    public boolean g;
    public final /* synthetic */ AbstractC9059qY0 h;

    public RunnableC8716pY0(AbstractC9059qY0 abstractC9059qY0) {
        this.h = abstractC9059qY0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent = this.a;
        AbstractC9059qY0 abstractC9059qY0 = this.h;
        if (abstractC9059qY0.j) {
            abstractC9059qY0.k = true;
            float x = motionEvent.getX();
            float f = abstractC9059qY0.a;
            float y = motionEvent.getY() * f;
            abstractC9059qY0.g.g0(x * f, y);
        }
        this.g = false;
    }
}
