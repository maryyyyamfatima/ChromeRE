package org.chromium.chrome.browser.keyboard_accessory.bar_component;

import J.N;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC6104hv1;
import defpackage.C5175fD1;
import defpackage.C6446iv1;
import defpackage.C7928nE;
import defpackage.FD2;
import defpackage.HD2;
import defpackage.InterfaceC5304fc3;
import defpackage.InterfaceC5992hc3;
import defpackage.JD2;
import defpackage.KH;
import defpackage.LD2;
import defpackage.ND2;
import defpackage.QK2;
import defpackage.RK2;
import defpackage.UN;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class n {
    /* JADX WARN: Type inference failed for: r2v1, types: [Du1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Eu1] */
    public static void a(PropertyModel propertyModel, KeyboardAccessoryView keyboardAccessoryView, FD2 fd2) {
        JD2 jd2 = AbstractC6104hv1.a;
        if (fd2 == jd2) {
            C5175fD1 c5175fD1 = (C5175fD1) propertyModel.i(jd2);
            QK2 qk2 = new QK2() { // from class: Bu1
                @Override // defpackage.QK2
                public final Object a(int i, RecyclerView recyclerView) {
                    if (i == 0) {
                        return new C9196qv1(R.layout.f58230_resource_name_obfuscated_res_0x7f0e014a, recyclerView);
                    }
                    if (i != 1) {
                        return null;
                    }
                    return new C9196qv1(R.layout.f58250_resource_name_obfuscated_res_0x7f0e014c, recyclerView);
                }
            };
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("AutofillKeyboardAccessory")) {
                qk2 = new QK2() { // from class: Cu1
                    @Override // defpackage.QK2
                    public final Object a(int i, RecyclerView recyclerView) {
                        if (i == 0) {
                            return new C9196qv1(R.layout.f58240_resource_name_obfuscated_res_0x7f0e014b, recyclerView);
                        }
                        if (i == 1) {
                            return new C4385cv1(recyclerView);
                        }
                        if (i == 2) {
                            return new C4728dv1(recyclerView);
                        }
                        if (i == 0) {
                            return new C9196qv1(R.layout.f58230_resource_name_obfuscated_res_0x7f0e014a, recyclerView);
                        }
                        if (i != 1) {
                            return null;
                        }
                        return new C9196qv1(R.layout.f58250_resource_name_obfuscated_res_0x7f0e014c, recyclerView);
                    }
                };
            }
            RK2 rk2 = new RK2(new C6446iv1(c5175fD1, new InterfaceC5992hc3() { // from class: Du1
                @Override // defpackage.InterfaceC5992hc3
                public final int a(Object obj) {
                    return ((C5416fv1) obj).a;
                }
            }, new InterfaceC5304fc3() { // from class: Eu1
                @Override // defpackage.InterfaceC5304fc3
                public final void a(Object obj, Object obj2) {
                    AbstractC9538rv1 abstractC9538rv1 = (AbstractC9538rv1) obj;
                    abstractC9538rv1.v((C5416fv1) obj2, abstractC9538rv1.a);
                }
            }, new KH()), qk2);
            keyboardAccessoryView.getClass();
            rk2.J(new m(keyboardAccessoryView));
            keyboardAccessoryView.a.n0(rk2);
            return;
        }
        HD2 hd2 = AbstractC6104hv1.i;
        if (fd2 == hd2) {
            if (propertyModel.j(hd2)) {
                keyboardAccessoryView.j = true;
                return;
            }
            return;
        }
        LD2 ld2 = AbstractC6104hv1.b;
        if (fd2 == ld2) {
            keyboardAccessoryView.b(propertyModel.j(ld2));
            return;
        }
        LD2 ld22 = AbstractC6104hv1.c;
        if (fd2 != ld22) {
            ND2 nd2 = AbstractC6104hv1.d;
            if (fd2 == nd2) {
                int h = propertyModel.h(nd2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) keyboardAccessoryView.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, h);
                keyboardAccessoryView.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        keyboardAccessoryView.i = propertyModel.j(ld22);
        if (propertyModel.j(ld2)) {
            return;
        }
        keyboardAccessoryView.b(false);
    }
}
