package defpackage;

import java.util.Objects;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.RenderFrameHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ym1 */
/* loaded from: classes.dex */
public final class C3181Ym1 implements InterfaceC8474op1 {
    public final RenderFrameHost a;

    public C3181Ym1(RenderFrameHost renderFrameHost) {
        this.a = renderFrameHost;
    }

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        RenderFrameHost renderFrameHost = this.a;
        Profile b = Profile.b(Hl4.a(renderFrameHost));
        C9496ro1 a = C9496ro1.a();
        Objects.requireNonNull(a);
        return new C6056hn1(b, renderFrameHost, new C3051Xm1(a));
    }
}
