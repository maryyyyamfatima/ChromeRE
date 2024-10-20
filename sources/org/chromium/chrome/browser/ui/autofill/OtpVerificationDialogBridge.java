package org.chromium.chrome.browser.ui.autofill;

import J.N;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC1996Pj1;
import defpackage.AbstractC2622Ue2;
import defpackage.AbstractC4249cY1;
import defpackage.C2102Qe2;
import defpackage.C2362Se2;
import defpackage.DD2;
import defpackage.GD2;
import defpackage.ID2;
import defpackage.JD2;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.ZX1;
import j$.util.Optional;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.autofill.OtpVerificationDialogView;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OtpVerificationDialogBridge {
    public final long a;
    public final C2102Qe2 b;

    public OtpVerificationDialogBridge(long j, Context context, ZX1 zx1) {
        this.a = j;
        this.b = new C2102Qe2(context, zx1, (OtpVerificationDialogView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01d1, (ViewGroup) null), this);
    }

    public static OtpVerificationDialogBridge create(long j, WindowAndroid windowAndroid) {
        Context context = (Context) windowAndroid.k().get();
        ZX1 s = windowAndroid.s();
        if (context == null || s == null) {
            return null;
        }
        return new OtpVerificationDialogBridge(j, context, s);
    }

    public void showDialog(int i) {
        C2102Qe2 c2102Qe2 = this.b;
        c2102Qe2.getClass();
        HashMap e = PropertyModel.e(AbstractC2622Ue2.h);
        ID2 id2 = AbstractC2622Ue2.a;
        DD2 dd2 = new DD2();
        dd2.a = i;
        e.put(id2, dd2);
        JD2 jd2 = AbstractC2622Ue2.b;
        String string = c2102Qe2.b.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14024b, Integer.valueOf(i));
        GD2 gd2 = new GD2();
        gd2.a = string;
        PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd2, e);
        UD2.a(a, c2102Qe2.c, new TD2() { // from class: Pe2
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                OtpVerificationDialogView otpVerificationDialogView = (OtpVerificationDialogView) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC2622Ue2.d;
                if (fd2.equals(pd2)) {
                    if (((Optional) propertyModel.i(pd2)).isPresent()) {
                        return;
                    }
                    otpVerificationDialogView.h.getText().clear();
                    return;
                }
                JD2 jd22 = AbstractC2622Ue2.b;
                if (!fd2.equals(jd22)) {
                    PD2 pd22 = AbstractC2622Ue2.c;
                    if (fd2.equals(pd22)) {
                        final InterfaceC2492Te2 interfaceC2492Te2 = (InterfaceC2492Te2) propertyModel.i(pd22);
                        otpVerificationDialogView.h.addTextChangedListener(new C2882We2(interfaceC2492Te2));
                        TextView textView = otpVerificationDialogView.j;
                        Context context = otpVerificationDialogView.getContext();
                        textView.setText(AbstractC9108qg3.a(context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140249), new C8765pg3(new C11997z52(context, new Callback() { // from class: Ve2
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj3) {
                                return new ZE(this, obj3);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj3) {
                                int i2 = OtpVerificationDialogView.k;
                                C2362Se2 c2362Se2 = (C2362Se2) InterfaceC2492Te2.this;
                                c2362Se2.i.o(AbstractC2622Ue2.d, Optional.empty());
                                N.MwUcrcWa(c2362Se2.h.a);
                            }
                        }), "<link>", "</link>")));
                        return;
                    }
                    PD2 pd23 = AbstractC2622Ue2.e;
                    if (fd2.equals(pd23)) {
                        Optional optional = (Optional) propertyModel.i(pd23);
                        if (optional.isPresent()) {
                            otpVerificationDialogView.i.setVisibility(0);
                            otpVerificationDialogView.i.setText((CharSequence) optional.get());
                            return;
                        } else {
                            otpVerificationDialogView.i.setVisibility(8);
                            return;
                        }
                    }
                    PD2 pd24 = AbstractC2622Ue2.f;
                    if (fd2.equals(pd24)) {
                        String str = (String) propertyModel.i(pd24);
                        otpVerificationDialogView.a.findViewById(R.id.progress_bar).setVisibility(8);
                        otpVerificationDialogView.a.findViewById(R.id.confirmation_icon).setVisibility(0);
                        ((TextView) otpVerificationDialogView.a.findViewById(R.id.progress_bar_message)).setText(str);
                        return;
                    }
                    LD2 ld2 = AbstractC2622Ue2.g;
                    if (fd2.equals(ld2)) {
                        if (propertyModel.j(ld2)) {
                            otpVerificationDialogView.a.setVisibility(0);
                            otpVerificationDialogView.a.setAlpha(0.0f);
                            otpVerificationDialogView.a.animate().alpha(1.0f).setDuration(250L);
                            otpVerificationDialogView.g.animate().alpha(0.0f).setDuration(250L);
                            return;
                        }
                        otpVerificationDialogView.a.setVisibility(8);
                        otpVerificationDialogView.a.animate().alpha(0.0f).setDuration(250L);
                        otpVerificationDialogView.g.animate().alpha(1.0f).setDuration(250L);
                        return;
                    }
                    return;
                }
                otpVerificationDialogView.h.setHint((String) propertyModel.i(jd22));
            }
        });
        C2362Se2 c2362Se2 = c2102Qe2.a;
        c2362Se2.i = a;
        a.o(AbstractC2622Ue2.c, c2362Se2);
        c2362Se2.a.l(c2362Se2.g, 0, false);
    }

    public void showOtpErrorMessage(String str) {
        C2102Qe2 c2102Qe2 = this.b;
        c2102Qe2.getClass();
        Optional of = Optional.of(str);
        C2362Se2 c2362Se2 = c2102Qe2.a;
        c2362Se2.i.k(AbstractC2622Ue2.g, false);
        c2362Se2.i.o(AbstractC2622Ue2.e, of);
        c2362Se2.g.k(AbstractC4249cY1.m, true);
    }

    public void dismissDialog() {
        C2362Se2 c2362Se2 = this.b.a;
        c2362Se2.a.c(4, c2362Se2.g);
    }

    public void showConfirmationAndDismissDialog(String str) {
        final C2362Se2 c2362Se2 = this.b.a;
        c2362Se2.i.o(AbstractC2622Ue2.f, str);
        new Handler().postDelayed(new Runnable() { // from class: Re2
            @Override // java.lang.Runnable
            public final void run() {
                C2362Se2 c2362Se22 = C2362Se2.this;
                c2362Se22.a.c(4, c2362Se22.g);
            }
        }, 250L);
    }
}
