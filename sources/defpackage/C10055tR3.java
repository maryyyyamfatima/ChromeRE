package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tR3 */
/* loaded from: classes2.dex */
public final class C10055tR3 extends AnimatorListenerAdapter {
    public final /* synthetic */ ToolbarTablet a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ToolbarTablet toolbarTablet = this.a;
        if (toolbarTablet.H[0].getAlpha() == 0.0f) {
            for (ImageButton imageButton : toolbarTablet.H) {
                imageButton.setVisibility(8);
                imageButton.setAlpha(1.0f);
            }
            toolbarTablet.d0(false);
        }
        toolbarTablet.R = null;
    }

    public C10055tR3(ToolbarTablet toolbarTablet) {
        this.a = toolbarTablet;
    }
}
