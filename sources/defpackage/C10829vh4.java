package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10829vh4 extends RF0 implements Cloneable {
    public C11172wh4 a = null;
    public C11172wh4 g = null;
    public C11172wh4 h = null;
    public C11172wh4 i = null;

    public C10829vh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C10829vh4 clone() {
        try {
            C10829vh4 c10829vh4 = (C10829vh4) a();
            C11172wh4 c11172wh4 = this.a;
            if (c11172wh4 != null) {
                c10829vh4.a = c11172wh4.clone();
            }
            C11172wh4 c11172wh42 = this.g;
            if (c11172wh42 != null) {
                c10829vh4.g = c11172wh42.clone();
            }
            C11172wh4 c11172wh43 = this.h;
            if (c11172wh43 != null) {
                c10829vh4.h = c11172wh43.clone();
            }
            C11172wh4 c11172wh44 = this.i;
            if (c11172wh44 != null) {
                c10829vh4.i = c11172wh44.clone();
            }
            return c10829vh4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C11172wh4 c11172wh4 = this.a;
        if (c11172wh4 != null) {
            gv.t(1, c11172wh4);
        }
        C11172wh4 c11172wh42 = this.g;
        if (c11172wh42 != null) {
            gv.t(2, c11172wh42);
        }
        C11172wh4 c11172wh43 = this.h;
        if (c11172wh43 != null) {
            gv.t(3, c11172wh43);
        }
        C11172wh4 c11172wh44 = this.i;
        if (c11172wh44 != null) {
            gv.t(4, c11172wh44);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C11172wh4 c11172wh4 = this.a;
        if (c11172wh4 != null) {
            computeSerializedSize += GV.f(1, c11172wh4);
        }
        C11172wh4 c11172wh42 = this.g;
        if (c11172wh42 != null) {
            computeSerializedSize += GV.f(2, c11172wh42);
        }
        C11172wh4 c11172wh43 = this.h;
        if (c11172wh43 != null) {
            computeSerializedSize += GV.f(3, c11172wh43);
        }
        C11172wh4 c11172wh44 = this.i;
        return c11172wh44 != null ? computeSerializedSize + GV.f(4, c11172wh44) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 10) {
                if (this.a == null) {
                    this.a = new C11172wh4();
                }
                c12129zV.f(this.a);
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new C11172wh4();
                }
                c12129zV.f(this.g);
            } else if (m == 26) {
                if (this.h == null) {
                    this.h = new C11172wh4();
                }
                c12129zV.f(this.h);
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.i == null) {
                    this.i = new C11172wh4();
                }
                c12129zV.f(this.i);
            }
        }
        return this;
    }
}
