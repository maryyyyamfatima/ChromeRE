package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.h;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vr3 */
/* loaded from: classes.dex */
public final class C10888vr3 {
    public static AbstractC0952Hi1 r;
    public C2553Tq3 a;
    public SurveyViewPager b;
    public Answer c;
    public C2349Sc d;
    public MaterialCardView f;
    public LinearLayout g;
    public boolean h;
    public boolean i;
    public int j;
    public Integer m;
    public boolean n;
    public EnumC3721az2 o;
    public final Activity p;
    public final h q;
    public Bundle e = new Bundle();
    public final Handler k = new Handler();
    public final RunnableC9516rr3 l = new Runnable() { // from class: rr3
        @Override // java.lang.Runnable
        public final void run() {
            C10888vr3 c10888vr3 = C10888vr3.this;
            c10888vr3.h = true;
            c10888vr3.p.finish();
        }
    };

    public final void j(int i) {
        if (OP0.b(G61.a(OP0.b))) {
            i(AbstractC3208Yr3.p(this.a));
        }
        e();
        f(5);
        SurveyViewPager surveyViewPager = this.b;
        surveyViewPager.u = false;
        surveyViewPager.x(i, 0, true, false);
        surveyViewPager.A().L0();
        l();
        MaterialButton materialButton = (MaterialButton) this.p.findViewById(R.id.survey_next);
        if (materialButton != null && this.b.B()) {
            materialButton.setText(R.string.0_resource_name_obfuscated_res_0x7f140ac4);
        }
        this.b.A().L.sendAccessibilityEvent(32);
        int i2 = AbstractC3208Yr3.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [rr3] */
    public C10888vr3(Activity activity, h hVar) {
        this.p = activity;
        this.q = hVar;
    }

    public final void c(boolean z) {
        this.g.setDescendantFocusability(z ? 393216 : 262144);
        this.g.setAlpha(z ? 0.4f : 1.0f);
        if (z) {
            this.i = this.p.findViewById(R.id.survey_next).isEnabled();
        }
        h(this.g, !z);
    }

    public final void h(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt, z);
            } else if (childAt.getId() == R.id.survey_next && z) {
                this.p.findViewById(R.id.survey_next).setEnabled(this.i);
            } else {
                childAt.setEnabled(z);
            }
        }
    }

    public final void i(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.p.findViewById(R.id.survey_next);
        int i = z ? 0 : 8;
        if (materialButton != null) {
            materialButton.setVisibility(i);
        }
    }

    public final void g(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.p.findViewById(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
        if (OP0.c(Y61.a(OP0.b))) {
            this.i = z;
        }
    }

    public final void d() {
        if (this.b.B() || !AbstractC6994kX2.a(a(), this.a, this.c)) {
            k();
        } else {
            j(this.b.k + 1);
        }
    }

    public final void k() {
        int i = AbstractC3208Yr3.b;
        f(5);
        this.h = true;
        g(false);
        this.p.setResult(-1, new Intent());
        if (OP0.c(J61.a(OP0.b))) {
            if (this.o == EnumC3721az2.CARD) {
                SurveyViewPager surveyViewPager = this.b;
                int f = surveyViewPager.j.f() - 1;
                surveyViewPager.u = false;
                surveyViewPager.x(f, 0, true, false);
                surveyViewPager.A().L0();
                return;
            }
            this.f.setVisibility(8);
            View findViewById = this.p.getWindow().findViewById(android.R.id.content);
            C9168qq3 c9168qq3 = this.a.k;
            if (c9168qq3 == null) {
                c9168qq3 = C9168qq3.o;
            }
            C0029Af3.g(findViewById, c9168qq3.j).h();
            this.p.setResult(-1, new Intent());
            this.k.postDelayed(this.l, 2400L);
            return;
        }
        SurveyViewPager surveyViewPager2 = this.b;
        int f2 = surveyViewPager2.j.f() - 1;
        surveyViewPager2.u = false;
        surveyViewPager2.x(f2, 0, true, false);
        surveyViewPager2.A().L0();
    }

    public final void e() {
        C1254Jq3 c1254Jq3;
        int i = this.c.a.j;
        if (AbstractC2373Sg3.a(i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 4 : 3 : 2 : 1 : 5, 1)) {
            Bundle bundle = this.e;
            String valueOf = String.valueOf(this.c.a.l);
            C1384Kq3 c1384Kq3 = this.c.a;
            if (c1384Kq3.j == 2) {
                c1254Jq3 = (C1254Jq3) c1384Kq3.k;
            } else {
                c1254Jq3 = C1254Jq3.k;
            }
            C0994Hq3 c0994Hq3 = c1254Jq3.j;
            if (c0994Hq3 == null) {
                c0994Hq3 = C0994Hq3.m;
            }
            bundle.putString(valueOf, c0994Hq3.l);
        }
    }

    public final void b() {
        C1384Kq3 M0;
        SurveyViewPager surveyViewPager = this.b;
        if (surveyViewPager != null) {
            if (surveyViewPager.k == 0) {
                C2163Qq3 c2163Qq3 = this.a.j;
                if (c2163Qq3 == null) {
                    c2163Qq3 = C2163Qq3.l;
                }
                if (!c2163Qq3.j) {
                    f(3);
                }
            }
        }
        LinearLayout linearLayout = this.g;
        int i = AbstractC3208Yr3.b;
        ((InputMethodManager) linearLayout.getContext().getSystemService("input_method")).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
        Activity activity = this.p;
        activity.findViewById(R.id.survey_controls_divider).setVisibility(8);
        activity.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
        if (!OP0.b(G61.a(OP0.b))) {
            C4363cr3 c4363cr3 = (C4363cr3) this.a.n.get(a());
            if (AbstractC3208Yr3.p(this.a)) {
                int i2 = c4363cr3.p;
                char c = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
                if (c == 0) {
                    c = 6;
                }
                if (c == 4) {
                    i(true);
                }
            }
        }
        AbstractC3349Zu A = this.b.A();
        C1384Kq3 M02 = A == null ? null : A.M0();
        if (M02 != null) {
            this.c.a = M02;
        }
        if (!OP0.a()) {
            d();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.b;
        if (surveyViewPager2 == null) {
            d();
            return;
        }
        C4363cr3 c4363cr32 = surveyViewPager2.A().b0;
        C4020br3 c4020br3 = c4363cr32.r;
        if ((c4020br3 == null ? C4020br3.l : c4020br3).k != null) {
            if (c4020br3 == null) {
                c4020br3 = C4020br3.l;
            }
            C4014bq3 c4014bq3 = c4020br3.k;
            if (c4014bq3 == null) {
                c4014bq3 = C4014bq3.l;
            }
            int i3 = c4014bq3.j;
            int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i4 == 0) {
                i4 = 5;
            }
            if (AbstractC2373Sg3.a(i4, 4)) {
                k();
                return;
            }
        }
        if (OP0.c(C10287u61.b(OP0.b))) {
            int i5 = c4363cr32.p;
            int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 5 : 4 : 3 : 2 : 1;
            if (i6 == 0) {
                i6 = 6;
            }
            if (AbstractC2373Sg3.a(i6, 4)) {
                AbstractC3349Zu A2 = this.b.A();
                M0 = A2 != null ? A2.M0() : null;
                C0994Hq3 c0994Hq3 = (M0.j == 4 ? (C0604Eq3) M0.k : C0604Eq3.k).j;
                if (c0994Hq3 == null) {
                    c0994Hq3 = C0994Hq3.m;
                }
                int a = new ZG2(r, this.a.n.size()).a(c0994Hq3.k, c4363cr32);
                if (a == -1) {
                    d();
                    return;
                } else if (a == this.a.n.size()) {
                    k();
                    return;
                } else {
                    C4369cs3 c4369cs3 = (C4369cs3) this.b.j;
                    j(c4369cs3 != null ? ((Integer) c4369cs3.j.get(Integer.valueOf(a))).intValue() : 0);
                    return;
                }
            }
        }
        if (OP0.c(C10287u61.a(OP0.b))) {
            int i7 = c4363cr32.p;
            int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? 0 : 5 : 4 : 3 : 2 : 1;
            if (AbstractC2373Sg3.a(i8 != 0 ? i8 : 6, 2)) {
                AbstractC3349Zu A3 = this.b.A();
                M0 = A3 != null ? A3.M0() : null;
                C0994Hq3 c0994Hq32 = (M0.j == 2 ? (C1254Jq3) M0.k : C1254Jq3.k).j;
                if (c0994Hq32 == null) {
                    c0994Hq32 = C0994Hq3.m;
                }
                int i9 = c0994Hq32.k - 1;
                int i10 = c4363cr32.j;
                if ((i10 == 4 ? (C7800mr3) c4363cr32.k : C7800mr3.l).j != null) {
                    C3670aq3 c3670aq3 = (i10 == 4 ? (C7800mr3) c4363cr32.k : C7800mr3.l).j;
                    if (c3670aq3 == null) {
                        c3670aq3 = C3670aq3.k;
                    }
                    if (((C3328Zp3) c3670aq3.j.get(i9)).n != null) {
                        C3670aq3 c3670aq32 = (c4363cr32.j == 4 ? (C7800mr3) c4363cr32.k : C7800mr3.l).j;
                        if (c3670aq32 == null) {
                            c3670aq32 = C3670aq3.k;
                        }
                        C4014bq3 c4014bq32 = ((C3328Zp3) c3670aq32.j.get(i9)).n;
                        if (c4014bq32 == null) {
                            c4014bq32 = C4014bq3.l;
                        }
                        int i11 = c4014bq32.j;
                        int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? 0 : 4 : 3 : 2 : 1;
                        int b = AbstractC2373Sg3.b(i12 != 0 ? i12 : 5);
                        if (b != 2) {
                            if (b != 3) {
                                d();
                                return;
                            } else {
                                k();
                                return;
                            }
                        }
                        C3670aq3 c3670aq33 = (c4363cr32.j == 4 ? (C7800mr3) c4363cr32.k : C7800mr3.l).j;
                        if (c3670aq33 == null) {
                            c3670aq33 = C3670aq3.k;
                        }
                        C4014bq3 c4014bq33 = ((C3328Zp3) c3670aq33.j.get(i9)).n;
                        if (c4014bq33 == null) {
                            c4014bq33 = C4014bq3.l;
                        }
                        String str = c4014bq33.k;
                        C4369cs3 c4369cs32 = (C4369cs3) this.b.j;
                        if (c4369cs32 != null && r.containsKey(str)) {
                            r3 = ((Integer) c4369cs32.j.get(Integer.valueOf(((Integer) r.get(str)).intValue()))).intValue();
                        }
                        j(r3);
                        return;
                    }
                }
                d();
                return;
            }
        }
        d();
    }

    public final void f(int i) {
        Answer answer = this.c;
        answer.g = i;
        this.d.a(answer, AbstractC3208Yr3.n(this.a));
    }

    public final int a() {
        SurveyViewPager surveyViewPager = this.b;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.k;
        if (OP0.a()) {
            return i + this.j;
        }
        return this.n ? i + 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0039, code lost:            if (r0.k == (r0.j.f() - 1)) goto L161;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:            if (((defpackage.AbstractC11574xr3) r3.g.get(r0.k)).a == 5) goto L161;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r12 = this;
            com.google.android.libraries.surveys.internal.view.SurveyViewPager r0 = r12.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3d
            android.content.Context r3 = defpackage.OP0.b
            boolean r3 = defpackage.J61.a(r3)
            boolean r3 = defpackage.OP0.c(r3)
            if (r3 == 0) goto L30
            bi2 r3 = r0.j
            cs3 r3 = (defpackage.C4369cs3) r3
            if (r3 != 0) goto L20
            java.lang.String r0 = "SurveyViewPager"
            java.lang.String r3 = "Error, survey view pager adapter is null!"
            android.util.Log.e(r0, r3)
            goto L3d
        L20:
            int r0 = r0.k
            java.util.ArrayList r3 = r3.g
            java.lang.Object r0 = r3.get(r0)
            xr3 r0 = (defpackage.AbstractC11574xr3) r0
            int r0 = r0.a
            r3 = 5
            if (r0 != r3) goto L3d
            goto L3b
        L30:
            int r3 = r0.k
            bi2 r0 = r0.j
            int r0 = r0.f()
            int r0 = r0 - r1
            if (r3 != r0) goto L3d
        L3b:
            r0 = r1
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 == 0) goto L41
            return
        L41:
            Tq3 r0 = r12.a
            int r3 = r12.a()
            Kp1 r0 = r0.n
            java.lang.Object r0 = r0.get(r3)
            cr3 r0 = (defpackage.C4363cr3) r0
            java.lang.String r3 = r0.n
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5a
            java.lang.String r3 = r0.m
            goto L5c
        L5a:
            java.lang.String r3 = r0.n
        L5c:
            Kp1 r4 = r0.o
            int r4 = r4.size()
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String[] r6 = new java.lang.String[r4]
            r7 = r2
        L67:
            if (r7 >= r4) goto Lb8
            Kp1 r8 = r0.o
            java.lang.Object r8 = r8.get(r7)
            or3 r8 = (defpackage.C8488or3) r8
            int r9 = r8.j
            r10 = 2
            if (r9 == 0) goto L7c
            if (r9 == r10) goto L7a
            r11 = r2
            goto L7d
        L7a:
            r11 = r1
            goto L7d
        L7c:
            r11 = r10
        L7d:
            if (r11 != r1) goto Lb5
            if (r9 != r10) goto L86
            java.lang.Object r9 = r8.k
            nr3 r9 = (defpackage.C8144nr3) r9
            goto L88
        L86:
            nr3 r9 = defpackage.C8144nr3.k
        L88:
            int r9 = r9.j
            android.os.Bundle r10 = r12.e
            java.lang.String r11 = java.lang.String.valueOf(r9)
            java.lang.String r10 = r10.getString(r11)
            if (r10 == 0) goto L9d
            java.lang.String r8 = r8.l
            r5[r7] = r8
            r6[r7] = r10
            goto Lb5
        L9d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "No single-select question with ordinal "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r9 = " was found."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "SurveyActivityImpl"
            android.util.Log.e(r9, r8)
        Lb5:
            int r7 = r7 + 1
            goto L67
        Lb8:
            java.lang.CharSequence r0 = android.text.TextUtils.replace(r3, r5, r6)
            java.lang.String r0 = r0.toString()
            com.google.android.libraries.surveys.internal.view.SurveyViewPager r1 = r12.b
            Zu r2 = r1.A()
            if (r2 == 0) goto Lcc
            r2.Q0(r0)
            goto Ld4
        Lcc:
            as3 r2 = new as3
            r2.<init>()
            r1.post(r2)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10888vr3.l():void");
    }
}
