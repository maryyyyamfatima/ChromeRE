package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import org.chromium.chrome.browser.infobar.TranslateCompactInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LW3 implements View.OnClickListener {
    public final /* synthetic */ TranslateCompactInfoBar a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TranslateCompactInfoBar translateCompactInfoBar = this.a;
        ObjectAnimator objectAnimator = translateCompactInfoBar.t.V;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        TranslateCompactInfoBar.y(3);
        translateCompactInfoBar.x(0);
        RW3 rw3 = translateCompactInfoBar.u;
        ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1 = translateCompactInfoBar.x;
        rw3.e(0, viewOnClickListenerC7418ll1 != null ? viewOnClickListenerC7418ll1.getWidth() : 0);
        translateCompactInfoBar.A = true;
    }

    public LW3(TranslateCompactInfoBar translateCompactInfoBar) {
        this.a = translateCompactInfoBar;
    }
}
