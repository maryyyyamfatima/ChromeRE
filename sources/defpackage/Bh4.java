package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Bh4 extends RF0 implements Cloneable {
    public Ah4 a = null;
    public C12201zh4 g = null;
    public C11858yh4 h = null;

    public Bh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Bh4 clone() {
        try {
            Bh4 bh4 = (Bh4) a();
            Ah4 ah4 = this.a;
            if (ah4 != null) {
                try {
                    bh4.a = (Ah4) ah4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            C12201zh4 c12201zh4 = this.g;
            if (c12201zh4 != null) {
                try {
                    bh4.g = (C12201zh4) c12201zh4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            C11858yh4 c11858yh4 = this.h;
            if (c11858yh4 != null) {
                try {
                    bh4.h = (C11858yh4) c11858yh4.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            return bh4;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Ah4 ah4 = this.a;
        if (ah4 != null) {
            gv.t(1, ah4);
        }
        C12201zh4 c12201zh4 = this.g;
        if (c12201zh4 != null) {
            gv.t(2, c12201zh4);
        }
        C11858yh4 c11858yh4 = this.h;
        if (c11858yh4 != null) {
            gv.t(3, c11858yh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Ah4 ah4 = this.a;
        if (ah4 != null) {
            computeSerializedSize += GV.f(1, ah4);
        }
        C12201zh4 c12201zh4 = this.g;
        if (c12201zh4 != null) {
            computeSerializedSize += GV.f(2, c12201zh4);
        }
        C11858yh4 c11858yh4 = this.h;
        return c11858yh4 != null ? computeSerializedSize + GV.f(3, c11858yh4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 10) {
                if (this.a == null) {
                    this.a = new Ah4();
                }
                c12129zV.f(this.a);
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new C12201zh4();
                }
                c12129zV.f(this.g);
            } else if (m != 26) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.h == null) {
                    this.h = new C11858yh4();
                }
                c12129zV.f(this.h);
            }
        }
        return this;
    }
}
