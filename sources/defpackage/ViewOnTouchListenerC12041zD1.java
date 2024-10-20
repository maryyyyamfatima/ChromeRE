package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC12041zD1 implements View.OnTouchListener {
    public final /* synthetic */ BD1 a;

    public ViewOnTouchListenerC12041zD1(BD1 bd1) {
        this.a = bd1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2234Rf c2234Rf;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        BD1 bd1 = this.a;
        if (action == 0 && (c2234Rf = bd1.E) != null && c2234Rf.isShowing() && x >= 0) {
            C2234Rf c2234Rf2 = bd1.E;
            if (x < c2234Rf2.getWidth() && y >= 0 && y < c2234Rf2.getHeight()) {
                bd1.A.postDelayed(bd1.w, 250L);
                return false;
            }
        }
        if (action != 1) {
            return false;
        }
        bd1.A.removeCallbacks(bd1.w);
        return false;
    }
}
