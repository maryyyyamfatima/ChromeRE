package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.ViewResourceFrameLayout;
import org.chromium.components.browser_ui.widget.text.TextViewWithCompoundDrawables;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xa2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2992Xa2 {
    public final Context a;
    public final C6732jl3 b;
    public final Handler c;
    public C1562Ma2 d;
    public InterfaceC7697ma2 e;
    public final InterfaceC0079Ap3 f;
    public C2602Ua2 g;
    public final RunnableC2212Ra2 h;
    public final RunnableC2472Ta2 i;
    public final RunnableC2342Sa2 j;
    public Runnable k;
    public final RunnableC2732Va2 l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final C3923bb2 q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [Qa2] */
    /* JADX WARN: Type inference failed for: r3v10, types: [Ua2, org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r3v11, types: [Va2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Ra2] */
    /* JADX WARN: Type inference failed for: r3v8, types: [Sa2] */
    /* JADX WARN: Type inference failed for: r3v9, types: [Ta2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Pa2] */
    public C2992Xa2(a aVar, C6732jl3 c6732jl3, C8385oa2 c8385oa2, InterfaceC0079Ap3 interfaceC0079Ap3) {
        if (AX.e().g("force-online-connection-state-for-indicator")) {
            return;
        }
        this.a = aVar;
        this.b = c6732jl3;
        this.c = new Handler();
        this.q = new C3923bb2();
        this.m = SystemClock.elapsedRealtime() - 5000;
        C1562Ma2 c1562Ma2 = new C1562Ma2(new Callback() { // from class: Pa2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2992Xa2 c2992Xa2 = C2992Xa2.this;
                c2992Xa2.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (c2992Xa2.o && c2992Xa2.n == booleanValue) {
                    return;
                }
                Handler handler = c2992Xa2.c;
                RunnableC2732Va2 runnableC2732Va2 = c2992Xa2.l;
                handler.removeCallbacks(runnableC2732Va2);
                long elapsedRealtime = SystemClock.elapsedRealtime() - c2992Xa2.m;
                if (elapsedRealtime < 5000) {
                    handler.postDelayed(runnableC2732Va2, 5000 - elapsedRealtime);
                } else {
                    c2992Xa2.b(booleanValue);
                }
            }
        }, new Callback() { // from class: Qa2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2992Xa2 c2992Xa2 = C2992Xa2.this;
                c2992Xa2.getClass();
                c2992Xa2.a(((Boolean) obj).booleanValue());
            }
        });
        this.d = c1562Ma2;
        a(c1562Ma2.o == 1);
        this.h = new Runnable() { // from class: Ra2
            /* JADX WARN: Type inference failed for: r1v3, types: [nl3] */
            @Override // java.lang.Runnable
            public final void run() {
                C2992Xa2 c2992Xa2 = C2992Xa2.this;
                c2992Xa2.getClass();
                FI2.a("OfflineIndicator.Shown");
                C3923bb2 c3923bb2 = c2992Xa2.q;
                if (!c3923bb2.a) {
                    Q83 q83 = O83.a;
                    long currentTimeMillis = System.currentTimeMillis();
                    c3923bb2.a = true;
                    c3923bb2.c = currentTimeMillis;
                    q83.s(currentTimeMillis, "Chrome.OfflineIndicatorV2.WallTimeShownMs");
                    c3923bb2.d = currentTimeMillis;
                    q83.s(currentTimeMillis, "Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
                }
                c2992Xa2.m = SystemClock.elapsedRealtime();
                Context context = c2992Xa2.a;
                final int color = context.getColor(R.color.f25510_resource_name_obfuscated_res_0x7f070805);
                final int color2 = context.getColor(R.color.f18090_resource_name_obfuscated_res_0x7f070141);
                final Drawable drawable = context.getDrawable(R.drawable.f47200_resource_name_obfuscated_res_0x7f0901dc);
                final int color3 = context.getColor(R.color.f17810_resource_name_obfuscated_res_0x7f070121);
                final String string = context.getString(R.string.f78890_resource_name_obfuscated_res_0x7f140713);
                final C6732jl3 c6732jl32 = c2992Xa2.b;
                if (c6732jl32.c) {
                    return;
                }
                c6732jl32.c = true;
                boolean z = c6732jl32.k;
                final ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = c6732jl32.a;
                if (!z) {
                    final ViewResourceFrameLayout viewResourceFrameLayout = (ViewResourceFrameLayout) ((ViewStub) c6732jl32.i.findViewById(R.id.status_indicator_stub)).inflate();
                    int id = viewResourceFrameLayout.getId();
                    c6732jl32.e = id;
                    C0319Cl3 c0319Cl3 = c6732jl32.b;
                    c0319Cl3.h = id;
                    c6732jl32.f = viewResourceFrameLayout.g;
                    Callback callback = new Callback() { // from class: cl3
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C6732jl3 c6732jl33 = C6732jl3.this;
                            c6732jl33.f.f(null);
                            c6732jl33.j.onResult((Runnable) obj);
                        }
                    };
                    HashMap e = PropertyModel.e(AbstractC0189Bl3.j);
                    ND2 nd2 = AbstractC0189Bl3.c;
                    DD2 dd2 = new DD2();
                    dd2.a = 8;
                    e.put(nd2, dd2);
                    LD2 ld2 = AbstractC0189Bl3.d;
                    AD2 ad2 = new AD2();
                    ad2.a = false;
                    e.put(ld2, ad2);
                    PropertyModel propertyModel = new PropertyModel(e);
                    UD2.a(propertyModel, new C0449Dl3(viewResourceFrameLayout, c0319Cl3), new TD2() { // from class: dl3
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj, Object obj2) {
                            PropertyModel propertyModel2 = (PropertyModel) wd2;
                            C0449Dl3 c0449Dl3 = (C0449Dl3) obj;
                            FD2 fd2 = (FD2) obj2;
                            PD2 pd2 = AbstractC0189Bl3.a;
                            if (pd2 == fd2) {
                                ((TextView) c0449Dl3.a.findViewById(R.id.status_text)).setText((CharSequence) propertyModel2.i(pd2));
                                return;
                            }
                            PD2 pd22 = AbstractC0189Bl3.b;
                            if (pd22 == fd2) {
                                ((TextView) c0449Dl3.a.findViewById(R.id.status_text)).setCompoundDrawablesRelative((Drawable) propertyModel2.i(pd22), null, null, null);
                                return;
                            }
                            LD2 ld22 = AbstractC0189Bl3.d;
                            if (ld22 == fd2) {
                                c0449Dl3.b.j = propertyModel2.j(ld22);
                                return;
                            }
                            ND2 nd22 = AbstractC0189Bl3.c;
                            if (nd22 == fd2) {
                                c0449Dl3.a.setVisibility(propertyModel2.h(nd22));
                                return;
                            }
                            ND2 nd23 = AbstractC0189Bl3.e;
                            if (nd23 == fd2) {
                                c0449Dl3.a.setBackgroundColor(propertyModel2.h(nd23));
                                return;
                            }
                            MD2 md2 = AbstractC0189Bl3.f;
                            if (md2 == fd2) {
                                c0449Dl3.a.findViewById(R.id.status_text).setAlpha(propertyModel2.g(md2));
                                return;
                            }
                            ND2 nd24 = AbstractC0189Bl3.g;
                            if (nd24 == fd2) {
                                ((TextView) c0449Dl3.a.findViewById(R.id.status_text)).setTextColor(propertyModel2.h(nd24));
                                return;
                            }
                            ND2 nd25 = AbstractC0189Bl3.h;
                            if (nd25 == fd2) {
                                TextViewWithCompoundDrawables textViewWithCompoundDrawables = (TextViewWithCompoundDrawables) c0449Dl3.a.findViewById(R.id.status_text);
                                textViewWithCompoundDrawables.m = ColorStateList.valueOf(propertyModel2.h(nd25));
                                textViewWithCompoundDrawables.h(textViewWithCompoundDrawables.getCompoundDrawablesRelative());
                            } else {
                                if (AbstractC0189Bl3.i == fd2) {
                                    c0449Dl3.a.setTranslationY(propertyModel2.h(r0) - c0449Dl3.a.getHeight());
                                }
                            }
                        }
                    });
                    Runnable runnable = new Runnable() { // from class: el3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6732jl3 c6732jl33 = C6732jl3.this;
                            if (c6732jl33.h) {
                                return;
                            }
                            c6732jl33.g.a().d(c6732jl33.e, c6732jl33.f);
                            c6732jl33.h = true;
                        }
                    };
                    Runnable runnable2 = new Runnable() { // from class: fl3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6732jl3 c6732jl33 = C6732jl3.this;
                            if (c6732jl33.h) {
                                c6732jl33.f.j.b();
                                c6732jl33.g.a().e(c6732jl33.e);
                                c6732jl33.h = false;
                            }
                        }
                    };
                    Runnable runnable3 = new Runnable() { // from class: gl3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewResourceFrameLayout.this.requestLayout();
                        }
                    };
                    viewOnLayoutChangeListenerC0059Al3.a = propertyModel;
                    viewOnLayoutChangeListenerC0059Al3.k = runnable;
                    viewOnLayoutChangeListenerC0059Al3.l = runnable2;
                    viewOnLayoutChangeListenerC0059Al3.n = callback;
                    viewOnLayoutChangeListenerC0059Al3.o = runnable3;
                    viewResourceFrameLayout.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0059Al3);
                    c6732jl32.d = new RunnableC6046hl3(c6732jl32, viewResourceFrameLayout);
                    c6732jl32.k = true;
                }
                viewOnLayoutChangeListenerC0059Al3.k.run();
                viewOnLayoutChangeListenerC0059Al3.v = false;
                viewOnLayoutChangeListenerC0059Al3.u = 0;
                ?? r1 = new Runnable() { // from class: nl3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al32 = ViewOnLayoutChangeListenerC0059Al3.this;
                        viewOnLayoutChangeListenerC0059Al32.a.o(AbstractC0189Bl3.a, string);
                        viewOnLayoutChangeListenerC0059Al32.a.o(AbstractC0189Bl3.b, drawable);
                        viewOnLayoutChangeListenerC0059Al32.a.l(AbstractC0189Bl3.f, 0.0f);
                        viewOnLayoutChangeListenerC0059Al32.a.m(AbstractC0189Bl3.e, color);
                        viewOnLayoutChangeListenerC0059Al32.a.m(AbstractC0189Bl3.g, color2);
                        viewOnLayoutChangeListenerC0059Al32.a.m(AbstractC0189Bl3.h, color3);
                        viewOnLayoutChangeListenerC0059Al32.a.m(AbstractC0189Bl3.c, 4);
                        viewOnLayoutChangeListenerC0059Al32.j = new RunnableC8795pl3(viewOnLayoutChangeListenerC0059Al32);
                    }
                };
                int intValue = ((Integer) viewOnLayoutChangeListenerC0059Al3.i.get()).intValue();
                if (intValue == color) {
                    r1.run();
                    return;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(intValue, color);
                viewOnLayoutChangeListenerC0059Al3.p = ofInt;
                ofInt.setEvaluator(new ArgbEvaluator());
                viewOnLayoutChangeListenerC0059Al3.p.setInterpolator(AbstractC8142nr1.e);
                viewOnLayoutChangeListenerC0059Al3.p.setDuration(200L);
                viewOnLayoutChangeListenerC0059Al3.p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ol3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Iterator it = ViewOnLayoutChangeListenerC0059Al3.this.h.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC6389il3) it.next()).d(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    }
                });
                viewOnLayoutChangeListenerC0059Al3.p.addListener(new C10166tl3(viewOnLayoutChangeListenerC0059Al3, r1));
                viewOnLayoutChangeListenerC0059Al3.p.start();
            }
        };
        this.j = new Runnable() { // from class: Sa2
            @Override // java.lang.Runnable
            public final void run() {
                final C2992Xa2 c2992Xa2 = C2992Xa2.this;
                c2992Xa2.c.postDelayed(new Runnable() { // from class: Wa2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6732jl3 c6732jl32 = C2992Xa2.this.b;
                        if (c6732jl32.c) {
                            c6732jl32.c = false;
                            final ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = c6732jl32.a;
                            ValueAnimator ofInt = ValueAnimator.ofInt(viewOnLayoutChangeListenerC0059Al3.a.h(AbstractC0189Bl3.e), ((Integer) viewOnLayoutChangeListenerC0059Al3.i.get()).intValue());
                            ofInt.setEvaluator(new ArgbEvaluator());
                            HH0 hh0 = AbstractC8142nr1.e;
                            ofInt.setInterpolator(hh0);
                            ofInt.setDuration(200L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ql3
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al32 = ViewOnLayoutChangeListenerC0059Al3.this;
                                    viewOnLayoutChangeListenerC0059Al32.getClass();
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    viewOnLayoutChangeListenerC0059Al32.a.m(AbstractC0189Bl3.e, intValue);
                                    viewOnLayoutChangeListenerC0059Al32.a(intValue);
                                }
                            });
                            ofInt.addListener(new C11538xl3(viewOnLayoutChangeListenerC0059Al3));
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat.setInterpolator(hh0);
                            ofFloat.setDuration(150L);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rl3
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ViewOnLayoutChangeListenerC0059Al3.this.a.l(AbstractC0189Bl3.f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            AnimatorSet animatorSet = new AnimatorSet();
                            viewOnLayoutChangeListenerC0059Al3.s = animatorSet;
                            animatorSet.play(ofInt).with(ofFloat);
                            viewOnLayoutChangeListenerC0059Al3.s.addListener(new C12224zl3(viewOnLayoutChangeListenerC0059Al3));
                            viewOnLayoutChangeListenerC0059Al3.s.start();
                        }
                    }
                }, 2000L);
            }
        };
        this.i = new Runnable() { // from class: Ta2
            @Override // java.lang.Runnable
            public final void run() {
                C2992Xa2 c2992Xa2 = C2992Xa2.this;
                c2992Xa2.getClass();
                FI2.a("OfflineIndicator.Hidden");
                c2992Xa2.q.a();
                c2992Xa2.m = SystemClock.elapsedRealtime();
                Context context = c2992Xa2.a;
                int b = AbstractC10957w33.b(context);
                int g = AbstractC10957w33.g(R.attr.f4980_resource_name_obfuscated_res_0x7f05011f, context);
                Drawable drawable = context.getDrawable(R.drawable.f47730_resource_name_obfuscated_res_0x7f090212);
                int d = AbstractC10957w33.d(context);
                String string = context.getString(R.string.f78880_resource_name_obfuscated_res_0x7f140712);
                C6732jl3 c6732jl32 = c2992Xa2.b;
                if (c6732jl32.c) {
                    final ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = c6732jl32.a;
                    boolean equals = string.equals(viewOnLayoutChangeListenerC0059Al3.a.i(AbstractC0189Bl3.a));
                    ND2 nd2 = AbstractC0189Bl3.e;
                    if (equals && drawable == viewOnLayoutChangeListenerC0059Al3.a.i(AbstractC0189Bl3.b) && b == viewOnLayoutChangeListenerC0059Al3.a.h(nd2) && g == viewOnLayoutChangeListenerC0059Al3.a.h(AbstractC0189Bl3.g)) {
                        viewOnLayoutChangeListenerC0059Al3.a.h(AbstractC0189Bl3.h);
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    HH0 hh0 = AbstractC8142nr1.e;
                    ofFloat.setInterpolator(hh0);
                    ofFloat.setDuration(150L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kl3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al32 = ViewOnLayoutChangeListenerC0059Al3.this;
                            viewOnLayoutChangeListenerC0059Al32.getClass();
                            viewOnLayoutChangeListenerC0059Al32.a.l(AbstractC0189Bl3.f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ofFloat.addListener(new C10852vl3(viewOnLayoutChangeListenerC0059Al3, string, drawable, g, d));
                    ValueAnimator ofInt = ValueAnimator.ofInt(viewOnLayoutChangeListenerC0059Al3.a.h(nd2), b);
                    ofInt.setEvaluator(new ArgbEvaluator());
                    ofInt.setInterpolator(hh0);
                    ofInt.setDuration(400L);
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ll3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al32 = ViewOnLayoutChangeListenerC0059Al3.this;
                            viewOnLayoutChangeListenerC0059Al32.getClass();
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            viewOnLayoutChangeListenerC0059Al32.a.m(AbstractC0189Bl3.e, intValue);
                            viewOnLayoutChangeListenerC0059Al32.a(intValue);
                        }
                    });
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat2.setInterpolator(hh0);
                    ofFloat2.setDuration(150L);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ml3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al32 = ViewOnLayoutChangeListenerC0059Al3.this;
                            viewOnLayoutChangeListenerC0059Al32.getClass();
                            viewOnLayoutChangeListenerC0059Al32.a.l(AbstractC0189Bl3.f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    viewOnLayoutChangeListenerC0059Al3.r = animatorSet;
                    animatorSet.play(ofFloat).with(ofInt);
                    viewOnLayoutChangeListenerC0059Al3.r.play(ofFloat2).after(ofInt);
                    viewOnLayoutChangeListenerC0059Al3.r.addListener(new C11195wl3(viewOnLayoutChangeListenerC0059Al3, c2992Xa2.j));
                    viewOnLayoutChangeListenerC0059Al3.r.start();
                }
            }
        };
        this.e = c8385oa2;
        this.f = interfaceC0079Ap3;
        ?? r3 = new Callback() { // from class: Ua2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Runnable runnable;
                C2992Xa2 c2992Xa2 = C2992Xa2.this;
                c2992Xa2.getClass();
                if (((Boolean) obj).booleanValue() || (runnable = c2992Xa2.k) == null) {
                    return;
                }
                runnable.run();
                c2992Xa2.k = null;
            }
        };
        this.g = r3;
        c8385oa2.m(r3);
        this.l = new Runnable() { // from class: Va2
            @Override // java.lang.Runnable
            public final void run() {
                C2992Xa2 c2992Xa2 = C2992Xa2.this;
                boolean z = c2992Xa2.d.h;
                if (z != c2992Xa2.n) {
                    c2992Xa2.b(z);
                }
            }
        };
    }

    public final void a(boolean z) {
        if (this.p == z) {
            return;
        }
        C3923bb2 c3923bb2 = this.q;
        if (z) {
            if (c3923bb2.a) {
                Q83 q83 = O83.a;
                long currentTimeMillis = System.currentTimeMillis();
                long j = c3923bb2.f + (currentTimeMillis - c3923bb2.d);
                c3923bb2.f = j;
                q83.s(j, "Chrome.OfflineIndicatorV2.TimeInBackgroundMs");
                c3923bb2.d = currentTimeMillis;
                q83.s(currentTimeMillis, "Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
            }
            c3923bb2.b = true;
        } else {
            if (c3923bb2.a) {
                Q83 q832 = O83.a;
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = c3923bb2.e + (currentTimeMillis2 - c3923bb2.d);
                c3923bb2.e = j2;
                q832.s(j2, "Chrome.OfflineIndicatorV2.TimeInForegroundMs");
                c3923bb2.d = currentTimeMillis2;
                q832.s(currentTimeMillis2, "Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
                if (!q832.c("Chrome.OfflineIndicatorV2.FirstTimeInForegroundMs")) {
                    long j3 = c3923bb2.e;
                    c3923bb2.g = j3;
                    q832.s(j3, "Chrome.OfflineIndicatorV2.FirstTimeInForegroundMs");
                }
                int i = c3923bb2.h + 1;
                c3923bb2.h = i;
                q832.q(i, "Chrome.OfflineIndicatorV2.NumTimesBackgrounded");
            }
            c3923bb2.b = false;
        }
        this.p = z;
    }

    public final void b(boolean z) {
        this.n = z;
        if (!this.o) {
            C3923bb2 c3923bb2 = this.q;
            if (c3923bb2.a && !z) {
                c3923bb2.a();
            }
        }
        int i = 1;
        if (!this.o && !z) {
            this.o = true;
            return;
        }
        this.o = true;
        boolean booleanValue = ((Boolean) ((C8385oa2) this.e).g).booleanValue();
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.f;
        Runnable runnable = this.i;
        Runnable runnable2 = this.h;
        if (booleanValue) {
            if ((!z && this.k == runnable2) || (z && this.k == runnable)) {
                this.k = null;
                return;
            }
            if (z) {
                runnable = runnable2;
            }
            this.k = runnable;
            if (!((Boolean) interfaceC0079Ap3.get()).booleanValue()) {
                i = 3;
            }
        } else {
            if (z) {
                runnable = runnable2;
            }
            runnable.run();
            i = ((Boolean) interfaceC0079Ap3.get()).booleanValue() ? 0 : 2;
        }
        EI2.h(i, 4, "OfflineIndicator.ConnectivityChanged.DeviceState.".concat(z ? "Offline" : "Online"));
    }
}
