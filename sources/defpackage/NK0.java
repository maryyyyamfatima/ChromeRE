package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NK0 extends AbstractC7010ka3 {
    public final /* synthetic */ SK0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK0(SK0 sk0, SigninManager signinManager) {
        super(signinManager);
        this.g = sk0;
        b();
    }

    public final void b() {
        if (this.b) {
            C12075zK0 c12075zK0 = this.g.a;
            if (c12075zK0.u == null) {
                C11046wK0 c11046wK0 = c12075zK0.o;
                c12075zK0.u = LayoutInflater.from(c11046wK0.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01f9, (ViewGroup) c11046wK0, false);
            }
            this.e.g(this.f, (PersonalizedSigninPromoView) c12075zK0.u.findViewById(R.id.signin_promo_view_container), new InterfaceC12164zb3() { // from class: MK0
                @Override // defpackage.InterfaceC12164zb3
                public final void onDismiss() {
                    NK0 nk0 = NK0.this;
                    nk0.getClass();
                    O83.a.p("ntp.personalized_signin_promo_dismissed", true);
                    C0009Ab3 c0009Ab3 = nk0.e;
                    ViewTreeObserverOnPreDrawListenerC2771Vi1 viewTreeObserverOnPreDrawListenerC2771Vi1 = c0009Ab3.b;
                    if (viewTreeObserverOnPreDrawListenerC2771Vi1 != null) {
                        viewTreeObserverOnPreDrawListenerC2771Vi1.a(null);
                        c0009Ab3.b = null;
                    }
                    boolean z = nk0.b;
                    SK0 sk0 = nk0.g;
                    if (z) {
                        nk0.b = false;
                        sk0.a.h(false);
                        nk0.b();
                    }
                    sk0.a.h(false);
                }
            });
        }
    }
}
