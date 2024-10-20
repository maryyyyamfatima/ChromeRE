package org.chromium.chrome.browser.toolbar.optional_button;

import J.N;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.AQ3;
import defpackage.AbstractC11495xe2;
import defpackage.AbstractC5266fV2;
import defpackage.AbstractC9685sM1;
import defpackage.C10809ve2;
import defpackage.C11152we2;
import defpackage.C12180ze1;
import defpackage.C7928nE;
import defpackage.C8267oD;
import defpackage.C8610pD;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.HD2;
import defpackage.ID2;
import defpackage.InterfaceC7913nB;
import defpackage.JD2;
import defpackage.KU3;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.Q44;
import defpackage.S93;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.UN;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC8754pe4;
import defpackage.WD2;
import defpackage.Yc4;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.toolbar.optional_button.b;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class b {
    public final C11152we2 a;
    public final OptionalButtonView b;
    public final Q44 c;
    public final KU3 d;
    public Callback e;
    public C12180ze1 f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.chromium.components.browser_ui.widget.listmenu.ListMenuButton] */
    public final void a(C8610pD c8610pD) {
        C12180ze1 c12180ze1;
        C8267oD c8267oD = c8610pD.c;
        if (c8267oD != null && (c12180ze1 = c8267oD.f) != null) {
            this.f = c12180ze1;
            Yc4 yc4 = new Yc4(1);
            yc4.d = new C10809ve2(this);
            OptionalButtonView optionalButtonView = this.b;
            ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(optionalButtonView);
            viewTreeObserverOnGlobalLayoutListenerC8754pe4.d(false);
            yc4.b = false;
            ?? r5 = optionalButtonView.j;
            if (r5 != 0) {
                optionalButtonView = r5;
            }
            c12180ze1.h = optionalButtonView;
            c12180ze1.n = viewTreeObserverOnGlobalLayoutListenerC8754pe4;
            c12180ze1.o = yc4;
        } else {
            this.f = null;
        }
        C8267oD c8267oD2 = c8610pD.c;
        if (c8267oD2.g == 6 && c8267oD2.i != 0) {
            KU3 ku3 = this.d;
            if (!ku3.isInitialized() || !ku3.shouldTriggerHelpUI("IPH_ContextualPageActions_PriceTrackingActionChip")) {
                c8610pD.a(0);
            }
        }
        PD2 pd2 = AbstractC11495xe2.a;
        PropertyModel propertyModel = this.a.a;
        propertyModel.o(pd2, c8610pD);
        propertyModel.k(AbstractC11495xe2.b, c8610pD.b);
    }

    public b(View view, Q44 q44, ViewGroup viewGroup, AQ3 aq3, KU3 ku3) {
        this.c = q44;
        HashMap e = PropertyModel.e(AbstractC11495xe2.l);
        PD2 pd2 = AbstractC11495xe2.d;
        Callback callback = new Callback() { // from class: ue2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                final b bVar = b.this;
                Callback callback2 = bVar.e;
                if (callback2 != null) {
                    callback2.onResult(Integer.valueOf(intValue));
                }
                if (intValue == 3) {
                    bVar.d.d(new Callback() { // from class: te2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            b bVar2 = b.this;
                            bVar2.getClass();
                            if (((Boolean) obj2).booleanValue()) {
                                bVar2.d.dismissed("IPH_ContextualPageActions_PriceTrackingActionChip");
                            }
                        }
                    });
                }
                C12180ze1 c12180ze1 = bVar.f;
                if (c12180ze1 != null) {
                    bVar.c.a(c12180ze1.a());
                    bVar.f = null;
                }
            }
        };
        GD2 gd2 = new GD2();
        gd2.a = callback;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC11495xe2.f;
        GD2 gd22 = new GD2();
        gd22.a = viewGroup;
        e.put(pd22, gd22);
        PD2 pd23 = AbstractC11495xe2.k;
        GD2 gd23 = new GD2();
        gd23.a = aq3;
        PropertyModel a = AbstractC5266fV2.a(e, pd23, gd23, e);
        OptionalButtonView optionalButtonView = (OptionalButtonView) view;
        this.b = optionalButtonView;
        UD2.a(a, optionalButtonView, new TD2() { // from class: org.chromium.chrome.browser.toolbar.optional_button.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                InterfaceC7913nB interfaceC7913nB;
                boolean z;
                PropertyModel propertyModel = (PropertyModel) wd2;
                OptionalButtonView optionalButtonView2 = (OptionalButtonView) obj;
                Object obj3 = (FD2) obj2;
                JD2 jd2 = AbstractC11495xe2.a;
                boolean z2 = true;
                if (jd2.equals(obj3)) {
                    C8610pD c8610pD = (C8610pD) propertyModel.i(jd2);
                    if (c8610pD != null && optionalButtonView2.s == c8610pD.c.g && optionalButtonView2.t == c8610pD.a) {
                        return;
                    }
                    if (optionalButtonView2.m == null || (interfaceC7913nB = optionalButtonView2.A) == null) {
                        throw new IllegalStateException("Both transitionRoot and animationAllowedPredicate must be set before starting a transition");
                    }
                    boolean a2 = interfaceC7913nB.a();
                    int i = optionalButtonView2.r;
                    if ((i == 3 || i == 4 || i == 5 || i == 6 || i == 7) != false) {
                        TransitionManager.endTransitions(optionalButtonView2.m);
                        optionalButtonView2.onTransitionEnd(null);
                    }
                    int i2 = 2;
                    if (optionalButtonView2.r == 2) {
                        optionalButtonView2.getHandler().removeCallbacks(optionalButtonView2.B);
                        optionalButtonView2.e(false);
                        int i3 = optionalButtonView2.r;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                i2 = 0;
                            } else if (i3 != 5) {
                                if (i3 != 6 && i3 != 7) {
                                    i2 = i3;
                                }
                            }
                            optionalButtonView2.r = i2;
                        }
                        i2 = 1;
                        optionalButtonView2.r = i2;
                    }
                    if (c8610pD != null && (z = c8610pD.a)) {
                        C8267oD c8267oD = c8610pD.c;
                        optionalButtonView2.s = c8267oD.g;
                        optionalButtonView2.t = z;
                        optionalButtonView2.l = c8267oD.a;
                        optionalButtonView2.v = c8267oD.h ? 1 : 0;
                        int i4 = c8267oD.i;
                        if (i4 == 0) {
                            optionalButtonView2.o = null;
                        } else {
                            optionalButtonView2.o = optionalButtonView2.getContext().getResources().getString(i4);
                        }
                        optionalButtonView2.w = c8267oD.b;
                        optionalButtonView2.x = c8267oD.c;
                        optionalButtonView2.j.setEnabled(c8610pD.b);
                        optionalButtonView2.n = optionalButtonView2.getContext().getResources().getString(c8267oD.d);
                        int i5 = optionalButtonView2.r;
                        if (i5 == 0 && optionalButtonView2.o == null) {
                            optionalButtonView2.e(a2);
                            return;
                        }
                        if (a2 && optionalButtonView2.o != null) {
                            if (i5 == 1 || i5 == 0) {
                                if (optionalButtonView2.getVisibility() == 8) {
                                    optionalButtonView2.setVisibility(0);
                                    optionalButtonView2.d(0);
                                }
                                optionalButtonView2.h.setVisibility(8);
                                optionalButtonView2.h.setText(optionalButtonView2.o);
                                optionalButtonView2.k.setImageDrawable(optionalButtonView2.j.getDrawable());
                                optionalButtonView2.k.setVisibility(0);
                                optionalButtonView2.j.setImageDrawable(optionalButtonView2.l);
                                optionalButtonView2.j.setVisibility(8);
                                C7928nE c7928nE = UN.a;
                                if (N.M6bsIDpc("ContextualPageActionPriceTracking", "action_chip_with_different_color", false)) {
                                    optionalButtonView2.i.setColorFilter(AbstractC9685sM1.d(optionalButtonView2, R.attr.0_resource_name_obfuscated_res_0x7f05014d));
                                } else {
                                    optionalButtonView2.i.setColorFilter(optionalButtonView2.p);
                                }
                                TransitionManager.beginDelayedTransition(optionalButtonView2.m, optionalButtonView2.a());
                                optionalButtonView2.j.setVisibility(0);
                                optionalButtonView2.k.setVisibility(8);
                                optionalButtonView2.h.setVisibility(0);
                                optionalButtonView2.i.setVisibility(0);
                                optionalButtonView2.d((int) (optionalButtonView2.a + optionalButtonView2.h.getPaint().measureText(optionalButtonView2.o) + optionalButtonView2.g));
                                optionalButtonView2.r = 5;
                                return;
                            }
                            return;
                        }
                        if (!a2 || optionalButtonView2.o != null) {
                            optionalButtonView2.e(false);
                            return;
                        }
                        if (i5 != 1) {
                            return;
                        }
                        byte b = optionalButtonView2.u == 1 && optionalButtonView2.v == 0;
                        if (optionalButtonView2.v == 1) {
                            optionalButtonView2.i.setColorFilter(optionalButtonView2.p);
                        }
                        ImageView imageView = optionalButtonView2.k;
                        ListMenuButton listMenuButton = optionalButtonView2.j;
                        Drawable drawable = optionalButtonView2.l;
                        Drawable drawable2 = listMenuButton.getDrawable();
                        if (b == false) {
                            imageView.setImageDrawable(drawable);
                        } else {
                            imageView.setImageDrawable(drawable2);
                            imageView.setVisibility(0);
                            listMenuButton.setImageDrawable(drawable);
                            listMenuButton.setVisibility(8);
                        }
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        Fade fade = new Fade();
                        S93 s93 = new S93();
                        s93.addTarget(optionalButtonView2.j);
                        Slide slide = new Slide(48);
                        slide.addTarget(optionalButtonView2.k);
                        transitionSet.addTransition(slide).addTransition(s93).addTransition(fade);
                        transitionSet.setDuration(300L);
                        transitionSet.addListener((Transition.TransitionListener) optionalButtonView2);
                        TransitionManager.beginDelayedTransition(optionalButtonView2.m, transitionSet);
                        if (b == false) {
                            imageView.setVisibility(0);
                            listMenuButton.setVisibility(8);
                        } else {
                            imageView.setVisibility(8);
                            listMenuButton.setVisibility(0);
                        }
                        optionalButtonView2.i.setVisibility(optionalButtonView2.v != 1 ? 8 : 0);
                        optionalButtonView2.r = 7;
                        return;
                    }
                    optionalButtonView2.s = 1;
                    optionalButtonView2.t = false;
                    TransitionSet b2 = optionalButtonView2.b();
                    if (!a2) {
                        b2.setDuration(0L);
                    }
                    TransitionManager.beginDelayedTransition(optionalButtonView2.m, b2);
                    optionalButtonView2.j.setVisibility(8);
                    optionalButtonView2.i.setVisibility(8);
                    optionalButtonView2.d(0);
                    Runnable runnable = optionalButtonView2.q;
                    if (runnable != null) {
                        runnable.run();
                    }
                    optionalButtonView2.r = 4;
                    return;
                }
                HD2 hd2 = AbstractC11495xe2.b;
                if (!hd2.equals(obj3)) {
                    JD2 jd22 = AbstractC11495xe2.c;
                    if (!jd22.equals(obj3)) {
                        JD2 jd23 = AbstractC11495xe2.d;
                        if (!jd23.equals(obj3)) {
                            JD2 jd24 = AbstractC11495xe2.e;
                            if (!jd24.equals(obj3)) {
                                JD2 jd25 = AbstractC11495xe2.f;
                                if (!jd25.equals(obj3)) {
                                    JD2 jd26 = AbstractC11495xe2.g;
                                    if (jd26.equals(obj3)) {
                                        ColorStateList colorStateList = (ColorStateList) propertyModel.i(jd26);
                                        optionalButtonView2.j.setImageTintList(colorStateList);
                                        optionalButtonView2.k.setImageTintList(colorStateList);
                                        if (colorStateList != null) {
                                            optionalButtonView2.h.setTextColor(colorStateList);
                                            return;
                                        }
                                        return;
                                    }
                                    ID2 id2 = AbstractC11495xe2.h;
                                    if (id2.equals(obj3)) {
                                        int h = propertyModel.h(id2);
                                        optionalButtonView2.p = h;
                                        optionalButtonView2.i.setColorFilter(h);
                                        return;
                                    }
                                    ID2 id22 = AbstractC11495xe2.i;
                                    if (!id22.equals(obj3)) {
                                        LD2 ld2 = AbstractC11495xe2.j;
                                        if (ld2.equals(obj3)) {
                                            if (propertyModel.j(ld2)) {
                                                int i6 = optionalButtonView2.r;
                                                if (i6 != 3 && i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    TransitionManager.endTransitions(optionalButtonView2.m);
                                                }
                                                propertyModel.k(ld2, false);
                                                return;
                                            }
                                            return;
                                        }
                                        JD2 jd27 = AbstractC11495xe2.k;
                                        if (jd27.equals(obj3)) {
                                            optionalButtonView2.A = (InterfaceC7913nB) propertyModel.i(jd27);
                                            return;
                                        }
                                        return;
                                    }
                                    optionalButtonView2.setPaddingRelative(propertyModel.h(id22), optionalButtonView2.getPaddingTop(), optionalButtonView2.getPaddingEnd(), optionalButtonView2.getPaddingBottom());
                                    return;
                                }
                                optionalButtonView2.m = (ViewGroup) propertyModel.i(jd25);
                                return;
                            }
                            optionalButtonView2.q = (Runnable) propertyModel.i(jd24);
                            return;
                        }
                        optionalButtonView2.z = (Callback) propertyModel.i(jd23);
                        return;
                    }
                    optionalButtonView2.y = (Callback) propertyModel.i(jd22);
                    return;
                }
                ListMenuButton listMenuButton2 = optionalButtonView2.j;
                if (listMenuButton2 != null) {
                    listMenuButton2.setEnabled(propertyModel.j(hd2));
                }
            }
        });
        this.a = new C11152we2(a);
        this.d = ku3;
    }
}
