package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pb2 */
/* loaded from: classes.dex */
public final class C1957Pb2 extends BA0 {
    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        if (tabImpl.x) {
            C1438Lb2 c1438Lb2 = AbstractC2217Rb2.a;
            EI2.h(9, 10, "OfflinePages.TabRestore");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:            if (r4.isIncognito() != false) goto L134;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.BA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(org.chromium.chrome.browser.tab.Tab r4, org.chromium.url.GURL r5) {
        /*
            r3 = this;
            boolean r5 = r4.t()
            if (r5 != 0) goto L7
            return
        L7:
            boolean r5 = defpackage.AbstractC2217Rb2.d()
            org.chromium.content_public.browser.WebContents r0 = r4.b()
            org.chromium.chrome.browser.offlinepages.OfflinePageItem r0 = defpackage.AbstractC2217Rb2.c(r0)
            if (r0 == 0) goto L26
            r5 = r5 | 8
            org.chromium.chrome.browser.offlinepages.ClientId r0 = r0.c
            java.lang.String r0 = r0.a
            java.lang.String r1 = "last_n"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
            r5 = r5 | 16
            goto L38
        L26:
            org.chromium.url.GURL r0 = r4.getUrl()
            boolean r0 = J.N.MXyz2Okt(r0)
            if (r0 == 0) goto L36
            boolean r0 = r4.isIncognito()
            if (r0 == 0) goto L38
        L36:
            r5 = r5 | 4
        L38:
            r0 = 4
            if (r5 == 0) goto L61
            r1 = 1
            if (r5 == r1) goto L60
            r2 = 5
            if (r5 == r0) goto L5e
            if (r5 == r2) goto L5c
            r0 = 8
            if (r5 == r0) goto L5a
            r0 = 9
            if (r5 == r0) goto L58
            r0 = 24
            if (r5 == r0) goto L56
            r0 = 25
            if (r5 == r0) goto L54
            return
        L54:
            r0 = 3
            goto L61
        L56:
            r0 = 7
            goto L61
        L58:
            r0 = 2
            goto L61
        L5a:
            r0 = 6
            goto L61
        L5c:
            r0 = r1
            goto L61
        L5e:
            r0 = r2
            goto L61
        L60:
            r0 = 0
        L61:
            org.chromium.url.GURL r4 = r4.getUrl()
            r4.i()
            r4 = 10
            java.lang.String r5 = "OfflinePages.TabRestore"
            defpackage.EI2.h(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1957Pb2.J0(org.chromium.chrome.browser.tab.Tab, org.chromium.url.GURL):void");
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        if (tab.t()) {
            C1438Lb2 c1438Lb2 = AbstractC2217Rb2.a;
            EI2.h(8, 10, "OfflinePages.TabRestore");
        }
    }
}
