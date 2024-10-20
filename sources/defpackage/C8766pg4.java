package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8766pg4 extends RF0 implements Cloneable {
    public Hh4 a = null;

    public C8766pg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8766pg4 clone() {
        try {
            C8766pg4 c8766pg4 = (C8766pg4) a();
            Hh4 hh4 = this.a;
            if (hh4 != null) {
                c8766pg4.a = hh4.clone();
            }
            return c8766pg4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Hh4 hh4 = this.a;
        if (hh4 != null) {
            gv.t(1, hh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Hh4 hh4 = this.a;
        return hh4 != null ? computeSerializedSize + GV.f(1, hh4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m != 10) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.a == null) {
                    this.a = new Hh4();
                }
                c12129zV.f(this.a);
            }
        }
        return this;
    }
}
