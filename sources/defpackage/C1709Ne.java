package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ne */
/* loaded from: classes.dex */
public final class C1709Ne implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DM1 a;
    public final /* synthetic */ AppBarLayout g;

    public C1709Ne(AppBarLayout appBarLayout, DM1 dm1) {
        this.g = appBarLayout;
        this.a = dm1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.i(floatValue);
        AppBarLayout appBarLayout = this.g;
        Drawable drawable = appBarLayout.v;
        if (drawable instanceof DM1) {
            ((DM1) drawable).i(floatValue);
        }
        Iterator it = appBarLayout.t.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }
}
