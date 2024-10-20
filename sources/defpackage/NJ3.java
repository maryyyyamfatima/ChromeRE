package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NJ3 extends AbstractC3349Zu {
    public static final /* synthetic */ int f0 = 0;
    public LinearLayout e0;

    @Override // defpackage.AbstractC3349Zu
    public final C1384Kq3 M0() {
        return null;
    }

    @Override // defpackage.AbstractC3349Zu
    public final void Q0(String str) {
    }

    @Override // defpackage.AbstractC3349Zu
    public final void P0() {
        ImageButton imageButton;
        ((SurveyActivity) O0()).y.i(false);
        ((SurveyActivity) O0()).n0(this, true);
        if (!TextUtils.isEmpty(AbstractC3208Yr3.e(this.c0.l)) || O0() == null) {
            return;
        }
        Context context = OP0.b;
        ((C61) ((B61) A61.g.a.get())).getClass();
        if (OP0.b(((Boolean) C61.a.a(context)).booleanValue()) && (imageButton = (ImageButton) ((SurveyActivity) O0()).y.p.findViewById(R.id.survey_close_button)) != null) {
            imageButton.setVisibility(8);
        }
        C10888vr3 c10888vr3 = ((SurveyActivity) O0()).y;
        c10888vr3.getClass();
        c10888vr3.p.setResult(-1, new Intent());
        c10888vr3.k.postDelayed(c10888vr3.l, 2400L);
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02a2, viewGroup, false);
        this.e0 = linearLayout;
        AbstractC2461Sy1.b((ImageView) linearLayout.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(this.l.getInt("DisplayLogoResId", 0)));
        TextView textView = (TextView) this.e0.findViewById(R.id.survey_question_text);
        Spanned a = P91.a(this.c0.j);
        textView.setText(a);
        textView.setContentDescription(a.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String e = AbstractC3208Yr3.e(this.c0.l);
        if (!TextUtils.isEmpty(e)) {
            String str = this.c0.k;
            if (TextUtils.isEmpty(str)) {
                str = N().getString(R.string.0_resource_name_obfuscated_res_0x7f140ac7);
            }
            TextView textView2 = (TextView) this.e0.findViewById(R.id.survey_follow_up_url);
            textView2.setContentDescription(str);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new MJ3(this, e), 0, str.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (AbstractC3208Yr3.m(K())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(new View.OnTouchListener() { // from class: LJ3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i = NJ3.f0;
                    if (motionEvent.getAction() == 0) {
                        view.setPressed(true);
                    } else if (motionEvent.getAction() == 1) {
                        view.performClick();
                        view.setPressed(false);
                    }
                    return false;
                }
            });
            textView2.setVisibility(0);
        }
        return this.e0;
    }

    @Override // defpackage.AbstractC3349Zu
    public final void L0() {
        if (this.e0 != null) {
            int i = 0;
            while (i < this.e0.getChildCount()) {
                View childAt = this.e0.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }
}
