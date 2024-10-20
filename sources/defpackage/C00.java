package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C00 implements View.OnTouchListener {
    public C6206iD0 a;
    public C6206iD0 g;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C6206iD0 c6206iD0 = this.g;
        if (c6206iD0 != null) {
            AbstractC4830eD0.a(c6206iD0, view, motionEvent);
        }
        C6206iD0 c6206iD02 = this.a;
        if (c6206iD02 == null) {
            return false;
        }
        LK3.a();
        if (AbstractC4830eD0.d == null) {
            AbstractC4830eD0.d = new C4570dT3();
        }
        C4570dT3 c4570dT3 = AbstractC4830eD0.d;
        c4570dT3.a = view;
        c4570dT3.b = motionEvent;
        Object c = c6206iD02.a.b().c(c6206iD02, AbstractC4830eD0.d);
        C4570dT3 c4570dT32 = AbstractC4830eD0.d;
        c4570dT32.a = null;
        c4570dT32.b = null;
        return c != null && ((Boolean) c).booleanValue();
    }
}
