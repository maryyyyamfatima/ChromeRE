package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ah4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3617ah4 extends RF0 implements Cloneable {
    public String a = null;
    public C5335fh4 g = null;
    public Yg4 h = null;
    public Xg4 i = null;

    public static void b(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append(i);
        sb.append(" is not a valid enum AudioCodec");
        throw new IllegalArgumentException(sb.toString());
    }

    public C3617ah4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C3617ah4 clone() {
        try {
            C3617ah4 c3617ah4 = (C3617ah4) a();
            C5335fh4 c5335fh4 = this.g;
            if (c5335fh4 != null) {
                c3617ah4.g = c5335fh4.clone();
            }
            Yg4 yg4 = this.h;
            if (yg4 != null) {
                c3617ah4.h = yg4.clone();
            }
            Xg4 xg4 = this.i;
            if (xg4 != null) {
                try {
                    c3617ah4.i = (Xg4) xg4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c3617ah4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        String str = this.a;
        if (str != null) {
            gv.x(1, str);
        }
        C5335fh4 c5335fh4 = this.g;
        if (c5335fh4 != null) {
            gv.t(2, c5335fh4);
        }
        Yg4 yg4 = this.h;
        if (yg4 != null) {
            gv.t(3, yg4);
        }
        Xg4 xg4 = this.i;
        if (xg4 != null) {
            gv.t(4, xg4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (str != null) {
            computeSerializedSize += GV.i(1, str);
        }
        C5335fh4 c5335fh4 = this.g;
        if (c5335fh4 != null) {
            computeSerializedSize += GV.f(2, c5335fh4);
        }
        Yg4 yg4 = this.h;
        if (yg4 != null) {
            computeSerializedSize += GV.f(3, yg4);
        }
        Xg4 xg4 = this.i;
        return xg4 != null ? computeSerializedSize + GV.f(4, xg4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 10) {
                this.a = c12129zV.l();
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new C5335fh4();
                }
                c12129zV.f(this.g);
            } else if (m == 26) {
                if (this.h == null) {
                    this.h = new Yg4();
                }
                c12129zV.f(this.h);
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.i == null) {
                    this.i = new Xg4();
                }
                c12129zV.f(this.i);
            }
        }
        return this;
    }
}
