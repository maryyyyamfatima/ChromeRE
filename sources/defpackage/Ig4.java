package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ig4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Long h = null;
    public Long i = null;
    public Integer j = null;
    public Kg4 k = null;
    public Lg4 l = null;

    public Ig4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ig4 clone() {
        try {
            Ig4 ig4 = (Ig4) a();
            Kg4 kg4 = this.k;
            if (kg4 != null) {
                ig4.k = kg4.clone();
            }
            Lg4 lg4 = this.l;
            if (lg4 != null) {
                ig4.l = lg4.clone();
            }
            return ig4;
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
        Long l = this.h;
        if (l != null) {
            gv.s(3, l.longValue());
        }
        Long l2 = this.i;
        if (l2 != null) {
            gv.s(4, l2.longValue());
        }
        Integer num3 = this.j;
        if (num3 != null) {
            gv.r(5, num3.intValue());
        }
        Kg4 kg4 = this.k;
        if (kg4 != null) {
            gv.t(6, kg4);
        }
        Lg4 lg4 = this.l;
        if (lg4 != null) {
            gv.t(7, lg4);
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
        if (num2 != null) {
            computeSerializedSize += GV.d(2, num2.intValue());
        }
        Long l = this.h;
        if (l != null) {
            computeSerializedSize += GV.e(3, l.longValue());
        }
        Long l2 = this.i;
        if (l2 != null) {
            computeSerializedSize += GV.e(4, l2.longValue());
        }
        Integer num3 = this.j;
        if (num3 != null) {
            computeSerializedSize += GV.d(5, num3.intValue());
        }
        Kg4 kg4 = this.k;
        if (kg4 != null) {
            computeSerializedSize += GV.f(6, kg4);
        }
        Lg4 lg4 = this.l;
        return lg4 != null ? computeSerializedSize + GV.f(7, lg4) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0119, code lost:            return r8;     */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ig4.mergeFrom(zV):nV1");
    }
}
