package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10648v91 {
    public static C10648v91 d;
    public final Q83 a = O83.a;
    public final C12157za2 b = new C12157za2();
    public final I53 c;

    public C10648v91() {
        if (C11334x91.k == null) {
            C11334x91.k = new C11334x91();
        }
        C11334x91.k.j.a(this);
        PartnerBrowserCustomizations.b().f = this;
        this.c = new I53();
    }

    public static C10648v91 c() {
        if (d == null) {
            d = new C10648v91();
        }
        return d;
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((LP3) c11814ya2.next()).a();
            }
        }
    }

    public static boolean d() {
        return C11334x91.a() || c().a.e("homepage", true);
    }

    public static String b() {
        String i;
        if (!d()) {
            return null;
        }
        C10648v91 c = c();
        c.getClass();
        if (C11334x91.a()) {
            if (C11334x91.k == null) {
                C11334x91.k = new C11334x91();
            }
            i = C11334x91.k.g;
        } else {
            Q83 q83 = c.a;
            if (q83.e("Chrome.Homepage.UseNTP", false)) {
                i = "chrome://newtab/";
            } else if (q83.e("homepage_partner_enabled", true)) {
                i = a();
            } else {
                i = q83.i("homepage_custom_uri", "");
            }
        }
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        return i;
    }

    public static String a() {
        String i;
        if (!PartnerBrowserCustomizations.b().d()) {
            Q83 q83 = O83.a;
            String i2 = q83.i("Chrome.Homepage.PartnerCustomizedDefaultGurl", "");
            if (!i2.equals("")) {
                i = GURL.a(i2).i();
            } else {
                i = q83.i("Chrome.Homepage.PartnerCustomizedDefaultUri", "");
            }
            return !i.equals("") ? i : "chrome://newtab/";
        }
        return PartnerBrowserCustomizations.b().a().i();
    }
}
