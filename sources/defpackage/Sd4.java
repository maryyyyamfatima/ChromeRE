package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Sd4 extends Xd4 {
    public final /* synthetic */ ViewPager2 a;

    public Sd4(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.Xd4
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.o.requestFocus(2);
        }
    }
}
