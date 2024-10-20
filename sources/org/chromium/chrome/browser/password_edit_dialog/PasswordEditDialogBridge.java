package org.chromium.chrome.browser.password_edit_dialog;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractC2007Pl2;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC4249cY1;
import defpackage.BD2;
import defpackage.C1747Nl2;
import defpackage.C1877Ol2;
import defpackage.C7928nE;
import defpackage.FD2;
import defpackage.InterfaceC1617Ml2;
import defpackage.JD2;
import defpackage.PD2;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.UN;
import defpackage.WD2;
import defpackage.ZX1;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordEditDialogBridge implements InterfaceC1617Ml2 {
    public long a;
    public final C1747Nl2 b;

    public static PasswordEditDialogBridge create(long j, WindowAndroid windowAndroid) {
        return new PasswordEditDialogBridge(j, windowAndroid);
    }

    public PasswordEditDialogBridge(long j, WindowAndroid windowAndroid) {
        b bVar;
        this.a = j;
        Context context = (Context) windowAndroid.j.get();
        ZX1 s = windowAndroid.s();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("PasswordEditDialogWithDetails")) {
            bVar = (PasswordEditDialogWithDetailsView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e2, (ViewGroup) null);
        } else {
            bVar = (UsernameSelectionConfirmationView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e1, (ViewGroup) null);
        }
        this.b = new C1747Nl2(context, s, bVar, this);
    }

    public void show(String[] strArr, int i, String str, String str2, String str3) {
        C1747Nl2 c1747Nl2 = this.b;
        boolean z = c1747Nl2.f;
        int i2 = z ? R.string.0_resource_name_obfuscated_res_0x7f1407e1 : R.string.0_resource_name_obfuscated_res_0x7f14038d;
        Context context = c1747Nl2.a;
        Resources resources = context.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        final C1877Ol2 c1877Ol2 = c1747Nl2.e;
        bd2.e(jd2, c1877Ol2);
        bd2.d(AbstractC4249cY1.c, resources, i2);
        bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f1407d1);
        bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1407c8);
        bd2.c(AbstractC4249cY1.v, 1);
        PD2 pd2 = AbstractC4249cY1.h;
        b bVar = c1747Nl2.c;
        bd2.e(pd2, bVar);
        if (z) {
            bd2.e(AbstractC4249cY1.e, AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f0902f3));
        }
        c1747Nl2.d = bd2.a();
        BD2 bd22 = new BD2(AbstractC2007Pl2.h);
        bd22.e(AbstractC2007Pl2.b, Arrays.asList(strArr));
        bd22.e(AbstractC2007Pl2.c, strArr[i]);
        JD2 jd22 = AbstractC2007Pl2.a;
        Objects.requireNonNull(c1877Ol2);
        bd22.e(jd22, new Callback() { // from class: Kl2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C1877Ol2.this.a.o(AbstractC2007Pl2.c, (String) obj);
            }
        });
        bd22.e(AbstractC2007Pl2.d, str);
        if (z) {
            bd22.e(AbstractC2007Pl2.e, context.getString(TextUtils.isEmpty(str3) ? R.string.0_resource_name_obfuscated_res_0x7f1407ae : R.string.0_resource_name_obfuscated_res_0x7f1407ac, str3));
            bd22.e(AbstractC2007Pl2.f, new Callback() { // from class: Ll2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str4 = (String) obj;
                    C1877Ol2 c1877Ol22 = C1877Ol2.this;
                    c1877Ol22.a.o(AbstractC2007Pl2.d, str4);
                    boolean isEmpty = str4.isEmpty();
                    c1877Ol22.a.o(AbstractC2007Pl2.g, isEmpty ? c1877Ol22.i.getString(R.string.0_resource_name_obfuscated_res_0x7f1407b5) : null);
                    c1877Ol22.g.k(AbstractC4249cY1.m, isEmpty);
                }
            });
            bd22.a();
        }
        PropertyModel a = bd22.a();
        PropertyModel propertyModel = c1747Nl2.d;
        c1877Ol2.a = a;
        c1877Ol2.g = propertyModel;
        UD2.a(a, bVar, new TD2() { // from class: org.chromium.chrome.browser.password_edit_dialog.a
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                b bVar2 = (b) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd23 = AbstractC2007Pl2.b;
                PD2 pd22 = AbstractC2007Pl2.c;
                if (fd2 == jd23) {
                    bVar2.e((String) propertyModel2.i(pd22), (List) propertyModel2.i(jd23));
                    return;
                }
                if (fd2 == pd22) {
                    return;
                }
                JD2 jd24 = AbstractC2007Pl2.e;
                if (fd2 == jd24) {
                    String str4 = (String) propertyModel2.i(jd24);
                    bVar2.a.setVisibility(!TextUtils.isEmpty(str4) ? 0 : 8);
                    bVar2.a.setText(str4);
                    return;
                }
                JD2 jd25 = AbstractC2007Pl2.a;
                if (fd2 == jd25) {
                    bVar2.d((Callback) propertyModel2.i(jd25));
                    return;
                }
                JD2 jd26 = AbstractC2007Pl2.f;
                if (fd2 == jd26) {
                    bVar2.b((Callback) propertyModel2.i(jd26));
                    return;
                }
                PD2 pd23 = AbstractC2007Pl2.d;
                if (fd2 == pd23) {
                    bVar2.a((String) propertyModel2.i(pd23));
                    return;
                }
                PD2 pd24 = AbstractC2007Pl2.g;
                if (fd2 == pd24) {
                    bVar2.c((String) propertyModel2.i(pd24));
                }
            }
        });
        c1747Nl2.b.l(c1747Nl2.d, 0, false);
    }

    public void dismiss() {
        C1747Nl2 c1747Nl2 = this.b;
        c1747Nl2.b.c(4, c1747Nl2.d);
    }
}
