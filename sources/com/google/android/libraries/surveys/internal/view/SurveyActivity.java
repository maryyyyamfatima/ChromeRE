package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import defpackage.AbstractC1389Kr3;
import defpackage.AbstractC3208Yr3;
import defpackage.AbstractC6994kX2;
import defpackage.C10888vr3;
import defpackage.C2163Qq3;
import defpackage.C2349Sc;
import defpackage.C2553Tq3;
import defpackage.C4369cs3;
import defpackage.C7456lr3;
import defpackage.D61;
import defpackage.EnumC3721az2;
import defpackage.G61;
import defpackage.InterfaceC11231wr3;
import defpackage.InterfaceC3078Xr3;
import defpackage.OP0;
import defpackage.Y61;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SurveyActivity extends a implements InterfaceC11231wr3 {
    public C10888vr3 y;

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C7456lr3 c7456lr3;
        C2553Tq3 c2553Tq3;
        MaterialButton materialButton;
        super.onCreate(bundle);
        final C10888vr3 c10888vr3 = new C10888vr3(this, h0());
        this.y = c10888vr3;
        if (OP0.b == null) {
            c10888vr3.p.finish();
            return;
        }
        Intent intent = c10888vr3.p.getIntent();
        if (intent.getBooleanExtra("IsDismissing", false)) {
            c10888vr3.p.finish();
            return;
        }
        c10888vr3.p.setTitle("");
        String stringExtra = intent.getStringExtra("TriggerId");
        c10888vr3.a = null;
        if (OP0.b(D61.a(OP0.b))) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("SurveyPayload");
            if (byteArrayExtra != null) {
                c10888vr3.a = (C2553Tq3) AbstractC3208Yr3.g(C2553Tq3.p, byteArrayExtra);
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("SurveySession");
            c7456lr3 = byteArrayExtra2 != null ? (C7456lr3) AbstractC3208Yr3.g(C7456lr3.l, byteArrayExtra2) : null;
        } else {
            c10888vr3.a = (C2553Tq3) AbstractC3208Yr3.g(C2553Tq3.p, intent.getByteArrayExtra("SurveyPayload"));
            c7456lr3 = (C7456lr3) AbstractC3208Yr3.g(C7456lr3.l, intent.getByteArrayExtra("SurveySession"));
        }
        if (bundle != null) {
            c10888vr3.c = (Answer) bundle.getParcelable("Answer");
            c10888vr3.h = bundle.getBoolean("IsSubmitting");
            Bundle bundle2 = bundle.getBundle("SingleSelectOrdinalAnswerMappings");
            c10888vr3.e = bundle2;
            if (bundle2 == null) {
                c10888vr3.e = new Bundle();
            }
        } else {
            c10888vr3.c = (Answer) intent.getParcelableExtra("Answer");
            c10888vr3.h = intent.getBooleanExtra("IsSubmitting", false);
        }
        c10888vr3.n = intent.getBooleanExtra("IgnoreFirstQuestion", false);
        c10888vr3.m = intent.hasExtra("LogoResId") ? Integer.valueOf(intent.getIntExtra("LogoResId", 0)) : null;
        if (stringExtra == null || (c2553Tq3 = c10888vr3.a) == null || c2553Tq3.n.size() == 0 || c10888vr3.c == null || c7456lr3 == null) {
            Log.e("SurveyActivityImpl", "Required EXTRAS not found in the intent, bailing out.");
            c10888vr3.p.finish();
            return;
        }
        C2163Qq3 c2163Qq3 = c10888vr3.a.j;
        if (c2163Qq3 == null) {
            c2163Qq3 = C2163Qq3.l;
        }
        boolean z = c2163Qq3.j || c10888vr3.n;
        if (bundle != null || !z) {
            AbstractC1389Kr3.a.b();
        }
        int i = AbstractC3208Yr3.b;
        c10888vr3.d = new C2349Sc(c10888vr3.p, stringExtra, c7456lr3);
        c10888vr3.p.setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e028d);
        c10888vr3.g = (LinearLayout) c10888vr3.p.findViewById(R.id.survey_container);
        c10888vr3.f = (MaterialCardView) c10888vr3.p.findViewById(R.id.survey_overall_container);
        c10888vr3.p.findViewById(R.id.survey_main_scroll_view).setFocusable(false);
        final String str = TextUtils.isEmpty(c10888vr3.c.h) ? null : c10888vr3.c.h;
        Activity activity = c10888vr3.p;
        ImageButton imageButton = (ImageButton) activity.findViewById(R.id.survey_close_button);
        imageButton.setImageDrawable(AbstractC3208Yr3.j(activity));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: ur3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10888vr3 c10888vr32 = C10888vr3.this;
                c10888vr32.getClass();
                C5364fm3 c5364fm3 = new C5364fm3();
                c10888vr32.f(6);
                LinearLayout linearLayout = c10888vr32.g;
                ((InputMethodManager) linearLayout.getContext().getSystemService("input_method")).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                Activity activity2 = c10888vr32.p;
                activity2.finish();
                AbstractC5275fX1.e(c5364fm3, activity2, str);
            }
        });
        c10888vr3.j = intent.getIntExtra("StartingQuestionIndex", 1);
        boolean p = AbstractC3208Yr3.p(c10888vr3.a);
        c10888vr3.p.getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e028e, c10888vr3.g);
        if (OP0.b(G61.a(OP0.b))) {
            c10888vr3.i(p);
        } else if (!p) {
            c10888vr3.i(false);
        }
        if (z) {
            Activity activity2 = c10888vr3.p;
            activity2.findViewById(R.id.survey_controls_divider).setVisibility(8);
            activity2.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
        } else {
            InterfaceC3078Xr3 interfaceC3078Xr3 = new InterfaceC3078Xr3() { // from class: tr3
                @Override // defpackage.InterfaceC3078Xr3
                public final void a() {
                    C10888vr3 c10888vr32 = C10888vr3.this;
                    c10888vr32.getClass();
                    C5364fm3 c5364fm3 = new C5364fm3();
                    C8506ou3 c8506ou3 = new C8506ou3();
                    Bundle bundle3 = new Bundle(2);
                    String str2 = str;
                    bundle3.putString("EXTRA_ACCOUNT_NAME", str2);
                    bundle3.putBundle("EXTRA_PSD_BUNDLE", AbstractC3208Yr3.h(c10888vr32.c.i));
                    c8506ou3.E0(bundle3);
                    String str3 = C8506ou3.r0;
                    h hVar = c10888vr32.q;
                    c8506ou3.Q0(hVar, str3);
                    hVar.w(true);
                    hVar.C();
                    AbstractC5275fX1.d(c5364fm3, c10888vr32.p, str2);
                }
            };
            Activity activity3 = c10888vr3.p;
            AbstractC3208Yr3.b(activity3, (TextView) activity3.findViewById(R.id.survey_controls_legal_text), str, interfaceC3078Xr3);
        }
        EnumC3721az2 enumC3721az2 = (EnumC3721az2) intent.getSerializableExtra("SurveyCompletionStyle");
        c10888vr3.o = enumC3721az2;
        h hVar = c10888vr3.q;
        C2553Tq3 c2553Tq32 = c10888vr3.a;
        Integer num = c10888vr3.m;
        boolean z2 = c10888vr3.n;
        C4369cs3 c4369cs3 = new C4369cs3(hVar, c2553Tq32, num, z2, AbstractC6994kX2.b(z2, c2553Tq32, c10888vr3.c), enumC3721az2, c10888vr3.j);
        SurveyViewPager surveyViewPager = (SurveyViewPager) c10888vr3.p.findViewById(R.id.survey_viewpager);
        c10888vr3.b = surveyViewPager;
        surveyViewPager.v(c4369cs3);
        c10888vr3.b.setImportantForAccessibility(2);
        if (bundle != null) {
            c10888vr3.b.w(bundle.getInt("CurrentQuestionIndexForViewPager"));
        }
        if (p && (materialButton = (MaterialButton) c10888vr3.p.findViewById(R.id.survey_next)) != null && c10888vr3.b.B()) {
            materialButton.setText(R.string.0_resource_name_obfuscated_res_0x7f140ac4);
        }
        c10888vr3.g.setVisibility(0);
        c10888vr3.g.forceLayout();
        if (c10888vr3.n) {
            c10888vr3.e();
            c10888vr3.l();
            c10888vr3.f(5);
        }
        if (p) {
            ((MaterialButton) c10888vr3.p.findViewById(R.id.survey_next)).setOnClickListener(new View.OnClickListener() { // from class: sr3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C10888vr3 c10888vr32 = C10888vr3.this;
                    c10888vr32.getClass();
                    C5364fm3 c5364fm3 = new C5364fm3();
                    c10888vr32.b();
                    AbstractC5275fX1.f(c5364fm3, c10888vr32.p, str);
                }
            });
        }
        Activity activity4 = c10888vr3.p;
        Window window = activity4.getWindow();
        window.addFlags(2);
        window.clearFlags(32);
        window.addFlags(262144);
        window.setDimAmount(0.4f);
        activity4.findViewById(R.id.survey_close_button).setVisibility(0);
        SurveyViewPager surveyViewPager2 = c10888vr3.b;
        if (surveyViewPager2 != null) {
            if (surveyViewPager2.k == 0) {
                C2163Qq3 c2163Qq32 = c10888vr3.a.j;
                if (c2163Qq32 == null) {
                    c2163Qq32 = C2163Qq3.l;
                }
                if (!c2163Qq32.j) {
                    c10888vr3.f(2);
                }
            }
        }
        if (OP0.c(Y61.a(OP0.b)) && intent.hasExtra("IsPausing")) {
            MaterialButton materialButton2 = (MaterialButton) c10888vr3.p.findViewById(R.id.survey_next);
            if (materialButton2 != null) {
                c10888vr3.i = materialButton2.isEnabled();
            }
            c10888vr3.c(intent.getBooleanExtra("IsPausing", false));
        }
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C10888vr3 c10888vr3 = this.y;
        c10888vr3.getClass();
        if (intent.getBooleanExtra("IsDismissing", false)) {
            c10888vr3.p.finish();
        }
        if (OP0.c(Y61.a(OP0.b)) && intent.hasExtra("IsPausing")) {
            c10888vr3.c(intent.getBooleanExtra("IsPausing", false));
        }
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C10888vr3 c10888vr3 = this.y;
        c10888vr3.getClass();
        if (OP0.b == null) {
            return;
        }
        if (c10888vr3.p.isFinishing()) {
            AbstractC1389Kr3.a.a();
        }
        c10888vr3.k.removeCallbacks(c10888vr3.l);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C10888vr3 c10888vr3 = this.y;
        c10888vr3.getClass();
        int action = motionEvent.getAction();
        Activity activity = c10888vr3.p;
        if (action == 0) {
            Rect rect = new Rect();
            c10888vr3.f.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && c10888vr3.h) {
                int i = AbstractC3208Yr3.b;
                activity.finish();
                return true;
            }
        }
        return activity.onTouchEvent(motionEvent);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onBackPressed() {
        C10888vr3 c10888vr3 = this.y;
        c10888vr3.f(6);
        boolean z = c10888vr3.h;
        Activity activity = c10888vr3.p;
        if (z) {
            activity.setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        activity.finish();
        super.onBackPressed();
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C10888vr3 c10888vr3 = this.y;
        c10888vr3.getClass();
        if (!OP0.b(G61.a(OP0.b))) {
            bundle.putInt("CurrentQuestionIndexForViewPager", c10888vr3.a());
        } else {
            SurveyViewPager surveyViewPager = c10888vr3.b;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.k : 0);
        }
        bundle.putBoolean("IsSubmitting", c10888vr3.h);
        bundle.putParcelable("Answer", c10888vr3.c);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", c10888vr3.e);
    }

    public final void n0(c cVar, boolean z) {
        C10888vr3 c10888vr3 = this.y;
        if (c10888vr3.h || cVar.l.getInt("QuestionIndex", -1) != c10888vr3.b.k) {
            return;
        }
        c10888vr3.g(z);
    }
}
