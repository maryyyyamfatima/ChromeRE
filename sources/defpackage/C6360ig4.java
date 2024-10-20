package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ig4 */
/* loaded from: classes4.dex */
public final class C6360ig4 extends RF0 implements Cloneable {
    public C4985eg4 a = null;
    public C6017hg4 g = null;
    public C5329fg4 h = null;
    public C5673gg4 i = null;

    public C6360ig4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C6360ig4 clone() {
        try {
            C6360ig4 c6360ig4 = (C6360ig4) a();
            C4985eg4 c4985eg4 = this.a;
            if (c4985eg4 != null) {
                try {
                    c6360ig4.a = (C4985eg4) c4985eg4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            C6017hg4 c6017hg4 = this.g;
            if (c6017hg4 != null) {
                try {
                    c6360ig4.g = (C6017hg4) c6017hg4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            C5329fg4 c5329fg4 = this.h;
            if (c5329fg4 != null) {
                try {
                    c6360ig4.h = (C5329fg4) c5329fg4.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            C5673gg4 c5673gg4 = this.i;
            if (c5673gg4 != null) {
                try {
                    c6360ig4.i = (C5673gg4) c5673gg4.a();
                } catch (CloneNotSupportedException e4) {
                    throw new AssertionError(e4);
                }
            }
            return c6360ig4;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C4985eg4 c4985eg4 = this.a;
        if (c4985eg4 != null) {
            gv.t(1, c4985eg4);
        }
        C6017hg4 c6017hg4 = this.g;
        if (c6017hg4 != null) {
            gv.t(2, c6017hg4);
        }
        C5329fg4 c5329fg4 = this.h;
        if (c5329fg4 != null) {
            gv.t(3, c5329fg4);
        }
        C5673gg4 c5673gg4 = this.i;
        if (c5673gg4 != null) {
            gv.t(4, c5673gg4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C4985eg4 c4985eg4 = this.a;
        if (c4985eg4 != null) {
            computeSerializedSize += GV.f(1, c4985eg4);
        }
        C6017hg4 c6017hg4 = this.g;
        if (c6017hg4 != null) {
            computeSerializedSize += GV.f(2, c6017hg4);
        }
        C5329fg4 c5329fg4 = this.h;
        if (c5329fg4 != null) {
            computeSerializedSize += GV.f(3, c5329fg4);
        }
        C5673gg4 c5673gg4 = this.i;
        return c5673gg4 != null ? computeSerializedSize + GV.f(4, c5673gg4) : computeSerializedSize;
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
                    this.a = new C4985eg4();
                }
                c12129zV.f(this.a);
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new C6017hg4();
                }
                c12129zV.f(this.g);
            } else if (m == 26) {
                if (this.h == null) {
                    this.h = new C5329fg4();
                }
                c12129zV.f(this.h);
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.i == null) {
                    this.i = new C5673gg4();
                }
                c12129zV.f(this.i);
            }
        }
        return this;
    }
}
