package defpackage;

import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager.widget.ViewPager;
import defpackage.AbstractC3736b2;
import defpackage.C1661Mu1;
import defpackage.C5175fD1;
import defpackage.C6207iD1;
import defpackage.FD2;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.Ld4;
import defpackage.ND2;
import defpackage.PD2;
import defpackage.W1;
import defpackage.WD2;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X1 {
    public final Z1 a;

    public X1(ViewStub viewStub) {
        C4324cl0 c4324cl0 = new C4324cl0(viewStub);
        JD2 jd2 = AbstractC3736b2.a;
        ND2 nd2 = AbstractC3736b2.b;
        LD2 ld2 = AbstractC3736b2.c;
        LD2 ld22 = AbstractC3736b2.e;
        HashMap e = PropertyModel.e(new FD2[]{jd2, nd2, ld2, AbstractC3736b2.d, ld22, AbstractC3736b2.f});
        C5175fD1 c5175fD1 = new C5175fD1();
        GD2 gd2 = new GD2();
        gd2.a = c5175fD1;
        e.put(jd2, gd2);
        DD2 dd2 = new DD2();
        dd2.a = -1;
        e.put(nd2, dd2);
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        AD2 ad22 = new AD2();
        ad22.a = false;
        e.put(ld22, ad22);
        final PropertyModel propertyModel = new PropertyModel(e);
        new C4407cz1(propertyModel, ld2, new C3720az1(ld2), c4324cl0, new TD2() { // from class: org.chromium.chrome.browser.keyboard_accessory.sheet_component.a
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                String str;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                final AccessorySheetView accessorySheetView = (AccessorySheetView) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd22 = AbstractC3736b2.a;
                if (fd2 == jd22) {
                    C5175fD1 c5175fD12 = (C5175fD1) propertyModel2.i(jd22);
                    ViewPager viewPager = accessorySheetView.a;
                    W1 w1 = new W1(c5175fD12);
                    c5175fD12.l(new C6207iD1(c5175fD12, viewPager, w1));
                    accessorySheetView.a.v(w1);
                    return;
                }
                LD2 ld23 = AbstractC3736b2.c;
                ND2 nd22 = AbstractC3736b2.b;
                if (fd2 == ld23) {
                    accessorySheetView.bringToFront();
                    accessorySheetView.setVisibility(propertyModel2.j(ld23) ? 0 : 8);
                    if (!propertyModel2.j(ld23) || propertyModel2.h(nd22) == -1 || (str = ((C1661Mu1) ((C5175fD1) propertyModel2.i(jd22)).get(propertyModel2.h(nd22))).c) == null) {
                        return;
                    }
                    accessorySheetView.announceForAccessibility(str);
                    return;
                }
                ND2 nd23 = AbstractC3736b2.d;
                if (fd2 == nd23) {
                    ViewGroup.LayoutParams layoutParams = accessorySheetView.getLayoutParams();
                    layoutParams.height = propertyModel2.h(nd23);
                    accessorySheetView.setLayoutParams(layoutParams);
                    return;
                }
                LD2 ld24 = AbstractC3736b2.e;
                if (fd2 == ld24) {
                    accessorySheetView.g.setVisibility(propertyModel2.j(ld24) ? 0 : 4);
                    return;
                }
                if (fd2 == nd22) {
                    if (propertyModel2.h(nd22) != -1) {
                        final int h = propertyModel2.h(nd22);
                        accessorySheetView.a.w(h);
                        accessorySheetView.a.post(new Runnable() { // from class: org.chromium.chrome.browser.keyboard_accessory.sheet_component.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AccessorySheetView.this.a.w(h);
                            }
                        });
                        return;
                    }
                    return;
                }
                PD2 pd2 = AbstractC3736b2.f;
                if (fd2 != pd2 || propertyModel2.i(pd2) == null) {
                    return;
                }
                accessorySheetView.a.b((Ld4) propertyModel2.i(pd2));
            }
        });
        propertyModel.a(new VD2() { // from class: a2
            @Override // defpackage.VD2
            public final void d(WD2 wd2, Object obj) {
                FD2 fd2 = (FD2) obj;
                LD2 ld23 = AbstractC3736b2.c;
                if (fd2 == ld23) {
                    PropertyModel propertyModel2 = PropertyModel.this;
                    if (propertyModel2.j(ld23)) {
                        int h = propertyModel2.h(AbstractC3736b2.b);
                        if (h >= 0) {
                            JD2 jd22 = AbstractC3736b2.a;
                            if (h < ((C5175fD1) propertyModel2.i(jd22)).size()) {
                                DL1.b(((C1661Mu1) ((C5175fD1) propertyModel2.i(jd22)).get(h)).f, 2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    DL1.b(0, 0);
                }
            }
        });
        this.a = new Z1(propertyModel);
    }
}
