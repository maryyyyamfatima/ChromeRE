package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bE2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3807bE2 extends RF0 implements Cloneable {
    public C3463aE2 a = null;

    public C3807bE2() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            C3807bE2 c3807bE2 = (C3807bE2) a();
            C3463aE2 c3463aE2 = this.a;
            if (c3463aE2 != null) {
                try {
                    c3807bE2.a = (C3463aE2) c3463aE2.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c3807bE2;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            C3807bE2 c3807bE2 = (C3807bE2) a();
            C3463aE2 c3463aE2 = this.a;
            if (c3463aE2 != null) {
                try {
                    c3807bE2.a = (C3463aE2) c3463aE2.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c3807bE2;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C3463aE2 c3463aE2 = this.a;
        if (c3463aE2 != null) {
            gv.t(1, c3463aE2);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3463aE2 c3463aE2 = this.a;
        return c3463aE2 != null ? computeSerializedSize + GV.f(1, c3463aE2) : computeSerializedSize;
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
                    this.a = new C3463aE2();
                }
                c12129zV.f(this.a);
            }
        }
        return this;
    }
}
