package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2890Wg0 implements InterfaceC12197zh0 {
    public InterfaceC11007wC1 a;
    public int b;

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.a = interfaceC11007wC1;
        return interfaceC11007wC1;
    }

    @Override // defpackage.InterfaceC12197zh0
    public final void c() {
        this.b++;
    }

    @Override // defpackage.InterfaceC12197zh0
    public final void reset() {
        this.b = 0;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        boolean z;
        InterfaceC11007wC1 interfaceC11007wC1 = this.a;
        if (interfaceC11007wC1 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            OC1 oc1 = (OC1) it.next();
            if ((oc1 instanceof MC1) && arrayList2.size() >= (this.b + 1) * 25) {
                z = true;
                break;
            }
            arrayList2.add(oc1);
        }
        if (z) {
            arrayList2.add(new LC1());
            this.b = (arrayList2.size() / 25) - 1;
        }
        interfaceC11007wC1.b(arrayList2);
    }
}
