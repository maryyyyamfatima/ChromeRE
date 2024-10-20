package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tv3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10226tv3 {
    public final C12157za2 a = new C12157za2();
    public InterfaceC10590uz3 b;
    public C8855pv3 c;
    public C9198qv3 d;
    public C9540rv3 e;
    public int f;
    public boolean g;

    public final void a(InterfaceC9883sv3 interfaceC9883sv3) {
        this.a.a(interfaceC9883sv3);
        InterfaceC10590uz3 interfaceC10590uz3 = this.b;
        if (interfaceC10590uz3 != null) {
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
            if (abstractC11276wz3.i) {
                interfaceC9883sv3.a(abstractC11276wz3.c.d().getCount(), ((AbstractC11276wz3) this.b).o());
            }
        }
    }

    public final void b() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.b;
        if (!((AbstractC11276wz3) interfaceC10590uz3).i) {
            return;
        }
        int count = ((AbstractC11276wz3) interfaceC10590uz3).c.d().getCount();
        boolean o = ((AbstractC11276wz3) this.b).o();
        if (this.f == count && this.g == o) {
            return;
        }
        this.f = count;
        this.g = o;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9883sv3) c11814ya2.next()).a(count, o);
            }
        }
    }
}
