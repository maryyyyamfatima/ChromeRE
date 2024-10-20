package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.chromium.base.SysUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;
import org.chromium.chrome.browser.tasks.tab_management.TabGroupUiToolbarView;
import org.chromium.chrome.browser.tasks.tab_management.TabListRecyclerView;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.chrome.browser.tasks.tab_management.j;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fv3 */
/* loaded from: classes.dex */
public final class C0759Fv3 implements InterfaceC7458ls {
    public final c a;
    public final C2318Rv3 g;
    public final UD2 h;
    public final ViewGroup i;
    public final C8385oa2 j;
    public j k;
    public final TabGridDialogView l;

    public C0759Fv3(Activity activity, InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager, InterfaceC10912vv3 interfaceC10912vv3, ViewGroup viewGroup, YC3 yc3, ZC3 zc3, C5860hC3 c5860hC3, InterfaceC0079Ap3 interfaceC0079Ap3, OX2 ox2, ViewGroup viewGroup2) {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.j = c8385oa2;
        TraceEvent i = TraceEvent.i("TabGridDialogCoordinator.constructor", null);
        try {
            String str = c5860hC3 == null ? "TabGridDialogFromStrip" : "TabGridDialogInSwitcher";
            PropertyModel propertyModel = new PropertyModel(AbstractC9204qw3.y);
            this.i = viewGroup2;
            TabGridDialogView tabGridDialogView = (TabGridDialogView) viewGroup.findViewById(R.id.dialog_parent_view);
            this.l = tabGridDialogView;
            if (tabGridDialogView == null) {
                LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02a9, viewGroup, true);
                TabGridDialogView tabGridDialogView2 = (TabGridDialogView) viewGroup.findViewById(R.id.dialog_parent_view);
                this.l = tabGridDialogView2;
                tabGridDialogView2.r = ox2;
            }
            C2318Rv3 c2318Rv3 = new C2318Rv3(activity, this, propertyModel, interfaceC10590uz3, interfaceC10912vv3, yc3, c5860hC3, interfaceC0079Ap3, new ViewOnClickListenerC1069If3(activity, this.l.m, null), str);
            this.g = c2318Rv3;
            int i2 = (AbstractC5177fD3.d(activity) && SysUtils.isLowEndDevice()) ? 3 : 0;
            Objects.requireNonNull(tabContentManager);
            c cVar = new c(i2, activity, interfaceC10590uz3, new C0369Cv3(tabContentManager), null, false, zc3, c2318Rv3.o, 1, null, null, viewGroup, false, str, viewGroup2);
            this.a = cVar;
            TabListRecyclerView tabListRecyclerView = cVar.g;
            TabGroupUiToolbarView tabGroupUiToolbarView = (TabGroupUiToolbarView) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0070, (ViewGroup) tabListRecyclerView, false);
            Context context = tabGroupUiToolbarView.getContext();
            tabGroupUiToolbarView.g.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0901be);
            ((ViewGroup.MarginLayoutParams) tabGroupUiToolbarView.l.getLayoutParams()).setMarginStart((int) context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807a0));
            tabGroupUiToolbarView.l.setGravity(8388627);
            tabGroupUiToolbarView.l.setTextAppearance(R.style.f101600_resource_name_obfuscated_res_0x7f1503dd);
            if (!AbstractC5177fD3.d(activity)) {
                tabGroupUiToolbarView.l.setFocusable(false);
                tabGroupUiToolbarView.l.setBackgroundColor(0);
                tabGroupUiToolbarView.m.removeView(tabGroupUiToolbarView.h);
            }
            this.h = UD2.a(propertyModel, new C9546rw3(tabGroupUiToolbarView, tabListRecyclerView, this.l), new TD2() { // from class: Dv3
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel2 = (PropertyModel) wd2;
                    C9546rw3 c9546rw3 = (C9546rw3) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = AbstractC9204qw3.a;
                    if (pd2 == fd2) {
                        c9546rw3.a.g.setOnClickListener((View.OnClickListener) propertyModel2.i(pd2));
                        return;
                    }
                    PD2 pd22 = AbstractC9204qw3.b;
                    if (pd22 == fd2) {
                        c9546rw3.a.a.setOnClickListener((View.OnClickListener) propertyModel2.i(pd22));
                        return;
                    }
                    PD2 pd23 = AbstractC9204qw3.c;
                    if (pd23 == fd2) {
                        TabGroupUiToolbarView tabGroupUiToolbarView2 = c9546rw3.a;
                        String str2 = (String) propertyModel2.i(pd23);
                        EditText editText = tabGroupUiToolbarView2.l;
                        if (editText == null) {
                            throw new IllegalStateException("Current Toolbar doesn't have a title text view");
                        }
                        editText.setText(str2);
                        return;
                    }
                    ND2 nd2 = AbstractC9204qw3.d;
                    if (nd2 == fd2) {
                        ((FrameLayout.LayoutParams) c9546rw3.b.getLayoutParams()).topMargin = propertyModel2.h(nd2);
                        c9546rw3.b.requestLayout();
                        return;
                    }
                    ND2 nd22 = AbstractC9204qw3.e;
                    if (nd22 == fd2) {
                        TabGroupUiToolbarView tabGroupUiToolbarView3 = c9546rw3.a;
                        int h = propertyModel2.h(nd22);
                        tabGroupUiToolbarView3.m.setBackgroundColor(h);
                        ChromeImageView chromeImageView = tabGroupUiToolbarView3.i;
                        if (chromeImageView != null && tabGroupUiToolbarView3.j != null) {
                            chromeImageView.setColorFilter(h, PorterDuff.Mode.SRC_IN);
                            tabGroupUiToolbarView3.j.setColorFilter(h, PorterDuff.Mode.SRC_IN);
                        }
                        c9546rw3.b.setBackgroundColor(propertyModel2.h(nd22));
                        return;
                    }
                    PD2 pd24 = AbstractC9204qw3.g;
                    if (pd24 == fd2) {
                        TabGroupUiToolbarView tabGroupUiToolbarView4 = c9546rw3.a;
                        ColorStateList colorStateList = (ColorStateList) propertyModel2.i(pd24);
                        tabGroupUiToolbarView4.g.setImageTintList(colorStateList);
                        tabGroupUiToolbarView4.a.setImageTintList(colorStateList);
                        EditText editText2 = tabGroupUiToolbarView4.l;
                        if (editText2 != null) {
                            editText2.setTextColor(colorStateList);
                        }
                        ChromeImageView chromeImageView2 = tabGroupUiToolbarView4.h;
                        if (chromeImageView2 != null) {
                            chromeImageView2.setImageTintList(colorStateList);
                            return;
                        }
                        return;
                    }
                    PD2 pd25 = AbstractC9204qw3.i;
                    if (pd25 == fd2) {
                        TabGridDialogView tabGridDialogView3 = c9546rw3.c;
                        Runnable runnable = (Runnable) propertyModel2.i(pd25);
                        tabGridDialogView3.getClass();
                        HashMap e = PropertyModel.e(UX2.m);
                        JD2 jd2 = UX2.c;
                        RelativeLayout relativeLayout = tabGridDialogView3.p;
                        GD2 gd2 = new GD2();
                        gd2.a = relativeLayout;
                        e.put(jd2, gd2);
                        HD2 hd2 = UX2.d;
                        AD2 ad2 = new AD2();
                        ad2.a = false;
                        e.put(hd2, ad2);
                        HD2 hd22 = UX2.b;
                        AD2 ad22 = new AD2();
                        ad22.a = true;
                        e.put(hd22, ad22);
                        ID2 id2 = UX2.a;
                        DD2 dd2 = new DD2();
                        dd2.a = 0;
                        e.put(id2, dd2);
                        JD2 jd22 = UX2.f;
                        GD2 gd22 = new GD2();
                        gd22.a = runnable;
                        e.put(jd22, gd22);
                        LD2 ld2 = UX2.k;
                        AD2 ad23 = new AD2();
                        ad23.a = true;
                        e.put(ld2, ad23);
                        tabGridDialogView3.q = new PropertyModel(e);
                        return;
                    }
                    LD2 ld22 = AbstractC9204qw3.h;
                    if (ld22 == fd2) {
                        if (!propertyModel2.j(ld22)) {
                            TabGridDialogView tabGridDialogView4 = c9546rw3.c;
                            if (tabGridDialogView4.getVisibility() != 0) {
                                return;
                            }
                            Animator animator = tabGridDialogView4.u;
                            if (animator != null && animator != tabGridDialogView4.B) {
                                animator.end();
                            }
                            tabGridDialogView4.u = tabGridDialogView4.B;
                            OX2 ox22 = tabGridDialogView4.r;
                            if (ox22.b.f != null) {
                                ox22.a(true);
                            }
                            tabGridDialogView4.B.start();
                            return;
                        }
                        TabGridDialogView tabGridDialogView5 = c9546rw3.c;
                        tabGridDialogView5.p.removeAllViews();
                        tabGridDialogView5.p.addView(c9546rw3.a);
                        RelativeLayout relativeLayout2 = tabGridDialogView5.p;
                        RecyclerView recyclerView = c9546rw3.b;
                        relativeLayout2.addView(recyclerView);
                        tabGridDialogView5.p.addView(tabGridDialogView5.l);
                        tabGridDialogView5.p.addView(tabGridDialogView5.m);
                        ((RelativeLayout.LayoutParams) recyclerView.getLayoutParams()).setMargins(0, tabGridDialogView5.g, 0, 0);
                        recyclerView.setVisibility(0);
                        TabGridDialogView tabGridDialogView6 = c9546rw3.c;
                        Animator animator2 = tabGridDialogView6.u;
                        if (animator2 != null && animator2 != tabGridDialogView6.A) {
                            animator2.end();
                        }
                        tabGridDialogView6.u = tabGridDialogView6.A;
                        tabGridDialogView6.r.b(tabGridDialogView6.q);
                        tabGridDialogView6.setVisibility(0);
                        tabGridDialogView6.A.start();
                        return;
                    }
                    PD2 pd26 = AbstractC9204qw3.j;
                    if (pd26 != fd2) {
                        ND2 nd23 = AbstractC9204qw3.k;
                        if (nd23 == fd2) {
                            TabGridDialogView tabGridDialogView7 = c9546rw3.c;
                            int h2 = propertyModel2.h(nd23);
                            if (h2 == tabGridDialogView7.K) {
                                return;
                            }
                            if (h2 == 0) {
                                tabGridDialogView7.b(false);
                                if (tabGridDialogView7.K == 1) {
                                    tabGridDialogView7.y.start();
                                }
                            } else if (h2 == 1) {
                                tabGridDialogView7.z.start();
                            } else if (h2 == 2) {
                                tabGridDialogView7.b(true);
                                if (tabGridDialogView7.K == 1) {
                                    tabGridDialogView7.y.start();
                                }
                            }
                            tabGridDialogView7.K = h2;
                            return;
                        }
                        ND2 nd24 = AbstractC9204qw3.f;
                        if (nd24 == fd2) {
                            if (c9546rw3.c != null) {
                                int h3 = propertyModel2.h(nd24);
                                TabGridDialogView tabGridDialogView8 = c9546rw3.c;
                                tabGridDialogView8.p.getBackground().setTint(h3);
                                tabGridDialogView8.i.getBackground().setTint(h3);
                                c9546rw3.a.getBackground().setTint(h3);
                                return;
                            }
                            return;
                        }
                        ND2 nd25 = AbstractC9204qw3.l;
                        if (nd25 == fd2) {
                            TabGridDialogView tabGridDialogView9 = c9546rw3.c;
                            if (tabGridDialogView9 != null) {
                                tabGridDialogView9.L = propertyModel2.h(nd25);
                                return;
                            }
                            return;
                        }
                        ND2 nd26 = AbstractC9204qw3.m;
                        if (nd26 == fd2) {
                            TabGridDialogView tabGridDialogView10 = c9546rw3.c;
                            if (tabGridDialogView10 != null) {
                                tabGridDialogView10.M = propertyModel2.h(nd26);
                                return;
                            }
                            return;
                        }
                        ND2 nd27 = AbstractC9204qw3.n;
                        if (nd27 == fd2) {
                            TabGridDialogView tabGridDialogView11 = c9546rw3.c;
                            if (tabGridDialogView11 != null) {
                                tabGridDialogView11.N = propertyModel2.h(nd27);
                                return;
                            }
                            return;
                        }
                        ND2 nd28 = AbstractC9204qw3.o;
                        if (nd28 == fd2) {
                            TabGridDialogView tabGridDialogView12 = c9546rw3.c;
                            if (tabGridDialogView12 != null) {
                                tabGridDialogView12.O = propertyModel2.h(nd28);
                                return;
                            }
                            return;
                        }
                        PD2 pd27 = AbstractC9204qw3.p;
                        if (pd27 == fd2) {
                            ((LinearLayoutManager) c9546rw3.b.s).i1(((Integer) propertyModel2.i(pd27)).intValue(), 0);
                            return;
                        }
                        if (AbstractC9204qw3.q == fd2) {
                            c9546rw3.b.setVisibility(0);
                            return;
                        }
                        PD2 pd28 = AbstractC9204qw3.r;
                        if (pd28 == fd2) {
                            c9546rw3.a.h.setOnClickListener((View.OnClickListener) propertyModel2.i(pd28));
                            return;
                        }
                        PD2 pd29 = AbstractC9204qw3.s;
                        if (pd29 == fd2) {
                            c9546rw3.a.l.addTextChangedListener((TextWatcher) propertyModel2.i(pd29));
                            return;
                        }
                        PD2 pd210 = AbstractC9204qw3.t;
                        if (pd210 == fd2) {
                            c9546rw3.a.l.setOnFocusChangeListener((View.OnFocusChangeListener) propertyModel2.i(pd210));
                            return;
                        }
                        LD2 ld23 = AbstractC9204qw3.u;
                        if (ld23 == fd2) {
                            c9546rw3.a.l.setCursorVisible(propertyModel2.j(ld23));
                            return;
                        }
                        LD2 ld24 = AbstractC9204qw3.v;
                        if (ld24 == fd2) {
                            if (!AbstractC5177fD3.c()) {
                                if (propertyModel2.j(ld24)) {
                                    return;
                                }
                                c9546rw3.a.l.clearFocus();
                                return;
                            }
                            TabGroupUiToolbarView tabGroupUiToolbarView5 = c9546rw3.a;
                            boolean j = propertyModel2.j(ld24);
                            tabGroupUiToolbarView5.getClass();
                            if (AbstractC5177fD3.c() && tabGroupUiToolbarView5.l.isFocused() != j) {
                                if (j) {
                                    tabGroupUiToolbarView5.l.requestFocus();
                                    return;
                                } else {
                                    tabGroupUiToolbarView5.l.clearFocus();
                                    return;
                                }
                            }
                            return;
                        }
                        LD2 ld25 = AbstractC9204qw3.w;
                        if (ld25 != fd2) {
                            PD2 pd211 = AbstractC9204qw3.x;
                            if (pd211 == fd2 && AbstractC5177fD3.c()) {
                                c9546rw3.a.g.setContentDescription((String) propertyModel2.i(pd211));
                                return;
                            }
                            return;
                        }
                        if (!AbstractC5177fD3.c()) {
                            if (propertyModel2.j(ld25)) {
                                return;
                            }
                            TabGroupUiToolbarView tabGroupUiToolbarView6 = c9546rw3.a;
                            tabGroupUiToolbarView6.getClass();
                            C11939yv1.g.d(tabGroupUiToolbarView6);
                            return;
                        }
                        TabGroupUiToolbarView tabGroupUiToolbarView7 = c9546rw3.a;
                        boolean j2 = propertyModel2.j(ld25);
                        tabGroupUiToolbarView7.getClass();
                        if (AbstractC5177fD3.c()) {
                            if (j2) {
                                tabGroupUiToolbarView7.postDelayed(new RunnableC5430fx3(tabGroupUiToolbarView7, C11939yv1.g), 150);
                                return;
                            } else {
                                C11939yv1.g.d(tabGroupUiToolbarView7);
                                return;
                            }
                        }
                        return;
                    }
                    TabGridDialogView tabGridDialogView13 = c9546rw3.c;
                    View view = (View) propertyModel2.i(pd26);
                    if (view == null) {
                        tabGridDialogView13.getClass();
                        AnimatorSet animatorSet = new AnimatorSet();
                        tabGridDialogView13.A = animatorSet;
                        animatorSet.play(tabGridDialogView13.w);
                        tabGridDialogView13.A.removeAllListeners();
                        tabGridDialogView13.A.addListener(tabGridDialogView13.C);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        tabGridDialogView13.B = animatorSet2;
                        animatorSet2.play(tabGridDialogView13.x);
                        tabGridDialogView13.B.removeAllListeners();
                        tabGridDialogView13.B.addListener(tabGridDialogView13.D);
                        return;
                    }
                    tabGridDialogView13.k = view;
                    Rect rect = new Rect();
                    tabGridDialogView13.k.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    tabGridDialogView13.n.getGlobalVisibleRect(rect2);
                    rect.offset(0, -rect2.top);
                    View view2 = tabGridDialogView13.k;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tabGridDialogView13.j.getLayoutParams();
                    layoutParams.width = view2.getWidth();
                    layoutParams.height = view2.getHeight();
                    if (view2.findViewById(R.id.tab_title) != null) {
                        tabGridDialogView13.j.findViewById(R.id.card_view).setBackground(view2.findViewById(R.id.card_view).getBackground());
                        ImageView imageView = (ImageView) view2.findViewById(R.id.tab_favicon);
                        ImageView imageView2 = (ImageView) tabGridDialogView13.j.findViewById(R.id.tab_favicon);
                        if (imageView.getDrawable() != null) {
                            int dimension = (int) tabGridDialogView13.a.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080782);
                            imageView2.setPadding(dimension, dimension, dimension, dimension);
                            imageView2.setImageDrawable(imageView.getDrawable());
                        } else {
                            imageView2.setImageDrawable(null);
                        }
                        ((TextView) tabGridDialogView13.j.findViewById(R.id.tab_title)).setText(((TextView) view2.findViewById(R.id.tab_title)).getText());
                        AbstractC9771sd.i(R.style.f102870_resource_name_obfuscated_res_0x7f15045c, (TextView) tabGridDialogView13.j.findViewById(R.id.tab_title));
                        ((TextView) tabGridDialogView13.j.findViewById(R.id.tab_title)).setTextColor(((TextView) view2.findViewById(R.id.tab_title)).getTextColors());
                        ((ImageView) tabGridDialogView13.j.findViewById(R.id.tab_thumbnail)).setImageDrawable(((ImageView) view2.findViewById(R.id.tab_thumbnail)).getDrawable());
                        ImageView imageView3 = (ImageView) tabGridDialogView13.j.findViewById(R.id.action_button);
                        imageView3.setImageDrawable(((ImageView) view2.findViewById(R.id.action_button)).getDrawable());
                        imageView3.setImageTintList(((ImageView) view2.findViewById(R.id.action_button)).getImageTintList());
                        tabGridDialogView13.j.findViewById(R.id.divider_view).setBackgroundColor(((ColorDrawable) view2.findViewById(R.id.divider_view).getBackground()).getColor());
                        tabGridDialogView13.j.findViewById(R.id.background_view).setBackground(null);
                    }
                    int i3 = tabGridDialogView13.I - (tabGridDialogView13.G * 2);
                    int i4 = tabGridDialogView13.f11529J - (tabGridDialogView13.F * 2);
                    float f = rect.left;
                    float f2 = tabGridDialogView13.h;
                    float f3 = f + f2;
                    float f4 = rect.top + f2;
                    float f5 = f2 * 2.0f;
                    float height = rect.height() - f5;
                    float width = rect.width() - f5;
                    float f6 = -((((i3 / 2) + tabGridDialogView13.G) - (height / 2.0f)) - f4);
                    float f7 = -((((i4 / 2) + tabGridDialogView13.F) - (width / 2.0f)) - f3);
                    float f8 = i3;
                    float f9 = height / f8;
                    float f10 = i4;
                    float f11 = width / f10;
                    float width2 = tabGridDialogView13.H == 1 ? f10 / rect.width() : f8 / rect.height();
                    float f12 = (width2 - 1.0f) / 2.0f;
                    float f13 = (f12 * height) + tabGridDialogView13.G;
                    float f14 = (f12 * width) + tabGridDialogView13.F;
                    float f15 = f4 - f2;
                    float f16 = f3 - f2;
                    float f17 = f6 - ((height - (f8 * f11)) / 2.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.TRANSLATION_Y, f15, f13);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.TRANSLATION_X, f16, f14);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.SCALE_X, 1.0f, width2);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.SCALE_Y, 1.0f, width2);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.setDuration(300L);
                    HH0 hh0 = AbstractC8142nr1.e;
                    animatorSet3.setInterpolator(hh0);
                    animatorSet3.play(ofFloat).with(ofFloat2).with(ofFloat4).with(ofFloat3);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat5.setDuration(150L);
                    LinearInterpolator linearInterpolator = AbstractC8142nr1.f;
                    ofFloat5.setInterpolator(linearInterpolator);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, f17, 0.0f);
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.TRANSLATION_X, f7, 0.0f);
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.SCALE_Y, f11, 1.0f);
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.SCALE_X, f11, 1.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    float f18 = width2;
                    animatorSet4.setDuration(300L);
                    animatorSet4.setInterpolator(hh0);
                    animatorSet4.play(ofFloat6).with(ofFloat7).with(ofFloat8).with(ofFloat9);
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat10.setDuration(150L);
                    ofFloat10.setStartDelay(150L);
                    ofFloat10.setInterpolator(linearInterpolator);
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.TRANSLATION_Y, f6, 0.0f);
                    ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.TRANSLATION_X, f7, 0.0f);
                    ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.SCALE_Y, f9, 1.0f);
                    ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.SCALE_X, f11, 1.0f);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.setDuration(300L);
                    animatorSet5.setInterpolator(hh0);
                    animatorSet5.play(ofFloat11).with(ofFloat12).with(ofFloat13).with(ofFloat14);
                    ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(tabGridDialogView13.k, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat15.setDuration(50L);
                    animatorSet4.addListener(new C6112hw3(tabGridDialogView13));
                    ofFloat10.addListener(new C6454iw3(tabGridDialogView13));
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    tabGridDialogView13.A = animatorSet6;
                    animatorSet6.play(animatorSet3).with(ofFloat5).with(animatorSet5).with(animatorSet4).with(ofFloat10).with(ofFloat15);
                    tabGridDialogView13.A.addListener(tabGridDialogView13.C);
                    ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, 0.0f, f17);
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.TRANSLATION_X, 0.0f, f7);
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.SCALE_Y, 1.0f, f11);
                    ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.SCALE_X, 1.0f, f11);
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    animatorSet7.play(ofFloat16).with(ofFloat17).with(ofFloat18).with(ofFloat19);
                    animatorSet7.setDuration(300L);
                    animatorSet7.setInterpolator(hh0);
                    animatorSet7.addListener(new C6798jw3(tabGridDialogView13));
                    ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(tabGridDialogView13.p, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat20.setDuration(150L);
                    ofFloat20.setInterpolator(linearInterpolator);
                    ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.TRANSLATION_Y, f13, f15);
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.TRANSLATION_X, f14, f16);
                    ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.SCALE_X, f18, 1.0f);
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.SCALE_Y, f18, 1.0f);
                    AnimatorSet animatorSet8 = new AnimatorSet();
                    animatorSet8.play(ofFloat21).with(ofFloat22).with(ofFloat23).with(ofFloat24);
                    animatorSet8.setDuration(300L);
                    animatorSet8.setInterpolator(hh0);
                    ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(tabGridDialogView13.j, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat25.setDuration(150L);
                    ofFloat25.setStartDelay(150L);
                    ofFloat25.setInterpolator(linearInterpolator);
                    ofFloat25.addListener(new C7142kw3(tabGridDialogView13));
                    ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f6);
                    ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f7);
                    ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.SCALE_Y, 1.0f, f9);
                    ObjectAnimator ofFloat29 = ObjectAnimator.ofFloat(tabGridDialogView13.i, (Property<View, Float>) View.SCALE_X, 1.0f, f11);
                    AnimatorSet animatorSet9 = new AnimatorSet();
                    animatorSet9.play(ofFloat26).with(ofFloat27).with(ofFloat28).with(ofFloat29);
                    animatorSet9.setDuration(300L);
                    animatorSet9.setInterpolator(hh0);
                    animatorSet9.addListener(new C4050bw3(tabGridDialogView13));
                    ObjectAnimator ofFloat30 = ObjectAnimator.ofFloat(tabGridDialogView13.k, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat30.setDuration(50L);
                    ofFloat30.setStartDelay(250L);
                    AnimatorSet animatorSet10 = new AnimatorSet();
                    tabGridDialogView13.B = animatorSet10;
                    animatorSet10.play(animatorSet7).with(ofFloat20).with(animatorSet9).with(animatorSet8).with(ofFloat25).with(ofFloat30);
                    tabGridDialogView13.B.addListener(tabGridDialogView13.D);
                }
            });
            c8385oa2.p(Boolean.valueOf(c()));
            propertyModel.a(new VD2() { // from class: Ev3
                @Override // defpackage.VD2
                public final void d(WD2 wd2, Object obj) {
                    C0759Fv3 c0759Fv3 = C0759Fv3.this;
                    c0759Fv3.j.p(Boolean.valueOf(c0759Fv3.c()));
                }
            });
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void a() {
        this.a.onDestroy();
        C2318Rv3 c2318Rv3 = this.g;
        C1668Mv3 c1668Mv3 = c2318Rv3.j;
        InterfaceC10590uz3 interfaceC10590uz3 = c2318Rv3.h;
        if (c1668Mv3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).c.f(c1668Mv3);
        }
        ((AbstractC11276wz3) interfaceC10590uz3).s(c2318Rv3.i);
        C11939yv1.g.h(c2318Rv3.u);
        this.h.b();
        j jVar = this.k;
        if (jVar != null) {
            jVar.a();
        }
    }

    public final void d(List list) {
        c cVar = this.a;
        cVar.getClass();
        cVar.k(IE2.d(list), false, false);
        C2318Rv3 c2318Rv3 = this.g;
        InterfaceC10590uz3 interfaceC10590uz3 = c2318Rv3.h;
        if (list == null) {
            c2318Rv3.v = -1;
        } else {
            AbstractC7158kz3 d = ((AbstractC11276wz3) interfaceC10590uz3).c.d();
            c2318Rv3.v = d.getTabAt(d.s((Tab) list.get(0))).getId();
        }
        int i = c2318Rv3.v;
        LD2 ld2 = AbstractC9204qw3.h;
        PropertyModel propertyModel = c2318Rv3.g;
        if (i != -1) {
            PD2 pd2 = AbstractC9204qw3.j;
            C5860hC3 c5860hC3 = c2318Rv3.n;
            if (c5860hC3 == null) {
                propertyModel.o(pd2, null);
            } else {
                c cVar2 = c5860hC3.a.j;
                d G = cVar2.g.G(cVar2.a.e.G(i));
                propertyModel.o(pd2, G != null ? G.a : null);
            }
            c2318Rv3.i();
            int i2 = c2318Rv3.v;
            int i3 = ((AbstractC11276wz3) interfaceC10590uz3).i();
            PD2 pd22 = AbstractC9204qw3.p;
            if (i2 != i3) {
                propertyModel.o(pd22, 0);
            } else {
                propertyModel.o(pd22, Integer.valueOf(Math.max(c2318Rv3.c(c2318Rv3.v).indexOf(r1.m(c2318Rv3.v)) - 2, 0)));
            }
            propertyModel.o(AbstractC9204qw3.i, c2318Rv3.q);
            c cVar3 = c2318Rv3.l.a;
            ViewOnLayoutChangeListenerC2588Tx3 viewOnLayoutChangeListenerC2588Tx3 = cVar3.q;
            if (viewOnLayoutChangeListenerC2588Tx3 != null) {
                cVar3.g.addOnLayoutChangeListener(viewOnLayoutChangeListenerC2588Tx3);
            }
            propertyModel.k(ld2, true);
            return;
        }
        propertyModel.k(ld2, false);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.g.e(true);
        FI2.a("TabGridDialog.Exit");
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.j;
    }

    public final boolean c() {
        return this.g.g.j(AbstractC9204qw3.h);
    }

    public final void b(Context context, InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager, C10242ty3 c10242ty3) {
        GA3 ga3;
        TraceEvent i = TraceEvent.i("TabGridDialogCoordinator.initWithNative", null);
        try {
            if (AbstractC5177fD3.d(context)) {
                j jVar = new j(context, (ViewGroup) this.l.findViewById(R.id.dialog_container_view), interfaceC10590uz3, tabContentManager, SysUtils.isLowEndDevice() ? 3 : 0, this.i);
                this.k = jVar;
                ga3 = jVar.e;
            } else {
                this.k = null;
                ga3 = null;
            }
            this.g.f(ga3, c10242ty3);
            this.a.d(null);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
