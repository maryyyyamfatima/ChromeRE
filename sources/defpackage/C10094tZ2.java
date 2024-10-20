package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tZ2 */
/* loaded from: classes2.dex */
public final class C10094tZ2 implements GG3, HG3 {
    public static C10094tZ2 h;
    public final C12157za2 a = new C12157za2();
    public C9751sZ2 g;

    public static void b() {
        Q83 q83 = O83.a;
        c(new C9751sZ2(q83.i("org.chromium.chrome.browser.searchwidget.SEARCH_ENGINE_SHORTNAME", null), q83.i("org.chromium.chrome.browser.searchwidget.SEARCH_ENGINE_URL", null), q83.e("org.chromium.chrome.browser.searchwidget.IS_VOICE_SEARCH_AVAILABLE", true), q83.e("org.chromium.chrome.browser.searchwidget.IS_GOOGLE_LENS_AVAILABLE", false), q83.e("org.chromium.chrome.browser.searchwidget.IS_INCOGNITO_AVAILABLE", true)), false);
    }

    public static C10094tZ2 a() {
        Object obj = ThreadUtils.a;
        if (h == null) {
            h = new C10094tZ2();
            b();
        }
        return h;
    }

    public static void f(Context context, C10285u6 c10285u6) {
        C9751sZ2 c9751sZ2 = a().g;
        String str = c9751sZ2.a;
        String str2 = c9751sZ2.b;
        boolean b = Wf4.b(c10285u6);
        C0257Bz1 c0257Bz1 = C0257Bz1.b;
        boolean a = DeviceFormFactor.a(context);
        Uri uri = Uri.EMPTY;
        C2336Rz1 c2336Rz1 = new C2336Rz1();
        c2336Rz1.h = 6;
        c2336Rz1.a = uri;
        c2336Rz1.b = null;
        c2336Rz1.c = null;
        c2336Rz1.d = null;
        c2336Rz1.e = null;
        c2336Rz1.f = null;
        c2336Rz1.g = false;
        c2336Rz1.i = a;
        c(new C9751sZ2(str, str2, b, c0257Bz1.a(c2336Rz1), N.M$3vpOHw()), true);
    }

    public static void c(final C9751sZ2 c9751sZ2, final boolean z) {
        final C10094tZ2 a = a();
        if (c9751sZ2.equals(a.g)) {
            return;
        }
        a.g = c9751sZ2;
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: rZ2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = z;
                C9751sZ2 c9751sZ22 = c9751sZ2;
                if (z2) {
                    Q83 q83 = O83.a;
                    q83.t("org.chromium.chrome.browser.searchwidget.SEARCH_ENGINE_SHORTNAME", c9751sZ22.a);
                    q83.t("org.chromium.chrome.browser.searchwidget.SEARCH_ENGINE_URL", c9751sZ22.b);
                    q83.p("org.chromium.chrome.browser.searchwidget.IS_VOICE_SEARCH_AVAILABLE", c9751sZ22.c);
                    q83.p("org.chromium.chrome.browser.searchwidget.IS_GOOGLE_LENS_AVAILABLE", c9751sZ22.d);
                    q83.p("org.chromium.chrome.browser.searchwidget.IS_INCOGNITO_AVAILABLE", c9751sZ22.e);
                }
                Iterator it = a.a.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        return;
                    } else {
                        ((InterfaceC11646y40) c11814ya2.next()).accept(c9751sZ22);
                    }
                }
            }
        });
    }

    public final void e() {
        TemplateUrlService a = IG3.a();
        TemplateUrl c = a.c();
        if (c == null) {
            return;
        }
        GURL gurl = new GURL(N.MjOvYRBS(a.c, a, c.b()));
        String c2 = c.c();
        String i = gurl.e().i();
        C9751sZ2 c9751sZ2 = this.g;
        c(new C9751sZ2(c2, i, c9751sZ2.c, c9751sZ2.d, c9751sZ2.e), true);
    }

    @Override // defpackage.GG3
    public final void d() {
        TemplateUrlService a = IG3.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        a.a.d(this);
        e();
    }

    @Override // defpackage.HG3
    public final void x() {
        e();
    }
}
