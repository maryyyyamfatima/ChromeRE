package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ul1 */
/* loaded from: classes2.dex */
public final class C10507ul1 extends AbstractC0187Bl1 {
    public final InterfaceC2006Pl1 c;
    public C2136Ql1 d;
    public View e;
    public final /* synthetic */ C0447Dl1 f;

    @Override // defpackage.AbstractC0187Bl1
    public final int c() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10507ul1(C0447Dl1 c0447Dl1, InterfaceC2006Pl1 interfaceC2006Pl1) {
        super(c0447Dl1);
        this.f = c0447Dl1;
        this.c = interfaceC2006Pl1;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void e() {
        InterfaceC2006Pl1 interfaceC2006Pl1 = this.c;
        this.e = ((InfoBar) interfaceC2006Pl1).k;
        C0447Dl1 c0447Dl1 = this.f;
        C2136Ql1 c2136Ql1 = new C2136Ql1(c0447Dl1.getContext(), interfaceC2006Pl1);
        this.d = c2136Ql1;
        c2136Ql1.addView(this.e);
        c0447Dl1.c(this.d);
    }

    @Override // defpackage.AbstractC0187Bl1
    public final Animator a() {
        this.d.setTranslationY(r0.getHeight());
        this.e.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(b(this.d, 0.0f).setDuration(250L), ObjectAnimator.ofFloat(this.e, (Property<View, Float>) View.ALPHA, 1.0f).setDuration(100L));
        return animatorSet;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void d() {
        this.f.announceForAccessibility(((InfoBar) this.c).p());
    }
}
