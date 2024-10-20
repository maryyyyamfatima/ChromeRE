package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sd2 */
/* loaded from: classes.dex */
public class C2357Sd2 extends AbstractC10775vY2 {
    public QuestionMetrics m0;
    public String n0;

    @Override // defpackage.AbstractC3349Zu, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle == null) {
            this.m0 = new QuestionMetrics();
        } else {
            this.m0 = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.AbstractC10775vY2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putParcelable("QuestionMetrics", this.m0);
    }

    @Override // defpackage.AbstractC10775vY2, defpackage.AbstractC3349Zu
    public final void P0() {
        super.P0();
        this.m0.d();
        ((SurveyActivity) O0()).n0(this, true);
    }

    @Override // defpackage.AbstractC10775vY2
    public final String T0() {
        if (this.b0.n.isEmpty()) {
            return this.b0.m;
        }
        return this.b0.n;
    }

    @Override // defpackage.AbstractC10775vY2
    public final View S0() {
        C2423Sq3 c2423Sq3;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(K()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e029f, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        C2747Vd2 c2747Vd2 = new C2747Vd2(K());
        C4363cr3 c4363cr3 = this.b0;
        if (c4363cr3.j == 7) {
            c2423Sq3 = (C2423Sq3) c4363cr3.k;
        } else {
            c2423Sq3 = C2423Sq3.l;
        }
        c2747Vd2.a(c2423Sq3);
        c2747Vd2.a = new InterfaceC2617Ud2() { // from class: Rd2
            @Override // defpackage.InterfaceC2617Ud2
            public final void a(String str) {
                C2357Sd2.this.n0 = str;
            }
        };
        linearLayout.addView(c2747Vd2);
        return linearLayout;
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        ((SurveyActivity) O0()).n0(this, true);
    }

    @Override // defpackage.AbstractC3349Zu
    public final C1384Kq3 M0() {
        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
        if (this.m0.a()) {
            this.m0.c();
            String str = this.n0;
            if (str == null) {
                str = "";
            }
            C0214Bq3 c0214Bq3 = (C0214Bq3) C0344Cq3.k.j();
            if (c0214Bq3.h) {
                c0214Bq3.l();
                c0214Bq3.h = false;
            }
            C0344Cq3 c0344Cq3 = (C0344Cq3) c0214Bq3.g;
            c0344Cq3.getClass();
            c0344Cq3.j = str;
            C0344Cq3 c0344Cq32 = (C0344Cq3) c0214Bq3.j();
            int i = this.b0.l;
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            ((C1384Kq3) c11911yq3.g).l = i;
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            C1384Kq3 c1384Kq3 = (C1384Kq3) c11911yq3.g;
            c1384Kq3.getClass();
            c0344Cq32.getClass();
            c1384Kq3.k = c0344Cq32;
            c1384Kq3.j = 5;
        }
        return (C1384Kq3) c11911yq3.j();
    }
}
