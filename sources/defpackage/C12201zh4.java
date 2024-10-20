package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C12201zh4 extends RF0 implements Cloneable {
    public Long a = null;
    public Long g = null;
    public Long h = null;
    public Long i = null;

    public C12201zh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C12201zh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C12201zh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Long l = this.a;
        if (l != null) {
            gv.s(1, l.longValue());
        }
        Long l2 = this.g;
        if (l2 != null) {
            gv.s(2, l2.longValue());
        }
        Long l3 = this.h;
        if (l3 != null) {
            gv.s(3, l3.longValue());
        }
        Long l4 = this.i;
        if (l4 != null) {
            gv.s(4, l4.longValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Long l = this.a;
        if (l != null) {
            computeSerializedSize += GV.e(1, l.longValue());
        }
        Long l2 = this.g;
        if (l2 != null) {
            computeSerializedSize += GV.e(2, l2.longValue());
        }
        Long l3 = this.h;
        if (l3 != null) {
            computeSerializedSize += GV.e(3, l3.longValue());
        }
        Long l4 = this.i;
        return l4 != null ? computeSerializedSize + GV.e(4, l4.longValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Long.valueOf(c12129zV.k());
            } else if (m == 16) {
                this.g = Long.valueOf(c12129zV.k());
            } else if (m == 24) {
                this.h = Long.valueOf(c12129zV.k());
            } else if (m == 32) {
                this.i = Long.valueOf(c12129zV.k());
            } else if (!super.storeUnknownField(c12129zV, m)) {
                break;
            }
        }
        return this;
    }
}
