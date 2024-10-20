package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1824Ob extends AbstractC2084Qb {
    public final ObjectAnimator a;
    public final boolean b;

    public C1824Ob(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C1954Pb c1954Pb = new C1954Pb(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(c1954Pb.c);
        ofInt.setInterpolator(c1954Pb);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.AbstractC2084Qb
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.AbstractC2084Qb
    public final void c() {
        this.a.start();
    }

    @Override // defpackage.AbstractC2084Qb
    public final void b() {
        this.a.reverse();
    }

    @Override // defpackage.AbstractC2084Qb
    public final void d() {
        this.a.cancel();
    }
}
