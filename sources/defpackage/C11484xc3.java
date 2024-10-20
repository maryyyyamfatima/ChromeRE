package defpackage;

import androidx.preference.Preference;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xc3 */
/* loaded from: classes2.dex */
public final class C11484xc3 extends AS0 {
    public final /* synthetic */ SingleCategorySettings b;

    @Override // defpackage.AS0, defpackage.InterfaceC4184cL1
    public final boolean a(Preference preference) {
        return this.b.m0.l();
    }

    @Override // defpackage.InterfaceC4184cL1
    public final boolean d(Preference preference) {
        SingleCategorySettings singleCategorySettings = this.b;
        return singleCategorySettings.m0.k() && !singleCategorySettings.m0.l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11484xc3(SingleCategorySettings singleCategorySettings, InterfaceC4184cL1 interfaceC4184cL1) {
        super(interfaceC4184cL1);
        this.b = singleCategorySettings;
    }
}
