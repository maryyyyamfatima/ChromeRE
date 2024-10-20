package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Qg4 extends RF0 implements Cloneable {
    public Pg4[] a;

    public Qg4() {
        if (Pg4.h == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (Pg4.h == null) {
                    Pg4.h = new Pg4[0];
                }
            }
        }
        this.a = Pg4.h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Qg4 clone() {
        try {
            Qg4 qg4 = (Qg4) a();
            Pg4[] pg4Arr = this.a;
            if (pg4Arr != null && pg4Arr.length > 0) {
                qg4.a = new Pg4[pg4Arr.length];
                int i = 0;
                while (true) {
                    Pg4[] pg4Arr2 = this.a;
                    if (i >= pg4Arr2.length) {
                        break;
                    }
                    Pg4 pg4 = pg4Arr2[i];
                    if (pg4 != null) {
                        try {
                            qg4.a[i] = (Pg4) pg4.a();
                        } catch (CloneNotSupportedException e) {
                            throw new AssertionError(e);
                        }
                    }
                    i++;
                }
            }
            return qg4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Pg4[] pg4Arr = this.a;
        if (pg4Arr != null && pg4Arr.length > 0) {
            int i = 0;
            while (true) {
                Pg4[] pg4Arr2 = this.a;
                if (i >= pg4Arr2.length) {
                    break;
                }
                Pg4 pg4 = pg4Arr2[i];
                if (pg4 != null) {
                    gv.t(1, pg4);
                }
                i++;
            }
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Pg4[] pg4Arr = this.a;
        if (pg4Arr != null && pg4Arr.length > 0) {
            int i = 0;
            while (true) {
                Pg4[] pg4Arr2 = this.a;
                if (i >= pg4Arr2.length) {
                    break;
                }
                Pg4 pg4 = pg4Arr2[i];
                if (pg4 != null) {
                    computeSerializedSize += GV.f(1, pg4);
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
            if (m != 10) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                int a = AbstractC11226wq4.a(c12129zV, 10);
                Pg4[] pg4Arr = this.a;
                int length = pg4Arr == null ? 0 : pg4Arr.length;
                int i = a + length;
                Pg4[] pg4Arr2 = new Pg4[i];
                if (length != 0) {
                    System.arraycopy(pg4Arr, 0, pg4Arr2, 0, length);
                }
                while (length < i - 1) {
                    Pg4 pg4 = new Pg4();
                    pg4Arr2[length] = pg4;
                    c12129zV.f(pg4);
                    c12129zV.m();
                    length++;
                }
                Pg4 pg42 = new Pg4();
                pg4Arr2[length] = pg42;
                c12129zV.f(pg42);
                this.a = pg4Arr2;
            }
        }
        return this;
    }
}
