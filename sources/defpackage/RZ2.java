package defpackage;

import J.N;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RZ2 extends SZ2 {
    public static final C4629de3 b;
    public static final AbstractC1472Li1 c;

    @Override // defpackage.SZ2, defpackage.TZ2
    public final String a() {
        return "yandex.by";
    }

    @Override // defpackage.TZ2
    public final String b(int i) {
        if (i == 1) {
            return "RMWQ";
        }
        if (i == 2) {
            return "WXKS";
        }
        return null;
    }

    @Override // defpackage.SZ2
    public final String c() {
        return "BY";
    }

    @Override // defpackage.SZ2
    public final String d() {
        return "900371";
    }

    @Override // defpackage.SZ2
    public final String i() {
        return "2298585";
    }

    static {
        int i = AbstractC1472Li1.h;
        b = new C4629de3("Europe/Moscow");
        c = AbstractC1472Li1.s("google.com", "yandex.by", "mail.ru");
    }

    @Override // defpackage.SZ2
    public final boolean n(int i) {
        Q83 q83 = O83.a;
        boolean e = q83.e("LocaleManager_PREF_PROMO_VER2_CHECKED", false);
        if (!e) {
            q83.p("LocaleManager_PREF_PROMO_VER2_CHECKED", true);
        }
        return !e && IG3.a().e();
    }

    public RZ2(LF1 lf1) {
        super(lf1);
    }

    @Override // defpackage.SZ2
    public final boolean k() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("SearchEnginePromo.NewDeviceVer2");
    }

    @Override // defpackage.SZ2
    public final boolean j() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("SearchEnginePromo.ExistingDeviceVer2");
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 g() {
        return b;
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 e() {
        return c;
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 f() {
        return c;
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 h() {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("SearchEnginePromo.NewDeviceVer2", "search_engine_list_new_devices");
        if (TextUtils.isEmpty(MMltG$kc)) {
            return null;
        }
        return AbstractC1472Li1.p(MMltG$kc.split(";"));
    }
}
