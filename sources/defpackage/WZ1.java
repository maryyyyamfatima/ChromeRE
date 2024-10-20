package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WZ1 implements InterfaceC3145Yf0, InterfaceC3015Xf0 {
    public final List a;
    public final InterfaceC9208qx2 g;
    public int h;
    public EnumC7567mA2 i;
    public InterfaceC3015Xf0 j;
    public List k;
    public boolean l;

    public WZ1(ArrayList arrayList, InterfaceC9208qx2 interfaceC9208qx2) {
        this.g = interfaceC9208qx2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.a = arrayList;
        this.h = 0;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        this.i = enumC7567mA2;
        this.j = interfaceC3015Xf0;
        this.k = (List) this.g.b();
        ((InterfaceC3145Yf0) this.a.get(this.h)).c(enumC7567mA2, this);
        if (this.l) {
            cancel();
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        List list = this.k;
        if (list != null) {
            this.g.a(list);
        }
        this.k = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3145Yf0) it.next()).b();
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
        this.l = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3145Yf0) it.next()).cancel();
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return ((InterfaceC3145Yf0) this.a.get(0)).a();
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return ((InterfaceC3145Yf0) this.a.get(0)).e();
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void f(Object obj) {
        if (obj != null) {
            this.j.f(obj);
        } else {
            g();
        }
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void d(Exception exc) {
        List list = this.k;
        AbstractC6464iy2.b(list);
        list.add(exc);
        g();
    }

    public final void g() {
        if (this.l) {
            return;
        }
        if (this.h < this.a.size() - 1) {
            this.h++;
            c(this.i, this.j);
        } else {
            AbstractC6464iy2.b(this.k);
            this.j.d(new EZ0("Fetch failed", new ArrayList(this.k)));
        }
    }
}
