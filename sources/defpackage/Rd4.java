package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Rd4 extends Xd4 {
    public final /* synthetic */ ViewPager2 a;

    public Rd4(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.Xd4
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.i != i) {
            viewPager2.i = i;
            viewPager2.v.e();
        }
    }

    @Override // defpackage.Xd4
    public final void a(int i) {
        if (i == 0) {
            this.a.f();
        }
    }
}
