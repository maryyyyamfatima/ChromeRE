package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VZ2 extends SZ2 {
    public static final AbstractC1472Li1 b = AbstractC1472Li1.t("Asia/Anadyr", "Asia/Barnaul", "Asia/Chita", "Asia/Irkutsk", "Asia/Kamchatka", "Asia/Khandyga", "Asia/Krasnoyarsk", "Asia/Magadan", "Asia/Novokuznetsk", "Asia/Novosibirsk", "Asia/Omsk", "Asia/Sakhalin", "Asia/Srednekolymsk", "Asia/Tomsk", "Asia/Ust-Nera", "Asia/Vladivostok", "Asia/Yakutsk", "Asia/Yekaterinburg", "Europe/Astrakhan", "Europe/Kaliningrad", "Europe/Kirov", "Europe/Moscow", "Europe/Samara", "Europe/Saratov", "Europe/Ulyanovsk", "Europe/Volgograd");
    public static final AbstractC1472Li1 c = AbstractC1472Li1.t("Asia/Anadyr", "Asia/Barnaul", "Asia/Chita", "Asia/Khandyga", "Asia/Novokuznetsk", "Asia/Novosibirsk", "Asia/Sakhalin", "Asia/Srednekolymsk", "Asia/Tomsk", "Asia/Ust-Nera", "Europe/Astrakhan", "Europe/Kaliningrad", "Europe/Kirov", "Europe/Samara", "Europe/Saratov", "Europe/Ulyanovsk", "Europe/Volgograd");
    public static final AbstractC1472Li1 d = AbstractC1472Li1.s("google.com", "yandex.ru", "mail.ru");

    @Override // defpackage.SZ2, defpackage.TZ2
    public final String a() {
        return "yandex.ru";
    }

    @Override // defpackage.TZ2
    public final String b(int i) {
        if (i == 1) {
            return "MJOK";
        }
        if (i == 2) {
            return "XSQO";
        }
        return null;
    }

    @Override // defpackage.SZ2
    public final String c() {
        return "RU";
    }

    @Override // defpackage.SZ2
    public final String d() {
        return "899996";
    }

    @Override // defpackage.SZ2
    public final String i() {
        return "2298210";
    }

    @Override // defpackage.SZ2
    public final boolean n(int i) {
        Q83 q83 = O83.a;
        boolean e = q83.e("com.android.chrome.MISSING_TIMEZONES", false);
        if (!e) {
            q83.a.getClass();
            SharedPreferences.Editor edit = T60.a.edit();
            edit.putBoolean("com.android.chrome.MISSING_TIMEZONES", true);
            C7432ln3 e2 = C7432ln3.e();
            try {
                edit.commit();
                e2.close();
            } catch (Throwable th) {
                try {
                    e2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        if (e || i != 0) {
            return false;
        }
        this.a.getClass();
        return c.contains(LF1.c().getID()) && TextUtils.isEmpty(LF1.b());
    }

    public VZ2(LF1 lf1) {
        super(lf1);
    }

    @Override // defpackage.SZ2
    public final boolean k() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("SearchEnginePromo.NewDevice");
    }

    @Override // defpackage.SZ2
    public final boolean j() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("SearchEnginePromo.ExistingDevice");
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 g() {
        return b;
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 e() {
        return d;
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 f() {
        return d;
    }

    @Override // defpackage.SZ2
    public final AbstractC1472Li1 h() {
        C7928nE c7928nE = UN.a;
        String MMltG$kc = N.MMltG$kc("SearchEnginePromo.NewDevice", "search_engine_list_new_devices");
        if (TextUtils.isEmpty(MMltG$kc)) {
            return null;
        }
        return AbstractC1472Li1.p(MMltG$kc.split(";"));
    }

    @Override // defpackage.SZ2
    public final boolean l() {
        AX e = AX.e();
        if (e.g("enable_existing_user_search_engine_promo") || e.g("enable_partner_search_engine_promo")) {
            return true;
        }
        return super.l();
    }
}
