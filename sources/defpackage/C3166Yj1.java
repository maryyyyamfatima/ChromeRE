package defpackage;

import J.N;
import android.os.Build;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3166Yj1 {
    public final ReauthenticatorBridge a = new ReauthenticatorBridge(6);

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30 && UN.C.a();
    }

    public static boolean a(Profile profile) {
        return b() && AbstractC6724jk1.a() && R44.a(profile).a("incognito.incognito_reauthentication");
    }

    public final void c(final InterfaceC3036Xj1 interfaceC3036Xj1) {
        ReauthenticatorBridge reauthenticatorBridge = this.a;
        if (N.MuzO7zcq(reauthenticatorBridge.a) && b()) {
            reauthenticatorBridge.b = new Callback() { // from class: Wj1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    InterfaceC3036Xj1 interfaceC3036Xj12 = InterfaceC3036Xj1.this;
                    if (booleanValue) {
                        interfaceC3036Xj12.a();
                    } else {
                        interfaceC3036Xj12.c();
                    }
                }
            };
            N.Mt502WDx(reauthenticatorBridge.a, false);
        } else {
            interfaceC3036Xj1.b();
        }
    }
}
