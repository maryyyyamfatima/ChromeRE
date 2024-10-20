package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qy3 */
/* loaded from: classes.dex */
public final class C9214qy3 implements InterfaceC0904Gy3 {
    public final /* synthetic */ C1553Ly3 a;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    @Override // defpackage.InterfaceC0904Gy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r10) {
        /*
            r9 = this;
            Ly3 r0 = r9.a
            Ny3 r1 = r0.e
            int r1 = r1.G(r10)
            r2 = -1
            if (r1 != r2) goto Lc
            return
        Lc:
            uz3 r1 = r0.g
            r3 = r1
            wz3 r3 = (defpackage.AbstractC11276wz3) r3
            org.chromium.chrome.browser.tabmodel.TabModel r3 = r3.g()
            org.chromium.chrome.browser.tab.Tab r3 = defpackage.AbstractC1558Lz3.c(r3, r10)
            if (r3 != 0) goto L1c
            return
        L1c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MobileTabClosed."
            r4.<init>(r5)
            java.lang.String r5 = r0.m
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.FI2.a(r4)
            boolean r4 = r0.q
            r6 = 1
            if (r4 == 0) goto L56
            java.util.List r4 = r0.h(r10)
            int r7 = r4.size()
            if (r7 <= r6) goto L56
            java.util.HashMap r0 = defpackage.C1553Ly3.I
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r10, r2)
            wz3 r1 = (defpackage.AbstractC11276wz3) r1
            org.chromium.chrome.browser.tabmodel.TabModel r10 = r1.g()
            r10.p(r4)
            return
        L56:
            java.lang.String r4 = "TabStrip"
            boolean r4 = r5.equals(r4)
            r7 = 0
            if (r4 == 0) goto L61
            r4 = r7
            goto L6a
        L61:
            java.lang.String r4 = "GridTabSwitcher"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L78
            r4 = 2
        L6a:
            java.util.HashMap r5 = defpackage.C1553Ly3.I
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.put(r8, r4)
            goto L81
        L78:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = "TabListMediator"
            java.lang.String r8 = "Attempting to close tab from Unknown UI"
            defpackage.AbstractC4851eH1.f(r5, r8, r4)
        L81:
            r4 = r1
            wz3 r4 = (defpackage.AbstractC11276wz3) r4
            org.chromium.chrome.browser.tab.Tab r4 = r4.h()
            if (r4 != r3) goto Ld6
            Ny3 r0 = r0.e
            int r10 = r0.G(r10)
            if (r10 != r2) goto L93
            goto Ld6
        L93:
            int r4 = r0.size()
            if (r4 <= r6) goto Lca
            if (r10 != 0) goto Lb5
        L9b:
            int r10 = r10 + r6
            int r4 = r0.size()
            if (r10 >= r4) goto Lb3
            java.lang.Object r4 = r0.get(r10)
            lK1 r4 = (defpackage.C7272lK1) r4
            org.chromium.ui.modelutil.PropertyModel r4 = r4.b
            ID2 r5 = defpackage.AbstractC1683My3.a
            int r4 = r4.h(r5)
            if (r4 != 0) goto L9b
            goto Lb9
        Lb3:
            r10 = r2
            goto Lb9
        Lb5:
            int r10 = r0.F(r10)
        Lb9:
            if (r10 != r2) goto Lbc
            goto Lca
        Lbc:
            java.lang.Object r10 = r0.get(r10)
            lK1 r10 = (defpackage.C7272lK1) r10
            org.chromium.ui.modelutil.PropertyModel r10 = r10.b
            ND2 r0 = defpackage.AbstractC9627sA3.a
            int r2 = r10.h(r0)
        Lca:
            r10 = r1
            wz3 r10 = (defpackage.AbstractC11276wz3) r10
            org.chromium.chrome.browser.tabmodel.TabModel r10 = r10.g()
            org.chromium.chrome.browser.tab.Tab r10 = defpackage.AbstractC1558Lz3.c(r10, r2)
            goto Ld7
        Ld6:
            r10 = 0
        Ld7:
            wz3 r1 = (defpackage.AbstractC11276wz3) r1
            org.chromium.chrome.browser.tabmodel.TabModel r0 = r1.g()
            r0.d(r3, r10, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9214qy3.a(int):void");
    }

    public C9214qy3(C1553Ly3 c1553Ly3) {
        this.a = c1553Ly3;
    }
}
