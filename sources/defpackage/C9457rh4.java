package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9457rh4 extends RF0 implements Cloneable {
    public Float a = null;

    public C9457rh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C9457rh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C9457rh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Float f = this.a;
        if (f != null) {
            gv.p(1, f.floatValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Float f = this.a;
        if (f == null) {
            return computeSerializedSize;
        }
        f.floatValue();
        return computeSerializedSize + GV.c(1);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m != 13) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.a = Float.valueOf(c12129zV.e());
            }
        }
        return this;
    }
}
