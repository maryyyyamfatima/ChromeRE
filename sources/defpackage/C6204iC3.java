package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.tasks.tab_management.PriceTrackingDialogView;
import org.chromium.chrome.browser.tasks.tab_management.j;
import org.chromium.chrome.browser.tasks.tab_management.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iC3 */
/* loaded from: classes.dex */
public final class C6204iC3 implements InterfaceC9035qT1 {
    public final /* synthetic */ n a;

    @Override // defpackage.InterfaceC9035qT1
    public final boolean a(int i, boolean z) {
        j jVar;
        boolean z2 = n.K;
        n nVar = this.a;
        if ((z2 && nVar.o == 2) || (!z2 && nVar.o == 0)) {
            return false;
        }
        if (i == R.id.menu_group_tabs && (jVar = nVar.u) != null) {
            GA3 ga3 = jVar.e;
            String str = nVar.v.a;
            Integer valueOf = Integer.valueOf(R.plurals.0_resource_name_obfuscated_res_0x7f12000b);
            C7578mC3 c7578mC3 = nVar.v;
            ga3.a(str, valueOf, c7578mC3.b, 2, c7578mC3.c);
            nVar.u.e.c(0, ((AbstractC11276wz3) nVar.n).c.d().H());
            FI2.a("MobileMenuGroupTabs");
            return true;
        }
        if (i != R.id.track_prices_row_menu_id) {
            return false;
        }
        C1817Nz2 c1817Nz2 = nVar.I;
        PriceTrackingDialogView priceTrackingDialogView = c1817Nz2.h;
        priceTrackingDialogView.h.setVisibility(AbstractC1947Oz2.a() ? 0 : 8);
        priceTrackingDialogView.i.setVisibility(AbstractC1947Oz2.c() ? 0 : 8);
        priceTrackingDialogView.a.setChecked(AbstractC2077Pz2.c());
        c1817Nz2.g.l(c1817Nz2.a, 1, false);
        return true;
    }

    public C6204iC3(n nVar) {
        this.a = nVar;
    }
}
