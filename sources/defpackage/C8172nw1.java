package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.base.LocaleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nw1 */
/* loaded from: classes.dex */
public final class C8172nw1 extends AbstractC8305oK2 {
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashSet k;

    public C8172nw1(C9202qw1 c9202qw1, HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        return i == this.i.size() ? 1 : 0;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        if (i == 0) {
            return new ViewOnClickListenerC7828mw1(AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e015a, recyclerView, false));
        }
        if (i == 1) {
            return new C8859pw1(AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e015b, recyclerView, false));
        }
        return null;
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        C10230tw1 c10230tw1;
        if (s(i) == 0) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                c10230tw1 = (C10230tw1) arrayList.get(i);
            } else {
                c10230tw1 = i > arrayList.size() ? (C10230tw1) this.j.get((i - arrayList.size()) - 1) : null;
            }
            ViewOnClickListenerC7828mw1 viewOnClickListenerC7828mw1 = (ViewOnClickListenerC7828mw1) dVar;
            viewOnClickListenerC7828mw1.z.setText(c10230tw1.b);
            viewOnClickListenerC7828mw1.A.setText(c10230tw1.c);
            String str = c10230tw1.a;
            viewOnClickListenerC7828mw1.D = str;
            HashSet hashSet = this.k;
            viewOnClickListenerC7828mw1.E = hashSet;
            viewOnClickListenerC7828mw1.B.setChecked(hashSet.contains(str));
            viewOnClickListenerC7828mw1.C.setVisibility(LocaleUtils.getDefaultLocaleString().equals(str) ? 0 : 4);
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.j.size() + this.i.size() + 1;
    }
}
