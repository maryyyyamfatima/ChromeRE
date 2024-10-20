package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.logo.LogoBridge;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zI1 */
/* loaded from: classes.dex */
public final class C12066zI1 {
    public final InterfaceC7697ma2 a;
    public final Callback b;
    public final LogoView c;
    public C4496dF d = new C4496dF();
    public C11037wI1 e;
    public boolean f;

    public C12066zI1(InterfaceC7697ma2 interfaceC7697ma2, Callback callback, LogoView logoView) {
        this.a = interfaceC7697ma2;
        this.b = callback;
        this.c = logoView;
    }

    public final void a(boolean z) {
        if (this.f) {
            return;
        }
        C8385oa2 c8385oa2 = (C8385oa2) this.a;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2) && !((Profile) c8385oa2.g).i() && IG3.a().b()) {
            C11037wI1 c11037wI1 = this.e;
            LogoView logoView = this.c;
            if (c11037wI1 == null) {
                this.e = new C11037wI1(this.b, logoView, (Profile) c8385oa2.g);
            }
            this.f = true;
            logoView.p = z;
            if (!logoView.a()) {
                logoView.a = null;
                logoView.invalidate();
                logoView.q.e();
            }
            if (!IG3.a().e() || CachedFeatureFlags.b(AbstractC6265iP.d.b("StartSurfaceAndroid:is_doodle_supported"), false)) {
                C11037wI1 c11037wI12 = this.e;
                C11723yI1 c11723yI1 = new C11723yI1(this);
                c11037wI12.getClass();
                C10694vI1 c10694vI1 = new C10694vI1(c11037wI12, System.currentTimeMillis(), c11723yI1);
                LogoBridge logoBridge = c11037wI12.c;
                N.MzrOFrdr(logoBridge.a, logoBridge, c10694vI1);
            }
        }
    }
}
