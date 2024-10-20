package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Wg4 extends RF0 implements Cloneable {
    public static volatile Wg4[] h;
    public Integer a = null;
    public Integer g = null;

    public static Wg4[] c() {
        if (h == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (h == null) {
                    h = new Wg4[0];
                }
            }
        }
        return h;
    }

    public Wg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Wg4 clone() {
        try {
            return (Wg4) a();
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
        Integer num2 = this.g;
        if (num2 != null) {
            gv.r(2, num2.intValue());
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
        Integer num2 = this.g;
        return num2 != null ? computeSerializedSize + GV.d(2, num2.intValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Integer.valueOf(c12129zV.j());
            } else if (m != 16) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.g = Integer.valueOf(c12129zV.j());
            }
        }
        return this;
    }
}
