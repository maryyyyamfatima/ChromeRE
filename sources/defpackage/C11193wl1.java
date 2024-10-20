package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wl1 */
/* loaded from: classes2.dex */
public final class C11193wl1 extends AbstractC0187Bl1 {
    public final InterfaceC2006Pl1 c;
    public C2136Ql1 d;
    public C2136Ql1 e;
    public View f;
    public final /* synthetic */ C0447Dl1 g;

    @Override // defpackage.AbstractC0187Bl1
    public final int c() {
        return 0;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void e() {
        C0447Dl1 c0447Dl1 = this.g;
        this.e = (C2136Ql1) c0447Dl1.i.get(0);
        InterfaceC2006Pl1 interfaceC2006Pl1 = this.c;
        this.f = ((InfoBar) interfaceC2006Pl1).k;
        C2136Ql1 c2136Ql1 = new C2136Ql1(c0447Dl1.getContext(), interfaceC2006Pl1);
        this.d = c2136Ql1;
        c2136Ql1.addView(this.f);
        C2136Ql1 c2136Ql12 = this.d;
        c0447Dl1.getClass();
        c0447Dl1.addView(c2136Ql12, new FrameLayout.LayoutParams(-1, -2));
        c0447Dl1.i.add(0, c2136Ql12);
        c0447Dl1.j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11193wl1(C0447Dl1 c0447Dl1, InterfaceC2006Pl1 interfaceC2006Pl1) {
        super(c0447Dl1);
        this.g = c0447Dl1;
        this.c = interfaceC2006Pl1;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final Animator a() {
        int i;
        int height = this.d.getHeight();
        C0447Dl1 c0447Dl1 = this.g;
        int height2 = (height + c0447Dl1.g) - this.e.getHeight();
        int height3 = this.d.getHeight();
        if (height2 < 0) {
            height3 -= height2;
            i = 0 - height2;
        } else {
            i = 0;
        }
        this.d.setTranslationY(height3);
        this.f.setAlpha(0.0f);
        c0447Dl1.m.run();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(b(this.d, i).setDuration(250L));
        int max = Math.max(0, height2);
        int max2 = Math.max(-height2, 0);
        for (int i2 = 1; i2 < c0447Dl1.i.size(); i2++) {
            ((C2136Ql1) c0447Dl1.i.get(i2)).setTranslationY(max);
            animatorSet.play(b((C2136Ql1) c0447Dl1.i.get(i2), max2).setDuration(250L));
        }
        animatorSet.play(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) View.ALPHA, 1.0f).setDuration(100L)).after(250L);
        return animatorSet;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void d() {
        this.e.removeAllViews();
        int i = 0;
        while (true) {
            C0447Dl1 c0447Dl1 = this.g;
            if (i >= c0447Dl1.i.size()) {
                c0447Dl1.j();
                c0447Dl1.announceForAccessibility(((InfoBar) this.c).p());
                return;
            } else {
                ((C2136Ql1) c0447Dl1.i.get(i)).setTranslationY(0.0f);
                i++;
            }
        }
    }
}
