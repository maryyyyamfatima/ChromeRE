package defpackage;

import J.N;
import android.content.Context;
import android.os.Build;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.components.policy.CombinedPolicyProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oh */
/* loaded from: classes.dex */
public final class C8424oh extends AppHooks {
    @Override // org.chromium.chrome.browser.AppHooks
    public final String u() {
        return "https://chromeupboarding-pa.googleapis.com";
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final String z() {
        return "https://webapk.googleapis.com/v1/webApks/?alt=proto&key=AIzaSyCGgcaMWVY1k8QB8qNeL7pcvssM4Zlp2v8";
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final FK t() {
        Object obj = ThreadUtils.a;
        if (HK.b == null) {
            HK.b = new HK();
        }
        return HK.b;
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final InterfaceC10140th1 w() {
        synchronized (C10483uh1.a) {
            if (C10483uh1.b == null) {
                C10483uh1.b = new C10483uh1();
            }
        }
        return C10483uh1.b;
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C12260zr3 q() {
        ((C1908Or3) AbstractC1778Nr3.a.b()).getClass();
        return new C9944t61();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final InterfaceC0048Aj2 x() {
        InterfaceC9099qf0 interfaceC9099qf0 = AbstractC1737Nj2.a.a;
        InterfaceC0048Aj2 a = interfaceC9099qf0 == null ? null : interfaceC9099qf0.a();
        return a != null ? a : super.x();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final EX3 r() {
        C11590xu1 c11590xu1 = new C11590xu1();
        c11590xu1.a = "chromesync";
        return new C6138i11(new C2421Sq1(V60.a, new C11933yu1(c11590xu1)));
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final InterfaceC11737yL0 h() {
        Context context = V60.a;
        if (C4502dG0.b.f()) {
            return new C2057Pv2(context);
        }
        return new C8188nz1(context);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final P2 a() {
        return new C10251u01(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final AbstractC0940Hg b() {
        return new ServiceConnectionC3087Xt2();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C9795sh c() {
        return new C10824vh();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final CustomTabsConnection e() {
        return new ON(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C3655ao0 g() {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DirectActions")) {
            return new C3655ao0();
        }
        return null;
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C6824k11 i() {
        return new C7168l11(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final JW0 k() {
        return new C6504j51();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C12008z71 l() {
        return new B71(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C9496ro1 m() {
        return new C10868vo1();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C9926t31 j() {
        return new C9926t31(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C1537Lv2 v() {
        return AbstractC1278Jv2.a;
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final XN2 n() {
        return new XN2(V60.a, C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C5929hQ2 p() {
        return new C7991nQ2();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final RB2 o() {
        return new UB2(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C4807e84 s() {
        return new C5839h84(C4502dG0.b);
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final AbstractC3362Zw2 y() {
        return new C1407Kv1();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final void A(CombinedPolicyProvider combinedPolicyProvider) {
        combinedPolicyProvider.b(new C4664dk2(V60.a));
        combinedPolicyProvider.b(new C5686gj(V60.a));
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final C12233zn0 f() {
        if (Build.VERSION.SDK_INT >= 29) {
            return new C0846Gn0();
        }
        return new C12233zn0();
    }

    @Override // org.chromium.chrome.browser.AppHooks
    public final HP d() {
        return new NP();
    }
}
