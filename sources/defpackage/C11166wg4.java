package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11166wg4 extends RF0 implements Cloneable {
    public String a = null;
    public Long g = null;

    public C11166wg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C11166wg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C11166wg4) a();
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
        Long l = this.g;
        if (l != null) {
            gv.s(2, l.longValue());
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
        Long l = this.g;
        return l != null ? computeSerializedSize + GV.e(2, l.longValue()) : computeSerializedSize;
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
            } else if (m != 16) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.g = Long.valueOf(c12129zV.k());
            }
        }
        return this;
    }
}
