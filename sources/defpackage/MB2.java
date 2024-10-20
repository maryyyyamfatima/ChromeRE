package defpackage;

import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MB2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (C10648v91.d()) {
            C10648v91 c = C10648v91.c();
            c.getClass();
            if (C11334x91.a()) {
                if (C11334x91.k == null) {
                    C11334x91.k = new C11334x91();
                }
                i = !T34.j(C11334x91.k.g) ? 1 : 0;
            } else {
                Q83 q83 = c.a;
                if (!q83.e("Chrome.Homepage.UseNTP", false)) {
                    if (q83.e("homepage_partner_enabled", true)) {
                        if (PartnerBrowserCustomizations.b().d()) {
                            i = T34.k(PartnerBrowserCustomizations.b().a()) ? 2 : 3;
                        } else {
                            i = 6;
                        }
                    } else if (!T34.j(q83.i("homepage_custom_uri", ""))) {
                        i = 5;
                    }
                }
                i = 4;
            }
            EI2.h(i, 7, "Settings.Homepage.LocationType");
        }
    }
}
