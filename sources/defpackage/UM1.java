package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UM1 implements H14 {
    public static final K14 j = new K14(UM1.class);
    public View g;
    public Tab i;
    public final TM1 a = new TM1(this);
    public final SparseArray h = new SparseArray();

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public UM1(C10285u6 c10285u6, View view) {
        this.g = view;
        j.a(this, c10285u6.t);
    }

    public final void a(Tab tab) {
        int id = tab.getId();
        SparseArray sparseArray = this.h;
        if (sparseArray.indexOfKey(id) < 0) {
            return;
        }
        tab.w(this.a);
        sparseArray.remove(id);
        if (tab == this.i) {
            this.g.setVisibility(8);
            this.i = null;
        }
    }

    public final void b() {
        Tab tab = this.i;
        if (tab == null) {
            return;
        }
        C3223Yu3 V0 = C3223Yu3.V0(tab);
        if (V0.l) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            marginLayoutParams.topMargin = V0.i;
            marginLayoutParams.bottomMargin = V0.h;
            this.g.setLayoutParams(marginLayoutParams);
        }
    }
}
