package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6215iF {
    public Object a;
    public C7589mF b;
    public BO2 c = new BO2();
    public boolean d;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:            if (r6 != false) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r5.d = r0
            mF r1 = r5.b
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L23
            lF r1 = r1.g
            r1.getClass()
            if (r6 != 0) goto L12
            java.lang.Object r6 = defpackage.AbstractC11278x0.k
        L12:
            p0 r4 = defpackage.AbstractC11278x0.j
            boolean r6 = r4.b(r1, r2, r6)
            if (r6 == 0) goto L1f
            defpackage.AbstractC11278x0.b(r1)
            r6 = r0
            goto L20
        L1f:
            r6 = r3
        L20:
            if (r6 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            if (r0 == 0) goto L2c
            r5.a = r2
            r5.b = r2
            r5.c = r2
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6215iF.a(java.lang.Object):void");
    }

    public final void finalize() {
        BO2 bo2;
        C7589mF c7589mF = this.b;
        if (c7589mF != null && !c7589mF.isDone()) {
            C6557jF c6557jF = new C6557jF("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a);
            C7245lF c7245lF = c7589mF.g;
            c7245lF.getClass();
            if (AbstractC11278x0.j.b(c7245lF, null, new C9563s0(c6557jF))) {
                AbstractC11278x0.b(c7245lF);
            }
        }
        if (this.d || (bo2 = this.c) == null) {
            return;
        }
        bo2.g(null);
    }
}
