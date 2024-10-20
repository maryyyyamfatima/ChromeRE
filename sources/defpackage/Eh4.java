package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Eh4 extends RF0 implements Cloneable {
    public Ch4 a = null;
    public Dh4 g = null;

    public Eh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Eh4 clone() {
        try {
            Eh4 eh4 = (Eh4) a();
            Ch4 ch4 = this.a;
            if (ch4 != null) {
                try {
                    eh4.a = (Ch4) ch4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Dh4 dh4 = this.g;
            if (dh4 != null) {
                try {
                    eh4.g = (Dh4) dh4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return eh4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Ch4 ch4 = this.a;
        if (ch4 != null) {
            gv.t(1, ch4);
        }
        Dh4 dh4 = this.g;
        if (dh4 != null) {
            gv.t(2, dh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Ch4 ch4 = this.a;
        if (ch4 != null) {
            computeSerializedSize += GV.f(1, ch4);
        }
        Dh4 dh4 = this.g;
        return dh4 != null ? computeSerializedSize + GV.f(2, dh4) : computeSerializedSize;
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
                    this.a = new Ch4();
                }
                c12129zV.f(this.a);
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.g == null) {
                    this.g = new Dh4();
                }
                c12129zV.f(this.g);
            }
        }
        return this;
    }
}
