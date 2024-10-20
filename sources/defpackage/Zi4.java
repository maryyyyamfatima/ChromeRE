package defpackage;

import J.N;
import android.view.MotionEvent;
import android.view.View;
import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Zi4 implements View.OnTouchListener {
    public final /* synthetic */ VrShell a;

    public Zi4(VrShell vrShell) {
        this.a = vrShell;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        VrShell vrShell = this.a;
        if (actionMasked != 0) {
            if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
                return false;
            }
            N.Mx9gLrf$(vrShell.A, vrShell, false);
            return true;
        }
        N.Mx9gLrf$(vrShell.A, vrShell, true);
        return true;
    }
}
