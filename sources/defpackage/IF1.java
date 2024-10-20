package defpackage;

import J.N;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IF1 extends EF1 {
    public static final HashSet n = AbstractC9048qW.d("IRBIS/TZ747/TZ747:7.0/NRD90M/lh22009121938:user/release-keys", "IRBIS/TZ753/TZ753:7.0/NRD90M/lh22009191111:user/release-keys", "IRBIS/TZ752/TZ752:7.0/NRD90M/lh22009191721:user/release-keys", "IRBIS/TZ737/TZ737:7.0/NRD90M/lh22009121105:user/release-keys", "DEXP/S169/S169:7.0/NRD90M/lxj19909091532:user/release-keys", "DEXP/M850/M850:7.0/NRD90M/1507951788:user/release-keys", "Vertex/Baccara/Baccara:7.0/NRD90M/1508316877:user/release-keys", "Fly/FS524/Knockout:7.0/NRD90M/20171222.152312:user/release-keys", "Fly/FS523/Cirrus_16:7.0/NRD90M/1512696624:user/release-keys", "Fly/FS459/Nimbus_16:7.0/NRD90M/chengf12150947:user/release-keys", "Fly/FS529/Champ:7.0/NRD90M/1514471935:user/release-keys", "asus/WW_Phone/ASUS_X00ID:7.1.1/NMF26F/14.2016.1712.226-20180103:user/release-keys", "asus/WW_Phone/ASUS_X00ID:7.1.1/NMF26F/14.2016.1802.230-20180202:user/release-keys", "asus/WW_Phone/ASUS_X00IDB:7.1.1/NMF26F/14.2016.1712.226-20180103:user/release-keys", "asus/WW_Phone/ASUS_X00IDB:7.1.1/NMF26F/14.2016.1802.230-20180202:user/release-keys", "asus/WW_Phone/ASUS_X00IDC:7.1.1/NMF26F/14.2016.1712.226-20180103:user/release-keys", "asus/WW_Phone/ASUS_X00IDC:7.1.1/NMF26F/14.2016.1802.230-20180202:user/release-keys", "asus/WW_Phone/ASUS_X00HD_1:7.1.1/NMF26F/14.2016.1801.372-20180119:user/release-keys", "asus/WW_Phone/ASUS_X00HD_2:7.1.1/NMF26F/14.2016.1801.372-20180119:user/release-keys", "asus/WW_Phone/ASUS_X00HD_4:7.1.1/NMF26F/14.2016.1801.372-20180119:user/release-keys");
    public static final List o = Arrays.asList("First", "Second", "Third");
    public static Boolean p;
    public final LF1 i;
    public final MK j;
    public SZ2 k;
    public JF1 l;
    public boolean m;

    public static void n(int i) {
        O83.a.q(i, "com.android.chrome.SEARCH_ENGINE_PROMO_SHOWN");
    }

    @Override // defpackage.EF1
    public final int b() {
        int f;
        Q83 q83 = O83.a;
        int f2 = q83.f(-1, "com.android.chrome.SEARCH_ENGINE_PROMO_SHOWN");
        if (i().n(f2)) {
            n(-1);
            f2 = -1;
        }
        int i = 1;
        if (f2 == 1 && (f = q83.f(-1, "LocaleManager_SHOULD_REPING_RLZ_FOR_SEARCH_PROMO_KEYWORD")) != -1) {
            String i2 = q83.i("LocaleManager_PARTNER_PROMO_SELECTED_KEYWORD", "");
            if (!TextUtils.isEmpty(i2)) {
                UZ2.a(i(), f, i2, new KF1(f, i2));
            }
        }
        if (f2 != -1) {
            return super.b();
        }
        if (m() && i().k()) {
            return 2;
        }
        if (!i().j()) {
            i = super.b();
        } else if (k()) {
            n(0);
            i = super.b();
        } else if (!IG3.a().e()) {
            n(0);
            i = super.b();
        } else {
            SZ2 i3 = i();
            LF1 lf1 = i3.a;
            String c = i3.c();
            lf1.getClass();
            if (!LF1.d(c)) {
                n(-1);
                i = super.b();
            } else if (!i().l()) {
                this.i.getClass();
                if (TextUtils.isEmpty(LF1.b()) && TextUtils.isEmpty(LF1.a())) {
                    n(-1);
                    i = super.b();
                } else {
                    n(0);
                    i = super.b();
                }
            }
        }
        return i;
    }

    public IF1() {
        LF1 lf1 = new LF1();
        this.i = lf1;
        this.j = new MK(lf1);
    }

    @Override // defpackage.EF1
    public final boolean c() {
        MK mk = this.j;
        mk.getClass();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("SpecialLocaleWrapper")) {
            mk.b.getClass();
            boolean equals = TextUtils.equals("CN", LF1.a());
            if (MK.c.contains(LF1.c().getID()) && equals) {
                return true;
            }
        }
        return false;
    }

    public static boolean m() {
        if (AX.e().g("enable_partner_search_engine_promo")) {
            return true;
        }
        return V60.a.getPackageManager().hasSystemFeature("com.google.android.feature.RU");
    }

    public static boolean l() {
        Boolean bool = p;
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = new HashSet();
        String MOVY9QtZ = N.MOVY9QtZ("InvalidRuPartnershipDevices", "InvalidFingerprints");
        if (!TextUtils.isEmpty(MOVY9QtZ)) {
            Collections.addAll(hashSet, MOVY9QtZ.split(" "));
        }
        String str = Build.FINGERPRINT;
        String replace = str.replace(' ', '_');
        HashSet hashSet2 = n;
        p = Boolean.valueOf(hashSet2.contains(str) || hashSet2.contains(replace) || hashSet.contains(str) || hashSet.contains(replace));
        if (!O83.a.e("LocaleManager_SEARCH_WIDGET_PRESENT_FIRST_START", false)) {
            p = Boolean.TRUE;
        }
        return p.booleanValue();
    }

    public final boolean k() {
        boolean z;
        AX e = AX.e();
        if (e.g("enable_existing_user_search_engine_promo") || e.g("enable_partner_search_engine_promo")) {
            return false;
        }
        String str = Build.FINGERPRINT;
        if (!TextUtils.isEmpty(str) && str.indexOf(":") != -1) {
            String str2 = str.split(":")[0];
            String[] strArr = P21.a;
            for (int i = 0; i < 21; i++) {
                if (TextUtils.equals(str2, strArr[i])) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean equals = "Google".equals(Build.MANUFACTURER);
        String str3 = Build.DEVICE;
        this.i.getClass();
        return z || equals || (str3.toLowerCase(Locale.getDefault()).contains("_sprout") || V60.a.getPackageManager().hasSystemFeature("com.google.android.feature.ANDROID_ONE_EXPERIENCE"));
    }

    public final String j() {
        return (m() && !l() && TextUtils.equals(O83.a.i("LocaleManager_PARTNER_PROMO_SELECTED_KEYWORD", ""), i().a())) ? i().i() : "";
    }

    public final String g() {
        if (!m() || l()) {
            return "";
        }
        String i = O83.a.i("LocaleManager_PARTNER_PROMO_SELECTED_KEYWORD", "");
        i().getClass();
        return !TextUtils.equals(i, "mail.ru") ? "" : i().d();
    }

    public final SZ2 i() {
        SZ2 vz2;
        if (this.k == null) {
            C4629de3 c4629de3 = RZ2.b;
            LF1 lf1 = this.i;
            if (SZ2.m(lf1, "BY", c4629de3)) {
                vz2 = new RZ2(lf1);
            } else {
                vz2 = new VZ2(lf1);
            }
            this.k = vz2;
        }
        return this.k;
    }

    public static int h(String str) {
        if (str.startsWith("google.")) {
            return 14;
        }
        TemplateUrlService a = IG3.a();
        return N.MJpD6RKI(a.c, a, str);
    }
}
