package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oD1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8269oD1 implements InterfaceC7925nD1 {
    public final C12157za2 a = new C12157za2();

    public final void l(InterfaceC7581mD1 interfaceC7581mD1) {
        this.a.a(interfaceC7581mD1);
    }

    public void q(int i, int i2) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC7581mD1) c11814ya2.next()).m(this, i, i2);
            }
        }
    }

    public void r(int i, int i2) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC7581mD1) c11814ya2.next()).k(i, i2);
            }
        }
    }

    public void o(Object obj, int i, int i2) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC7581mD1) c11814ya2.next()).p(this, i, i2, obj);
            }
        }
    }

    public final void n(int i, int i2) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC7581mD1) c11814ya2.next()).f(i, i2);
            }
        }
    }
}
