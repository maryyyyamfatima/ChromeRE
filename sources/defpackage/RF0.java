package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class RF0 extends AbstractC8015nV1 {
    protected C4532dM0 unknownFieldData;

    @Override // defpackage.AbstractC8015nV1
    public int computeSerializedSize() {
        int i = 0;
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            C4532dM0 c4532dM0 = this.unknownFieldData;
            if (i >= c4532dM0.h) {
                return i2;
            }
            i2 += c4532dM0.g[i].b();
            i++;
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public void writeTo(GV gv) {
        if (this.unknownFieldData == null) {
            return;
        }
        int i = 0;
        while (true) {
            C4532dM0 c4532dM0 = this.unknownFieldData;
            if (i >= c4532dM0.h) {
                return;
            }
            c4532dM0.g[i].c(gv);
            i++;
        }
    }

    public final RF0 a() {
        RF0 rf0 = (RF0) super.clone();
        Object obj = AbstractC3071Xq1.a;
        C4532dM0 c4532dM0 = this.unknownFieldData;
        if (c4532dM0 != null) {
            rf0.unknownFieldData = c4532dM0.clone();
        }
        return rf0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:            if (r10 != defpackage.C4532dM0.i) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean storeUnknownField(defpackage.C12129zV r10, int r11) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RF0.storeUnknownField(zV, int):boolean");
    }
}
