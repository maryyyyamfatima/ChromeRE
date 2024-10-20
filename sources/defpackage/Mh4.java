package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Mh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Long g = null;
    public String h = null;
    public C4298cg4 i = null;
    public C7656mS1 j = null;
    public Lh4 k = null;

    public Mh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Mh4 clone() {
        try {
            Mh4 mh4 = (Mh4) a();
            C4298cg4 c4298cg4 = this.i;
            if (c4298cg4 != null) {
                mh4.i = c4298cg4.clone();
            }
            C7656mS1 c7656mS1 = this.j;
            if (c7656mS1 != null) {
                try {
                    mh4.j = (C7656mS1) c7656mS1.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Lh4 lh4 = this.k;
            if (lh4 != null) {
                try {
                    mh4.k = (Lh4) lh4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return mh4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.a;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Long l = this.g;
        if (l != null) {
            gv.s(2, l.longValue());
        }
        String str = this.h;
        if (str != null) {
            gv.x(3, str);
        }
        C4298cg4 c4298cg4 = this.i;
        if (c4298cg4 != null) {
            gv.t(4, c4298cg4);
        }
        C7656mS1 c7656mS1 = this.j;
        if (c7656mS1 != null) {
            gv.t(5, c7656mS1);
        }
        Lh4 lh4 = this.k;
        if (lh4 != null) {
            gv.t(6, lh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Integer num = this.a;
        if (num != null) {
            computeSerializedSize += GV.d(1, num.intValue());
        }
        Long l = this.g;
        if (l != null) {
            computeSerializedSize += GV.e(2, l.longValue());
        }
        String str = this.h;
        if (str != null) {
            computeSerializedSize += GV.i(3, str);
        }
        C4298cg4 c4298cg4 = this.i;
        if (c4298cg4 != null) {
            computeSerializedSize += GV.f(4, c4298cg4);
        }
        C7656mS1 c7656mS1 = this.j;
        if (c7656mS1 != null) {
            computeSerializedSize += GV.f(5, c7656mS1);
        }
        Lh4 lh4 = this.k;
        return lh4 != null ? computeSerializedSize + GV.f(6, lh4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                int i = c12129zV.e - c12129zV.b;
                try {
                    int j = c12129zV.j();
                    if (j != 0 && j != 1 && j != 2 && j != 3) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append(j);
                        sb.append(" is not a valid enum DashboardEventType");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.a = Integer.valueOf(j);
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m == 16) {
                this.g = Long.valueOf(c12129zV.k());
            } else if (m == 26) {
                this.h = c12129zV.l();
            } else if (m == 34) {
                if (this.i == null) {
                    this.i = new C4298cg4();
                }
                c12129zV.f(this.i);
            } else if (m == 42) {
                if (this.j == null) {
                    this.j = new C7656mS1();
                }
                c12129zV.f(this.j);
            } else if (m != 50) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.k == null) {
                    this.k = new Lh4();
                }
                c12129zV.f(this.k);
            }
        }
        return this;
    }
}
