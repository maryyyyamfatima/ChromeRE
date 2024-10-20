package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zu */
/* loaded from: classes.dex */
public abstract class AbstractC3349Zu extends c {
    public C4363cr3 b0;
    public C9168qq3 c0;
    public Integer d0;

    public void L0() {
    }

    public abstract C1384Kq3 M0();

    public abstract void P0();

    public abstract void Q0(String str);

    public static Bundle N0(C4363cr3 c4363cr3, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", c4363cr3.toByteArray());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    @Override // androidx.fragment.app.c
    public void g0(Bundle bundle) {
        super.g0(bundle);
        Bundle bundle2 = this.l;
        byte[] byteArray = bundle2.getByteArray("Question");
        if (byteArray != null) {
            this.b0 = (C4363cr3) AbstractC3208Yr3.g(C4363cr3.s, byteArray);
        }
        this.d0 = bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null;
        bundle2.getInt("QuestionIndex");
        byte[] byteArray2 = bundle2.getByteArray("Completion");
        if (byteArray2 != null) {
            this.c0 = (C9168qq3) AbstractC3208Yr3.g(C9168qq3.o, byteArray2);
        }
    }

    public final InterfaceC11231wr3 O0() {
        Object K = K();
        if (!(K instanceof InterfaceC11231wr3)) {
            return null;
        }
        InterfaceC11231wr3 interfaceC11231wr3 = (InterfaceC11231wr3) K;
        SurveyActivity surveyActivity = (SurveyActivity) interfaceC11231wr3;
        surveyActivity.getClass();
        if (surveyActivity.isFinishing() || surveyActivity.isDestroyed()) {
            return null;
        }
        return interfaceC11231wr3;
    }
}
