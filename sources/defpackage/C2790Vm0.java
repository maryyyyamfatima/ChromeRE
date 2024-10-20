package defpackage;

import java.util.Objects;
import org.chromium.content_public.browser.RenderFrameHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2790Vm0 implements InterfaceC2400Sm0 {
    public final RenderFrameHost a;
    public final C2660Um0 g;
    public final C2140Qm0 h;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C2790Vm0(RenderFrameHost renderFrameHost) {
        this.a = renderFrameHost;
        Objects.requireNonNull(renderFrameHost);
        this.g = new C2660Um0(renderFrameHost);
        this.h = new C2140Qm0((VX3) C10712vM.e().k.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // defpackage.InterfaceC2400Sm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j1(java.lang.String r4, defpackage.C3649an0 r5) {
        /*
            r3 = this;
            Um0 r0 = r3.g
            org.chromium.content_public.browser.RenderFrameHost r1 = r0.a
            org.chromium.url.GURL r1 = r1.g()
            org.chromium.chrome.browser.profiles.Profile r2 = org.chromium.chrome.browser.profiles.Profile.d()
            J.N.MyLo2O3q(r2, r1)
            java.lang.String r1 = "AppStoreBilling"
            boolean r1 = J.N.M1X7xdZV(r1)
            if (r1 != 0) goto L18
            goto L2f
        L18:
            org.chromium.content_public.browser.RenderFrameHost r1 = r3.a
            org.chromium.content_public.browser.WebContents r1 = defpackage.Hl4.a(r1)
            android.app.Activity r1 = defpackage.AbstractC9942t6.a(r1)
            boolean r2 = r1 instanceof org.chromium.chrome.browser.customtabs.CustomTabActivity
            if (r2 != 0) goto L27
            goto L2f
        L27:
            org.chromium.chrome.browser.customtabs.CustomTabActivity r1 = (org.chromium.chrome.browser.customtabs.CustomTabActivity) r1
            boolean r1 = r1.U1()
            if (r1 != 0) goto L31
        L2f:
            r4 = 3
            goto L3c
        L31:
            java.lang.String r1 = "https://play.google.com/billing"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L3b
            r4 = 2
            goto L3c
        L3b:
            r4 = 0
        L3c:
            if (r4 != 0) goto L4d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            en0 r1 = new en0
            Qm0 r2 = r3.h
            r1.<init>(r2, r0)
            r5.a(r4, r1)
            goto L55
        L4d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 0
            r5.a(r4, r0)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2790Vm0.j1(java.lang.String, an0):void");
    }
}
