package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RK2 extends AbstractC8305oK2 implements InterfaceC7581mD1 {
    public final PK2 i;
    public final QK2 j;

    /* JADX WARN: Multi-variable type inference failed */
    public RK2(PK2 pk2, QK2 qk2) {
        this.i = pk2;
        this.j = qk2;
        ((AbstractC8269oD1) pk2).l(this);
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.i.a();
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        return this.i.getItemViewType(i);
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        return (d) this.j.a(i, recyclerView);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        this.i.b(dVar, i, null);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void D(d dVar, int i, List list) {
        if (list.isEmpty()) {
            C(dVar, i);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.i.b(dVar, i, it.next());
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final void I(d dVar) {
        this.i.g(dVar);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void m(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2) {
        y(i, i2);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void k(int i, int i2) {
        z(i, i2);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void p(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2, Object obj) {
        x(obj, i, i2);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void f(int i, int i2) {
        w(i, i2);
    }
}
