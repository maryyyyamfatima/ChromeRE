package defpackage;

import J.N;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8807pn3 extends AbstractC7584mE {
    public final String c;

    public C8807pn3(String str, String str2, String str3) {
        super(str, str2);
        this.c = str3;
    }

    public final String c() {
        return CachedFeatureFlags.c(b(), this.c);
    }

    @Override // defpackage.AbstractC7584mE
    public final void a() {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc(this.a, this.b);
        Q83 q83 = O83.a;
        String b = b();
        if (MMltG$kc.isEmpty()) {
            MMltG$kc = this.c;
        }
        q83.t(b, MMltG$kc);
    }
}
