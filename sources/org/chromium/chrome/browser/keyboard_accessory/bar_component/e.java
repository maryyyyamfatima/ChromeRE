package org.chromium.chrome.browser.keyboard_accessory.bar_component;

import J.N;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.AD2;
import defpackage.AbstractC2181Qu1;
import defpackage.AbstractC6104hv1;
import defpackage.C2961Wu1;
import defpackage.C3091Xu1;
import defpackage.C3720az1;
import defpackage.C3823bH3;
import defpackage.C4324cl0;
import defpackage.C4407cz1;
import defpackage.C5175fD1;
import defpackage.C7822mv1;
import defpackage.C7928nE;
import defpackage.CL1;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.HD2;
import defpackage.JD2;
import defpackage.KU3;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.RunnableC3351Zu1;
import defpackage.TD2;
import defpackage.UN;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC8754pe4;
import defpackage.WD2;
import defpackage.ZE;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e {
    public final C2961Wu1 a;
    public final org.chromium.chrome.browser.keyboard_accessory.tab_layout_component.c b;
    public final TD2 c;
    public final PropertyModel d;
    public KeyboardAccessoryView e;

    public e(CL1 cl1, ViewStub viewStub) {
        org.chromium.chrome.browser.keyboard_accessory.tab_layout_component.c cVar = new org.chromium.chrome.browser.keyboard_accessory.tab_layout_component.c();
        C4324cl0 c4324cl0 = new C4324cl0(viewStub);
        this.b = cVar;
        HD2 hd2 = AbstractC6104hv1.i;
        JD2 jd2 = AbstractC6104hv1.a;
        LD2 ld2 = AbstractC6104hv1.b;
        LD2 ld22 = AbstractC6104hv1.c;
        LD2 ld23 = AbstractC6104hv1.f;
        LD2 ld24 = AbstractC6104hv1.k;
        HashMap e = PropertyModel.e(new FD2[]{hd2, jd2, ld2, ld22, AbstractC6104hv1.d, AbstractC6104hv1.g, ld23, AbstractC6104hv1.e, AbstractC6104hv1.h, AbstractC6104hv1.j, ld24});
        C5175fD1 c5175fD1 = new C5175fD1();
        GD2 gd2 = new GD2();
        gd2.a = c5175fD1;
        e.put(jd2, gd2);
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        AD2 ad22 = new AD2();
        ad22.a = false;
        e.put(ld22, ad22);
        AD2 ad23 = new AD2();
        ad23.a = false;
        e.put(ld23, ad23);
        AD2 ad24 = new AD2();
        ad24.a = false;
        e.put(hd2, ad24);
        AD2 ad25 = new AD2();
        ad25.a = false;
        e.put(ld24, ad25);
        PropertyModel propertyModel = new PropertyModel(e);
        this.d = propertyModel;
        C7822mv1 c7822mv1 = cVar.b;
        C2961Wu1 c2961Wu1 = new C2961Wu1(propertyModel, cl1, c7822mv1, cVar.d);
        this.a = c2961Wu1;
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("AutofillKeyboardAccessory")) {
            c4324cl0.a(new Callback() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.a
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    KeyboardAccessoryView keyboardAccessoryView = (KeyboardAccessoryView) obj;
                    e eVar = e.this;
                    eVar.getClass();
                    if (keyboardAccessoryView.g == null) {
                        keyboardAccessoryView.g = (TabLayout) keyboardAccessoryView.findViewById(R.id.tabs);
                    }
                    eVar.b.a(keyboardAccessoryView.g);
                }
            });
        }
        c4324cl0.a(new Callback() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.b
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                e.this.e = (KeyboardAccessoryView) obj;
            }
        });
        c7822mv1.g = c2961Wu1;
        TD2 td2 = N.M09VlOh_("AutofillKeyboardAccessory") ? new TD2() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.c
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4;
                C3823bH3 a;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                FD2 fd2 = (FD2) obj2;
                KeyboardAccessoryModernView keyboardAccessoryModernView = (KeyboardAccessoryModernView) ((KeyboardAccessoryView) obj);
                n.a(propertyModel2, keyboardAccessoryModernView, fd2);
                LD2 ld25 = AbstractC6104hv1.f;
                if (fd2 == ld25) {
                    boolean j = propertyModel2.j(ld25);
                    keyboardAccessoryModernView.l.setVisibility(j ? 0 : 8);
                    keyboardAccessoryModernView.m.setVisibility(j ? 0 : 8);
                    keyboardAccessoryModernView.a.setVisibility(j ? 8 : 0);
                    if (j) {
                        return;
                    }
                    RecyclerView recyclerView = keyboardAccessoryModernView.a;
                    Objects.requireNonNull(recyclerView);
                    recyclerView.post(new RunnableC3351Zu1(recyclerView));
                    return;
                }
                PD2 pd2 = AbstractC6104hv1.h;
                if (fd2 == pd2) {
                    final Runnable runnable = (Runnable) propertyModel2.i(pd2);
                    keyboardAccessoryModernView.l.setOnClickListener(runnable != null ? new View.OnClickListener() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i = KeyboardAccessoryModernView.p;
                            runnable.run();
                        }
                    } : null);
                    return;
                }
                PD2 pd22 = AbstractC6104hv1.e;
                if (fd2 != pd22) {
                    PD2 pd23 = AbstractC6104hv1.j;
                    if (fd2 != pd23) {
                        LD2 ld26 = AbstractC6104hv1.k;
                        if (fd2 == ld26) {
                            if (keyboardAccessoryModernView.c() == null) {
                                viewTreeObserverOnGlobalLayoutListenerC8754pe4 = null;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(keyboardAccessoryModernView.c());
                                viewTreeObserverOnGlobalLayoutListenerC8754pe4.d(true);
                            }
                            if (!propertyModel2.j(ld26) || viewTreeObserverOnGlobalLayoutListenerC8754pe4 == null) {
                                return;
                            }
                            KU3 b = AbstractC2181Qu1.b();
                            if (b != null && (b.getTriggerState("IPH_KeyboardAccessoryAddressFilling") == 0 || b.getTriggerState("IPH_KeyboardAccessoryPasswordFilling") == 0 || b.getTriggerState("IPH_KeyboardAccessoryPaymentFilling") == 0)) {
                                r1 = 1;
                            }
                            if (r1 == 0 || (a = AbstractC2181Qu1.a("IPH_KeyboardAccessoryBarSwiping", viewTreeObserverOnGlobalLayoutListenerC8754pe4, keyboardAccessoryModernView.a, null)) == null) {
                                return;
                            }
                            a.h();
                            return;
                        }
                        return;
                    }
                    keyboardAccessoryModernView.n = (Callback) propertyModel2.i(pd23);
                    return;
                }
                keyboardAccessoryModernView.m.setText((String) propertyModel2.i(pd22));
            }
        } : new TD2() { // from class: org.chromium.chrome.browser.keyboard_accessory.bar_component.d
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                n.a((PropertyModel) wd2, (KeyboardAccessoryView) obj, (FD2) obj2);
            }
        };
        this.c = td2;
        new C4407cz1(propertyModel, ld2, new C3720az1(ld2), c4324cl0, td2);
        C3091Xu1 c3091Xu1 = new C3091Xu1(propertyModel, c7822mv1);
        propertyModel.a(c3091Xu1);
        ((C5175fD1) propertyModel.i(jd2)).l(c3091Xu1);
    }

    public final void a() {
        LD2 ld2 = AbstractC6104hv1.c;
        this.a.a.k(ld2, true);
        KeyboardAccessoryView keyboardAccessoryView = this.e;
        if (keyboardAccessoryView != null) {
            this.c.d(this.d, keyboardAccessoryView, ld2);
        }
    }
}
