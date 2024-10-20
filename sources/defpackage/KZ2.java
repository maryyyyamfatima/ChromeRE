package defpackage;

import J.N;
import android.content.Context;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.search_engines.settings.SearchEngineSettings;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KZ2 implements InterfaceC0679Ff3 {
    public final Context a;
    public final SettingsLauncher g;

    @Override // defpackage.InterfaceC0679Ff3
    public final /* synthetic */ void a(Object obj) {
    }

    public KZ2(Context context) {
        I53 i53 = ChromeTabbedActivity.M1;
        this.a = context;
        this.g = i53;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        int MJpD6RKI;
        this.g.c(this.a, SearchEngineSettings.class);
        EI2.h(1, 3, "Android.SearchEngineChoice.Events");
        TemplateUrlService a = IG3.a();
        TemplateUrl c = a.c();
        if (c == null) {
            MJpD6RKI = -1;
        } else {
            MJpD6RKI = N.MJpD6RKI(a.c, a, c.b());
        }
        EI2.h(MJpD6RKI, 64, "Android.SearchEngineChoice.SearchEngineBeforeChoicePrompt");
        O83.a.q(MJpD6RKI, "search_engine_choice_default_type_before");
    }
}
