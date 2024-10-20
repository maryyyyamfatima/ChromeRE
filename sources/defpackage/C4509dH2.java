package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dH2 */
/* loaded from: classes.dex */
public class C4509dH2 extends AbstractC3349Zu {
    public static final /* synthetic */ int i0 = 0;
    public String e0;
    public int f0;
    public QuestionMetrics g0;
    public TextView h0;

    @Override // defpackage.AbstractC3349Zu, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            this.e0 = bundle.getString("SelectedResponse", null);
            this.g0 = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.g0 == null) {
            this.g0 = new QuestionMetrics();
        }
    }

    @Override // androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        bundle.putString("SelectedResponse", this.e0);
        bundle.putParcelable("QuestionMetrics", this.g0);
        TextView textView = this.h0;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.AbstractC3349Zu
    public final void P0() {
        TextView textView;
        this.g0.d();
        if (O0() != null) {
            ((SurveyActivity) O0()).y.i(false);
        }
        ((SurveyActivity) O0()).n0(this, this.e0 != null);
        if (!AbstractC3208Yr3.m(K()) || (textView = this.h0) == null) {
            return;
        }
        textView.requestFocus();
        this.h0.sendAccessibilityEvent(8);
    }

    @Override // defpackage.AbstractC3349Zu
    public final void Q0(String str) {
        if (OP0.b(G61.a(OP0.b))) {
            if (!((K() == null || this.h0 == null) ? false : true)) {
                return;
            }
        }
        Spanned a = P91.a(str);
        this.h0.setText(a);
        this.h0.setContentDescription(a.toString());
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5050er3 c5050er3;
        String str;
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0299, viewGroup, false);
        Bundle bundle2 = this.l;
        AbstractC2461Sy1.b((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            if (this.b0.n.isEmpty()) {
                str = this.b0.m;
            } else {
                str = this.b0.n;
            }
            charSequence = P91.a(str);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.survey_question_text);
        this.h0 = textView;
        textView.setText(charSequence);
        this.h0.setContentDescription(charSequence.toString());
        C8633pH2 c8633pH2 = new C8633pH2(K());
        C4363cr3 c4363cr3 = this.b0;
        if (c4363cr3.j == 6) {
            c5050er3 = (C5050er3) c4363cr3.k;
        } else {
            c5050er3 = C5050er3.p;
        }
        c8633pH2.f(c5050er3);
        c8633pH2.g = new InterfaceC8290oH2() { // from class: cH2
            @Override // defpackage.InterfaceC8290oH2
            public final void a(int i) {
                char c;
                int i2 = C4509dH2.i0;
                C4509dH2 c4509dH2 = C4509dH2.this;
                c4509dH2.getClass();
                c4509dH2.e0 = Integer.toString(i);
                c4509dH2.f0 = i;
                c4509dH2.g0.c();
                int i3 = c4509dH2.b0.p;
                if (i3 != 0) {
                    c = 2;
                    if (i3 != 1) {
                        c = i3 != 2 ? i3 != 3 ? i3 != 4 ? (char) 0 : (char) 5 : (char) 4 : (char) 3;
                    }
                } else {
                    c = 1;
                }
                if (c == 0) {
                    c = 6;
                }
                boolean z = c == 4;
                InterfaceC11231wr3 O0 = c4509dH2.O0();
                if (O0 == null) {
                    Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else if (z) {
                    ((SurveyActivity) O0).y.b();
                } else {
                    ((SurveyActivity) O0).n0(c4509dH2, c4509dH2.e0 != null);
                }
            }
        };
        ((ViewGroup) inflate.findViewById(R.id.survey_rating_container)).addView(c8633pH2);
        return inflate;
    }

    @Override // defpackage.AbstractC3349Zu
    public final C1384Kq3 M0() {
        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
        if (this.g0.a() && this.e0 != null) {
            C0864Gq3 c0864Gq3 = (C0864Gq3) C0994Hq3.m.j();
            int i = this.f0;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            ((C0994Hq3) c0864Gq3.g).k = i;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            C0994Hq3 c0994Hq3 = (C0994Hq3) c0864Gq3.g;
            c0994Hq3.getClass();
            c0994Hq3.j = AbstractC0734Fq3.a(2);
            String str = this.e0;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            C0994Hq3 c0994Hq32 = (C0994Hq3) c0864Gq3.g;
            c0994Hq32.getClass();
            str.getClass();
            c0994Hq32.l = str;
            C0994Hq3 c0994Hq33 = (C0994Hq3) c0864Gq3.j();
            C0474Dq3 c0474Dq3 = (C0474Dq3) C0604Eq3.k.j();
            if (c0474Dq3.h) {
                c0474Dq3.l();
                c0474Dq3.h = false;
            }
            C0604Eq3 c0604Eq3 = (C0604Eq3) c0474Dq3.g;
            c0604Eq3.getClass();
            c0994Hq33.getClass();
            c0604Eq3.j = c0994Hq33;
            C0604Eq3 c0604Eq32 = (C0604Eq3) c0474Dq3.j();
            int i2 = this.b0.l;
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            ((C1384Kq3) c11911yq3.g).l = i2;
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            C1384Kq3 c1384Kq3 = (C1384Kq3) c11911yq3.g;
            c1384Kq3.getClass();
            c0604Eq32.getClass();
            c1384Kq3.k = c0604Eq32;
            c1384Kq3.j = 4;
            int i3 = AbstractC3208Yr3.b;
        }
        return (C1384Kq3) c11911yq3.j();
    }
}
