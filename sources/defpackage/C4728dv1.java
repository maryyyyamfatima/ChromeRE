package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import org.chromium.chrome.browser.keyboard_accessory.tab_layout_component.b;
import org.chromium.chrome.browser.keyboard_accessory.tab_layout_component.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dv1 */
/* loaded from: classes.dex */
public final class C4728dv1 extends AbstractC9538rv1 {
    public TabLayout A;
    public C5760gv1 z;

    @Override // defpackage.AbstractC9538rv1
    public final void v(C5416fv1 c5416fv1, View view) {
        C5760gv1 c5760gv1 = (C5760gv1) c5416fv1;
        TabLayout tabLayout = (TabLayout) view;
        this.z = c5760gv1;
        this.A = tabLayout;
        c cVar = c5760gv1.c.a;
        if (cVar.c.containsKey(tabLayout)) {
            return;
        }
        cVar.c.put(tabLayout, new b(cVar, tabLayout));
    }

    public C4728dv1(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0158, recyclerView);
    }

    @Override // defpackage.AbstractC9538rv1
    public final void w() {
        C5760gv1 c5760gv1 = this.z;
        b bVar = (b) c5760gv1.c.a.c.remove(this.A);
        if (bVar != null) {
            C7822mv1 c7822mv1 = bVar.c.b;
            c7822mv1.h.remove(bVar.b);
            bVar.a.b();
            bVar.b = null;
        }
    }
}
