package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s02 */
/* loaded from: classes.dex */
public class C9566s02 extends AbstractC10775vY2 {
    public static final /* synthetic */ int q0 = 0;
    public boolean[] m0;
    public LinearLayout n0;
    public QuestionMetrics o0;
    public C11624y02 p0;

    @Override // defpackage.AbstractC3349Zu, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            this.o0 = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
            this.m0 = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.o0 == null) {
            this.o0 = new QuestionMetrics();
        }
        boolean[] zArr = this.m0;
        if (zArr == null) {
            C4363cr3 c4363cr3 = this.b0;
            C3670aq3 c3670aq3 = (c4363cr3.j == 5 ? (C2293Rq3) c4363cr3.k : C2293Rq3.k).j;
            if (c3670aq3 == null) {
                c3670aq3 = C3670aq3.k;
            }
            this.m0 = new boolean[c3670aq3.j.size()];
            return;
        }
        int length = zArr.length;
        C4363cr3 c4363cr32 = this.b0;
        C3670aq3 c3670aq32 = (c4363cr32.j == 5 ? (C2293Rq3) c4363cr32.k : C2293Rq3.k).j;
        if (c3670aq32 == null) {
            c3670aq32 = C3670aq3.k;
        }
        if (length != c3670aq32.j.size()) {
            Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.m0.length);
            C4363cr3 c4363cr33 = this.b0;
            C3670aq3 c3670aq33 = (c4363cr33.j == 5 ? (C2293Rq3) c4363cr33.k : C2293Rq3.k).j;
            if (c3670aq33 == null) {
                c3670aq33 = C3670aq3.k;
            }
            this.m0 = new boolean[c3670aq33.j.size()];
        }
    }

    @Override // defpackage.AbstractC10775vY2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putParcelable("QuestionMetrics", this.o0);
        bundle.putBooleanArray("ResponsesAsArray", this.m0);
    }

    @Override // defpackage.AbstractC10775vY2, defpackage.AbstractC3349Zu
    public final void P0() {
        super.P0();
        this.o0.d();
        InterfaceC11231wr3 O0 = O0();
        C11624y02 c11624y02 = this.p0;
        ((SurveyActivity) O0).n0(this, c11624y02 == null ? false : c11624y02.a());
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
        C2293Rq3 c2293Rq3;
        this.n0 = (LinearLayout) LayoutInflater.from(K()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e029f, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        A02 a02 = new A02(K());
        a02.h = new InterfaceC11967z02() { // from class: r02
            @Override // defpackage.InterfaceC11967z02
            public final void a(C11624y02 c11624y02) {
                int i = C9566s02.q0;
                C9566s02 c9566s02 = C9566s02.this;
                InterfaceC11231wr3 O0 = c9566s02.O0();
                if (O0 == null) {
                    Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                if (!c11624y02.a()) {
                    ((SurveyActivity) O0).y.g(false);
                    return;
                }
                c9566s02.p0 = c11624y02;
                c9566s02.o0.c();
                C11624y02 c11624y022 = c9566s02.p0;
                ((SurveyActivity) O0).n0(c9566s02, c11624y022 != null ? c11624y022.a() : false);
            }
        };
        C4363cr3 c4363cr3 = this.b0;
        if (c4363cr3.j == 5) {
            c2293Rq3 = (C2293Rq3) c4363cr3.k;
        } else {
            c2293Rq3 = C2293Rq3.k;
        }
        a02.a(c2293Rq3, this.m0);
        this.n0.addView(a02);
        return this.n0;
    }

    @Override // defpackage.AbstractC3349Zu
    public final void L0() {
        if (this.n0 != null) {
            int i = 0;
            while (i < this.n0.getChildCount()) {
                View childAt = this.n0.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        InterfaceC11231wr3 O0 = O0();
        C11624y02 c11624y02 = this.p0;
        ((SurveyActivity) O0).n0(this, c11624y02 == null ? false : c11624y02.a());
    }

    @Override // defpackage.AbstractC3349Zu
    public final C1384Kq3 M0() {
        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
        if (this.o0.a()) {
            C12254zq3 c12254zq3 = (C12254zq3) C0084Aq3.k.j();
            C4363cr3 c4363cr3 = this.b0;
            C3670aq3 c3670aq3 = (c4363cr3.j == 5 ? (C2293Rq3) c4363cr3.k : C2293Rq3.k).j;
            if (c3670aq3 == null) {
                c3670aq3 = C3670aq3.k;
            }
            InterfaceC1377Kp1 interfaceC1377Kp1 = c3670aq3.j;
            int i = 0;
            while (true) {
                boolean[] zArr = this.p0.b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    String str = ((C3328Zp3) interfaceC1377Kp1.get(i)).l;
                    int i2 = ((C3328Zp3) interfaceC1377Kp1.get(i)).j;
                    int i3 = 4;
                    char c = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
                    if (c == 0) {
                        c = 5;
                    }
                    if (c == 3 && !TextUtils.isEmpty(this.p0.a)) {
                        str = this.p0.a;
                    }
                    C0864Gq3 c0864Gq3 = (C0864Gq3) C0994Hq3.m.j();
                    int i4 = ((C3328Zp3) interfaceC1377Kp1.get(i)).k;
                    if (c0864Gq3.h) {
                        c0864Gq3.l();
                        c0864Gq3.h = false;
                    }
                    ((C0994Hq3) c0864Gq3.g).k = i4;
                    if (c0864Gq3.h) {
                        c0864Gq3.l();
                        c0864Gq3.h = false;
                    }
                    C0994Hq3 c0994Hq3 = (C0994Hq3) c0864Gq3.g;
                    c0994Hq3.getClass();
                    str.getClass();
                    c0994Hq3.l = str;
                    int i5 = ((C3328Zp3) interfaceC1377Kp1.get(i)).j;
                    int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 0 : 4 : 3 : 2 : 1;
                    if (i6 == 0) {
                        i6 = 5;
                    }
                    int b = AbstractC2373Sg3.b(i6);
                    if (b == 1) {
                        i3 = 2;
                    } else if (b == 2) {
                        i3 = 3;
                    } else if (b != 3) {
                        i3 = 1;
                    }
                    if (c0864Gq3.h) {
                        c0864Gq3.l();
                        c0864Gq3.h = false;
                    }
                    C0994Hq3 c0994Hq32 = (C0994Hq3) c0864Gq3.g;
                    c0994Hq32.getClass();
                    c0994Hq32.j = AbstractC0734Fq3.a(i3);
                    c12254zq3.o((C0994Hq3) c0864Gq3.j());
                    this.o0.c();
                }
                int i7 = this.b0.l;
                if (c11911yq3.h) {
                    c11911yq3.l();
                    c11911yq3.h = false;
                }
                ((C1384Kq3) c11911yq3.g).l = i7;
                C0084Aq3 c0084Aq3 = (C0084Aq3) c12254zq3.j();
                if (c11911yq3.h) {
                    c11911yq3.l();
                    c11911yq3.h = false;
                }
                C1384Kq3 c1384Kq3 = (C1384Kq3) c11911yq3.g;
                c1384Kq3.getClass();
                c0084Aq3.getClass();
                c1384Kq3.k = c0084Aq3;
                c1384Kq3.j = 3;
                i++;
            }
        }
        return (C1384Kq3) c11911yq3.j();
    }
}
