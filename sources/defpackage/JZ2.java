package defpackage;

import J.N;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JZ2 {
    public static boolean b() {
        Q83 q83 = O83.a;
        if (!q83.c("search_engine_choice_default_type_before")) {
            return false;
        }
        int f = q83.f(-1, "search_engine_choice_default_type_before");
        TemplateUrlService a = IG3.a();
        TemplateUrl c = a.c();
        int MJpD6RKI = c != null ? N.MJpD6RKI(a.c, a, c.b()) : -1;
        boolean z = f != MJpD6RKI;
        if (z) {
            EI2.h(MJpD6RKI, 64, "Android.SearchEngineChoice.ChosenSearchEngine");
        }
        q83.m("search_engine_choice_default_type_before");
        return z;
    }

    public static void a(int i) {
        EI2.h(i, 8, "Android.SearchEngineChoice.EventsV2");
    }
}
