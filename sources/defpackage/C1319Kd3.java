package defpackage;

import java.util.Collection;
import org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kd3 */
/* loaded from: classes2.dex */
public final class C1319Kd3 implements No4 {
    public final C6751jo4 a;
    public final /* synthetic */ SingleWebsiteSettings b;

    public C1319Kd3(SingleWebsiteSettings singleWebsiteSettings, C6751jo4 c6751jo4) {
        this.b = singleWebsiteSettings;
        this.a = c6751jo4;
    }

    @Override // defpackage.No4
    public final void a(Collection collection) {
        SingleWebsiteSettings singleWebsiteSettings = this.b;
        if (singleWebsiteSettings.getActivity() == null) {
            return;
        }
        singleWebsiteSettings.p0 = SingleWebsiteSettings.Z0(this.a, collection);
        singleWebsiteSettings.T0();
    }
}
