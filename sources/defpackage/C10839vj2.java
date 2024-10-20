package defpackage;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vj2 */
/* loaded from: classes.dex */
public final class C10839vj2 extends GestureDetector.SimpleOnGestureListener implements InterfaceC11493xe0 {
    public final GestureDetector a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final VelocityTracker f = VelocityTracker.obtain();
    public Runnable g;
    public final /* synthetic */ C11182wj2 h;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public C10839vj2(C11182wj2 c11182wj2, Activity activity) {
        this.h = c11182wj2;
        this.a = new GestureDetector(activity, this, ThreadUtils.b());
    }
}
