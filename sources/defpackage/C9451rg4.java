package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9451rg4 extends RF0 implements Cloneable {
    public String a = null;
    public Integer g = null;
    public String h = null;
    public String i = null;

    public C9451rg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C9451rg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C9451rg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        String str = this.a;
        if (str != null) {
            gv.x(1, str);
        }
        Integer num = this.g;
        if (num != null) {
            gv.r(2, num.intValue());
        }
        String str2 = this.h;
        if (str2 != null) {
            gv.x(3, str2);
        }
        String str3 = this.i;
        if (str3 != null) {
            gv.x(4, str3);
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
        Integer num = this.g;
        if (num != null) {
            computeSerializedSize += GV.d(2, num.intValue());
        }
        String str2 = this.h;
        if (str2 != null) {
            computeSerializedSize += GV.i(3, str2);
        }
        String str3 = this.i;
        return str3 != null ? computeSerializedSize + GV.i(4, str3) : computeSerializedSize;
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
            } else if (m == 16) {
                this.g = Integer.valueOf(c12129zV.j());
            } else if (m == 26) {
                this.h = c12129zV.l();
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.i = c12129zV.l();
            }
        }
        return this;
    }
}
