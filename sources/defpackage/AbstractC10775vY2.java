package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vY2 */
/* loaded from: classes.dex */
public abstract class AbstractC10775vY2 extends AbstractC3349Zu {
    public static final /* synthetic */ int l0 = 0;
    public TextView e0;
    public View f0;
    public View g0;
    public View h0;
    public ScrollViewWithSizeCallback i0;
    public final ViewTreeObserverOnScrollChangedListenerC10432uY2 j0 = new ViewTreeObserverOnScrollChangedListenerC10432uY2(this);
    public boolean k0 = false;

    public abstract View S0();

    public abstract String T0();

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e029e, viewGroup, false);
        this.f0 = inflate.findViewById(R.id.survey_question_header_logo_text);
        this.e0 = (TextView) inflate.findViewById(R.id.survey_question_text);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = P91.a(T0());
        }
        this.e0.setText(charSequence);
        this.e0.setContentDescription(charSequence.toString());
        this.h0 = S0();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) inflate.findViewById(R.id.survey_question_scroll_view);
        this.i0 = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.h0);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.i0;
        ViewTreeObserverOnScrollChangedListenerC10432uY2 viewTreeObserverOnScrollChangedListenerC10432uY2 = this.j0;
        scrollViewWithSizeCallback2.a = viewTreeObserverOnScrollChangedListenerC10432uY2;
        if (!this.k0) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC10432uY2);
            this.k0 = true;
        }
        AbstractC2461Sy1.b((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), this.d0);
        SurveyActivity surveyActivity = (SurveyActivity) ((InterfaceC11231wr3) viewGroup.getContext());
        surveyActivity.getClass();
        this.g0 = surveyActivity.findViewById(R.id.survey_controls_container);
        Ec4.n(null, inflate);
        return inflate;
    }

    @Override // defpackage.AbstractC3349Zu
    public void P0() {
        View view;
        if ((!OP0.b(G61.a(OP0.b)) || R0()) && AbstractC3208Yr3.m(K()) && (view = this.f0) != null) {
            view.requestFocus();
            this.f0.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.AbstractC3349Zu
    public final void Q0(String str) {
        if (!OP0.b(G61.a(OP0.b)) || R0()) {
            Spanned a = P91.a(str);
            this.e0.setText(a);
            this.e0.setContentDescription(a.toString());
        }
    }

    @Override // androidx.fragment.app.c
    public void s0(Bundle bundle) {
        TextView textView = this.e0;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // androidx.fragment.app.c
    public final void k0() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.k0 && (scrollViewWithSizeCallback = this.i0) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.j0);
            this.k0 = false;
        }
        this.f11484J = true;
    }

    public final boolean R0() {
        return (K() == null || this.e0 == null || this.f0 == null || this.g0 == null || this.h0 == null || this.i0 == null) ? false : true;
    }
}
