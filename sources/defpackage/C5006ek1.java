package defpackage;

import android.os.Build;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ek1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5006ek1 extends KV1 {
    public final int c;
    public final Profile d;
    public final Q83 e;

    public C5006ek1(Profile profile, Q83 q83, C3454aC3 c3454aC3) {
        super(4);
        this.d = profile;
        this.e = q83;
        this.c = (((Boolean) c3454aC3.get()).booleanValue() ? 2 : 1) * 10;
    }

    public final void e() {
        d();
        this.e.p("Chrome.IncognitoReauth.PromoCardEnabled", false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ck1] */
    @Override // defpackage.KV1
    public final void a(QU1 qu1) {
        super.a(qu1);
        if (f(this.d)) {
            if (this.e.f(0, "Chrome.IncognitoReauth.PromoShowCount") >= this.c) {
                e();
            } else {
                c(new C4663dk1(new RU1() { // from class: ck1
                    @Override // defpackage.RU1
                    public final void a(int i) {
                        C5006ek1.this.e();
                    }
                }));
            }
        }
    }

    public final boolean f(Profile profile) {
        if (!C3166Yj1.a(profile) && C3166Yj1.b() && Build.VERSION.SDK_INT >= 30 && AbstractC6724jk1.a()) {
            return this.e.e("Chrome.IncognitoReauth.PromoCardEnabled", true);
        }
        return false;
    }
}
