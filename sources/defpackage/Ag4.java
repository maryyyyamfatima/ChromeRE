package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ag4 extends RF0 implements Cloneable {
    public C6703jg4 a = null;
    public Hh4 g = null;
    public C8423og4[] h;
    public C8079ng4 i;
    public C11852yg4 j;
    public C9451rg4 k;
    public C9794sg4 l;
    public C9794sg4 m;
    public C11166wg4 n;
    public C11509xg4 o;
    public C7735mg4[] p;
    public C8766pg4 q;
    public C10480ug4 r;
    public C10823vg4 s;
    public C7047kg4 t;
    public C10137tg4 u;
    public C12195zg4[] v;

    public Ag4() {
        if (C8423og4.h == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (C8423og4.h == null) {
                    C8423og4.h = new C8423og4[0];
                }
            }
        }
        this.h = C8423og4.h;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        if (C7735mg4.j == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (C7735mg4.j == null) {
                    C7735mg4.j = new C7735mg4[0];
                }
            }
        }
        this.p = C7735mg4.j;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        if (C12195zg4.i == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (C12195zg4.i == null) {
                    C12195zg4.i = new C12195zg4[0];
                }
            }
        }
        this.v = C12195zg4.i;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Ag4 clone() {
        try {
            Ag4 ag4 = (Ag4) a();
            C6703jg4 c6703jg4 = this.a;
            if (c6703jg4 != null) {
                ag4.a = c6703jg4.clone();
            }
            Hh4 hh4 = this.g;
            if (hh4 != null) {
                ag4.g = hh4.clone();
            }
            C8423og4[] c8423og4Arr = this.h;
            int i = 0;
            if (c8423og4Arr != null && c8423og4Arr.length > 0) {
                ag4.h = new C8423og4[c8423og4Arr.length];
                int i2 = 0;
                while (true) {
                    C8423og4[] c8423og4Arr2 = this.h;
                    if (i2 >= c8423og4Arr2.length) {
                        break;
                    }
                    C8423og4 c8423og4 = c8423og4Arr2[i2];
                    if (c8423og4 != null) {
                        ag4.h[i2] = c8423og4.clone();
                    }
                    i2++;
                }
            }
            C8079ng4 c8079ng4 = this.i;
            if (c8079ng4 != null) {
                try {
                    ag4.i = (C8079ng4) c8079ng4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            C11852yg4 c11852yg4 = this.j;
            if (c11852yg4 != null) {
                ag4.j = c11852yg4.clone();
            }
            C9451rg4 c9451rg4 = this.k;
            if (c9451rg4 != null) {
                try {
                    ag4.k = (C9451rg4) c9451rg4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            C9794sg4 c9794sg4 = this.l;
            if (c9794sg4 != null) {
                ag4.l = c9794sg4.clone();
            }
            C9794sg4 c9794sg42 = this.m;
            if (c9794sg42 != null) {
                ag4.m = c9794sg42.clone();
            }
            C11166wg4 c11166wg4 = this.n;
            if (c11166wg4 != null) {
                try {
                    ag4.n = (C11166wg4) c11166wg4.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            C11509xg4 c11509xg4 = this.o;
            if (c11509xg4 != null) {
                try {
                    ag4.o = (C11509xg4) c11509xg4.a();
                } catch (CloneNotSupportedException e4) {
                    throw new AssertionError(e4);
                }
            }
            C7735mg4[] c7735mg4Arr = this.p;
            if (c7735mg4Arr != null && c7735mg4Arr.length > 0) {
                ag4.p = new C7735mg4[c7735mg4Arr.length];
                int i3 = 0;
                while (true) {
                    C7735mg4[] c7735mg4Arr2 = this.p;
                    if (i3 >= c7735mg4Arr2.length) {
                        break;
                    }
                    C7735mg4 c7735mg4 = c7735mg4Arr2[i3];
                    if (c7735mg4 != null) {
                        ag4.p[i3] = c7735mg4.clone();
                    }
                    i3++;
                }
            }
            C8766pg4 c8766pg4 = this.q;
            if (c8766pg4 != null) {
                ag4.q = c8766pg4.clone();
            }
            C10480ug4 c10480ug4 = this.r;
            if (c10480ug4 != null) {
                try {
                    ag4.r = (C10480ug4) c10480ug4.a();
                } catch (CloneNotSupportedException e5) {
                    throw new AssertionError(e5);
                }
            }
            C10823vg4 c10823vg4 = this.s;
            if (c10823vg4 != null) {
                ag4.s = c10823vg4.clone();
            }
            C7047kg4 c7047kg4 = this.t;
            if (c7047kg4 != null) {
                try {
                    ag4.t = (C7047kg4) c7047kg4.a();
                } catch (CloneNotSupportedException e6) {
                    throw new AssertionError(e6);
                }
            }
            C10137tg4 c10137tg4 = this.u;
            if (c10137tg4 != null) {
                ag4.u = c10137tg4.clone();
            }
            C12195zg4[] c12195zg4Arr = this.v;
            if (c12195zg4Arr != null && c12195zg4Arr.length > 0) {
                ag4.v = new C12195zg4[c12195zg4Arr.length];
                while (true) {
                    C12195zg4[] c12195zg4Arr2 = this.v;
                    if (i >= c12195zg4Arr2.length) {
                        break;
                    }
                    C12195zg4 c12195zg4 = c12195zg4Arr2[i];
                    if (c12195zg4 != null) {
                        try {
                            ag4.v[i] = (C12195zg4) c12195zg4.a();
                        } catch (CloneNotSupportedException e7) {
                            throw new AssertionError(e7);
                        }
                    }
                    i++;
                }
            }
            return ag4;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C6703jg4 c6703jg4 = this.a;
        if (c6703jg4 != null) {
            gv.t(1, c6703jg4);
        }
        Hh4 hh4 = this.g;
        if (hh4 != null) {
            gv.t(2, hh4);
        }
        C8423og4[] c8423og4Arr = this.h;
        int i = 0;
        if (c8423og4Arr != null && c8423og4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C8423og4[] c8423og4Arr2 = this.h;
                if (i2 >= c8423og4Arr2.length) {
                    break;
                }
                C8423og4 c8423og4 = c8423og4Arr2[i2];
                if (c8423og4 != null) {
                    gv.t(3, c8423og4);
                }
                i2++;
            }
        }
        C8079ng4 c8079ng4 = this.i;
        if (c8079ng4 != null) {
            gv.t(4, c8079ng4);
        }
        C11852yg4 c11852yg4 = this.j;
        if (c11852yg4 != null) {
            gv.t(5, c11852yg4);
        }
        C9451rg4 c9451rg4 = this.k;
        if (c9451rg4 != null) {
            gv.t(6, c9451rg4);
        }
        C9794sg4 c9794sg4 = this.l;
        if (c9794sg4 != null) {
            gv.t(7, c9794sg4);
        }
        C11166wg4 c11166wg4 = this.n;
        if (c11166wg4 != null) {
            gv.t(8, c11166wg4);
        }
        C11509xg4 c11509xg4 = this.o;
        if (c11509xg4 != null) {
            gv.t(9, c11509xg4);
        }
        C7735mg4[] c7735mg4Arr = this.p;
        if (c7735mg4Arr != null && c7735mg4Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C7735mg4[] c7735mg4Arr2 = this.p;
                if (i3 >= c7735mg4Arr2.length) {
                    break;
                }
                C7735mg4 c7735mg4 = c7735mg4Arr2[i3];
                if (c7735mg4 != null) {
                    gv.t(10, c7735mg4);
                }
                i3++;
            }
        }
        C8766pg4 c8766pg4 = this.q;
        if (c8766pg4 != null) {
            gv.t(11, c8766pg4);
        }
        C10480ug4 c10480ug4 = this.r;
        if (c10480ug4 != null) {
            gv.t(12, c10480ug4);
        }
        C10137tg4 c10137tg4 = this.u;
        if (c10137tg4 != null) {
            gv.t(13, c10137tg4);
        }
        C9794sg4 c9794sg42 = this.m;
        if (c9794sg42 != null) {
            gv.t(14, c9794sg42);
        }
        C12195zg4[] c12195zg4Arr = this.v;
        if (c12195zg4Arr != null && c12195zg4Arr.length > 0) {
            while (true) {
                C12195zg4[] c12195zg4Arr2 = this.v;
                if (i >= c12195zg4Arr2.length) {
                    break;
                }
                C12195zg4 c12195zg4 = c12195zg4Arr2[i];
                if (c12195zg4 != null) {
                    gv.t(15, c12195zg4);
                }
                i++;
            }
        }
        C10823vg4 c10823vg4 = this.s;
        if (c10823vg4 != null) {
            gv.t(16, c10823vg4);
        }
        C7047kg4 c7047kg4 = this.t;
        if (c7047kg4 != null) {
            gv.t(17, c7047kg4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C6703jg4 c6703jg4 = this.a;
        if (c6703jg4 != null) {
            computeSerializedSize += GV.f(1, c6703jg4);
        }
        Hh4 hh4 = this.g;
        if (hh4 != null) {
            computeSerializedSize += GV.f(2, hh4);
        }
        C8423og4[] c8423og4Arr = this.h;
        int i = 0;
        if (c8423og4Arr != null && c8423og4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C8423og4[] c8423og4Arr2 = this.h;
                if (i2 >= c8423og4Arr2.length) {
                    break;
                }
                C8423og4 c8423og4 = c8423og4Arr2[i2];
                if (c8423og4 != null) {
                    computeSerializedSize += GV.f(3, c8423og4);
                }
                i2++;
            }
        }
        C8079ng4 c8079ng4 = this.i;
        if (c8079ng4 != null) {
            computeSerializedSize += GV.f(4, c8079ng4);
        }
        C11852yg4 c11852yg4 = this.j;
        if (c11852yg4 != null) {
            computeSerializedSize += GV.f(5, c11852yg4);
        }
        C9451rg4 c9451rg4 = this.k;
        if (c9451rg4 != null) {
            computeSerializedSize += GV.f(6, c9451rg4);
        }
        C9794sg4 c9794sg4 = this.l;
        if (c9794sg4 != null) {
            computeSerializedSize += GV.f(7, c9794sg4);
        }
        C11166wg4 c11166wg4 = this.n;
        if (c11166wg4 != null) {
            computeSerializedSize += GV.f(8, c11166wg4);
        }
        C11509xg4 c11509xg4 = this.o;
        if (c11509xg4 != null) {
            computeSerializedSize += GV.f(9, c11509xg4);
        }
        C7735mg4[] c7735mg4Arr = this.p;
        if (c7735mg4Arr != null && c7735mg4Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C7735mg4[] c7735mg4Arr2 = this.p;
                if (i3 >= c7735mg4Arr2.length) {
                    break;
                }
                C7735mg4 c7735mg4 = c7735mg4Arr2[i3];
                if (c7735mg4 != null) {
                    computeSerializedSize += GV.f(10, c7735mg4);
                }
                i3++;
            }
        }
        C8766pg4 c8766pg4 = this.q;
        if (c8766pg4 != null) {
            computeSerializedSize += GV.f(11, c8766pg4);
        }
        C10480ug4 c10480ug4 = this.r;
        if (c10480ug4 != null) {
            computeSerializedSize += GV.f(12, c10480ug4);
        }
        C10137tg4 c10137tg4 = this.u;
        if (c10137tg4 != null) {
            computeSerializedSize += GV.f(13, c10137tg4);
        }
        C9794sg4 c9794sg42 = this.m;
        if (c9794sg42 != null) {
            computeSerializedSize += GV.f(14, c9794sg42);
        }
        C12195zg4[] c12195zg4Arr = this.v;
        if (c12195zg4Arr != null && c12195zg4Arr.length > 0) {
            while (true) {
                C12195zg4[] c12195zg4Arr2 = this.v;
                if (i >= c12195zg4Arr2.length) {
                    break;
                }
                C12195zg4 c12195zg4 = c12195zg4Arr2[i];
                if (c12195zg4 != null) {
                    computeSerializedSize += GV.f(15, c12195zg4);
                }
                i++;
            }
        }
        C10823vg4 c10823vg4 = this.s;
        if (c10823vg4 != null) {
            computeSerializedSize += GV.f(16, c10823vg4);
        }
        C7047kg4 c7047kg4 = this.t;
        return c7047kg4 != null ? computeSerializedSize + GV.f(17, c7047kg4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            switch (m) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new C6703jg4();
                    }
                    c12129zV.f(this.a);
                    break;
                case 18:
                    if (this.g == null) {
                        this.g = new Hh4();
                    }
                    c12129zV.f(this.g);
                    break;
                case 26:
                    int a = AbstractC11226wq4.a(c12129zV, 26);
                    C8423og4[] c8423og4Arr = this.h;
                    int length = c8423og4Arr == null ? 0 : c8423og4Arr.length;
                    int i = a + length;
                    C8423og4[] c8423og4Arr2 = new C8423og4[i];
                    if (length != 0) {
                        System.arraycopy(c8423og4Arr, 0, c8423og4Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C8423og4 c8423og4 = new C8423og4();
                        c8423og4Arr2[length] = c8423og4;
                        c12129zV.f(c8423og4);
                        c12129zV.m();
                        length++;
                    }
                    C8423og4 c8423og42 = new C8423og4();
                    c8423og4Arr2[length] = c8423og42;
                    c12129zV.f(c8423og42);
                    this.h = c8423og4Arr2;
                    break;
                case 34:
                    if (this.i == null) {
                        this.i = new C8079ng4();
                    }
                    c12129zV.f(this.i);
                    break;
                case 42:
                    if (this.j == null) {
                        this.j = new C11852yg4();
                    }
                    c12129zV.f(this.j);
                    break;
                case 50:
                    if (this.k == null) {
                        this.k = new C9451rg4();
                    }
                    c12129zV.f(this.k);
                    break;
                case 58:
                    if (this.l == null) {
                        this.l = new C9794sg4();
                    }
                    c12129zV.f(this.l);
                    break;
                case 66:
                    if (this.n == null) {
                        this.n = new C11166wg4();
                    }
                    c12129zV.f(this.n);
                    break;
                case 74:
                    if (this.o == null) {
                        this.o = new C11509xg4();
                    }
                    c12129zV.f(this.o);
                    break;
                case 82:
                    int a2 = AbstractC11226wq4.a(c12129zV, 82);
                    C7735mg4[] c7735mg4Arr = this.p;
                    int length2 = c7735mg4Arr == null ? 0 : c7735mg4Arr.length;
                    int i2 = a2 + length2;
                    C7735mg4[] c7735mg4Arr2 = new C7735mg4[i2];
                    if (length2 != 0) {
                        System.arraycopy(c7735mg4Arr, 0, c7735mg4Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C7735mg4 c7735mg4 = new C7735mg4();
                        c7735mg4Arr2[length2] = c7735mg4;
                        c12129zV.f(c7735mg4);
                        c12129zV.m();
                        length2++;
                    }
                    C7735mg4 c7735mg42 = new C7735mg4();
                    c7735mg4Arr2[length2] = c7735mg42;
                    c12129zV.f(c7735mg42);
                    this.p = c7735mg4Arr2;
                    break;
                case 90:
                    if (this.q == null) {
                        this.q = new C8766pg4();
                    }
                    c12129zV.f(this.q);
                    break;
                case 98:
                    if (this.r == null) {
                        this.r = new C10480ug4();
                    }
                    c12129zV.f(this.r);
                    break;
                case 106:
                    if (this.u == null) {
                        this.u = new C10137tg4();
                    }
                    c12129zV.f(this.u);
                    break;
                case 114:
                    if (this.m == null) {
                        this.m = new C9794sg4();
                    }
                    c12129zV.f(this.m);
                    break;
                case 122:
                    int a3 = AbstractC11226wq4.a(c12129zV, 122);
                    C12195zg4[] c12195zg4Arr = this.v;
                    int length3 = c12195zg4Arr == null ? 0 : c12195zg4Arr.length;
                    int i3 = a3 + length3;
                    C12195zg4[] c12195zg4Arr2 = new C12195zg4[i3];
                    if (length3 != 0) {
                        System.arraycopy(c12195zg4Arr, 0, c12195zg4Arr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        C12195zg4 c12195zg4 = new C12195zg4();
                        c12195zg4Arr2[length3] = c12195zg4;
                        c12129zV.f(c12195zg4);
                        c12129zV.m();
                        length3++;
                    }
                    C12195zg4 c12195zg42 = new C12195zg4();
                    c12195zg4Arr2[length3] = c12195zg42;
                    c12129zV.f(c12195zg42);
                    this.v = c12195zg4Arr2;
                    break;
                case 130:
                    if (this.s == null) {
                        this.s = new C10823vg4();
                    }
                    c12129zV.f(this.s);
                    break;
                case 138:
                    if (this.t == null) {
                        this.t = new C7047kg4();
                    }
                    c12129zV.f(this.t);
                    break;
                default:
                    if (!super.storeUnknownField(c12129zV, m)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
