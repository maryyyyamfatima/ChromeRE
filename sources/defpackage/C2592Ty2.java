package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ty2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2592Ty2 implements InterfaceC12197zh0 {
    public InterfaceC11007wC1 a;
    public int b;

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.a = interfaceC11007wC1;
        return interfaceC11007wC1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        InterfaceC11007wC1 interfaceC11007wC1 = this.a;
        if (interfaceC11007wC1 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OC1 oc1 = (OC1) it.next();
            if ((arrayList2.size() >= (this.b + 1) * 25) && !z2) {
                z = true;
                break;
            }
            z2 |= oc1 instanceof IC1;
            if ((oc1 instanceof GC1) && ((GC1) oc1).d == 3) {
                z2 = false;
            }
            arrayList2.add(oc1);
        }
        if (z) {
            arrayList2.add(new LC1());
        }
        interfaceC11007wC1.b(arrayList2);
    }

    @Override // defpackage.InterfaceC12197zh0
    public final void c() {
        this.b++;
    }

    @Override // defpackage.InterfaceC12197zh0
    public final void reset() {
        this.b = 0;
    }
}
