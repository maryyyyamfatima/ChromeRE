package defpackage;

import android.animation.Animator;
import android.widget.ImageView;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0623Eu2 implements Animator.AnimatorListener {
    public final /* synthetic */ PickerVideoPlayer a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        ImageView imageView = pickerVideoPlayer.p;
        pickerVideoPlayer.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        pickerVideoPlayer.p.setClickable(false);
        ImageView imageView = pickerVideoPlayer.p;
        pickerVideoPlayer.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        pickerVideoPlayer.m = false;
        ImageView imageView = pickerVideoPlayer.p;
        pickerVideoPlayer.getClass();
    }

    public C0623Eu2(PickerVideoPlayer pickerVideoPlayer) {
        this.a = pickerVideoPlayer;
    }
}
