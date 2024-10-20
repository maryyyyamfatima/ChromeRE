package org.chromium.ui.base;

import J.N;
import android.view.MotionEvent;
import defpackage.Cl4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class EventForwarder {
    public final boolean a;
    public long b;
    public float c;
    public float d;
    public int e;
    public int f;
    public Cl4 g;

    public static EventForwarder create(long j, boolean z) {
        return new EventForwarder(j, z);
    }

    public EventForwarder(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public final void destroy() {
        this.b = 0L;
    }

    public final float b() {
        return ((WindowAndroid) N.M4_mlka_(this.b, this)).i.a();
    }

    public final boolean c() {
        return (this.c == 0.0f && this.d == 0.0f) ? false : true;
    }

    public final MotionEvent a(MotionEvent motionEvent) {
        if (!c()) {
            return motionEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(this.c, this.d);
        return obtain;
    }

    public final void f(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1) {
            return;
        }
        float b = b();
        N.M$2oj6EQ(this.b, this, motionEvent.getEventTime(), actionMasked, motionEvent.getX() / b, motionEvent.getY() / b, motionEvent.getPointerId(0), motionEvent.getPressure(0), motionEvent.getOrientation(0), motionEvent.getAxisValue(25, 0), motionEvent.getActionButton(), motionEvent.getButtonState(), motionEvent.getMetaState(), motionEvent.getToolType(0));
    }

    public final void e(long j, int i, float f) {
        long j2 = this.b;
        if (j2 == 0) {
            return;
        }
        N.MtyC4Bd2(j2, this, i, j, f);
    }

    public final boolean d(MotionEvent motionEvent) {
        int actionMasked;
        if (this.b == 0) {
            return false;
        }
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getToolType(0) == 3 && ((actionMasked = motionEvent.getActionMasked()) == 11 || actionMasked == 12)) {
            this.e = motionEvent.getButtonState();
        }
        return N.MvdB06Zi(this.b, this, motionEvent, motionEvent.getEventTime());
    }
}
