package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Tg4 extends RF0 implements Cloneable {
    public Long a = null;
    public Long g = null;
    public Rg4[] h;
    public Sg4[] i;

    public Tg4() {
        if (Rg4.h == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (Rg4.h == null) {
                    Rg4.h = new Rg4[0];
                }
            }
        }
        this.h = Rg4.h;
        if (Sg4.j == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (Sg4.j == null) {
                    Sg4.j = new Sg4[0];
                }
            }
        }
        this.i = Sg4.j;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Tg4 clone() {
        try {
            Tg4 tg4 = (Tg4) a();
            Rg4[] rg4Arr = this.h;
            int i = 0;
            if (rg4Arr != null && rg4Arr.length > 0) {
                tg4.h = new Rg4[rg4Arr.length];
                int i2 = 0;
                while (true) {
                    Rg4[] rg4Arr2 = this.h;
                    if (i2 >= rg4Arr2.length) {
                        break;
                    }
                    Rg4 rg4 = rg4Arr2[i2];
                    if (rg4 != null) {
                        try {
                            tg4.h[i2] = (Rg4) rg4.a();
                        } catch (CloneNotSupportedException e) {
                            throw new AssertionError(e);
                        }
                    }
                    i2++;
                }
            }
            Sg4[] sg4Arr = this.i;
            if (sg4Arr != null && sg4Arr.length > 0) {
                tg4.i = new Sg4[sg4Arr.length];
                while (true) {
                    Sg4[] sg4Arr2 = this.i;
                    if (i >= sg4Arr2.length) {
                        break;
                    }
                    Sg4 sg4 = sg4Arr2[i];
                    if (sg4 != null) {
                        tg4.i[i] = sg4.clone();
                    }
                    i++;
                }
            }
            return tg4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Long l = this.a;
        if (l != null) {
            gv.s(1, l.longValue());
        }
        Long l2 = this.g;
        if (l2 != null) {
            gv.s(2, l2.longValue());
        }
        Rg4[] rg4Arr = this.h;
        int i = 0;
        if (rg4Arr != null && rg4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Rg4[] rg4Arr2 = this.h;
                if (i2 >= rg4Arr2.length) {
                    break;
                }
                Rg4 rg4 = rg4Arr2[i2];
                if (rg4 != null) {
                    gv.t(3, rg4);
                }
                i2++;
            }
        }
        Sg4[] sg4Arr = this.i;
        if (sg4Arr != null && sg4Arr.length > 0) {
            while (true) {
                Sg4[] sg4Arr2 = this.i;
                if (i >= sg4Arr2.length) {
                    break;
                }
                Sg4 sg4 = sg4Arr2[i];
                if (sg4 != null) {
                    gv.t(4, sg4);
                }
                i++;
            }
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Long l = this.a;
        if (l != null) {
            computeSerializedSize += GV.e(1, l.longValue());
        }
        Long l2 = this.g;
        if (l2 != null) {
            computeSerializedSize += GV.e(2, l2.longValue());
        }
        Rg4[] rg4Arr = this.h;
        int i = 0;
        if (rg4Arr != null && rg4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Rg4[] rg4Arr2 = this.h;
                if (i2 >= rg4Arr2.length) {
                    break;
                }
                Rg4 rg4 = rg4Arr2[i2];
                if (rg4 != null) {
                    computeSerializedSize += GV.f(3, rg4);
                }
                i2++;
            }
        }
        Sg4[] sg4Arr = this.i;
        if (sg4Arr != null && sg4Arr.length > 0) {
            while (true) {
                Sg4[] sg4Arr2 = this.i;
                if (i >= sg4Arr2.length) {
                    break;
                }
                Sg4 sg4 = sg4Arr2[i];
                if (sg4 != null) {
                    computeSerializedSize += GV.f(4, sg4);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Long.valueOf(c12129zV.k());
            } else if (m == 16) {
                this.g = Long.valueOf(c12129zV.k());
            } else if (m == 26) {
                int a = AbstractC11226wq4.a(c12129zV, 26);
                Rg4[] rg4Arr = this.h;
                int length = rg4Arr == null ? 0 : rg4Arr.length;
                int i = a + length;
                Rg4[] rg4Arr2 = new Rg4[i];
                if (length != 0) {
                    System.arraycopy(rg4Arr, 0, rg4Arr2, 0, length);
                }
                while (length < i - 1) {
                    Rg4 rg4 = new Rg4();
                    rg4Arr2[length] = rg4;
                    c12129zV.f(rg4);
                    c12129zV.m();
                    length++;
                }
                Rg4 rg42 = new Rg4();
                rg4Arr2[length] = rg42;
                c12129zV.f(rg42);
                this.h = rg4Arr2;
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                int a2 = AbstractC11226wq4.a(c12129zV, 34);
                Sg4[] sg4Arr = this.i;
                int length2 = sg4Arr == null ? 0 : sg4Arr.length;
                int i2 = a2 + length2;
                Sg4[] sg4Arr2 = new Sg4[i2];
                if (length2 != 0) {
                    System.arraycopy(sg4Arr, 0, sg4Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    Sg4 sg4 = new Sg4();
                    sg4Arr2[length2] = sg4;
                    c12129zV.f(sg4);
                    c12129zV.m();
                    length2++;
                }
                Sg4 sg42 = new Sg4();
                sg4Arr2[length2] = sg42;
                c12129zV.f(sg42);
                this.i = sg4Arr2;
            }
        }
        return this;
    }
}
