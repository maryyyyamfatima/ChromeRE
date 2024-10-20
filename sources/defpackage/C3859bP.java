package defpackage;

import J.N;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bP */
/* loaded from: classes.dex */
public final class C3859bP implements InterfaceC8474op1 {
    public final RenderFrameHost a;

    public C3859bP(RenderFrameHost renderFrameHost) {
        this.a = renderFrameHost;
    }

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        RenderFrameHost renderFrameHost = this.a;
        if (renderFrameHost == null) {
            return new C0867Gr1();
        }
        if (!renderFrameHost.m()) {
            renderFrameHost.k();
            return null;
        }
        if (!N.M1X7xdZV("WebPayments")) {
            return new C0867Gr1();
        }
        C3515aP c3515aP = new C3515aP(renderFrameHost);
        WebContents a = Hl4.a(renderFrameHost);
        if (a == null || a.isDestroyed()) {
            return new C0867Gr1();
        }
        return new JY1(new YO(this, c3515aP));
    }
}
