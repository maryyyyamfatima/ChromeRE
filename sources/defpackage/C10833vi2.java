package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10833vi2 extends AbstractC6096hu {
    public final List c;
    public final C10490ui2 d;
    public GO2 k;
    public final HashSet e = new HashSet();
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public final int f = 0;

    public C10833vi2(ArrayList arrayList) {
        this.c = arrayList;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Empty binding parallel");
        }
        this.d = new C10490ui2(this);
    }

    public static void f(C10833vi2 c10833vi2, AbstractC6096hu abstractC6096hu) {
        HashSet hashSet = c10833vi2.e;
        if (hashSet.contains(abstractC6096hu)) {
            throw new RuntimeException("Binding unexpectedly completed twice");
        }
        hashSet.add(abstractC6096hu);
        c10833vi2.h++;
        abstractC6096hu.a.remove(c10833vi2.d);
        if (c10833vi2.h < c10833vi2.c.size()) {
            return;
        }
        c10833vi2.j = false;
        CopyOnWriteArrayList copyOnWriteArrayList = c10833vi2.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC12166zc) copyOnWriteArrayList.get(size)).c(c10833vi2);
            }
        }
    }

    @Override // defpackage.AbstractC6096hu
    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((InterfaceC12166zc) copyOnWriteArrayList.get(size)).a(this);
            }
        }
        List list = this.c;
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            ((AbstractC6096hu) list.get(i)).c();
        }
    }

    @Override // defpackage.AbstractC6096hu
    public final void d(GO2 go2) {
        int i;
        boolean z;
        if (this.i) {
            throw new RuntimeException("Starting binding multiple times");
        }
        this.i = true;
        this.k = go2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size() - 1;
        while (true) {
            if (size < 0) {
                z = true;
                break;
            } else {
                if (!((InterfaceC12166zc) copyOnWriteArrayList.get(size)).e(this)) {
                    z = false;
                    break;
                }
                size--;
            }
        }
        if (!z) {
            int size2 = copyOnWriteArrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    ((InterfaceC12166zc) copyOnWriteArrayList.get(size2)).d(this);
                }
            }
        } else {
            int size3 = copyOnWriteArrayList.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                } else {
                    ((InterfaceC12166zc) copyOnWriteArrayList.get(size3)).b(this);
                }
            }
            this.j = true;
            List list = this.c;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC6096hu) it.next()).a.add(this.d);
            }
            if (this.f == 0) {
                int size4 = list.size();
                for (i = 0; i < size4; i++) {
                    ((AbstractC6096hu) list.get(i)).d(this.k);
                }
                this.g = list.size();
                return;
            }
            int size5 = list.size();
            for (int i2 = 1; i2 < size5; i2++) {
                ((AbstractC6096hu) list.get(i2)).c();
            }
            g();
        }
    }

    public final void g() {
        int i = this.g;
        List list = this.c;
        ((AbstractC6096hu) list.get(i)).d(this.k);
        int i2 = this.g + 1;
        this.g = i2;
        if (i2 >= list.size()) {
            return;
        }
        ((C3839bL) C3839bL.a()).getClass();
        throw null;
    }

    @Override // defpackage.AbstractC6096hu
    public final void e() {
        if (this.j) {
            this.j = false;
            this.k = null;
            List list = this.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC6096hu abstractC6096hu = (AbstractC6096hu) list.get(i);
                if (abstractC6096hu.b()) {
                    abstractC6096hu.e();
                }
            }
        }
    }

    @Override // defpackage.AbstractC6096hu
    public final boolean b() {
        return this.j;
    }

    @Override // defpackage.AbstractC6096hu
    public final void a(ArrayList arrayList) {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC6096hu) list.get(i)).a(arrayList);
        }
    }
}
