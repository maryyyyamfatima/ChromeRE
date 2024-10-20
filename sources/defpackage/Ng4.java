package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ng4 extends RF0 implements Cloneable {
    public Fg4 a = null;
    public Hg4 g = null;
    public Jg4 h = null;
    public Ig4 i = null;
    public Mg4 j = null;
    public Gg4 k = null;
    public Eg4 l = null;

    public Ng4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Ng4 clone() {
        try {
            Ng4 ng4 = (Ng4) a();
            Fg4 fg4 = this.a;
            if (fg4 != null) {
                try {
                    ng4.a = (Fg4) fg4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Hg4 hg4 = this.g;
            if (hg4 != null) {
                ng4.g = hg4.clone();
            }
            Jg4 jg4 = this.h;
            if (jg4 != null) {
                try {
                    ng4.h = (Jg4) jg4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            Ig4 ig4 = this.i;
            if (ig4 != null) {
                ng4.i = ig4.clone();
            }
            Mg4 mg4 = this.j;
            if (mg4 != null) {
                try {
                    ng4.j = (Mg4) mg4.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            Gg4 gg4 = this.k;
            if (gg4 != null) {
                try {
                    ng4.k = (Gg4) gg4.a();
                } catch (CloneNotSupportedException e4) {
                    throw new AssertionError(e4);
                }
            }
            Eg4 eg4 = this.l;
            if (eg4 != null) {
                try {
                    ng4.l = (Eg4) eg4.a();
                } catch (CloneNotSupportedException e5) {
                    throw new AssertionError(e5);
                }
            }
            return ng4;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Fg4 fg4 = this.a;
        if (fg4 != null) {
            gv.t(1, fg4);
        }
        Hg4 hg4 = this.g;
        if (hg4 != null) {
            gv.t(2, hg4);
        }
        Jg4 jg4 = this.h;
        if (jg4 != null) {
            gv.t(3, jg4);
        }
        Ig4 ig4 = this.i;
        if (ig4 != null) {
            gv.t(4, ig4);
        }
        Mg4 mg4 = this.j;
        if (mg4 != null) {
            gv.t(5, mg4);
        }
        Gg4 gg4 = this.k;
        if (gg4 != null) {
            gv.t(6, gg4);
        }
        Eg4 eg4 = this.l;
        if (eg4 != null) {
            gv.t(7, eg4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Fg4 fg4 = this.a;
        if (fg4 != null) {
            computeSerializedSize += GV.f(1, fg4);
        }
        Hg4 hg4 = this.g;
        if (hg4 != null) {
            computeSerializedSize += GV.f(2, hg4);
        }
        Jg4 jg4 = this.h;
        if (jg4 != null) {
            computeSerializedSize += GV.f(3, jg4);
        }
        Ig4 ig4 = this.i;
        if (ig4 != null) {
            computeSerializedSize += GV.f(4, ig4);
        }
        Mg4 mg4 = this.j;
        if (mg4 != null) {
            computeSerializedSize += GV.f(5, mg4);
        }
        Gg4 gg4 = this.k;
        if (gg4 != null) {
            computeSerializedSize += GV.f(6, gg4);
        }
        Eg4 eg4 = this.l;
        return eg4 != null ? computeSerializedSize + GV.f(7, eg4) : computeSerializedSize;
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
                    this.a = new Fg4();
                }
                c12129zV.f(this.a);
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new Hg4();
                }
                c12129zV.f(this.g);
            } else if (m == 26) {
                if (this.h == null) {
                    this.h = new Jg4();
                }
                c12129zV.f(this.h);
            } else if (m == 34) {
                if (this.i == null) {
                    this.i = new Ig4();
                }
                c12129zV.f(this.i);
            } else if (m == 42) {
                if (this.j == null) {
                    this.j = new Mg4();
                }
                c12129zV.f(this.j);
            } else if (m == 50) {
                if (this.k == null) {
                    this.k = new Gg4();
                }
                c12129zV.f(this.k);
            } else if (m != 58) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.l == null) {
                    this.l = new Eg4();
                }
                c12129zV.f(this.l);
            }
        }
        return this;
    }
}
