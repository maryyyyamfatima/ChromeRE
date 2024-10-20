package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.h;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.material.button.MaterialButton;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iD2 */
/* loaded from: classes.dex */
public final class C6208iD2 {
    public static AbstractC0952Hi1 w;
    public final InterfaceC5864hD2 a;
    public Answer b;
    public ContextThemeWrapper c;
    public Activity d;
    public C11624y02 e;
    public C2553Tq3 f;
    public QuestionMetrics g;
    public C7456lr3 h;
    public C7028kd3 i;
    public View j;
    public ViewGroup k;
    public C2816Vr1 l;
    public boolean n;
    public boolean o;
    public int p;
    public Integer q;
    public String r;
    public String s;
    public EnumC3721az2 t;
    public String u;
    public boolean m = false;
    public int v = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r2 = this;
            android.content.Context r0 = defpackage.OP0.b
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.m
            if (r0 == 0) goto La
            goto L3b
        La:
            android.content.Context r0 = defpackage.OP0.b
            V61 r1 = defpackage.V61.g
            Bp3 r1 = r1.a
            java.lang.Object r1 = r1.get()
            W61 r1 = (defpackage.W61) r1
            X61 r1 = (defpackage.X61) r1
            r1.getClass()
            YB2 r1 = defpackage.X61.a
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = defpackage.OP0.b(r0)
            if (r0 == 0) goto L3d
            hD2 r0 = r2.a
            android.app.Activity r0 = r0.getActivity()
            if (r0 == 0) goto L3d
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L3d
        L3b:
            r0 = 0
            goto L3e
        L3d:
            r0 = 1
        L3e:
            if (r0 == 0) goto L45
            Ar3 r0 = defpackage.AbstractC1389Kr3.a
            r0.a()
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6208iD2.e():void");
    }

    public static Bundle b(String str, C2553Tq3 c2553Tq3, C7456lr3 c7456lr3, Answer answer, Integer num, boolean z, Integer num2, EnumC3721az2 enumC3721az2, EnumC4408cz2 enumC4408cz2) {
        Bundle bundle = new Bundle();
        bundle.putString("TriggerId", str);
        HashMap hashMap = new HashMap();
        for (C4363cr3 c4363cr3 : c2553Tq3.n) {
            C4020br3 c4020br3 = c4363cr3.r;
            if (c4020br3 != null) {
                if (c4020br3 == null) {
                    c4020br3 = C4020br3.l;
                }
                if (!hashMap.containsKey(c4020br3.j)) {
                    C4020br3 c4020br32 = c4363cr3.r;
                    if (c4020br32 == null) {
                        c4020br32 = C4020br3.l;
                    }
                    hashMap.put(c4020br32.j, Integer.valueOf(c4363cr3.l));
                }
            }
        }
        w = AbstractC0952Hi1.b(hashMap);
        bundle.putByteArray("SurveyPayload", c2553Tq3.toByteArray());
        bundle.putByteArray("SurveySession", c7456lr3.toByteArray());
        bundle.putParcelable("Answer", answer);
        if (num != null) {
            bundle.putInt("RequestCode", num.intValue());
        }
        bundle.putBoolean("BottomSheet", z);
        if (num2 != null) {
            bundle.putInt("logoResId", num2.intValue());
        }
        bundle.putSerializable("SurveyCompletionCode", enumC3721az2);
        bundle.putSerializable("SurveyPromptCode", enumC4408cz2);
        bundle.putString("SurveyActivityClassName", "com.google.android.libraries.surveys.internal.view.SurveyActivity");
        return bundle;
    }

    public C6208iD2(InterfaceC5864hD2 interfaceC5864hD2) {
        this.a = interfaceC5864hD2;
    }

    public final View d(ViewGroup viewGroup) {
        C2553Tq3 c2553Tq3;
        this.d = this.a.getActivity();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.d, R.style.f99320_resource_name_obfuscated_res_0x7f1502f9);
        this.c = contextThemeWrapper;
        LayoutInflater layoutInflater = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        Bundle arguments = this.a.getArguments();
        this.r = arguments.getString("TriggerId");
        this.p = arguments.getInt("RequestCode", -1);
        this.b = (Answer) arguments.getParcelable("Answer");
        this.n = arguments.getBoolean("BottomSheet");
        this.u = arguments.getString("SurveyActivityClassName");
        this.q = arguments.containsKey("logoResId") ? Integer.valueOf(arguments.getInt("logoResId", 0)) : null;
        this.t = (EnumC3721az2) arguments.getSerializable("SurveyCompletionCode");
        EnumC4408cz2 enumC4408cz2 = (EnumC4408cz2) arguments.getSerializable("SurveyPromptCode");
        if (OP0.b(D61.a(OP0.b))) {
            this.f = null;
            byte[] byteArray = arguments.getByteArray("SurveyPayload");
            if (byteArray != null) {
                this.f = (C2553Tq3) AbstractC3208Yr3.g(C2553Tq3.p, byteArray);
            }
            this.h = null;
            byte[] byteArray2 = arguments.getByteArray("SurveySession");
            if (byteArray2 != null) {
                this.h = (C7456lr3) AbstractC3208Yr3.g(C7456lr3.l, byteArray2);
            }
            if (this.r == null || (c2553Tq3 = this.f) == null || c2553Tq3.n.size() == 0 || this.b == null || this.h == null) {
                Log.e("SurveyPromptDialogDel", "Required EXTRAS not found in the intent, bailing out.");
                return null;
            }
        } else {
            this.f = (C2553Tq3) AbstractC3208Yr3.g(C2553Tq3.p, arguments.getByteArray("SurveyPayload"));
            this.h = (C7456lr3) AbstractC3208Yr3.g(C7456lr3.l, arguments.getByteArray("SurveySession"));
        }
        if (this.a.getShowsDialog()) {
            this.a.getDialog().requestWindowFeature(1);
        }
        ContextThemeWrapper contextThemeWrapper2 = this.c;
        String str = this.r;
        C7456lr3 c7456lr3 = this.h;
        boolean n = AbstractC3208Yr3.n(this.f);
        this.b.g = 2;
        new C2349Sc(contextThemeWrapper2, str, c7456lr3).a(this.b, n);
        AbstractC1389Kr3.a.b();
        this.j = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0293, viewGroup, false);
        OP0.c(Y61.a(OP0.b));
        this.k = (ViewGroup) this.j.findViewById(R.id.survey_prompt_banner_container);
        AbstractC2461Sy1.b((ImageView) this.j.findViewById(R.id.survey_prompt_banner_logo), this.q);
        Answer answer = this.b;
        final String str2 = (answer == null || TextUtils.isEmpty(answer.h)) ? null : this.b.h;
        if (OP0.c(J61.a(OP0.b)) && enumC4408cz2 == EnumC4408cz2.FIRST_CARD_MODAL) {
            k();
            return this.j;
        }
        C2553Tq3 c2553Tq32 = this.f;
        C2163Qq3 c2163Qq3 = c2553Tq32.j;
        if ((c2163Qq3 == null ? C2163Qq3.l : c2163Qq3).j) {
            this.o = false;
            View view = this.j;
            if (c2163Qq3 == null) {
                c2163Qq3 = C2163Qq3.l;
            }
            String str3 = c2163Qq3.k;
            TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
            Spanned a = P91.a(str3);
            textView.setText(a);
            textView.announceForAccessibility(a.toString());
            C2816Vr1 c2816Vr1 = new C2816Vr1(this.c);
            this.l = c2816Vr1;
            c2816Vr1.a.setOnClickListener(new View.OnClickListener() { // from class: ZC2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C6208iD2 c6208iD2 = C6208iD2.this;
                    c6208iD2.b.k = true;
                    ContextThemeWrapper contextThemeWrapper3 = c6208iD2.c;
                    String str4 = c6208iD2.r;
                    C7456lr3 c7456lr32 = c6208iD2.h;
                    boolean n2 = AbstractC3208Yr3.n(c6208iD2.f);
                    c6208iD2.b.g = 4;
                    new C2349Sc(contextThemeWrapper3, str4, c7456lr32).a(c6208iD2.b, n2);
                    c6208iD2.k();
                }
            });
            this.l.g.setOnClickListener(new View.OnClickListener() { // from class: aD2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C6208iD2 c6208iD2 = C6208iD2.this;
                    c6208iD2.b.k = false;
                    c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                    ContextThemeWrapper contextThemeWrapper3 = c6208iD2.c;
                    String str4 = c6208iD2.r;
                    C7456lr3 c7456lr32 = c6208iD2.h;
                    boolean n2 = AbstractC3208Yr3.n(c6208iD2.f);
                    c6208iD2.b.g = 4;
                    new C2349Sc(contextThemeWrapper3, str4, c7456lr32).a(c6208iD2.b, n2);
                    c6208iD2.a.dismissAllowingStateLoss();
                }
            });
            this.k.addView(this.l);
            ImageButton imageButton = (ImageButton) this.j.findViewById(R.id.survey_close_button);
            imageButton.setImageDrawable(AbstractC3208Yr3.j(this.c));
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: bD2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C6208iD2 c6208iD2 = C6208iD2.this;
                    c6208iD2.getClass();
                    C5364fm3 c5364fm3 = new C5364fm3();
                    c6208iD2.l.getClass();
                    c6208iD2.l.getClass();
                    c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                    c6208iD2.a.dismissAllowingStateLoss();
                    AbstractC5275fX1.e(c5364fm3, c6208iD2.c, str2);
                }
            });
        } else {
            this.o = true;
            C4363cr3 c4363cr3 = (C4363cr3) c2553Tq32.n.get(0);
            View view2 = this.j;
            String str4 = c4363cr3.n.isEmpty() ? c4363cr3.m : c4363cr3.n;
            TextView textView2 = (TextView) view2.findViewById(R.id.survey_prompt_title_text);
            Spanned a2 = P91.a(str4);
            textView2.setText(a2);
            textView2.announceForAccessibility(a2.toString());
            int i = c4363cr3.p;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 5 : 4 : 3 : 2 : 1;
            if (i2 == 0) {
                i2 = 6;
            }
            int b = AbstractC2373Sg3.b(i2);
            if (b == 1) {
                QuestionMetrics questionMetrics = new QuestionMetrics();
                this.g = questionMetrics;
                questionMetrics.d();
                final C4363cr3 c4363cr32 = (C4363cr3) this.f.n.get(0);
                final C7372ld3 c7372ld3 = new C7372ld3(this.c);
                c7372ld3.a = new InterfaceC6684jd3() { // from class: UC2
                    @Override // defpackage.InterfaceC6684jd3
                    public final void a(C7028kd3 c7028kd3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        c6208iD2.i = c7028kd3;
                        if (c7028kd3.b == 3) {
                            c6208iD2.g(true);
                        } else {
                            c6208iD2.j(c4363cr32);
                        }
                    }
                };
                c7372ld3.a(c4363cr32.j == 4 ? (C7800mr3) c4363cr32.k : C7800mr3.l);
                this.k.addView(c7372ld3);
                i();
                h(new View.OnClickListener() { // from class: VC2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2.this.j(c4363cr32);
                    }
                }, str2);
                ImageButton imageButton2 = (ImageButton) this.j.findViewById(R.id.survey_close_button);
                imageButton2.setImageDrawable(AbstractC3208Yr3.j(this.c));
                imageButton2.setOnClickListener(new View.OnClickListener() { // from class: WC2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        c6208iD2.getClass();
                        C5364fm3 c5364fm3 = new C5364fm3();
                        c7372ld3.a = null;
                        c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                        c6208iD2.a.dismissAllowingStateLoss();
                        AbstractC5275fX1.e(c5364fm3, c6208iD2.c, str2);
                    }
                });
            } else if (b == 2) {
                QuestionMetrics questionMetrics2 = new QuestionMetrics();
                this.g = questionMetrics2;
                questionMetrics2.d();
                final C4363cr3 c4363cr33 = (C4363cr3) this.f.n.get(0);
                final A02 a02 = new A02(this.c);
                a02.h = new InterfaceC11967z02() { // from class: fD2
                    @Override // defpackage.InterfaceC11967z02
                    public final void a(C11624y02 c11624y02) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        c6208iD2.getClass();
                        if (!c11624y02.a()) {
                            c6208iD2.g(false);
                            return;
                        }
                        c6208iD2.e = c11624y02;
                        c6208iD2.g.c();
                        c6208iD2.g(true);
                    }
                };
                a02.a(c4363cr33.j == 5 ? (C2293Rq3) c4363cr33.k : C2293Rq3.k, null);
                this.k.addView(a02);
                i();
                h(new View.OnClickListener() { // from class: gD2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        C11624y02 c11624y02 = c6208iD2.e;
                        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
                        boolean a3 = c6208iD2.g.a();
                        C4363cr3 c4363cr34 = c4363cr33;
                        if (a3) {
                            C12254zq3 c12254zq3 = (C12254zq3) C0084Aq3.k.j();
                            char c = 5;
                            C3670aq3 c3670aq3 = (c4363cr34.j == 5 ? (C2293Rq3) c4363cr34.k : C2293Rq3.k).j;
                            if (c3670aq3 == null) {
                                c3670aq3 = C3670aq3.k;
                            }
                            InterfaceC1377Kp1 interfaceC1377Kp1 = c3670aq3.j;
                            int i3 = 0;
                            while (true) {
                                boolean[] zArr = c11624y02.b;
                                if (i3 >= zArr.length) {
                                    break;
                                }
                                if (zArr[i3]) {
                                    String str5 = ((C3328Zp3) interfaceC1377Kp1.get(i3)).l;
                                    int i4 = ((C3328Zp3) interfaceC1377Kp1.get(i3)).j;
                                    char c2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
                                    if (c2 == 0) {
                                        c2 = c;
                                    }
                                    if (c2 == 3) {
                                        String str6 = c11624y02.a;
                                        if (!TextUtils.isEmpty(str6)) {
                                            str5 = str6;
                                        }
                                    }
                                    C0864Gq3 c0864Gq3 = (C0864Gq3) C0994Hq3.m.j();
                                    int i5 = ((C3328Zp3) interfaceC1377Kp1.get(i3)).k;
                                    if (c0864Gq3.h) {
                                        c0864Gq3.l();
                                        c0864Gq3.h = false;
                                    }
                                    ((C0994Hq3) c0864Gq3.g).k = i5;
                                    if (c0864Gq3.h) {
                                        c0864Gq3.l();
                                        c0864Gq3.h = false;
                                    }
                                    C0994Hq3 c0994Hq3 = (C0994Hq3) c0864Gq3.g;
                                    c0994Hq3.getClass();
                                    str5.getClass();
                                    c0994Hq3.l = str5;
                                    int i6 = ((C3328Zp3) interfaceC1377Kp1.get(i3)).j;
                                    int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? 0 : 4 : 3 : 2 : 1;
                                    if (i7 == 0) {
                                        i7 = 5;
                                    }
                                    int b2 = AbstractC2373Sg3.b(i7);
                                    int i8 = b2 != 1 ? b2 != 2 ? b2 != 3 ? 1 : 4 : 3 : 2;
                                    if (c0864Gq3.h) {
                                        c0864Gq3.l();
                                        c0864Gq3.h = false;
                                    }
                                    C0994Hq3 c0994Hq32 = (C0994Hq3) c0864Gq3.g;
                                    c0994Hq32.getClass();
                                    c0994Hq32.j = AbstractC0734Fq3.a(i8);
                                    c12254zq3.o((C0994Hq3) c0864Gq3.j());
                                    c6208iD2.g.c();
                                }
                                int i9 = c4363cr34.l;
                                if (c11911yq3.h) {
                                    c11911yq3.l();
                                    c11911yq3.h = false;
                                }
                                ((C1384Kq3) c11911yq3.g).l = i9;
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
                                i3++;
                                c = 5;
                            }
                        }
                        C1384Kq3 c1384Kq32 = (C1384Kq3) c11911yq3.j();
                        if (c1384Kq32 != null) {
                            c6208iD2.b.a = c1384Kq32;
                        }
                        c6208iD2.a(c4363cr34);
                        c6208iD2.c();
                    }
                }, str2);
                ImageButton imageButton3 = (ImageButton) this.j.findViewById(R.id.survey_close_button);
                imageButton3.setImageDrawable(AbstractC3208Yr3.j(this.c));
                imageButton3.setOnClickListener(new View.OnClickListener() { // from class: QC2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        c6208iD2.getClass();
                        C5364fm3 c5364fm3 = new C5364fm3();
                        a02.h = null;
                        c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                        c6208iD2.a.dismissAllowingStateLoss();
                        AbstractC5275fX1.e(c5364fm3, c6208iD2.c, str2);
                    }
                });
            } else if (b == 3) {
                QuestionMetrics questionMetrics3 = new QuestionMetrics();
                this.g = questionMetrics3;
                questionMetrics3.d();
                final C4363cr3 c4363cr34 = (C4363cr3) this.f.n.get(0);
                final C8633pH2 c8633pH2 = new C8633pH2(this.c);
                c8633pH2.f(c4363cr34.j == 6 ? (C5050er3) c4363cr34.k : C5050er3.p);
                c8633pH2.g = new InterfaceC8290oH2() { // from class: dD2
                    @Override // defpackage.InterfaceC8290oH2
                    public final void a(int i3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        C4363cr3 c4363cr35 = c4363cr34;
                        if (c6208iD2.a.getActivity() == null) {
                            return;
                        }
                        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
                        String num = Integer.toString(i3);
                        if (c6208iD2.g.a()) {
                            C0864Gq3 c0864Gq3 = (C0864Gq3) C0994Hq3.m.j();
                            if (c0864Gq3.h) {
                                c0864Gq3.l();
                                c0864Gq3.h = false;
                            }
                            ((C0994Hq3) c0864Gq3.g).k = i3;
                            if (c0864Gq3.h) {
                                c0864Gq3.l();
                                c0864Gq3.h = false;
                            }
                            C0994Hq3 c0994Hq3 = (C0994Hq3) c0864Gq3.g;
                            c0994Hq3.getClass();
                            num.getClass();
                            c0994Hq3.l = num;
                            if (c0864Gq3.h) {
                                c0864Gq3.l();
                                c0864Gq3.h = false;
                            }
                            C0994Hq3 c0994Hq32 = (C0994Hq3) c0864Gq3.g;
                            c0994Hq32.getClass();
                            c0994Hq32.j = AbstractC0734Fq3.a(2);
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
                            int i4 = c4363cr35.l;
                            if (c11911yq3.h) {
                                c11911yq3.l();
                                c11911yq3.h = false;
                            }
                            ((C1384Kq3) c11911yq3.g).l = i4;
                            if (c11911yq3.h) {
                                c11911yq3.l();
                                c11911yq3.h = false;
                            }
                            C1384Kq3 c1384Kq3 = (C1384Kq3) c11911yq3.g;
                            c1384Kq3.getClass();
                            c0604Eq32.getClass();
                            c1384Kq3.k = c0604Eq32;
                            c1384Kq3.j = 4;
                            int i5 = AbstractC3208Yr3.b;
                        }
                        C1384Kq3 c1384Kq32 = (C1384Kq3) c11911yq3.j();
                        if (c1384Kq32 != null) {
                            c6208iD2.b.a = c1384Kq32;
                        }
                        c6208iD2.a(c4363cr35);
                        if (!OP0.c(C10287u61.b(OP0.b))) {
                            c6208iD2.v = 1;
                        } else if (c6208iD2.v <= 1) {
                            int a3 = new ZG2(C6208iD2.w, c6208iD2.f.n.size()).a(i3, c4363cr35);
                            if (a3 == -1) {
                                c6208iD2.v = 1;
                            } else {
                                c6208iD2.v = a3 - 1;
                            }
                        }
                        c6208iD2.c();
                    }
                };
                this.k.addView(c8633pH2);
                i();
                this.k.findViewById(R.id.survey_next).setVisibility(8);
                ImageButton imageButton4 = (ImageButton) this.j.findViewById(R.id.survey_close_button);
                imageButton4.setImageDrawable(AbstractC3208Yr3.j(this.c));
                imageButton4.setOnClickListener(new View.OnClickListener() { // from class: eD2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        c6208iD2.getClass();
                        C5364fm3 c5364fm3 = new C5364fm3();
                        c8633pH2.g = null;
                        c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                        c6208iD2.a.dismissAllowingStateLoss();
                        AbstractC5275fX1.e(c5364fm3, c6208iD2.c, str2);
                    }
                });
            } else if (b != 4) {
                Log.e("SurveyPromptDialogDel", "Error, unknown question type encountered.");
            } else {
                QuestionMetrics questionMetrics4 = new QuestionMetrics();
                this.g = questionMetrics4;
                questionMetrics4.d();
                final C4363cr3 c4363cr35 = (C4363cr3) this.f.n.get(0);
                C2747Vd2 c2747Vd2 = new C2747Vd2(this.c);
                c2747Vd2.a(c4363cr35.j == 7 ? (C2423Sq3) c4363cr35.k : C2423Sq3.l);
                c2747Vd2.a = new InterfaceC2617Ud2() { // from class: RC2
                    @Override // defpackage.InterfaceC2617Ud2
                    public final void a(String str5) {
                        C6208iD2.this.s = str5;
                    }
                };
                this.k.addView(c2747Vd2);
                i();
                g(true);
                h(new View.OnClickListener() { // from class: SC2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        String str5 = c6208iD2.s;
                        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
                        boolean a3 = c6208iD2.g.a();
                        C4363cr3 c4363cr36 = c4363cr35;
                        if (a3) {
                            if (str5 == null) {
                                str5 = "";
                            }
                            C0214Bq3 c0214Bq3 = (C0214Bq3) C0344Cq3.k.j();
                            if (c0214Bq3.h) {
                                c0214Bq3.l();
                                c0214Bq3.h = false;
                            }
                            C0344Cq3 c0344Cq3 = (C0344Cq3) c0214Bq3.g;
                            c0344Cq3.getClass();
                            c0344Cq3.j = str5;
                            C0344Cq3 c0344Cq32 = (C0344Cq3) c0214Bq3.j();
                            int i3 = c4363cr36.l;
                            if (c11911yq3.h) {
                                c11911yq3.l();
                                c11911yq3.h = false;
                            }
                            ((C1384Kq3) c11911yq3.g).l = i3;
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
                        C1384Kq3 c1384Kq32 = (C1384Kq3) c11911yq3.j();
                        if (c1384Kq32 != null) {
                            c6208iD2.b.a = c1384Kq32;
                        }
                        c6208iD2.a(c4363cr36);
                        c6208iD2.c();
                    }
                }, str2);
                ImageButton imageButton5 = (ImageButton) this.j.findViewById(R.id.survey_close_button);
                imageButton5.setImageDrawable(AbstractC3208Yr3.j(this.c));
                imageButton5.setOnClickListener(new View.OnClickListener() { // from class: TC2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6208iD2 c6208iD2 = C6208iD2.this;
                        c6208iD2.getClass();
                        C5364fm3 c5364fm3 = new C5364fm3();
                        c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                        c6208iD2.a.dismissAllowingStateLoss();
                        AbstractC5275fX1.e(c5364fm3, c6208iD2.c, str2);
                    }
                });
            }
        }
        AbstractC3208Yr3.b(this.a.getActivity(), (TextView) this.j.findViewById(R.id.survey_legal_text), str2, new InterfaceC3078Xr3() { // from class: cD2
            @Override // defpackage.InterfaceC3078Xr3
            public final void a() {
                C6208iD2 c6208iD2 = C6208iD2.this;
                c6208iD2.getClass();
                C5364fm3 c5364fm3 = new C5364fm3();
                Activity activity = c6208iD2.d;
                boolean z = activity instanceof VS0;
                String str5 = str2;
                if (z) {
                    h h0 = ((VS0) activity).h0();
                    C8506ou3 c8506ou3 = new C8506ou3();
                    Bundle bundle = new Bundle(2);
                    bundle.putString("EXTRA_ACCOUNT_NAME", str5);
                    bundle.putBundle("EXTRA_PSD_BUNDLE", AbstractC3208Yr3.h(c6208iD2.b.i));
                    c8506ou3.E0(bundle);
                    c8506ou3.Q0(h0, C8506ou3.r0);
                    h0.w(true);
                    h0.C();
                } else {
                    FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
                    DialogFragmentC0498Dv2 dialogFragmentC0498Dv2 = new DialogFragmentC0498Dv2();
                    Bundle bundle2 = new Bundle(2);
                    bundle2.putString("EXTRA_ACCOUNT_NAME", str5);
                    bundle2.putBundle("EXTRA_PSD_BUNDLE", AbstractC3208Yr3.h(c6208iD2.b.i));
                    dialogFragmentC0498Dv2.setArguments(bundle2);
                    beginTransaction.add(dialogFragmentC0498Dv2, DialogFragmentC0498Dv2.a);
                    beginTransaction.commitAllowingStateLoss();
                }
                AbstractC5275fX1.d(c5364fm3, c6208iD2.c, str5);
            }
        });
        this.j.setOnKeyListener(new View.OnKeyListener() { // from class: PC2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view3, int i3, KeyEvent keyEvent) {
                C6208iD2 c6208iD2 = C6208iD2.this;
                if (i3 == 4) {
                    c6208iD2.l(c6208iD2.c, c6208iD2.r, c6208iD2.h, AbstractC3208Yr3.n(c6208iD2.f));
                    c6208iD2.a.dismissAllowingStateLoss();
                    if (c6208iD2.o) {
                        return true;
                    }
                } else {
                    c6208iD2.getClass();
                }
                return false;
            }
        });
        this.j.setOnTouchListener(new View.OnTouchListener() { // from class: YC2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    view3.performClick();
                }
                return true;
            }
        });
        return this.j;
    }

    public final void f(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getSystemService("accessibility");
        View findViewById = view.findViewById(R.id.survey_prompt_title_text);
        Context context = OP0.b;
        ((C12002z61) ((InterfaceC11659y61) C11316x61.g.a.get())).getClass();
        if (!OP0.b(((Boolean) C12002z61.a.a(context)).booleanValue()) || !accessibilityManager.isTouchExplorationEnabled() || findViewById == null || findViewById.isAccessibilityFocused()) {
            return;
        }
        findViewById.performAccessibilityAction(64, null);
    }

    public final void j(C4363cr3 c4363cr3) {
        C7028kd3 c7028kd3 = this.i;
        C11911yq3 c11911yq3 = (C11911yq3) C1384Kq3.m.j();
        if (this.g.a() && c7028kd3.a != null) {
            C0864Gq3 c0864Gq3 = (C0864Gq3) C0994Hq3.m.j();
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            ((C0994Hq3) c0864Gq3.g).k = c7028kd3.c;
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            C0994Hq3 c0994Hq3 = (C0994Hq3) c0864Gq3.g;
            c0994Hq3.getClass();
            c0994Hq3.j = AbstractC0734Fq3.a(c7028kd3.b);
            if (c0864Gq3.h) {
                c0864Gq3.l();
                c0864Gq3.h = false;
            }
            C0994Hq3 c0994Hq32 = (C0994Hq3) c0864Gq3.g;
            c0994Hq32.getClass();
            String str = c7028kd3.a;
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
            int i = c4363cr3.l;
            if (c11911yq3.h) {
                c11911yq3.l();
                c11911yq3.h = false;
            }
            ((C1384Kq3) c11911yq3.g).l = i;
        }
        C1384Kq3 c1384Kq32 = (C1384Kq3) c11911yq3.j();
        if (c1384Kq32 != null) {
            this.b.a = c1384Kq32;
        }
        a(c4363cr3);
        C7028kd3 c7028kd32 = this.i;
        if (OP0.c(C10287u61.a(OP0.b))) {
            int i2 = 4;
            C3670aq3 c3670aq3 = (c4363cr3.j == 4 ? (C7800mr3) c4363cr3.k : C7800mr3.l).j;
            if (c3670aq3 == null) {
                c3670aq3 = C3670aq3.k;
            }
            C3328Zp3 c3328Zp3 = (C3328Zp3) c3670aq3.j.get(c7028kd32.c - 1);
            C4014bq3 c4014bq3 = c3328Zp3.n;
            if (c4014bq3 != null) {
                if (c4014bq3 == null) {
                    c4014bq3 = C4014bq3.l;
                }
                int i3 = c4014bq3.j;
                if (i3 == 0) {
                    i2 = 1;
                } else if (i3 == 1) {
                    i2 = 2;
                } else if (i3 == 2) {
                    i2 = 3;
                } else if (i3 != 3) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = 5;
                }
                int b = AbstractC2373Sg3.b(i2);
                if (b == 2) {
                    C4014bq3 c4014bq32 = c3328Zp3.n;
                    if (c4014bq32 == null) {
                        c4014bq32 = C4014bq3.l;
                    }
                    this.v = w.containsKey(c4014bq32.k) ? ((Integer) w.get(r8)).intValue() - 1 : 0;
                } else if (b != 3) {
                    this.v = 1;
                } else {
                    this.v = this.f.n.size();
                }
            }
        } else {
            this.v = 1;
        }
        c();
    }

    public final void a(C4363cr3 c4363cr3) {
        if (!OP0.a()) {
            this.v = 1;
            return;
        }
        C4020br3 c4020br3 = c4363cr3.r;
        int i = 0;
        if (!((c4020br3 == null ? C4020br3.l : c4020br3).k != null)) {
            this.v = 1;
            return;
        }
        if (c4020br3 == null) {
            c4020br3 = C4020br3.l;
        }
        C4014bq3 c4014bq3 = c4020br3.k;
        if (c4014bq3 == null) {
            c4014bq3 = C4014bq3.l;
        }
        int i2 = c4014bq3.j;
        if (i2 == 0) {
            i = 1;
        } else if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 3;
        } else if (i2 == 3) {
            i = 4;
        }
        if (i == 0) {
            i = 5;
        }
        if (AbstractC2373Sg3.b(i) == 3) {
            this.v = this.f.n.size();
        } else {
            this.v = 1;
        }
    }

    public final void c() {
        this.g.c();
        if (!OP0.c(J61.a(OP0.b)) || this.t != EnumC3721az2.TOAST || (this.f.n.size() != 1 && !AbstractC6994kX2.b(this.o, this.f, this.b) && this.v != this.f.n.size())) {
            k();
            return;
        }
        View view = this.j;
        C9168qq3 c9168qq3 = this.f.k;
        if (c9168qq3 == null) {
            c9168qq3 = C9168qq3.o;
        }
        C0029Af3.g(view, c9168qq3.j).h();
        this.a.dismissAllowingStateLoss();
    }

    public final void i() {
        ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e028e, this.k);
        if (!AbstractC3208Yr3.p(this.f)) {
            this.k.findViewById(R.id.survey_next).setVisibility(8);
        } else {
            g(false);
            MaterialButton materialButton = (MaterialButton) this.k.findViewById(R.id.survey_next);
            if (materialButton != null && this.f.n.size() == 1) {
                materialButton.setText(R.string.0_resource_name_obfuscated_res_0x7f140ac4);
            }
            View findViewById = this.k.findViewById(R.id.survey_controls_container);
            View findViewById2 = this.k.findViewById(R.id.survey_next);
            Rect rect = AbstractC2461Sy1.a;
            findViewById.post(new RunnableC2331Ry1(R.dimen.0_resource_name_obfuscated_res_0x7f080753, 0, findViewById2, findViewById));
        }
        this.k.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.k.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    public final void g(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.k.findViewById(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final void h(final View.OnClickListener onClickListener, final String str) {
        ((MaterialButton) this.k.findViewById(R.id.survey_next)).setOnClickListener(new View.OnClickListener() { // from class: XC2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6208iD2 c6208iD2 = C6208iD2.this;
                c6208iD2.getClass();
                C5364fm3 c5364fm3 = new C5364fm3();
                onClickListener.onClick(view);
                AbstractC5275fX1.f(c5364fm3, c6208iD2.c, str);
            }
        });
    }

    public final void k() {
        InterfaceC5864hD2 interfaceC5864hD2;
        InterfaceC5864hD2 interfaceC5864hD22 = this.a;
        Activity activity = interfaceC5864hD22.getActivity();
        String str = this.r;
        C2553Tq3 c2553Tq3 = this.f;
        C7456lr3 c7456lr3 = this.h;
        Answer answer = this.b;
        Integer valueOf = Integer.valueOf(this.p);
        boolean z = this.n;
        boolean z2 = this.o;
        Integer num = this.q;
        EnumC3721az2 enumC3721az2 = this.t;
        String str2 = this.u;
        int i = this.v;
        HashMap hashMap = new HashMap();
        Iterator it = c2553Tq3.n.iterator();
        while (true) {
            interfaceC5864hD2 = interfaceC5864hD22;
            if (!it.hasNext()) {
                break;
            }
            C4363cr3 c4363cr3 = (C4363cr3) it.next();
            Iterator it2 = it;
            C4020br3 c4020br3 = c4363cr3.r;
            if (c4020br3 != null) {
                if (c4020br3 == null) {
                    c4020br3 = C4020br3.l;
                }
                if (!hashMap.containsKey(c4020br3.j)) {
                    C4020br3 c4020br32 = c4363cr3.r;
                    if (c4020br32 == null) {
                        c4020br32 = C4020br3.l;
                    }
                    hashMap.put(c4020br32.j, Integer.valueOf(c4363cr3.l));
                }
            }
            it = it2;
            interfaceC5864hD22 = interfaceC5864hD2;
        }
        C10888vr3.r = AbstractC0952Hi1.b(hashMap);
        Intent intent = new Intent(activity, (Class<?>) C10888vr3.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", c2553Tq3.toByteArray());
        intent.putExtra("SurveySession", c7456lr3.toByteArray());
        intent.putExtra("Answer", answer);
        intent.putExtra("IsFullWidth", z);
        intent.putExtra("IgnoreFirstQuestion", z2);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", enumC3721az2);
        intent.putExtra("StartingQuestionIndex", i);
        int i2 = AbstractC3208Yr3.b;
        if (valueOf == null) {
            activity.startActivity(intent);
        } else {
            activity.startActivityForResult(intent, valueOf.intValue());
        }
        this.m = true;
        ContextThemeWrapper contextThemeWrapper = this.c;
        String str3 = this.r;
        C7456lr3 c7456lr32 = this.h;
        boolean n = AbstractC3208Yr3.n(this.f);
        this.b.g = 3;
        new C2349Sc(contextThemeWrapper, str3, c7456lr32).a(this.b, n);
        interfaceC5864hD2.dismissAllowingStateLoss();
    }

    public final void l(ContextThemeWrapper contextThemeWrapper, String str, C7456lr3 c7456lr3, boolean z) {
        this.b.g = 6;
        new C2349Sc(contextThemeWrapper, str, c7456lr3).a(this.b, z);
    }
}
