package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fz3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5440fz3 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ AbstractC6470iz3 g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC6470iz3 abstractC6470iz3 = this.g;
        abstractC6470iz3.i.setVisibility(8);
        abstractC6470iz3.i.removeView(this.a);
    }

    public C5440fz3(AbstractC6470iz3 abstractC6470iz3, ModalDialogView modalDialogView) {
        this.g = abstractC6470iz3;
        this.a = modalDialogView;
    }
}
