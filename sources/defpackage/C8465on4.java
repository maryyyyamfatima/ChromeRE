package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.signin.services.WebSigninBridge;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: on4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8465on4 implements InterfaceC9924t3 {
    public final Tab a;
    public final C8808pn4 b;
    public final String c;
    public final SigninManager d = AbstractC9966tA.a(C1202Jg1.a());
    public final IdentityManager e;
    public WebSigninBridge f;

    @Override // defpackage.InterfaceC9924t3
    public final int a() {
        return 0;
    }

    public C8465on4(Tab tab, C8808pn4 c8808pn4, String str) {
        this.a = tab;
        this.b = c8808pn4;
        this.c = str;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        this.e = C1202Jg1.b(d);
    }

    @Override // defpackage.InterfaceC9924t3
    public final void destroy() {
        c();
    }

    @Override // defpackage.InterfaceC9924t3
    public final void b(final C7178l3 c7178l3, final String str) {
        if (this.e.c(0)) {
            c();
            this.d.e(18);
        }
        D2.a().b(str).g(new Callback() { // from class: ln4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8465on4 c8465on4 = C8465on4.this;
                c8465on4.getClass();
                Profile d = Profile.d();
                Tab tab = c8465on4.a;
                C8121nn4 c8121nn4 = new C8121nn4(c8465on4.c, c7178l3, tab);
                c8465on4.b.getClass();
                c8465on4.f = new WebSigninBridge(d, (AccountInfo) obj, c8121nn4);
                c8465on4.d.s(B4.c(str), new C7777mn4(c8465on4));
            }
        });
    }

    public final void c() {
        WebSigninBridge webSigninBridge = this.f;
        if (webSigninBridge != null) {
            N.MFd8dsZQ(webSigninBridge.a);
            webSigninBridge.a = 0L;
            this.f = null;
        }
    }
}
