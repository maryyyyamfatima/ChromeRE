package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aE2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3463aE2 extends RF0 implements Cloneable {
    public int a = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;

    public C3463aE2() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C3463aE2) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C3463aE2) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.a & 1) != 0) {
            gv.r(1, this.g);
        }
        if ((this.a & 2) != 0) {
            gv.r(2, this.h);
        }
        if ((this.a & 4) != 0) {
            gv.r(3, this.i);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += GV.d(1, this.g);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += GV.d(2, this.h);
        }
        return (this.a & 4) != 0 ? computeSerializedSize + GV.d(3, this.i) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.g = c12129zV.j();
                this.a |= 1;
            } else if (m == 16) {
                this.h = c12129zV.j();
                this.a |= 2;
            } else if (m != 24) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.i = c12129zV.j();
                this.a |= 4;
            }
        }
        return this;
    }
}
