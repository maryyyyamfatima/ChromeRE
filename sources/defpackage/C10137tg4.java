package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10137tg4 extends RF0 implements Cloneable {
    public String a = null;
    public String g = null;
    public Integer h = null;
    public C11852yg4 i = null;

    public C10137tg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C10137tg4 clone() {
        try {
            C10137tg4 c10137tg4 = (C10137tg4) a();
            C11852yg4 c11852yg4 = this.i;
            if (c11852yg4 != null) {
                c10137tg4.i = c11852yg4.clone();
            }
            return c10137tg4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        String str = this.a;
        if (str != null) {
            gv.x(1, str);
        }
        String str2 = this.g;
        if (str2 != null) {
            gv.x(2, str2);
        }
        Integer num = this.h;
        if (num != null) {
            gv.r(3, num.intValue());
        }
        C11852yg4 c11852yg4 = this.i;
        if (c11852yg4 != null) {
            gv.t(4, c11852yg4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (str != null) {
            computeSerializedSize += GV.i(1, str);
        }
        String str2 = this.g;
        if (str2 != null) {
            computeSerializedSize += GV.i(2, str2);
        }
        Integer num = this.h;
        if (num != null) {
            computeSerializedSize += GV.d(3, num.intValue());
        }
        C11852yg4 c11852yg4 = this.i;
        return c11852yg4 != null ? computeSerializedSize + GV.f(4, c11852yg4) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 10) {
                this.a = c12129zV.l();
            } else if (m == 18) {
                this.g = c12129zV.l();
            } else if (m == 24) {
                this.h = Integer.valueOf(c12129zV.j());
            } else if (m != 34) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                if (this.i == null) {
                    this.i = new C11852yg4();
                }
                c12129zV.f(this.i);
            }
        }
        return this;
    }
}
