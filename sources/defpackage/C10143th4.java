package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: th4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10143th4 extends RF0 implements Cloneable {
    public Integer a = null;
    public String g = null;

    public C10143th4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C10143th4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C10143th4) a();
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
        String str = this.g;
        if (str != null) {
            gv.x(2, str);
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
        String str = this.g;
        return str != null ? computeSerializedSize + GV.i(2, str) : computeSerializedSize;
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
                        StringBuilder sb = new StringBuilder(38);
                        sb.append(j);
                        sb.append(" is not a valid enum Status");
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
                this.g = c12129zV.l();
            }
        }
        return this;
    }
}
