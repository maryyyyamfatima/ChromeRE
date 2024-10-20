package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029Hx3 extends Xd4 {
    public final WeakReference a;
    public int c = 0;
    public int b = 0;

    public C1029Hx3(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.Xd4
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
    }

    @Override // defpackage.Xd4
    public final void b(float f, int i, int i2) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            tabLayout.t(f, i, i3 != 2 || this.b == 1, (i3 == 2 && this.b == 0) ? false : true);
        }
    }

    @Override // defpackage.Xd4
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.j() == i || i >= tabLayout.l()) {
            return;
        }
        int i2 = this.c;
        tabLayout.r(tabLayout.k(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
