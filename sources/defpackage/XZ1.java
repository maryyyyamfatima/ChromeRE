package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XZ1 implements InterfaceC8030nY1 {
    public final List a;
    public final InterfaceC9208qx2 b;

    public XZ1(ArrayList arrayList, InterfaceC9208qx2 interfaceC9208qx2) {
        this.a = arrayList;
        this.b = interfaceC9208qx2;
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        C7686mY1 b;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC6098hu1 interfaceC6098hu1 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC8030nY1 interfaceC8030nY1 = (InterfaceC8030nY1) list.get(i3);
            if (interfaceC8030nY1.a(obj) && (b = interfaceC8030nY1.b(obj, i, i2, c0543Ee2)) != null) {
                arrayList.add(b.c);
                interfaceC6098hu1 = b.a;
            }
        }
        if (arrayList.isEmpty() || interfaceC6098hu1 == null) {
            return null;
        }
        return new C7686mY1(interfaceC6098hu1, new WZ1(arrayList, this.b));
    }

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC8030nY1) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC4199cO1.a("MultiModelLoader{modelLoaders=", Arrays.toString(this.a.toArray()), "}");
    }
}
