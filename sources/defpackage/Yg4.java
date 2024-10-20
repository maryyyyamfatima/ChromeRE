package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Yg4 extends RF0 implements Cloneable {
    public C4648dh4 a = null;
    public Boolean g = null;

    public Yg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Yg4 clone() {
        try {
            Yg4 yg4 = (Yg4) a();
            C4648dh4 c4648dh4 = this.a;
            if (c4648dh4 != null) {
                yg4.a = c4648dh4.clone();
            }
            return yg4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C4648dh4 c4648dh4 = this.a;
        if (c4648dh4 != null) {
            gv.t(1, c4648dh4);
        }
        Boolean bool = this.g;
        if (bool != null) {
            gv.n(2, bool.booleanValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C4648dh4 c4648dh4 = this.a;
        if (c4648dh4 != null) {
            computeSerializedSize += GV.f(1, c4648dh4);
        }
        Boolean bool = this.g;
        if (bool == null) {
            return computeSerializedSize;
        }
        bool.booleanValue();
        return computeSerializedSize + GV.a(2);
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
                    this.a = new C4648dh4();
                }
                c12129zV.f(this.a);
            } else if (m != 16) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.g = Boolean.valueOf(c12129zV.c());
            }
        }
        return this;
    }
}
