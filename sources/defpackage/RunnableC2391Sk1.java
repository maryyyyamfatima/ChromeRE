package defpackage;

import androidx.viewpager.widget.ViewPager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2391Sk1 implements Runnable {
    public final /* synthetic */ ViewPager a;
    public final /* synthetic */ C2651Uk1 g;

    public RunnableC2391Sk1(ViewPager viewPager, C2651Uk1 c2651Uk1) {
        this.a = viewPager;
        this.g = c2651Uk1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.g);
    }
}
