package defpackage;

import android.view.View;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bs3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4026bs3 extends Od4 {
    public final /* synthetic */ SurveyViewPager a;

    public C4026bs3(SurveyViewPager surveyViewPager) {
        this.a = surveyViewPager;
    }

    @Override // defpackage.Od4, defpackage.Ld4
    public final void c(int i) {
        SurveyViewPager surveyViewPager = this.a;
        surveyViewPager.invalidate();
        int i2 = SurveyViewPager.b0;
        AbstractC3349Zu A = surveyViewPager.A();
        if (A != null) {
            A.P0();
            A.L0();
            View view = A.L;
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        surveyViewPager.requestLayout();
    }
}
