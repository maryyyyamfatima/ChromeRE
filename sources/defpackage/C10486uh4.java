package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10486uh4 extends RF0 implements Cloneable {
    public String a = null;
    public String g = null;
    public String h = null;

    public C10486uh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C10486uh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C10486uh4) a();
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
        String str3 = this.h;
        if (str3 != null) {
            gv.x(3, str3);
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
        String str3 = this.h;
        return str3 != null ? computeSerializedSize + GV.i(3, str3) : computeSerializedSize;
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
            } else if (m != 26) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.h = c12129zV.l();
            }
        }
        return this;
    }
}
