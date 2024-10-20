package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hh4 */
/* loaded from: classes4.dex */
public final class C6023hh4 extends RF0 implements Cloneable {
    public C3617ah4 a = null;
    public C4304ch4 g = null;
    public C3961bh4 h = null;

    public C6023hh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C6023hh4 clone() {
        try {
            C6023hh4 c6023hh4 = (C6023hh4) a();
            C3617ah4 c3617ah4 = this.a;
            if (c3617ah4 != null) {
                c6023hh4.a = c3617ah4.clone();
            }
            C4304ch4 c4304ch4 = this.g;
            if (c4304ch4 != null) {
                c6023hh4.g = c4304ch4.clone();
            }
            C3961bh4 c3961bh4 = this.h;
            if (c3961bh4 != null) {
                try {
                    c6023hh4.h = (C3961bh4) c3961bh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c6023hh4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C3617ah4 c3617ah4 = this.a;
        if (c3617ah4 != null) {
            gv.t(1, c3617ah4);
        }
        C4304ch4 c4304ch4 = this.g;
        if (c4304ch4 != null) {
            gv.t(2, c4304ch4);
        }
        C3961bh4 c3961bh4 = this.h;
        if (c3961bh4 != null) {
            gv.t(3, c3961bh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3617ah4 c3617ah4 = this.a;
        if (c3617ah4 != null) {
            computeSerializedSize += GV.f(1, c3617ah4);
        }
        C4304ch4 c4304ch4 = this.g;
        if (c4304ch4 != null) {
            computeSerializedSize += GV.f(2, c4304ch4);
        }
        C3961bh4 c3961bh4 = this.h;
        return c3961bh4 != null ? computeSerializedSize + GV.f(3, c3961bh4) : computeSerializedSize;
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
                    this.a = new C3617ah4();
                }
                c12129zV.f(this.a);
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new C4304ch4();
                }
                c12129zV.f(this.g);
            } else if (m != 26) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.h == null) {
                    this.h = new C3961bh4();
                }
                c12129zV.f(this.h);
            }
        }
        return this;
    }
}
