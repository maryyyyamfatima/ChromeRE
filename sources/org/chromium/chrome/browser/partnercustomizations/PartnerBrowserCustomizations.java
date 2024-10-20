package org.chromium.chrome.browser.partnercustomizations;

import android.content.Context;
import defpackage.AX;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC10615v34;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.C10648v91;
import defpackage.C1607Mj2;
import defpackage.C8069nf0;
import defpackage.O83;
import defpackage.T34;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;
import org.chromium.base.task.PostTask;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PartnerBrowserCustomizations {
    public static volatile PartnerBrowserCustomizations g;
    public volatile GURL a;
    public volatile boolean b;
    public volatile boolean c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public C10648v91 f;

    public static PartnerBrowserCustomizations b() {
        if (g == null) {
            g = new PartnerBrowserCustomizations();
        }
        return g;
    }

    public final boolean d() {
        GURL a = a();
        return (a == null || a.k()) ? false : true;
    }

    public static boolean isIncognitoDisabled() {
        return b().b;
    }

    public static boolean e(GURL gurl) {
        if (gurl == null) {
            return false;
        }
        if (gurl.b) {
            Pattern pattern = T34.a;
            if (T34.l(gurl.h()) || T34.k(gurl)) {
                if (gurl.i().length() <= 1000) {
                    return true;
                }
                AbstractC4851eH1.f("PartnerCustomize", "The homepage URL \"%s\" is too long.", gurl.i());
                return false;
            }
        }
        AbstractC4851eH1.f("PartnerCustomize", "Partner homepage must be HTTP(S) or NewTabPage. Got invalid URL \"%s\"", gurl);
        return false;
    }

    public final void c(Context context) {
        this.d = false;
        final C1607Mj2 c1607Mj2 = new C1607Mj2(context, this);
        c1607Mj2.c(AbstractC0185Bl.e);
        PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: Kj2
            @Override // java.lang.Runnable
            public final void run() {
                c1607Mj2.a(true);
            }
        }, 10000L);
    }

    public final boolean f(C8069nf0 c8069nf0) {
        boolean z;
        GURL gurl;
        try {
            String a = c8069nf0.a();
            if (a != null && (a.startsWith("about:") || a.startsWith("chrome:"))) {
                gurl = AbstractC10615v34.a(a);
            } else {
                gurl = new GURL(a);
            }
            if (!e(gurl)) {
                gurl = null;
            }
            z = !Objects.equals(this.a, gurl);
            try {
                this.a = gurl;
                O83.a.t("Chrome.Homepage.PartnerCustomizedDefaultGurl", (this.a == null ? GURL.emptyGURL() : this.a).m());
            } catch (Exception e) {
                e = e;
                AbstractC4851eH1.f("PartnerCustomize", "Partner homepage delegate URL read failed : ", e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        return z;
    }

    public final void g(Runnable runnable) {
        if (this.d) {
            PostTask.c(AbstractC5103f04.a, runnable);
        } else {
            this.e.add(runnable);
        }
    }

    public final GURL a() {
        AX e = AX.e();
        if (e.g("partner-homepage-for-testing")) {
            return new GURL(e.f("partner-homepage-for-testing"));
        }
        return this.a;
    }
}
