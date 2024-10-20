package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: og4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8423og4 extends RF0 implements Cloneable {
    public static volatile C8423og4[] h;
    public Integer a = null;
    public Hh4 g = null;

    public C8423og4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8423og4 clone() {
        try {
            C8423og4 c8423og4 = (C8423og4) a();
            Hh4 hh4 = this.g;
            if (hh4 != null) {
                c8423og4.g = hh4.clone();
            }
            return c8423og4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.a;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Hh4 hh4 = this.g;
        if (hh4 != null) {
            gv.t(2, hh4);
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
        Hh4 hh4 = this.g;
        return hh4 != null ? computeSerializedSize + GV.f(2, hh4) : computeSerializedSize;
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
                    if (j != 0 && j != 1 && j != 2) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(j);
                        sb.append(" is not a valid enum Role");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.a = Integer.valueOf(j);
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.g == null) {
                    this.g = new Hh4();
                }
                c12129zV.f(this.g);
            }
        }
        return this;
    }
}
