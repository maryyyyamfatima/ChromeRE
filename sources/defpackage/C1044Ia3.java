package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ProgressBar;
import com.android.chrome.R;
import org.chromium.chrome.browser.ui.signin.fre.SigninFirstRunView;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ia3 */
/* loaded from: classes2.dex */
public final class C1044Ia3 {
    public final C2993Xa3 a;

    public C1044Ia3(Context context, SigninFirstRunView signinFirstRunView, ZX1 zx1, InterfaceC0914Ha3 interfaceC0914Ha3, C9626sA2 c9626sA2) {
        C2993Xa3 c2993Xa3 = new C2993Xa3(context, zx1, interfaceC0914Ha3, c9626sA2);
        this.a = c2993Xa3;
        UD2.a(c2993Xa3.k, signinFirstRunView, new TD2() { // from class: Ga3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                SigninFirstRunView signinFirstRunView2 = (SigninFirstRunView) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd2 = AbstractC4267cb3.d;
                if (fd2 == jd2) {
                    signinFirstRunView2.l.setOnClickListener((View.OnClickListener) propertyModel.i(jd2));
                    return;
                }
                JD2 jd22 = AbstractC4267cb3.e;
                if (fd2 == jd22) {
                    signinFirstRunView2.m.setOnClickListener((View.OnClickListener) propertyModel.i(jd22));
                    return;
                }
                LD2 ld2 = AbstractC4267cb3.f;
                if (fd2 == ld2) {
                    AbstractC4611db3.b(signinFirstRunView2, propertyModel.j(ld2), true);
                    return;
                }
                LD2 ld22 = AbstractC4267cb3.g;
                if (fd2 == ld22) {
                    AbstractC4611db3.b(signinFirstRunView2, propertyModel.j(ld22), false);
                    return;
                }
                JD2 jd23 = AbstractC4267cb3.a;
                if (fd2 == jd23) {
                    signinFirstRunView2.j.setOnClickListener((View.OnClickListener) propertyModel.i(jd23));
                    return;
                }
                PD2 pd2 = AbstractC4267cb3.b;
                LD2 ld23 = AbstractC4267cb3.j;
                if (fd2 == pd2) {
                    if (propertyModel.j(ld23)) {
                        C6073hq0 c6073hq0 = (C6073hq0) propertyModel.i(pd2);
                        if (c6073hq0 == null) {
                            signinFirstRunView2.l.setText(R.string.0_resource_name_obfuscated_res_0x7f140a5b);
                        } else {
                            PE0.a(c6073hq0, signinFirstRunView2.j);
                            ButtonCompat buttonCompat = signinFirstRunView2.l;
                            Context context2 = signinFirstRunView2.getContext();
                            Object[] objArr = new Object[1];
                            String str = c6073hq0.d;
                            if (str == null && (str = c6073hq0.c) == null) {
                                str = c6073hq0.a;
                            }
                            objArr[0] = str;
                            buttonCompat.setText(context2.getString(R.string.0_resource_name_obfuscated_res_0x7f140a6f, objArr));
                        }
                        AbstractC4611db3.a(signinFirstRunView2, propertyModel);
                        return;
                    }
                    return;
                }
                if (fd2 == AbstractC4267cb3.c) {
                    signinFirstRunView2.j.setEnabled(!propertyModel.j(r0));
                    AbstractC4611db3.a(signinFirstRunView2, propertyModel);
                    return;
                }
                LD2 ld24 = AbstractC4267cb3.h;
                if (fd2 == ld24) {
                    boolean j = propertyModel.j(ld24);
                    ProgressBar progressBar = signinFirstRunView2.i;
                    if (j) {
                        TransitionManager.beginDelayedTransition(signinFirstRunView2);
                        progressBar.setVisibility(8);
                    } else {
                        progressBar.animate().alpha(1.0f).setStartDelay(500L);
                    }
                    AbstractC4611db3.a(signinFirstRunView2, propertyModel);
                    return;
                }
                PD2 pd22 = AbstractC4267cb3.i;
                if (fd2 == pd22) {
                    signinFirstRunView2.h.setVisibility(propertyModel.i(pd22) == null ? 8 : 0);
                    return;
                }
                if (fd2 == ld23) {
                    if (propertyModel.j(ld23)) {
                        return;
                    }
                    signinFirstRunView2.l.setText(R.string.0_resource_name_obfuscated_res_0x7f1403d2);
                    AbstractC4611db3.a(signinFirstRunView2, propertyModel);
                    return;
                }
                PD2 pd23 = AbstractC4267cb3.k;
                if (fd2 == pd23) {
                    signinFirstRunView2.n.setText((CharSequence) propertyModel.i(pd23));
                    signinFirstRunView2.n.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    throw new IllegalArgumentException("Unknown property key:" + fd2);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r6) {
        /*
            r5 = this;
            java.lang.Object r0 = org.chromium.base.ThreadUtils.a
            LD2 r0 = defpackage.AbstractC4267cb3.h
            Xa3 r1 = r5.a
            org.chromium.ui.modelutil.PropertyModel r2 = r1.k
            r3 = 1
            r2.k(r0, r3)
            PD2 r0 = defpackage.AbstractC4267cb3.i
            if (r6 == 0) goto L16
            bb3 r6 = new bb3
            r6.<init>()
            goto L17
        L16:
            r6 = 0
        L17:
            r2.o(r0, r6)
            dG0 r6 = defpackage.C4502dG0.b
            r6.getClass()
            boolean r6 = defpackage.C4502dG0.b()
            if (r6 == 0) goto L3c
            Jg1 r6 = defpackage.C1202Jg1.a()
            org.chromium.chrome.browser.profiles.Profile r4 = org.chromium.chrome.browser.profiles.Profile.d()
            r6.getClass()
            org.chromium.chrome.browser.signin.services.SigninManager r6 = defpackage.C1202Jg1.c(r4)
            boolean r6 = r6.g()
            if (r6 != 0) goto L3c
            r6 = r3
            goto L3d
        L3c:
            r6 = 0
        L3d:
            LD2 r4 = defpackage.AbstractC4267cb3.j
            r2.k(r4, r6)
            sA2 r6 = r1.j
            boolean r6 = r6.b()
            if (r6 != 0) goto L52
            java.lang.Object r6 = r2.i(r0)
            bb3 r6 = (defpackage.C3924bb3) r6
            r6.a = r3
        L52:
            LD2 r6 = defpackage.AbstractC4267cb3.c
            r2.j(r6)
            PD2 r6 = defpackage.AbstractC4267cb3.k
            boolean r0 = r1.c()
            android.text.SpannableString r0 = r1.a(r0)
            r2.o(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1044Ia3.a(boolean):void");
    }
}
