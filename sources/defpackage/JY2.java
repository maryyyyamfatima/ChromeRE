package defpackage;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JY2 implements View.OnTouchListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ LY2 g;

    public JY2(LY2 ly2, View view) {
        this.g = ly2;
        this.a = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        LY2 ly2 = this.g;
        ObjectAnimator objectAnimator = ly2.a;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            ly2.a.cancel();
        }
        ly2.a = null;
        this.a.setOnTouchListener(null);
        return false;
    }
}
