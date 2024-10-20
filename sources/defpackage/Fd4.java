package defpackage;

import androidx.viewpager.widget.ViewPager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Fd4 implements Runnable {
    public final /* synthetic */ ViewPager a;

    public Fd4(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPager viewPager = this.a;
        viewPager.y(0);
        viewPager.r();
    }
}
