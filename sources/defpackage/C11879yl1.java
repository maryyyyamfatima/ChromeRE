package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yl1 */
/* loaded from: classes2.dex */
public final class C11879yl1 extends AbstractC0187Bl1 {
    public C2136Ql1 c;
    public View d;
    public View e;
    public final /* synthetic */ C0447Dl1 f;

    @Override // defpackage.AbstractC0187Bl1
    public final int c() {
        return 1;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void e() {
        C2136Ql1 c2136Ql1 = (C2136Ql1) this.f.i.get(0);
        this.c = c2136Ql1;
        this.d = c2136Ql1.getChildAt(0);
        C2136Ql1 c2136Ql12 = this.c;
        View view = ((InfoBar) c2136Ql12.a).k;
        this.e = view;
        c2136Ql12.addView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11879yl1(C0447Dl1 c0447Dl1) {
        super(c0447Dl1);
        this.f = c0447Dl1;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final Animator a() {
        float max = Math.max(0, this.e.getHeight() - this.d.getHeight());
        C0447Dl1 c0447Dl1 = this.f;
        c0447Dl1.setTranslationY(max);
        this.e.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ObjectAnimator.ofFloat(this.d, (Property<View, Float>) View.ALPHA, 0.0f).setDuration(200L), ObjectAnimator.ofFloat(c0447Dl1, (Property<C0447Dl1, Float>) View.TRANSLATION_Y, Math.max(0, -r0)).setDuration(250L), ObjectAnimator.ofFloat(this.e, (Property<View, Float>) View.ALPHA, 1.0f).setDuration(200L));
        return animatorSet;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void d() {
        this.c.removeViewAt(0);
        C0447Dl1 c0447Dl1 = this.f;
        c0447Dl1.setTranslationY(0.0f);
        InfoBar infoBar = (InfoBar) this.c.a;
        infoBar.n = true;
        c0447Dl1.announceForAccessibility(infoBar.p());
    }
}
