package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kh4 */
/* loaded from: classes4.dex */
public final class C7053kh4 extends RF0 implements Cloneable {
    public C6366ih4[] a;

    public C7053kh4() {
        if (C6366ih4.q == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (C6366ih4.q == null) {
                    C6366ih4.q = new C6366ih4[0];
                }
            }
        }
        this.a = C6366ih4.q;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C7053kh4 clone() {
        try {
            C7053kh4 c7053kh4 = (C7053kh4) a();
            C6366ih4[] c6366ih4Arr = this.a;
            if (c6366ih4Arr != null && c6366ih4Arr.length > 0) {
                c7053kh4.a = new C6366ih4[c6366ih4Arr.length];
                int i = 0;
                while (true) {
                    C6366ih4[] c6366ih4Arr2 = this.a;
                    if (i >= c6366ih4Arr2.length) {
                        break;
                    }
                    C6366ih4 c6366ih4 = c6366ih4Arr2[i];
                    if (c6366ih4 != null) {
                        c7053kh4.a[i] = c6366ih4.clone();
                    }
                    i++;
                }
            }
            return c7053kh4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        C6366ih4[] c6366ih4Arr = this.a;
        if (c6366ih4Arr != null && c6366ih4Arr.length > 0) {
            int i = 0;
            while (true) {
                C6366ih4[] c6366ih4Arr2 = this.a;
                if (i >= c6366ih4Arr2.length) {
                    break;
                }
                C6366ih4 c6366ih4 = c6366ih4Arr2[i];
                if (c6366ih4 != null) {
                    gv.t(2, c6366ih4);
                }
                i++;
            }
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C6366ih4[] c6366ih4Arr = this.a;
        if (c6366ih4Arr != null && c6366ih4Arr.length > 0) {
            int i = 0;
            while (true) {
                C6366ih4[] c6366ih4Arr2 = this.a;
                if (i >= c6366ih4Arr2.length) {
                    break;
                }
                C6366ih4 c6366ih4 = c6366ih4Arr2[i];
                if (c6366ih4 != null) {
                    computeSerializedSize += GV.f(2, c6366ih4);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                int a = AbstractC11226wq4.a(c12129zV, 18);
                C6366ih4[] c6366ih4Arr = this.a;
                int length = c6366ih4Arr == null ? 0 : c6366ih4Arr.length;
                int i = a + length;
                C6366ih4[] c6366ih4Arr2 = new C6366ih4[i];
                if (length != 0) {
                    System.arraycopy(c6366ih4Arr, 0, c6366ih4Arr2, 0, length);
                }
                while (length < i - 1) {
                    C6366ih4 c6366ih4 = new C6366ih4();
                    c6366ih4Arr2[length] = c6366ih4;
                    c12129zV.f(c6366ih4);
                    c12129zV.m();
                    length++;
                }
                C6366ih4 c6366ih42 = new C6366ih4();
                c6366ih4Arr2[length] = c6366ih42;
                c12129zV.f(c6366ih42);
                this.a = c6366ih4Arr2;
            }
        }
        return this;
    }
}
