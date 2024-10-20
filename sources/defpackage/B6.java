package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B6 {
    public final C7961nK2 d;
    public final C9550rx2 a = new C9550rx2(30);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int f = 0;
    public final C0798Gd2 e = new C0798Gd2(this);

    public B6(C7961nK2 c7961nK2) {
        this.d = c7961nK2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B6.j():void");
    }

    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a((A6) arrayList.get(i));
        }
        l(arrayList);
        this.f = 0;
    }

    public final void d(A6 a6) {
        int i;
        C9550rx2 c9550rx2;
        int i2 = a6.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(a6.b, i2);
        int i3 = a6.b;
        int i4 = a6.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + a6);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = a6.d;
            c9550rx2 = this.a;
            if (i5 >= i7) {
                break;
            }
            int m2 = m((i * i5) + a6.b, a6.a);
            int i8 = a6.a;
            if (i8 == 2 ? m2 == m : i8 == 4 && m2 == m + 1) {
                i6++;
            } else {
                A6 h = h(a6.c, i8, m, i6);
                e(h, i3);
                h.c = null;
                c9550rx2.a(h);
                if (a6.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                m = m2;
            }
            i5++;
        }
        Object obj = a6.c;
        a6.c = null;
        c9550rx2.a(a6);
        if (i6 > 0) {
            A6 h2 = h(obj, a6.a, m, i6);
            e(h2, i3);
            h2.c = null;
            c9550rx2.a(h2);
        }
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            A6 a6 = (A6) arrayList.get(size);
            int i5 = a6.a;
            if (i5 == 8) {
                int i6 = a6.b;
                int i7 = a6.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            a6.b = i6 + 1;
                            a6.d = i7 + 1;
                        } else if (i2 == 2) {
                            a6.b = i6 - 1;
                            a6.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        a6.d = i7 + 1;
                    } else if (i2 == 2) {
                        a6.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        a6.b = i6 + 1;
                    } else if (i2 == 2) {
                        a6.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = a6.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= a6.d;
                    } else if (i5 == 2) {
                        i += a6.d;
                    }
                } else if (i2 == 1) {
                    a6.b = i8 + 1;
                } else if (i2 == 2) {
                    a6.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            A6 a62 = (A6) arrayList.get(size2);
            if (a62.a == 8) {
                int i9 = a62.d;
                if (i9 == a62.b || i9 < 0) {
                    arrayList.remove(size2);
                    k(a62);
                }
            } else if (a62.d <= 0) {
                arrayList.remove(size2);
                k(a62);
            }
        }
        return i;
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            A6 a6 = (A6) arrayList.get(i2);
            int i3 = a6.a;
            if (i3 == 8) {
                if (f(a6.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = a6.b;
                int i5 = a6.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void i(A6 a6) {
        this.c.add(a6);
        int i = a6.a;
        C7961nK2 c7961nK2 = this.d;
        if (i == 1) {
            c7961nK2.d(a6.b, a6.d);
            return;
        }
        if (i == 2) {
            int i2 = a6.b;
            int i3 = a6.d;
            RecyclerView recyclerView = c7961nK2.a;
            recyclerView.V(i2, i3, false);
            recyclerView.q0 = true;
            return;
        }
        if (i == 4) {
            c7961nK2.c(a6.c, a6.b, a6.d);
        } else if (i == 8) {
            c7961nK2.e(a6.b, a6.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + a6);
        }
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final int f(int i, int i2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            A6 a6 = (A6) arrayList.get(i2);
            int i3 = a6.a;
            if (i3 == 8) {
                int i4 = a6.b;
                if (i4 == i) {
                    i = a6.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (a6.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = a6.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = a6.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += a6.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A6 a6 = (A6) arrayList.get(i);
            int i2 = a6.a;
            C7961nK2 c7961nK2 = this.d;
            if (i2 == 1) {
                c7961nK2.a(a6);
                c7961nK2.d(a6.b, a6.d);
            } else if (i2 == 2) {
                c7961nK2.a(a6);
                int i3 = a6.b;
                int i4 = a6.d;
                RecyclerView recyclerView = c7961nK2.a;
                recyclerView.V(i3, i4, true);
                recyclerView.q0 = true;
                recyclerView.n0.c += i4;
            } else if (i2 == 4) {
                c7961nK2.a(a6);
                c7961nK2.c(a6.c, a6.b, a6.d);
            } else if (i2 == 8) {
                c7961nK2.a(a6);
                c7961nK2.e(a6.b, a6.d);
            }
        }
        l(arrayList);
        this.f = 0;
    }

    public final A6 h(Object obj, int i, int i2, int i3) {
        A6 a6 = (A6) this.a.b();
        if (a6 == null) {
            return new A6(obj, i, i2, i3);
        }
        a6.a = i;
        a6.b = i2;
        a6.d = i3;
        a6.c = obj;
        return a6;
    }

    public final void k(A6 a6) {
        a6.c = null;
        this.a.a(a6);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((A6) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final void e(A6 a6, int i) {
        C7961nK2 c7961nK2 = this.d;
        c7961nK2.a(a6);
        int i2 = a6.a;
        if (i2 != 2) {
            if (i2 == 4) {
                c7961nK2.c(a6.c, i, a6.d);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = a6.d;
        RecyclerView recyclerView = c7961nK2.a;
        recyclerView.V(i, i3, true);
        recyclerView.q0 = true;
        recyclerView.n0.c += i3;
    }
}
