package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zD2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12042zD2 extends AbstractC5519gD1 {
    public final C11699yD2 h = new VD2() { // from class: yD2
        @Override // defpackage.VD2
        public final void d(WD2 wd2, Object obj) {
            C12042zD2 c12042zD2 = C12042zD2.this;
            c12042zD2.o(obj, c12042zD2.indexOf(wd2), 1);
        }
    };

    @Override // defpackage.AbstractC5519gD1
    public final void u(int i, Collection collection) {
        throw null;
    }

    @Override // defpackage.AbstractC5519gD1
    public final void v(InterfaceC2608Ub3 interfaceC2608Ub3, int i) {
        throw null;
    }

    @Override // defpackage.AbstractC5519gD1
    public final Object y(int i) {
        WD2 wd2 = (WD2) super.y(i);
        wd2.d(this.h);
        return wd2;
    }

    @Override // defpackage.AbstractC5519gD1
    public final void z(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ((WD2) get(0 + i3)).d(this.h);
        }
        super.z(0, i2);
    }

    @Override // defpackage.AbstractC5519gD1
    public final void A(List list) {
        C11699yD2 c11699yD2;
        Iterator it = iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c11699yD2 = this.h;
            if (!hasNext) {
                break;
            } else {
                ((WD2) it.next()).d(c11699yD2);
            }
        }
        super.A(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((WD2) it2.next()).a(c11699yD2);
        }
    }
}
