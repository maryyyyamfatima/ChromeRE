package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Gd4 implements InterfaceC11483xc2 {
    public final Rect a = new Rect();
    public final /* synthetic */ ViewPager b;

    public Gd4(ViewPager viewPager) {
        this.b = viewPager;
    }

    @Override // defpackage.InterfaceC11483xc2
    public final C5389fq4 a(View view, C5389fq4 c5389fq4) {
        Hp4 c11563xp4;
        C5389fq4 h = Ec4.h(view, c5389fq4);
        if (h.a.m()) {
            return h;
        }
        int b = h.b();
        Rect rect = this.a;
        rect.left = b;
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        ViewPager viewPager = this.b;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C5389fq4 b2 = Ec4.b(viewPager.getChildAt(i), h);
            rect.left = Math.min(b2.b(), rect.left);
            rect.top = Math.min(b2.d(), rect.top);
            rect.right = Math.min(b2.c(), rect.right);
            rect.bottom = Math.min(b2.a(), rect.bottom);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            c11563xp4 = new Gp4(h);
        } else if (i2 >= 29) {
            c11563xp4 = new Ep4(h);
        } else {
            c11563xp4 = new C11563xp4(h);
        }
        c11563xp4.g(C2141Qm1.b(rect.left, rect.top, rect.right, rect.bottom));
        return c11563xp4.b();
    }
}
