package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sR3 */
/* loaded from: classes2.dex */
public final class C9712sR3 extends AnimatorListenerAdapter {
    public final /* synthetic */ ToolbarTablet a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.R = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ToolbarTablet toolbarTablet = this.a;
        for (ImageButton imageButton : toolbarTablet.H) {
            imageButton.setVisibility(0);
        }
        toolbarTablet.d0(true);
    }

    public C9712sR3(ToolbarTablet toolbarTablet) {
        this.a = toolbarTablet;
    }
}
