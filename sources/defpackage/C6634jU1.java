package defpackage;

import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.merchant_viewer.MerchantTrustSignalsEventStorage;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6634jU1 {
    public static final HashMap b = new HashMap();
    public final InterfaceC7697ma2 a;

    public C6634jU1(InterfaceC7697ma2 interfaceC7697ma2) {
        this.a = interfaceC7697ma2;
        ((C8385oa2) interfaceC7697ma2).m(new C4496dF().b(new Callback() { // from class: iU1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Profile profile = (Profile) obj;
                C6634jU1.this.getClass();
                if (profile == null || profile.i()) {
                    return;
                }
                HashMap hashMap = C6634jU1.b;
                if (hashMap.get(profile) != null) {
                    return;
                }
                hashMap.put(profile, new MerchantTrustSignalsEventStorage(profile));
            }
        }));
    }
}
