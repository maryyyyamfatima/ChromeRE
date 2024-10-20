package defpackage;

import android.animation.Animator;
import android.view.View;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Du2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0493Du2 implements Animator.AnimatorListener {
    public final /* synthetic */ PickerVideoPlayer a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        View view = pickerVideoPlayer.n;
        pickerVideoPlayer.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        View view = pickerVideoPlayer.n;
        pickerVideoPlayer.getClass();
    }

    public C0493Du2(PickerVideoPlayer pickerVideoPlayer) {
        this.a = pickerVideoPlayer;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = PickerVideoPlayer.F;
        PickerVideoPlayer pickerVideoPlayer = this.a;
        pickerVideoPlayer.q.setClickable(false);
        pickerVideoPlayer.s.setClickable(false);
        pickerVideoPlayer.z = false;
    }
}
