package defpackage;

import android.animation.Animator;
import android.view.View;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0753Fu2 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerVideoPlayer g;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.g;
        View view = pickerVideoPlayer.n;
        pickerVideoPlayer.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.g;
        View view = pickerVideoPlayer.n;
        pickerVideoPlayer.getClass();
    }

    public C0753Fu2(PickerVideoPlayer pickerVideoPlayer, int i) {
        this.g = pickerVideoPlayer;
        this.a = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = PickerVideoPlayer.F;
        PickerVideoPlayer pickerVideoPlayer = this.g;
        pickerVideoPlayer.q.setClickable(true);
        pickerVideoPlayer.s.setClickable(true);
        pickerVideoPlayer.c(this.a);
    }
}
