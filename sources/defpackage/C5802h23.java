package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageButton;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h23, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5802h23 {
    public final ImageButton a;
    public final View b;
    public final AnimatorSet c;
    public final AnimatorSet d;
    public final int e;

    public C5802h23(ImageButton imageButton, View view) {
        this.a = imageButton;
        this.b = view;
        this.e = imageButton.getResources().getDimensionPixelSize(R.dimen.f34870_resource_name_obfuscated_res_0x7f0803bf);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
        InterpolatorC0485Dt interpolatorC0485Dt = InterpolatorC0485Dt.c;
        ofFloat.setInterpolator(interpolatorC0485Dt);
        ofFloat.setDuration(200L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageButton, (Property<ImageButton, Float>) View.ALPHA, 1.0f);
        ofFloat2.setInterpolator(InterpolatorC0485Dt.e);
        ofFloat2.setDuration(150L);
        ofFloat2.addListener(new C5114f23(this));
        animatorSet.playSequentially(ofFloat, ofFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageButton, (Property<ImageButton, Float>) View.ALPHA, 0.0f);
        ofFloat3.setInterpolator(InterpolatorC0485Dt.d);
        ofFloat3.setDuration(150L);
        ofFloat3.addListener(new C5458g23(this));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -r3);
        ofFloat4.setInterpolator(interpolatorC0485Dt);
        ofFloat4.setDuration(200L);
        animatorSet2.playSequentially(ofFloat3, ofFloat4);
    }
}
