package defpackage;

import org.chromium.chrome.browser.infobar.SurveyInfoBar;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ir3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129Ir3 extends BA0 {
    public final /* synthetic */ SurveyInfoBar a;

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        SurveyInfoBar surveyInfoBar = this.a;
        surveyInfoBar.p.a();
        tab.w(this);
        super/*org.chromium.components.infobars.InfoBar*/.i();
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        this.a.p.b(z);
    }

    public C1129Ir3(SurveyInfoBar surveyInfoBar) {
        this.a = surveyInfoBar;
    }
}
