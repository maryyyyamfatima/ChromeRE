package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dd3 */
/* loaded from: classes.dex */
public class C4623dd3 extends AbstractC10775vY2 {
    public static final /* synthetic */ int r0 = 0;
    public LinearLayout m0;
    public String n0;
    public int o0 = -1;
    public QuestionMetrics p0;
    public int q0;

    @Override // defpackage.AbstractC3349Zu, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            this.n0 = bundle.getString("SelectedResponse", null);
            this.p0 = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.p0 == null) {
            this.p0 = new QuestionMetrics();
        }
    }

    @Override // defpackage.AbstractC10775vY2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putString("SelectedResponse", this.n0);
        bundle.putParcelable("QuestionMetrics", this.p0);
    }

    @Override // defpackage.AbstractC10775vY2, defpackage.AbstractC3349Zu
    public final void P0() {
        EditText editText;
        super.P0();
        this.p0.d();
        InterfaceC11231wr3 O0 = O0();
        LinearLayout linearLayout = this.m0;
        boolean z = false;
        if (linearLayout != null && (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) != null && editText.hasFocus()) {
            z = true;
        }
        ((SurveyActivity) O0).n0(this, z);
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
        C7800mr3 c7800mr3;
        View inflate = LayoutInflater.from(K()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e029f, (ViewGroup) null);
        this.m0 = (LinearLayout) inflate.findViewById(R.id.survey_answers_container);
        C7372ld3 c7372ld3 = new C7372ld3(K());
        c7372ld3.a = new InterfaceC6684jd3() { // from class: cd3
            @Override // defpackage.InterfaceC6684jd3
            public final void a(C7028kd3 c7028kd3) {
                int i = C4623dd3.r0;
                C4623dd3 c4623dd3 = C4623dd3.this;
                InterfaceC11231wr3 O0 = c4623dd3.O0();
                if (O0 == null) {
                    Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                int i2 = c7028kd3.b;
                c4623dd3.q0 = i2;
                c4623dd3.n0 = c7028kd3.a;
                c4623dd3.o0 = c7028kd3.c;
                if (i2 == 3) {
                    ((SurveyActivity) O0).y.g(true);
                } else {
                    ((SurveyActivity) O0).y.b();
                }
            }
        };
        C4363cr3 c4363cr3 = this.b0;
        if (c4363cr3.j == 4) {
            c7800mr3 = (C7800mr3) c4363cr3.k;
        } else {
            c7800mr3 = C7800mr3.l;
        }
        c7372ld3.a(c7800mr3);
        this.m0.addView(c7372ld3);
        if (!AbstractC3208Yr3.p(((SurveyActivity) O0()).y.a)) {
            inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), N().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080752));
        }
        return inflate;
    }

    @Override // defpackage.AbstractC3349Zu
    public final void L0() {
        if (this.m0 != null) {
            int i = 0;
            while (i < this.m0.getChildCount()) {
                View childAt = this.m0.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.AbstractC3349Zu
    public final C1384Kq3 M0() {
        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
        if (this.p0.a() && this.n0 != null) {
            this.p0.c();
            C0864Gq3 c0864Gq3 = (C0864Gq3) C0994Hq3.m.j();
            int i = this.o0;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            ((C0994Hq3) c0864Gq3.g).k = i;
            int i2 = this.q0;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            C0994Hq3 c0994Hq3 = (C0994Hq3) c0864Gq3.g;
            c0994Hq3.getClass();
            c0994Hq3.j = AbstractC0734Fq3.a(i2);
            String str = this.n0;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            C0994Hq3 c0994Hq32 = (C0994Hq3) c0864Gq3.g;
            c0994Hq32.getClass();
            str.getClass();
            c0994Hq32.l = str;
            C0994Hq3 c0994Hq33 = (C0994Hq3) c0864Gq3.j();
            C1124Iq3 c1124Iq3 = (C1124Iq3) C1254Jq3.k.j();
            if (c1124Iq3.h) {
                c1124Iq3.l();
                c1124Iq3.h = false;
            }
            C1254Jq3 c1254Jq3 = (C1254Jq3) c1124Iq3.g;
            c1254Jq3.getClass();
            c0994Hq33.getClass();
            c1254Jq3.j = c0994Hq33;
            C1254Jq3 c1254Jq32 = (C1254Jq3) c1124Iq3.j();
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            C1384Kq3 c1384Kq3 = (C1384Kq3) c11911yq3.g;
            c1384Kq3.getClass();
            c1254Jq32.getClass();
            c1384Kq3.k = c1254Jq32;
            c1384Kq3.j = 2;
            int i3 = this.b0.l;
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            ((C1384Kq3) c11911yq3.g).l = i3;
        }
        return (C1384Kq3) c11911yq3.j();
    }
}
