package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sh4 */
/* loaded from: classes4.dex */
public final class C9800sh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public C9115qh4 g = null;
    public C9457rh4 h = null;

    public C9800sh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C9800sh4 clone() {
        try {
            C9800sh4 c9800sh4 = (C9800sh4) a();
            C9115qh4 c9115qh4 = this.g;
            if (c9115qh4 != null) {
                try {
                    c9800sh4.g = (C9115qh4) c9115qh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            C9457rh4 c9457rh4 = this.h;
            if (c9457rh4 != null) {
                try {
                    c9800sh4.h = (C9457rh4) c9457rh4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return c9800sh4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.a;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        C9115qh4 c9115qh4 = this.g;
        if (c9115qh4 != null) {
            gv.t(2, c9115qh4);
        }
        C9457rh4 c9457rh4 = this.h;
        if (c9457rh4 != null) {
            gv.t(3, c9457rh4);
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
        C9115qh4 c9115qh4 = this.g;
        if (c9115qh4 != null) {
            computeSerializedSize += GV.f(2, c9115qh4);
        }
        C9457rh4 c9457rh4 = this.h;
        return c9457rh4 != null ? computeSerializedSize + GV.f(3, c9457rh4) : computeSerializedSize;
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
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new C9115qh4();
                }
                c12129zV.f(this.g);
            } else if (m != 26) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.h == null) {
                    this.h = new C9457rh4();
                }
                c12129zV.f(this.h);
            }
        }
        return this;
    }
}
