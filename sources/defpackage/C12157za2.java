package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: za2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12157za2 implements Iterable {
    public int h;
    public int i;
    public boolean j;
    public final ArrayList a = new ArrayList();
    public final boolean k = true;
    public final IK3 g = new IK3();

    public final boolean a(Object obj) {
        if (this.k) {
            this.g.getClass();
        }
        if (obj == null) {
            return false;
        }
        ArrayList arrayList = this.a;
        if (arrayList.contains(obj)) {
            return false;
        }
        arrayList.add(obj);
        this.i++;
        return true;
    }

    public final boolean d(Object obj) {
        ArrayList arrayList;
        int indexOf;
        if (this.k) {
            this.g.getClass();
        }
        if (obj == null || (indexOf = (arrayList = this.a).indexOf(obj)) == -1) {
            return false;
        }
        if (this.h == 0) {
            arrayList.remove(indexOf);
        } else {
            this.j = true;
            arrayList.set(indexOf, null);
        }
        this.i--;
        return true;
    }

    public final boolean b(Object obj) {
        if (this.k) {
            this.g.getClass();
        }
        return this.a.contains(obj);
    }

    public final void clear() {
        if (this.k) {
            this.g.getClass();
        }
        this.i = 0;
        int i = this.h;
        ArrayList arrayList = this.a;
        if (i == 0) {
            arrayList.clear();
            return;
        }
        int size = arrayList.size();
        this.j |= size != 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, null);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.k) {
            this.g.getClass();
        }
        return new C11814ya2(this);
    }

    public final C11814ya2 f() {
        if (this.k) {
            this.g.getClass();
        }
        return new C11814ya2(this);
    }

    public final boolean isEmpty() {
        if (this.k) {
            this.g.getClass();
        }
        return this.i == 0;
    }
}
