package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.c;
import androidx.viewpager.widget.ViewPager;
import com.android.chrome.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import defpackage.AbstractC2461Sy1;
import defpackage.AbstractC3349Zu;
import defpackage.C4026bs3;
import defpackage.InterfaceC11231wr3;
import defpackage.J61;
import defpackage.K61;
import defpackage.L61;
import defpackage.OP0;
import defpackage.VS0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SurveyViewPager extends ViewPager {
    public static final /* synthetic */ int b0 = 0;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final C4026bs3 c4026bs3 = new C4026bs3(this);
        b(c4026bs3);
        post(new Runnable() { // from class: Zr3
            @Override // java.lang.Runnable
            public final void run() {
                int i = SurveyViewPager.b0;
                c4026bs3.c(SurveyViewPager.this.k);
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC3349Zu A;
        AbstractC3349Zu A2;
        Context context = OP0.b;
        ((L61) ((K61) J61.g.a.get())).getClass();
        View view = null;
        if (!OP0.c(((Boolean) L61.a.a(context)).booleanValue())) {
            if (getChildCount() == 0) {
                super.onMeasure(i, i2);
            }
            if (this.j != null && (A2 = A()) != null) {
                view = A2.L;
            }
            if (view == null) {
                super.onMeasure(i, i2);
                return;
            }
            view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, (rect.height() - view.findViewById(R.id.survey_question_header_logo_text).getHeight()) - (getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080755) * 2)), 1073741824));
            return;
        }
        if (this.j != null && (A = A()) != null) {
            view = A.L;
        }
        View view2 = view;
        if (view2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        View findViewById = view2.findViewById(R.id.survey_question_header_logo_text);
        SurveyActivity surveyActivity = (SurveyActivity) ((InterfaceC11231wr3) getContext());
        surveyActivity.getClass();
        super.onMeasure(i, AbstractC2461Sy1.a(this, view2, i, i2, findViewById, surveyActivity.findViewById(R.id.survey_controls_container)));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        break;
                    default:
                        z = false;
                        break;
                }
            case 19:
            case 20:
            case 21:
            case 22:
                z = true;
                break;
        }
        if (z) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final AbstractC3349Zu A() {
        Object context = getContext();
        if (!(context instanceof InterfaceC11231wr3)) {
            Log.e("SurveyViewPager", "Context is not a SurveyPromptActivity, something is very wrong.");
            return null;
        }
        int i = this.k;
        for (c cVar : ((VS0) ((InterfaceC11231wr3) context)).h0().c.f()) {
            if (cVar.l.getInt("QuestionIndex", -1) == i && (cVar instanceof AbstractC3349Zu)) {
                return (AbstractC3349Zu) cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            r6 = this;
            bi2 r0 = r6.j
            cs3 r0 = (defpackage.C4369cs3) r0
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r0 = "SurveyViewPager"
            java.lang.String r2 = "Error, survey view pager adapter is null!"
            android.util.Log.e(r0, r2)
            return r1
        Lf:
            boolean r2 = defpackage.OP0.a()
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L68
            Zu r2 = r6.A()
            if (r2 == 0) goto L68
            int r2 = r6.k
            java.util.ArrayList r5 = r0.g
            java.lang.Object r2 = r5.get(r2)
            xr3 r2 = (defpackage.AbstractC11574xr3) r2
            cr3 r2 = r2.b
            br3 r2 = r2.r
            if (r2 == 0) goto L2f
            r2 = r3
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 == 0) goto L68
            bi2 r0 = r6.j
            cs3 r0 = (defpackage.C4369cs3) r0
            int r2 = r6.k
            java.util.ArrayList r0 = r0.g
            java.lang.Object r0 = r0.get(r2)
            xr3 r0 = (defpackage.AbstractC11574xr3) r0
            cr3 r0 = r0.b
            br3 r0 = r0.r
            if (r0 != 0) goto L48
            br3 r0 = defpackage.C4020br3.l
        L48:
            bq3 r0 = r0.k
            if (r0 != 0) goto L4e
            bq3 r0 = defpackage.C4014bq3.l
        L4e:
            int r0 = r0.j
            r2 = 4
            if (r0 == 0) goto L5f
            if (r0 == r3) goto L5d
            r3 = 3
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L5b
            goto L60
        L5b:
            r1 = r2
            goto L60
        L5d:
            r1 = r4
            goto L60
        L5f:
            r1 = r3
        L60:
            if (r1 != 0) goto L63
            r1 = 5
        L63:
            boolean r0 = defpackage.AbstractC2373Sg3.a(r1, r2)
            return r0
        L68:
            android.content.Context r2 = defpackage.OP0.b
            boolean r2 = defpackage.J61.a(r2)
            boolean r2 = defpackage.OP0.c(r2)
            if (r2 == 0) goto L87
            az2 r2 = r0.i
            az2 r5 = defpackage.EnumC3721az2.CARD
            if (r2 != r5) goto L7b
            goto L7c
        L7b:
            r4 = r3
        L7c:
            int r2 = r6.k
            int r0 = r0.f()
            int r0 = r0 - r4
            if (r2 != r0) goto L86
            r1 = r3
        L86:
            return r1
        L87:
            int r2 = r6.k
            int r0 = r0.f()
            int r0 = r0 - r4
            if (r2 != r0) goto L91
            r1 = r3
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.SurveyViewPager.B():boolean");
    }
}
