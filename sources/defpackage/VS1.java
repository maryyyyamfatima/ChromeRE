package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VS1 implements TD2 {
    public boolean a;

    @Override // defpackage.TD2
    /* renamed from: a */
    public final void d(PropertyModel propertyModel, MenuButton menuButton, FD2 fd2) {
        AnimatorSet animatorSet;
        MD2 md2 = TS1.a;
        if (fd2 == md2) {
            menuButton.setAlpha(propertyModel.g(md2));
            return;
        }
        PD2 pd2 = TS1.b;
        if (fd2 == pd2) {
            InterfaceViewOnTouchListenerC0040Ai interfaceViewOnTouchListenerC0040Ai = (InterfaceViewOnTouchListenerC0040Ai) propertyModel.i(pd2);
            menuButton.i = interfaceViewOnTouchListenerC0040Ai;
            menuButton.a.setOnTouchListener(interfaceViewOnTouchListenerC0040Ai);
            ImageButton imageButton = menuButton.a;
            C0170Bi c0170Bi = (C0170Bi) menuButton.i;
            c0170Bi.getClass();
            imageButton.setAccessibilityDelegate(c0170Bi);
            return;
        }
        PD2 pd22 = TS1.c;
        if (fd2 != pd22) {
            LD2 ld2 = TS1.d;
            if (fd2 == ld2) {
                menuButton.setClickable(propertyModel.j(ld2));
                return;
            }
            LD2 ld22 = TS1.e;
            if (fd2 != ld22) {
                LD2 ld23 = TS1.f;
                if (fd2 == ld23) {
                    menuButton.setVisibility(propertyModel.j(ld23) ? 0 : 8);
                    return;
                }
                PD2 pd23 = TS1.g;
                if (fd2 == pd23) {
                    if (this.a) {
                        return;
                    }
                    menuButton.q = (InterfaceC0079Ap3) propertyModel.i(pd23);
                    this.a = true;
                    return;
                }
                PD2 pd24 = TS1.h;
                if (fd2 == pd24) {
                    d(propertyModel, menuButton, pd23);
                    RS1 rs1 = (RS1) propertyModel.i(pd24);
                    boolean z = rs1.a;
                    boolean z2 = rs1.b;
                    if (z) {
                        if (menuButton.g == null || menuButton.a == null) {
                            return;
                        }
                        menuButton.a();
                        if (!z2 || menuButton.n) {
                            ImageView imageView = menuButton.g;
                            if (imageView == null) {
                                return;
                            }
                            imageView.setVisibility(0);
                            menuButton.a();
                            return;
                        }
                        menuButton.g.setAlpha(0.0f);
                        menuButton.g.setVisibility(0);
                        ImageButton imageButton2 = menuButton.a;
                        ImageView imageView2 = menuButton.g;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.ALPHA, 1.0f);
                        ofFloat.setInterpolator(InterpolatorC0485Dt.e);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.TRANSLATION_Y, imageView2.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0804c9), 0.0f);
                        ofFloat2.setInterpolator(InterpolatorC0485Dt.c);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageButton2, (Property<ImageButton, Float>) View.ALPHA, 0.0f);
                        ofFloat3.setInterpolator(AbstractC8142nr1.f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
                        animatorSet2.setDuration(350L);
                        animatorSet2.addListener(new FS1(imageButton2, imageView2));
                        menuButton.m = animatorSet2;
                        animatorSet2.addListener(new DS1(menuButton));
                        menuButton.m.start();
                        return;
                    }
                    ImageView imageView3 = menuButton.g;
                    if (imageView3 != null) {
                        if (imageView3 != null && imageView3.getVisibility() == 0) {
                            if (!z2) {
                                ImageView imageView4 = menuButton.g;
                                if (imageView4 == null) {
                                    return;
                                }
                                imageView4.setVisibility(8);
                                return;
                            }
                            if (menuButton.n && (animatorSet = menuButton.m) != null) {
                                animatorSet.cancel();
                            }
                            menuButton.a.setAlpha(0.0f);
                            ImageButton imageButton3 = menuButton.a;
                            ImageView imageView5 = menuButton.g;
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView5, (Property<ImageView, Float>) View.ALPHA, 0.0f);
                            ofFloat4.setInterpolator(InterpolatorC0485Dt.d);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageButton3, (Property<ImageButton, Float>) View.ALPHA, 1.0f);
                            ofFloat5.setInterpolator(InterpolatorC0485Dt.e);
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            animatorSet3.playTogether(ofFloat4, ofFloat5);
                            animatorSet3.setDuration(200L);
                            animatorSet3.addListener(new GS1(imageView5, imageButton3));
                            menuButton.m = animatorSet3;
                            animatorSet3.addListener(new ES1(menuButton));
                            menuButton.m.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                PD2 pd25 = TS1.i;
                if (fd2 == pd25) {
                    d(propertyModel, menuButton, pd23);
                    SS1 ss1 = (SS1) propertyModel.i(pd25);
                    menuButton.c(ss1.b, ss1.a);
                    return;
                } else {
                    MD2 md22 = TS1.j;
                    if (fd2 == md22) {
                        menuButton.setTranslationX(propertyModel.g(md22));
                        return;
                    }
                    return;
                }
            }
            menuButton.j = propertyModel.j(ld22);
            menuButton.b();
            return;
        }
        menuButton.a.setContentDescription((String) propertyModel.i(pd22));
    }
}
