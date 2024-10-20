package defpackage;

import android.view.View;
import org.chromium.chrome.browser.infobar.SurveyInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jr3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1259Jr3 implements View.OnClickListener {
    public final /* synthetic */ SurveyInfoBar a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SurveyInfoBar surveyInfoBar = this.a;
        if (surveyInfoBar.q || !C10021tL.f().c()) {
            return;
        }
        surveyInfoBar.v();
        surveyInfoBar.r = true;
    }

    public ViewOnClickListenerC1259Jr3(SurveyInfoBar surveyInfoBar) {
        this.a = surveyInfoBar;
    }
}
