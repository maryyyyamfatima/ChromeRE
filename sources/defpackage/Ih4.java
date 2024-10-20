package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ih4 extends RF0 implements Cloneable {
    public static volatile Ih4[] h;
    public Float a = null;
    public Float g = null;

    public Ih4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ih4 clone() {
        try {
            return (Ih4) a();
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
        Float f2 = this.g;
        if (f2 != null) {
            gv.p(2, f2.floatValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Float f = this.a;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(1);
        }
        Float f2 = this.g;
        if (f2 == null) {
            return computeSerializedSize;
        }
        f2.floatValue();
        return computeSerializedSize + GV.c(2);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 13) {
                this.a = Float.valueOf(c12129zV.e());
            } else if (m != 21) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.g = Float.valueOf(c12129zV.e());
            }
        }
        return this;
    }
}
