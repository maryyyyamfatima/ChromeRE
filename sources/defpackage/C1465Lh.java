package defpackage;

import android.text.TextUtils;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465Lh extends AbstractC8305oK2 {
    public final ArrayList i;
    public final ArrayList j;
    public C10230tw1 k;
    public boolean l;

    public C1465Lh(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, C10230tw1 c10230tw1) {
        this.i = new ArrayList(linkedHashSet);
        this.j = new ArrayList(linkedHashSet2);
        this.k = c10230tw1;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        if (i != this.i.size()) {
            return 0;
        }
        return this.l ? 1 : 2;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        if (i == 0) {
            return new ViewOnClickListenerC1335Kh(AbstractC9192qu3.a(recyclerView, R.layout.f55770_resource_name_obfuscated_res_0x7f0e003f, recyclerView, false));
        }
        if (i == 1) {
            return new C1724Nh(AbstractC9192qu3.a(recyclerView, R.layout.f58400_resource_name_obfuscated_res_0x7f0e015b, recyclerView, false));
        }
        if (i != 2) {
            return null;
        }
        return new ViewOnClickListenerC1594Mh(AbstractC9192qu3.a(recyclerView, R.layout.f55760_resource_name_obfuscated_res_0x7f0e003e, recyclerView, false));
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        if (s(i) == 0) {
            C10230tw1 M = M(i);
            ViewOnClickListenerC1335Kh viewOnClickListenerC1335Kh = (ViewOnClickListenerC1335Kh) dVar;
            boolean equals = M.equals(this.k);
            RadioButton radioButton = viewOnClickListenerC1335Kh.B;
            radioButton.setChecked(equals);
            String str = M.b;
            radioButton.setContentDescription(str);
            boolean equals2 = TextUtils.equals(M.a, null);
            TextView textView = viewOnClickListenerC1335Kh.A;
            TextView textView2 = viewOnClickListenerC1335Kh.z;
            String str2 = M.c;
            if (equals2) {
                textView2.setText(str);
                textView.setText(str2);
            } else {
                textView2.setText(str2);
                textView.setText(str);
            }
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        int size = this.i.size() + 1;
        return this.l ? size + this.j.size() : size;
    }

    public final C10230tw1 M(int i) {
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            return (C10230tw1) arrayList.get(i);
        }
        if (i > arrayList.size()) {
            return (C10230tw1) this.j.get((i - arrayList.size()) - 1);
        }
        return null;
    }
}
