package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dc3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4617dc3 extends AbstractC8305oK2 {
    public final C7616mK1 i;
    public final SparseArray j = new SparseArray();

    public C4617dc3(C7616mK1 c7616mK1) {
        this.i = c7616mK1;
        c7616mK1.l(new C3930bc3(this));
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.i.size();
    }

    public final void Q(int i, InterfaceC7960nK1 interfaceC7960nK1, TD2 td2) {
        this.j.put(i, new Pair(interfaceC7960nK1, td2));
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        return ((C7272lK1) this.i.get(i)).a;
    }

    public View M(int i, RecyclerView recyclerView) {
        return ((InterfaceC7960nK1) ((Pair) this.j.get(i)).first).a(recyclerView);
    }

    @Override // defpackage.AbstractC8305oK2
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C4273cc3 E(int i, RecyclerView recyclerView) {
        return new C4273cc3(M(i, recyclerView), (TD2) ((Pair) this.j.get(i)).second);
    }

    @Override // defpackage.AbstractC8305oK2
    /* renamed from: N */
    public void C(C4273cc3 c4273cc3, int i) {
        c4273cc3.v(((C7272lK1) this.i.get(i)).b);
    }

    @Override // defpackage.AbstractC8305oK2
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void I(C4273cc3 c4273cc3) {
        c4273cc3.v(null);
    }
}
