package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xl1 */
/* loaded from: classes2.dex */
public final class C11536xl1 extends AbstractC0187Bl1 {
    public C2136Ql1 c;
    public C2136Ql1 d;
    public View e;
    public final /* synthetic */ C0447Dl1 f;

    @Override // defpackage.AbstractC0187Bl1
    public final int c() {
        return 2;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void e() {
        C0447Dl1 c0447Dl1 = this.f;
        this.c = (C2136Ql1) c0447Dl1.i.get(0);
        C2136Ql1 c2136Ql1 = (C2136Ql1) c0447Dl1.i.get(1);
        this.d = c2136Ql1;
        View view = ((InfoBar) c2136Ql1.a).k;
        this.e = view;
        c2136Ql1.addView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11536xl1(C0447Dl1 c0447Dl1) {
        super(c0447Dl1);
        this.f = c0447Dl1;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final Animator a() {
        int height = this.d.getHeight();
        C0447Dl1 c0447Dl1 = this.f;
        int height2 = (height - c0447Dl1.g) - this.c.getHeight();
        int max = Math.max(height2, 0);
        int max2 = Math.max(-height2, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        float f = max;
        this.c.setTranslationY(f);
        animatorSet.play(b(this.c, r5.getHeight() + max).setDuration(250L));
        for (int i = 1; i < c0447Dl1.i.size(); i++) {
            ((C2136Ql1) c0447Dl1.i.get(i)).setTranslationY(f);
            animatorSet.play(b((C2136Ql1) c0447Dl1.i.get(i), max2).setDuration(250L));
        }
        this.e.setAlpha(0.0f);
        animatorSet.play(ObjectAnimator.ofFloat(this.e, (Property<View, Float>) View.ALPHA, 1.0f).setDuration(100L)).after(250L);
        return animatorSet;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void d() {
        this.c.removeAllViews();
        C2136Ql1 c2136Ql1 = this.c;
        C0447Dl1 c0447Dl1 = this.f;
        c0447Dl1.removeView(c2136Ql1);
        c0447Dl1.i.remove(c2136Ql1);
        c0447Dl1.j();
        int i = 0;
        while (true) {
            ArrayList arrayList = c0447Dl1.i;
            if (i < arrayList.size()) {
                ((C2136Ql1) arrayList.get(i)).setTranslationY(0.0f);
                i++;
            } else {
                c0447Dl1.announceForAccessibility(((InfoBar) this.d.a).p());
                return;
            }
        }
    }
}
