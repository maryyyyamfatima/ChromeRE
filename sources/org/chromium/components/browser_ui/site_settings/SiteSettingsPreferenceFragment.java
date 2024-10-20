package org.chromium.components.browser_ui.site_settings;

import defpackage.AbstractC0123Ay2;
import defpackage.GP;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class SiteSettingsPreferenceFragment extends AbstractC0123Ay2 {
    public GP j0;

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public void k0() {
        LargeIconBridge largeIconBridge;
        super.k0();
        GP gp = this.j0;
        if (gp == null || (largeIconBridge = gp.e) == null) {
            return;
        }
        largeIconBridge.a();
        gp.e = null;
    }
}
