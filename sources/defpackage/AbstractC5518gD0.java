package defpackage;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5518gD0 {
    public final float a;
    public final boolean b;
    public float c;
    public float d;

    public abstract boolean b(MotionEvent motionEvent);

    public abstract void c(MotionEvent motionEvent);

    public AbstractC5518gD0(Context context, boolean z) {
        this.a = 1.0f / context.getResources().getDisplayMetrics().density;
        this.b = z;
    }

    public final boolean a(MotionEvent motionEvent, boolean z) {
        MotionEvent motionEvent2;
        if (!this.b || (this.c == 0.0f && this.d == 0.0f)) {
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = MotionEvent.obtain(motionEvent);
            motionEvent2.offsetLocation(this.c, this.d);
        }
        boolean b = b(motionEvent2);
        if (motionEvent2 != motionEvent) {
            motionEvent2.recycle();
        }
        return b;
    }
}
