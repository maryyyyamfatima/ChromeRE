package defpackage;

import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cd4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4280cd4 {
    public final C1439Lb3 a = new C1439Lb3();
    public final C3487aJ1 b = new C3487aJ1();

    public final C10019tK2 b(d dVar, int i) {
        C3937bd4 c3937bd4;
        C10019tK2 c10019tK2;
        C1439Lb3 c1439Lb3 = this.a;
        int d = c1439Lb3.d(dVar);
        if (d >= 0 && (c3937bd4 = (C3937bd4) c1439Lb3.j(d)) != null) {
            int i2 = c3937bd4.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c3937bd4.a = i3;
                if (i == 4) {
                    c10019tK2 = c3937bd4.b;
                } else if (i == 8) {
                    c10019tK2 = c3937bd4.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c1439Lb3.h(d);
                    c3937bd4.a = 0;
                    c3937bd4.b = null;
                    c3937bd4.c = null;
                    C3937bd4.d.a(c3937bd4);
                }
                return c10019tK2;
            }
        }
        return null;
    }

    public final void a(d dVar, C10019tK2 c10019tK2) {
        C1439Lb3 c1439Lb3 = this.a;
        C3937bd4 c3937bd4 = (C3937bd4) c1439Lb3.get(dVar);
        if (c3937bd4 == null) {
            c3937bd4 = C3937bd4.a();
            c1439Lb3.put(dVar, c3937bd4);
        }
        c3937bd4.c = c10019tK2;
        c3937bd4.a |= 8;
    }

    public final void c(d dVar) {
        C3937bd4 c3937bd4 = (C3937bd4) this.a.get(dVar);
        if (c3937bd4 == null) {
            return;
        }
        c3937bd4.a &= -2;
    }

    public final void d(d dVar) {
        C3487aJ1 c3487aJ1 = this.b;
        int k = c3487aJ1.k();
        while (true) {
            k--;
            if (k < 0) {
                break;
            }
            if (dVar == c3487aJ1.l(k)) {
                Object[] objArr = c3487aJ1.h;
                Object obj = objArr[k];
                Object obj2 = AbstractC3831bJ1.a;
                if (obj != obj2) {
                    objArr[k] = obj2;
                    c3487aJ1.a = true;
                }
            }
        }
        C3937bd4 c3937bd4 = (C3937bd4) this.a.remove(dVar);
        if (c3937bd4 != null) {
            c3937bd4.a = 0;
            c3937bd4.b = null;
            c3937bd4.c = null;
            C3937bd4.d.a(c3937bd4);
        }
    }
}
