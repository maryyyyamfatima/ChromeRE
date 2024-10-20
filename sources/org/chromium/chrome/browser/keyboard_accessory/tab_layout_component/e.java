package org.chromium.chrome.browser.keyboard_accessory.tab_layout_component;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC8166nv1;
import defpackage.C0249Bx3;
import defpackage.C1661Mu1;
import defpackage.C5175fD1;
import defpackage.C6207iD1;
import defpackage.FD2;
import defpackage.InterfaceC11609xx3;
import defpackage.InterfaceC5863hD1;
import defpackage.InterfaceC7925nD1;
import defpackage.InterfaceC9646sE2;
import defpackage.JD2;
import defpackage.PD2;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e implements InterfaceC5863hD1 {
    @Override // defpackage.InterfaceC5863hD1
    public final void a(InterfaceC7925nD1 interfaceC7925nD1, Object obj, int i, int i2) {
        e((KeyboardAccessoryTabLayoutView) obj, (C5175fD1) interfaceC7925nD1);
    }

    @Override // defpackage.InterfaceC5863hD1
    public final void b(InterfaceC7925nD1 interfaceC7925nD1, Object obj, int i, int i2) {
        e((KeyboardAccessoryTabLayoutView) obj, (C5175fD1) interfaceC7925nD1);
    }

    @Override // defpackage.InterfaceC5863hD1
    public final void c(InterfaceC7925nD1 interfaceC7925nD1, int i, Object obj, Object obj2, int i2) {
        e((KeyboardAccessoryTabLayoutView) obj, (C5175fD1) interfaceC7925nD1);
    }

    public static void e(KeyboardAccessoryTabLayoutView keyboardAccessoryTabLayoutView, C5175fD1 c5175fD1) {
        keyboardAccessoryTabLayoutView.o();
        if (c5175fD1.size() <= 0) {
            return;
        }
        for (int i = 0; i < c5175fD1.size(); i++) {
            C1661Mu1 c1661Mu1 = (C1661Mu1) c5175fD1.get(i);
            Drawable drawable = c1661Mu1.b;
            C0249Bx3 m = keyboardAccessoryTabLayoutView.m();
            m.b = drawable.mutate();
            TabLayout tabLayout = m.g;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.w(true);
            }
            m.e();
            m.b.setColorFilter(AbstractC10957w33.c(keyboardAccessoryTabLayoutView.getContext()), PorterDuff.Mode.SRC_IN);
            m.c(c1661Mu1.d);
            keyboardAccessoryTabLayoutView.d(m, i, false);
        }
    }

    public static void d(PropertyModel propertyModel, KeyboardAccessoryTabLayoutView keyboardAccessoryTabLayoutView, FD2 fd2) {
        InterfaceC11609xx3 interfaceC11609xx3;
        int i;
        JD2 jd2 = AbstractC8166nv1.a;
        int i2 = 0;
        if (fd2 != jd2) {
            PD2 pd2 = AbstractC8166nv1.b;
            if (fd2 == pd2) {
                Integer num = (Integer) propertyModel.i(pd2);
                for (int l = keyboardAccessoryTabLayoutView.l() - 1; l >= 0; l--) {
                    C0249Bx3 k = keyboardAccessoryTabLayoutView.k(l);
                    if (k != null && k.b != null) {
                        if (num == null || l != num.intValue()) {
                            i = -16842913;
                        } else {
                            if (!k.a()) {
                                k.b();
                            }
                            i = R.attr.state_selected;
                        }
                        Drawable drawable = k.b;
                        ColorStateList colorStateList = keyboardAccessoryTabLayoutView.n;
                        drawable.setColorFilter(colorStateList.getColorForState(new int[]{i}, colorStateList.getDefaultColor()), PorterDuff.Mode.SRC_IN);
                    }
                }
                int intValue = propertyModel.i(pd2) != null ? ((Integer) propertyModel.i(pd2)).intValue() : -1;
                while (i2 < ((C5175fD1) propertyModel.i(jd2)).size()) {
                    C1661Mu1 c1661Mu1 = (C1661Mu1) ((C5175fD1) propertyModel.i(jd2)).get(i2);
                    if (intValue == i2) {
                        C0249Bx3 k2 = keyboardAccessoryTabLayoutView.k(i2);
                        if (k2 == null) {
                            continue;
                        } else {
                            TabLayout tabLayout = k2.g;
                            if (tabLayout == null) {
                                throw new IllegalArgumentException("Tab not attached to a TabLayout");
                            }
                            k2.d = tabLayout.getResources().getText(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140577);
                            k2.e();
                        }
                    } else {
                        String str = c1661Mu1.d;
                        C0249Bx3 k3 = keyboardAccessoryTabLayoutView.k(i2);
                        if (k3 != null) {
                            k3.c(str);
                        }
                    }
                    i2++;
                }
                return;
            }
            PD2 pd22 = AbstractC8166nv1.c;
            if (fd2 != pd22 || (interfaceC11609xx3 = (InterfaceC11609xx3) propertyModel.i(pd22)) == null) {
                return;
            }
            keyboardAccessoryTabLayoutView.f11501J.clear();
            keyboardAccessoryTabLayoutView.b(interfaceC11609xx3);
            return;
        }
        e eVar = new e();
        ((C5175fD1) propertyModel.i(jd2)).l(new C6207iD1((C5175fD1) propertyModel.i(jd2), keyboardAccessoryTabLayoutView, eVar));
        e(keyboardAccessoryTabLayoutView, (C5175fD1) propertyModel.i(jd2));
        C5175fD1 c5175fD1 = (C5175fD1) propertyModel.i(jd2);
        while (i2 < c5175fD1.size()) {
            ((C1661Mu1) c5175fD1.get(i2)).h.b(new InterfaceC9646sE2(c5175fD1, keyboardAccessoryTabLayoutView, i2) { // from class: org.chromium.chrome.browser.keyboard_accessory.tab_layout_component.d
                public final /* synthetic */ C5175fD1 g;
                public final /* synthetic */ KeyboardAccessoryTabLayoutView h;

                @Override // defpackage.InterfaceC9646sE2
                public final void a(int i3, Object obj) {
                    e.this.getClass();
                    e.e(this.h, this.g);
                }
            });
            i2++;
        }
    }
}
