package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Jh4 extends RF0 implements Cloneable {
    public Boolean a = null;

    public Jh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Jh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Jh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Boolean bool = this.a;
        if (bool != null) {
            gv.n(1, bool.booleanValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Boolean bool = this.a;
        if (bool == null) {
            return computeSerializedSize;
        }
        bool.booleanValue();
        return computeSerializedSize + GV.a(1);
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
                this.a = Boolean.valueOf(c12129zV.c());
            }
        }
        return this;
    }
}
