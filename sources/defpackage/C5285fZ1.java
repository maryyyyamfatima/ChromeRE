package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.chrome.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.suggestions.tile.MostVisitedTilesGridLayout;
import org.chromium.chrome.browser.suggestions.tile.SuggestionsTileView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fZ1 */
/* loaded from: classes.dex */
public final class C5285fZ1 implements HG3 {
    public final Resources a;
    public final QZ3 g;
    public final ViewGroup h;
    public final ViewStub i;
    public final PropertyModel j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final Runnable o;
    public final Runnable p;
    public int q;
    public C11745yM3 r;
    public ZL3 s;
    public boolean t;
    public boolean u = true;

    public C5285fZ1(Resources resources, QZ3 qz3, ViewGroup viewGroup, ViewStub viewStub, C11745yM3 c11745yM3, PropertyModel propertyModel, boolean z, boolean z2, boolean z3, E32 e32, F32 f32) {
        this.a = resources;
        this.g = qz3;
        this.r = c11745yM3;
        this.j = propertyModel;
        this.k = z2;
        this.l = z3;
        this.o = e32;
        this.p = f32;
        this.h = viewGroup;
        this.i = viewStub;
        this.m = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807f6);
        this.n = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807f5);
        b();
        if (!z || this.t) {
            return;
        }
        try {
            Object obj = C3911bZ1.c;
            C7432ln3 e = C7432ln3.e();
            try {
                ArrayList e2 = C3911bZ1.e();
                e.close();
                if (e2 == null) {
                    return;
                }
                this.r.c(e2, viewGroup, null);
                e();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException unused2) {
            AbstractC4851eH1.d("TopSites", "No cached MV tiles file.", new Object[0]);
        }
    }

    @Override // defpackage.HG3
    public final void x() {
        c();
    }

    public final SuggestionsTileView a(C7722me3 c7722me3) {
        ViewGroup viewGroup = this.h;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            SuggestionsTileView suggestionsTileView = (SuggestionsTileView) viewGroup.getChildAt(i);
            if (c7722me3.equals(suggestionsTileView.k)) {
                return suggestionsTileView;
            }
        }
        return null;
    }

    public final void b() {
        if (this.k) {
            Resources resources = this.a;
            if (resources.getConfiguration().orientation == 2 || this.q != 0) {
                return;
            }
            boolean z = this.l;
            int i = this.n;
            if (!z) {
                PZ3 pz3 = this.g.a;
                this.q = Math.max(-resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807f4), (int) (((resources.getDisplayMetrics().widthPixels - i) - (resources.getDimensionPixelOffset(pz3.a == 0 || pz3.b == 0 ? R.dimen.0_resource_name_obfuscated_res_0x7f0807f9 : R.dimen.0_resource_name_obfuscated_res_0x7f0807f8) * 4.5d)) / 4.0d));
                return;
            }
            this.q = i;
        }
    }

    public final void e() {
        if (!this.k || this.h.getChildCount() < 1) {
            return;
        }
        int i = this.a.getConfiguration().orientation;
        PD2 pd2 = AbstractC7347lZ1.d;
        PD2 pd22 = AbstractC7347lZ1.e;
        PropertyModel propertyModel = this.j;
        if (i == 2) {
            int i2 = this.m;
            propertyModel.o(pd22, Integer.valueOf(i2));
            propertyModel.o(pd2, Integer.valueOf(i2));
        } else {
            propertyModel.o(pd22, Integer.valueOf(this.n));
            propertyModel.o(pd2, Integer.valueOf(this.q));
        }
    }

    public final void c() {
        int i;
        boolean b = IG3.a().b();
        if (this.u == b) {
            return;
        }
        this.u = b;
        d();
        if (this.k) {
            return;
        }
        ViewGroup viewGroup = this.h;
        MostVisitedTilesGridLayout mostVisitedTilesGridLayout = (MostVisitedTilesGridLayout) viewGroup;
        boolean z = this.u;
        if (mostVisitedTilesGridLayout.l != z) {
            mostVisitedTilesGridLayout.l = z;
            Resources resources = mostVisitedTilesGridLayout.getResources();
            if (mostVisitedTilesGridLayout.l) {
                if (MJ0.c()) {
                    i = R.dimen.0_resource_name_obfuscated_res_0x7f0807e1;
                } else if (MJ0.d()) {
                    i = R.dimen.0_resource_name_obfuscated_res_0x7f0807e2;
                }
                mostVisitedTilesGridLayout.i = resources.getDimensionPixelOffset(i);
            }
            i = R.dimen.0_resource_name_obfuscated_res_0x7f0807e0;
            mostVisitedTilesGridLayout.i = resources.getDimensionPixelOffset(i);
        }
        viewGroup.requestLayout();
    }

    public final void d() {
        boolean z;
        ZL3 zl3 = this.s;
        if (zl3 == null) {
            return;
        }
        boolean z2 = false;
        if (zl3.l) {
            int i = 0;
            while (true) {
                if (i >= zl3.h.size()) {
                    z = true;
                    break;
                } else {
                    if (!((List) zl3.h.valueAt(i)).isEmpty()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (z && !this.u) {
                z2 = true;
            }
        }
        PropertyModel propertyModel = this.j;
        if (z2) {
            PD2 pd2 = AbstractC7347lZ1.c;
            if (propertyModel.i(pd2) == null) {
                propertyModel.o(pd2, this.i.inflate());
            }
        }
        propertyModel.k(AbstractC7347lZ1.b, !z2);
    }
}
