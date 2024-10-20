package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10093tZ1 {
    public final InterfaceC10436uZ1 c;
    public C3471aG0 e;
    public final C3487aJ1 a = new C3487aJ1();
    public final ArrayList b = new ArrayList();
    public final HashMap d = new HashMap();
    public boolean f = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(AbstractC10779vZ1 abstractC10779vZ1) {
        C3471aG0 c3471aG0 = new C3471aG0(this, abstractC10779vZ1.a());
        if (abstractC10779vZ1 instanceof G14) {
            this.c.g((G14) abstractC10779vZ1);
            this.e = c3471aG0;
        }
        this.f = this.f || (abstractC10779vZ1 instanceof AbstractC2261Rk1);
        this.d.put(abstractC10779vZ1, c3471aG0);
        this.b.add(abstractC10779vZ1);
    }

    public C10093tZ1(InterfaceC10436uZ1 interfaceC10436uZ1) {
        this.c = interfaceC10436uZ1;
    }

    public final void d(C9645sE1 c9645sE1, Object obj, Object obj2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC10779vZ1 abstractC10779vZ1 = (AbstractC10779vZ1) arrayList.get(i);
            abstractC10779vZ1.b(c(abstractC10779vZ1), c9645sE1, obj);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC10779vZ1 abstractC10779vZ1 = (AbstractC10779vZ1) arrayList.get(i);
            c(abstractC10779vZ1);
            abstractC10779vZ1.getClass();
        }
    }

    public final C3471aG0 c(AbstractC10779vZ1 abstractC10779vZ1) {
        return (C3471aG0) this.d.get(abstractC10779vZ1);
    }

    public final void f() {
        if (this.f) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                c((AbstractC10779vZ1) it.next()).d();
            }
            this.a.b();
        }
    }

    public final void a(long j) {
        if (this.f) {
            C3487aJ1 c3487aJ1 = this.a;
            Integer num = (Integer) c3487aJ1.d(j);
            if (num == null) {
                num = 0;
            }
            c3487aJ1.i(j, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final void g(long j) {
        if (this.f) {
            C3487aJ1 c3487aJ1 = this.a;
            Integer num = (Integer) c3487aJ1.d(j);
            if (num == null || num.intValue() == 0) {
                throw new IllegalStateException("Trying to decrement reference count for an item you don't own.");
            }
            c3487aJ1.i(j, Integer.valueOf(num.intValue() - 1));
        }
    }
}
