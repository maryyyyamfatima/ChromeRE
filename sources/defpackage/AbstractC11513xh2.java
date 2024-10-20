package defpackage;

import android.view.View;
import androidx.fragment.app.h;
import org.chromium.components.browser_ui.site_settings.SiteSettingsPreferenceFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xh2 */
/* loaded from: classes2.dex */
public abstract class AbstractC11513xh2 implements InterfaceC0558Eh2 {
    public final AbstractC2242Rg2 a;
    public SiteSettingsPreferenceFragment g;

    public AbstractC11513xh2(WO wo) {
        this.a = wo;
    }

    public final View c(SiteSettingsPreferenceFragment siteSettingsPreferenceFragment) {
        AbstractC2242Rg2 abstractC2242Rg2 = this.a;
        h a = abstractC2242Rg2.a();
        if (a.J()) {
            return null;
        }
        this.g = siteSettingsPreferenceFragment;
        WO wo = (WO) abstractC2242Rg2;
        siteSettingsPreferenceFragment.j0 = new GP(wo.j, wo.k);
        C10547us c10547us = new C10547us(a);
        c10547us.g(0, this.g, null, 1);
        c10547us.f();
        return this.g.C0();
    }

    public final void e() {
        h a = this.a.a();
        SiteSettingsPreferenceFragment siteSettingsPreferenceFragment = this.g;
        this.g = null;
        if (a == null || a.J()) {
            return;
        }
        C10547us c10547us = new C10547us(a);
        c10547us.i(siteSettingsPreferenceFragment);
        c10547us.f();
    }
}
