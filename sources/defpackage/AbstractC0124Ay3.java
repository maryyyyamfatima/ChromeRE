package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ay3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0124Ay3 {
    public static final C12300zy3 a = new C12300zy3();

    public static void a(Tab tab) {
        if (tab.b() == null) {
            tab.v(a);
            return;
        }
        NavigationController i = tab.b().i();
        G12 q = i.q();
        int i2 = q.b;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (i.a(i2 - q.b)) {
                GURL gurl = q.a(i2).c;
                TemplateUrlService a2 = IG3.a();
                if (!TextUtils.isEmpty(N.MfK2IDmL(a2.c, a2, gurl))) {
                    tab.d(new LoadUrlParams(gurl.i(), 10));
                    return;
                }
            }
        }
    }
}
