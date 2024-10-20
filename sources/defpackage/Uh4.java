package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Uh4 extends RF0 implements Cloneable {
    public Th4 a = null;
    public Qg4 g = null;
    public Qh4 h = null;
    public Ph4 i = null;

    public Uh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Uh4 clone() {
        try {
            Uh4 uh4 = (Uh4) a();
            Th4 th4 = this.a;
            if (th4 != null) {
                uh4.a = th4.clone();
            }
            Qg4 qg4 = this.g;
            if (qg4 != null) {
                uh4.g = qg4.clone();
            }
            Qh4 qh4 = this.h;
            if (qh4 != null) {
                try {
                    uh4.h = (Qh4) qh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Ph4 ph4 = this.i;
            if (ph4 != null) {
                try {
                    uh4.i = (Ph4) ph4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return uh4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Th4 th4 = this.a;
        if (th4 != null) {
            gv.t(1, th4);
        }
        Qg4 qg4 = this.g;
        if (qg4 != null) {
            gv.t(2, qg4);
        }
        Qh4 qh4 = this.h;
        if (qh4 != null) {
            gv.t(3, qh4);
        }
        Ph4 ph4 = this.i;
        if (ph4 != null) {
            gv.t(4, ph4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Th4 th4 = this.a;
        if (th4 != null) {
            computeSerializedSize += GV.f(1, th4);
        }
        Qg4 qg4 = this.g;
        if (qg4 != null) {
            computeSerializedSize += GV.f(2, qg4);
        }
        Qh4 qh4 = this.h;
        if (qh4 != null) {
            computeSerializedSize += GV.f(3, qh4);
        }
        Ph4 ph4 = this.i;
        return ph4 != null ? computeSerializedSize + GV.f(4, ph4) : computeSerializedSize;
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
                    this.a = new Th4();
                }
                c12129zV.f(this.a);
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new Qg4();
                }
                c12129zV.f(this.g);
            } else if (m == 26) {
                if (this.h == null) {
                    this.h = new Qh4();
                }
                c12129zV.f(this.h);
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.i == null) {
                    this.i = new Ph4();
                }
                c12129zV.f(this.i);
            }
        }
        return this;
    }
}
