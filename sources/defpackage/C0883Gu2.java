package defpackage;

import android.animation.Animator;
import android.widget.ImageView;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0883Gu2 implements Animator.AnimatorListener {
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
        pickerVideoPlayer.p.setClickable(true);
        ImageView imageView = pickerVideoPlayer.p;
        pickerVideoPlayer.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        ImageView imageView = pickerVideoPlayer.p;
        pickerVideoPlayer.getClass();
    }

    public C0883Gu2(PickerVideoPlayer pickerVideoPlayer) {
        this.a = pickerVideoPlayer;
    }
}
