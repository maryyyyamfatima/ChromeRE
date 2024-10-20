package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataTabsFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jx3 */
/* loaded from: classes.dex */
public final class C1289Jx3 {
    public final TabLayout a;
    public final ViewPager2 b;
    public final C3535aT c;
    public AbstractC8305oK2 d;
    public boolean e;

    public C1289Jx3(TabLayout tabLayout, ViewPager2 viewPager2, C3535aT c3535aT) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = c3535aT;
    }

    public final void a(int i) {
        b(0, i, true, true);
    }

    public final void b(int i, int i2, boolean z, boolean z2) {
        String string;
        if (this.d == null) {
            return;
        }
        TabLayout tabLayout = this.a;
        if (z2) {
            int l = tabLayout.l();
            int min = Math.min(i2, l - i);
            if (min == l) {
                tabLayout.o();
            } else {
                for (int i3 = 0; i3 < min; i3++) {
                    tabLayout.p(i);
                }
            }
        }
        int q = this.d.q();
        if (z) {
            int min2 = Math.min(i2, q - i);
            for (int i4 = i; i4 < i + min2; i4++) {
                C0249Bx3 m = tabLayout.m();
                C3535aT c3535aT = this.c;
                c3535aT.getClass();
                int i5 = ClearBrowsingDataTabsFragment.c0;
                ClearBrowsingDataTabsFragment clearBrowsingDataTabsFragment = c3535aT.a;
                if (i4 == 0) {
                    string = clearBrowsingDataTabsFragment.getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f14033b);
                } else if (i4 == 1) {
                    string = clearBrowsingDataTabsFragment.getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f14085a);
                } else {
                    clearBrowsingDataTabsFragment.getClass();
                    throw new RuntimeException(AbstractC9076qb1.a("invalid position: ", i4));
                }
                m.d(string);
                tabLayout.d(m, i4, false);
            }
        }
        if (q == 0) {
            return;
        }
        int min3 = Math.min(this.b.i, tabLayout.l() - 1);
        if (min3 != tabLayout.j()) {
            tabLayout.r(tabLayout.k(min3), true);
        }
    }
}
