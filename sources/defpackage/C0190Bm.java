package defpackage;

import J.N;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bm */
/* loaded from: classes2.dex */
public final class C0190Bm implements InterfaceC8474op1 {
    public final RenderFrameHost a;

    public C0190Bm(RenderFrameHost renderFrameHost) {
        this.a = renderFrameHost;
    }

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        WebContents a;
        long M6q_dnW6;
        int Mh_TQYmi;
        RenderFrameHost renderFrameHost = this.a;
        if (renderFrameHost == null || (a = Hl4.a(renderFrameHost)) == null || (Mh_TQYmi = N.Mh_TQYmi((M6q_dnW6 = N.M6q_dnW6()), a)) == 0) {
            return null;
        }
        return new C1100Im((C0970Hm) N.MOw11ALs(M6q_dnW6, a), renderFrameHost, Mh_TQYmi);
    }
}
