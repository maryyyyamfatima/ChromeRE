package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11515xh4 extends RF0 implements Cloneable {
    public C10829vh4 a = null;

    public C11515xh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C11515xh4 clone() {
        try {
            C11515xh4 c11515xh4 = (C11515xh4) a();
            C10829vh4 c10829vh4 = this.a;
            if (c10829vh4 != null) {
                c11515xh4.a = c10829vh4.clone();
            }
            return c11515xh4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C10829vh4 c10829vh4 = this.a;
        if (c10829vh4 != null) {
            gv.t(1, c10829vh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C10829vh4 c10829vh4 = this.a;
        return c10829vh4 != null ? computeSerializedSize + GV.f(1, c10829vh4) : computeSerializedSize;
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
                    this.a = new C10829vh4();
                }
                c12129zV.f(this.a);
            }
        }
        return this;
    }
}
