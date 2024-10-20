package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ng4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8079ng4 extends RF0 implements Cloneable {
    public Long a = null;

    public C8079ng4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C8079ng4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C8079ng4) a();
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
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Long l = this.a;
        return l != null ? computeSerializedSize + GV.e(1, l.longValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m != 8) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.a = Long.valueOf(c12129zV.k());
            }
        }
        return this;
    }
}
