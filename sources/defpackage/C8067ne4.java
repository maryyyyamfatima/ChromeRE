package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ne4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8067ne4 implements OV3 {
    public final KH a;

    public C8067ne4(KH kh) {
        this.a = kh;
    }

    @Override // defpackage.OV3
    public final void a(NV3 nv3) {
        AbstractC6026hi1 abstractC6026hi1 = (AbstractC6026hi1) nv3;
        if (abstractC6026hi1.a != null) {
            this.a.getClass();
            View view = abstractC6026hi1.a;
            view.clearAnimation();
            Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.f450_resource_name_obfuscated_res_0x7f020033);
            loadAnimation.setAnimationListener(new WZ0(view));
            view.startAnimation(loadAnimation);
        }
    }
}
