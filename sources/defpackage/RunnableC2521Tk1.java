package defpackage;

import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2521Tk1 implements Runnable {
    public final /* synthetic */ ViewPager a;
    public final /* synthetic */ C2651Uk1 g;

    public RunnableC2521Tk1(C2651Uk1 c2651Uk1, ViewPager viewPager) {
        this.g = c2651Uk1;
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a.R;
        if (arrayList != null) {
            arrayList.remove(this.g);
        }
    }
}
