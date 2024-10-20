package org.chromium.chrome.browser.tasks.tab_management;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC1683My3;
import defpackage.AbstractC4368cs2;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC5521gD3;
import defpackage.AbstractC6265iP;
import defpackage.AbstractC7239lD3;
import defpackage.AbstractC9627sA3;
import defpackage.AbstractC9685sM1;
import defpackage.C0514Dy3;
import defpackage.C0774Fy3;
import defpackage.C10021tL;
import defpackage.C10307u93;
import defpackage.C1294Jy3;
import defpackage.C1364Km3;
import defpackage.C1553Ly3;
import defpackage.C2720Uy0;
import defpackage.C3823bH3;
import defpackage.C4747dy3;
import defpackage.C5607gV;
import defpackage.C6674jc;
import defpackage.C7497ly3;
import defpackage.C7526m33;
import defpackage.Ec4;
import defpackage.FD2;
import defpackage.HD2;
import defpackage.InterfaceC0904Gy3;
import defpackage.InterfaceC7117ks2;
import defpackage.LD2;
import defpackage.MD2;
import defpackage.ND2;
import defpackage.PD2;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC8754pe4;
import defpackage.Y50;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.endpoint_fetcher.EndpointResponse;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tasks.tab_management.CouponCardView;
import org.chromium.chrome.browser.tasks.tab_management.PriceCardView;
import org.chromium.chrome.browser.tasks.tab_management.SelectableTabGridView;
import org.chromium.chrome.browser.tasks.tab_management.StoreHoursCardView;
import org.chromium.chrome.browser.tasks.tab_management.TabGridThumbnailView;
import org.chromium.chrome.browser.tasks.tab_management.n;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.ChromeImageView;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class b {
    public static void e(int i, PropertyModel propertyModel, ViewLookupCachingFrameLayout viewLookupCachingFrameLayout) {
        FD2[] fd2Arr = AbstractC9627sA3.E;
        for (int i2 = 0; i2 < 32; i2++) {
            FD2 fd2 = fd2Arr[i2];
            b(propertyModel, viewLookupCachingFrameLayout, fd2);
            if (i == 0) {
                c(propertyModel, viewLookupCachingFrameLayout, fd2);
            } else if (i == 1) {
                a(propertyModel, viewLookupCachingFrameLayout, fd2);
            }
        }
    }

    public static void b(PropertyModel propertyModel, ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, FD2 fd2) {
        PD2 pd2 = AbstractC9627sA3.h;
        if (pd2 == fd2) {
            String str = (String) propertyModel.i(pd2);
            TextView textView = (TextView) viewLookupCachingFrameLayout.c(R.id.tab_title);
            textView.setText(str);
            textView.setContentDescription(viewLookupCachingFrameLayout.getResources().getString(R.string.f66550_resource_name_obfuscated_res_0x7f140181, str));
            return;
        }
        LD2 ld2 = AbstractC9627sA3.i;
        if (ld2 == fd2) {
            f(viewLookupCachingFrameLayout, propertyModel.j(AbstractC9627sA3.o), propertyModel.j(ld2));
            h(viewLookupCachingFrameLayout, propertyModel);
            if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_search_term_chip"), false)) {
                ChipView chipView = (ChipView) viewLookupCachingFrameLayout.c(R.id.page_info_button);
                chipView.g.setTextAlignment(5);
                chipView.g.setEllipsize(TextUtils.TruncateAt.END);
                chipView.setSelected(false);
                return;
            }
            return;
        }
        if (AbstractC9627sA3.d == fd2) {
            h(viewLookupCachingFrameLayout, propertyModel);
            return;
        }
        if (AbstractC9627sA3.e == fd2) {
            i(viewLookupCachingFrameLayout, propertyModel);
            return;
        }
        PD2 pd22 = AbstractC9627sA3.B;
        if (pd22 == fd2) {
            viewLookupCachingFrameLayout.setContentDescription((CharSequence) propertyModel.i(pd22));
            return;
        }
        PD2 pd23 = AbstractC9627sA3.f;
        if (pd23 == fd2) {
            Size size = (Size) propertyModel.i(pd23);
            viewLookupCachingFrameLayout.setMinimumHeight(size.getHeight());
            viewLookupCachingFrameLayout.setMinimumWidth(size.getWidth());
            viewLookupCachingFrameLayout.getLayoutParams().height = size.getHeight();
            viewLookupCachingFrameLayout.getLayoutParams().width = size.getWidth();
            viewLookupCachingFrameLayout.setLayoutParams(viewLookupCachingFrameLayout.getLayoutParams());
            ((TabGridThumbnailView) viewLookupCachingFrameLayout.c(R.id.tab_thumbnail)).getLayoutParams().height = -1;
            i(viewLookupCachingFrameLayout, propertyModel);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [Bw3] */
    public static void a(final PropertyModel propertyModel, final ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, FD2 fd2) {
        PD2 pd2;
        PD2 pd22 = AbstractC9627sA3.c;
        if (pd22 == fd2) {
            if (propertyModel.i(pd22) == null) {
                viewLookupCachingFrameLayout.c(R.id.action_button).setOnClickListener(null);
                return;
            } else {
                viewLookupCachingFrameLayout.c(R.id.action_button).setOnClickListener(new View.OnClickListener() { // from class: ww3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ND2 nd2 = AbstractC9627sA3.a;
                        PropertyModel propertyModel2 = PropertyModel.this;
                        ((InterfaceC0904Gy3) propertyModel2.i(AbstractC9627sA3.c)).a(propertyModel2.h(nd2));
                    }
                });
                return;
            }
        }
        PD2 pd23 = AbstractC9627sA3.b;
        if (pd23 == fd2) {
            if (propertyModel.i(pd23) == null) {
                viewLookupCachingFrameLayout.setOnClickListener(null);
                return;
            } else {
                viewLookupCachingFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: xw3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ND2 nd2 = AbstractC9627sA3.a;
                        PropertyModel propertyModel2 = PropertyModel.this;
                        ((InterfaceC0904Gy3) propertyModel2.i(AbstractC9627sA3.b)).a(propertyModel2.h(nd2));
                    }
                });
                return;
            }
        }
        PD2 pd24 = AbstractC9627sA3.k;
        if (pd24 == fd2) {
            final InterfaceC0904Gy3 interfaceC0904Gy3 = (InterfaceC0904Gy3) propertyModel.i(pd24);
            ButtonCompat buttonCompat = (ButtonCompat) viewLookupCachingFrameLayout.c(R.id.create_group_button);
            if (interfaceC0904Gy3 == null) {
                buttonCompat.setVisibility(8);
                buttonCompat.setOnClickListener(null);
                return;
            } else {
                buttonCompat.setVisibility(0);
                buttonCompat.setOnClickListener(new View.OnClickListener() { // from class: yw3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        interfaceC0904Gy3.a(PropertyModel.this.h(AbstractC9627sA3.a));
                    }
                });
                return;
            }
        }
        MD2 md2 = AbstractC1683My3.b;
        if (md2 == fd2) {
            viewLookupCachingFrameLayout.setAlpha(propertyModel.g(md2));
            return;
        }
        PD2 pd25 = AbstractC9627sA3.h;
        if (pd25 == fd2) {
            if (AbstractC5177fD3.c()) {
                return;
            }
            viewLookupCachingFrameLayout.c(R.id.action_button).setContentDescription(viewLookupCachingFrameLayout.getResources().getString(R.string.f66470_resource_name_obfuscated_res_0x7f140179, (String) propertyModel.i(pd25)));
            return;
        }
        PD2 pd26 = AbstractC9627sA3.g;
        if (pd26 == fd2) {
            C7497ly3 c7497ly3 = (C7497ly3) propertyModel.i(pd26);
            if (c7497ly3 != null) {
                final View c = viewLookupCachingFrameLayout.c(R.id.tab_thumbnail);
                C1553Ly3 c1553Ly3 = c7497ly3.a;
                if (c1553Ly3.b) {
                    return;
                }
                c1553Ly3.b = true;
                new Handler().postDelayed(new Runnable() { // from class: iy3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC7492lx3.b("IPH_TabGroupsYourTabsTogether", c, null);
                    }
                }, 1000L);
                return;
            }
            return;
        }
        ND2 nd2 = AbstractC9627sA3.l;
        if (nd2 == fd2) {
            ClosableTabGridView closableTabGridView = (ClosableTabGridView) viewLookupCachingFrameLayout;
            int h = propertyModel.h(nd2);
            View c2 = closableTabGridView.c(R.id.background_view);
            View c3 = closableTabGridView.c(R.id.content_view);
            boolean z = h == 2 || h == 4;
            boolean z2 = h == 4 || h == 3;
            long j = h == 0 ? 50L : 218L;
            float f = z ? 0.8f : 1.0f;
            if (!z2) {
                c3 = closableTabGridView;
            }
            if (h == 4) {
                c2.setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new C5607gV(closableTabGridView, z, c2));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c3, (Property<View, Float>) View.SCALE_X, f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c3, (Property<View, Float>) View.SCALE_Y, f);
            ofFloat.setDuration(j);
            ofFloat2.setDuration(j);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
            return;
        }
        HD2 hd2 = AbstractC9627sA3.o;
        if (hd2 == fd2) {
            boolean j2 = propertyModel.j(hd2);
            LD2 ld2 = AbstractC9627sA3.i;
            f(viewLookupCachingFrameLayout, j2, propertyModel.j(ld2));
            boolean j3 = propertyModel.j(hd2);
            boolean j4 = propertyModel.j(ld2);
            ImageView imageView = (ImageView) viewLookupCachingFrameLayout.c(R.id.action_button);
            imageView.setImageTintList(AbstractC5521gD3.a(imageView.getContext(), j3, j4));
            return;
        }
        PD2 pd27 = AbstractC9627sA3.u;
        if (pd27 == fd2) {
            viewLookupCachingFrameLayout.setAccessibilityDelegate((View.AccessibilityDelegate) propertyModel.i(pd27));
            return;
        }
        PD2 pd28 = AbstractC9627sA3.v;
        if (pd28 == fd2) {
            String str = (String) propertyModel.i(pd28);
            ChipView chipView = (ChipView) viewLookupCachingFrameLayout.c(R.id.page_info_button);
            if (TextUtils.isEmpty(str)) {
                chipView.setVisibility(8);
                return;
            } else {
                chipView.setVisibility(0);
                chipView.g.setText(str);
                return;
            }
        }
        if (AbstractC9627sA3.w == fd2) {
            d(propertyModel, new Callback() { // from class: zw3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C8593p93 c8593p93 = (C8593p93) obj;
                    ViewLookupCachingFrameLayout viewLookupCachingFrameLayout2 = ViewLookupCachingFrameLayout.this;
                    PriceCardView priceCardView = (PriceCardView) viewLookupCachingFrameLayout2.c(R.id.price_info_box_outer);
                    if (c8593p93 != null) {
                        TextView textView = priceCardView.a;
                        String str2 = c8593p93.a;
                        textView.setText(str2);
                        TextView textView2 = priceCardView.g;
                        String str3 = c8593p93.b;
                        textView2.setText(str3);
                        priceCardView.setVisibility(0);
                        priceCardView.setContentDescription(viewLookupCachingFrameLayout2.getResources().getString(R.string.f66360_resource_name_obfuscated_res_0x7f14016a, str3, str2));
                        return;
                    }
                    priceCardView.setVisibility(8);
                }
            }, true);
            return;
        }
        PD2 pd29 = AbstractC9627sA3.y;
        if (pd29 == fd2) {
            final CouponCardView couponCardView = (CouponCardView) viewLookupCachingFrameLayout.c(R.id.coupon_info_box_outer);
            if (propertyModel.i(pd29) == null) {
                couponCardView.setVisibility(8);
                return;
            } else {
                d(propertyModel, new Callback() { // from class: Aw3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [org.chromium.base.Callback, uy3] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [tw3] */
                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C8593p93 c8593p93 = (C8593p93) obj;
                        final CouponCardView couponCardView2 = CouponCardView.this;
                        if (c8593p93 != null) {
                            couponCardView2.setVisibility(8);
                            return;
                        }
                        C10928vy3 c10928vy3 = (C10928vy3) propertyModel.i(AbstractC9627sA3.y);
                        final ?? r1 = new Callback() { // from class: tw3
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:            if (((r6.a == null || r6.b == null) ? false : true) == false) goto L26;     */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
                            @Override // org.chromium.base.Callback
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void onResult(java.lang.Object r6) {
                                /*
                                    r5 = this;
                                    Da0 r6 = (defpackage.C0391Da0) r6
                                    org.chromium.chrome.browser.tasks.tab_management.CouponCardView r0 = org.chromium.chrome.browser.tasks.tab_management.CouponCardView.this
                                    if (r6 == 0) goto L3b
                                    Aa0 r6 = r6.o
                                    r1 = 1
                                    r2 = 0
                                    r3 = 0
                                    if (r6 == 0) goto L1d
                                    java.lang.String r4 = r6.a
                                    if (r4 == 0) goto L17
                                    java.lang.String r4 = r6.b
                                    if (r4 == 0) goto L17
                                    r4 = r1
                                    goto L18
                                L17:
                                    r4 = r3
                                L18:
                                    if (r4 != 0) goto L1b
                                    goto L1d
                                L1b:
                                    r4 = r6
                                    goto L1e
                                L1d:
                                    r4 = r2
                                L1e:
                                    if (r4 != 0) goto L21
                                    goto L3b
                                L21:
                                    if (r6 == 0) goto L2f
                                    java.lang.String r4 = r6.a
                                    if (r4 == 0) goto L2c
                                    java.lang.String r4 = r6.b
                                    if (r4 == 0) goto L2c
                                    goto L2d
                                L2c:
                                    r1 = r3
                                L2d:
                                    if (r1 != 0) goto L30
                                L2f:
                                    r6 = r2
                                L30:
                                    java.lang.String r6 = r6.a
                                    android.widget.TextView r1 = r0.a
                                    r1.setText(r6)
                                    r0.setVisibility(r3)
                                    goto L40
                                L3b:
                                    r6 = 8
                                    r0.setVisibility(r6)
                                L40:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.C10232tw3.onResult(java.lang.Object):void");
                            }
                        };
                        c10928vy3.getClass();
                        final ?? r0 = new Callback() { // from class: uy3
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                r1.onResult((C0391Da0) obj2);
                            }
                        };
                        String[] strArr = C0391Da0.p;
                        final Tab tab = c10928vy3.a;
                        if (tab == null || tab.isDestroyed() || tab.isIncognito() || tab.isCustomTab()) {
                            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: xa0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r0.onResult(null);
                                }
                            });
                        } else {
                            AbstractC4368cs2.e(tab, new InterfaceC7117ks2() { // from class: ya0
                                @Override // defpackage.InterfaceC7117ks2
                                public final void a(ByteBuffer byteBuffer, InterfaceC7805ms2 interfaceC7805ms2, String str2, C3337Zr2 c3337Zr2) {
                                    C0391Da0 c0391Da0;
                                    Tab tab2 = Tab.this;
                                    if (tab2.isDestroyed()) {
                                        c0391Da0 = null;
                                    } else {
                                        C0391Da0 c0391Da02 = (C0391Da0) AbstractC4368cs2.d(tab2, C0391Da0.class);
                                        c0391Da0 = c0391Da02 == null ? (C0391Da0) tab2.F().d(C0391Da0.class, new C0391Da0(tab2)) : c0391Da02;
                                    }
                                    if (c0391Da0 != null) {
                                        c0391Da0.c(byteBuffer);
                                    }
                                    c3337Zr2.onResult(c0391Da0);
                                }
                            }, new Callback() { // from class: za0
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj2) {
                                    return new ZE(this, obj2);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj2) {
                                    final Callback callback = (Callback) obj2;
                                    final Tab tab2 = Tab.this;
                                    if (tab2.isDestroyed()) {
                                        callback.onResult(null);
                                    } else {
                                        AbstractC4133cB0.a(new Callback() { // from class: va0
                                            @Override // org.chromium.base.Callback
                                            public final void onResult(Object obj3) {
                                                C0391Da0 c0391Da0;
                                                C0001Aa0 m;
                                                boolean z3 = false;
                                                try {
                                                    m = C0391Da0.m(new JSONObject(((EndpointResponse) obj3).a).optJSONArray("discounts"));
                                                } catch (Exception e) {
                                                    AbstractC4851eH1.a("COPTD", "Error parsing JSON: %s", e.getMessage());
                                                }
                                                if (m != null) {
                                                    if (m.a != null && m.b != null) {
                                                        z3 = true;
                                                    }
                                                    if (z3) {
                                                        c0391Da0 = new C0391Da0(tab2);
                                                        c0391Da0.o = m;
                                                        Callback.this.onResult(c0391Da0);
                                                    }
                                                }
                                                c0391Da0 = null;
                                                Callback.this.onResult(c0391Da0);
                                            }

                                            @Override // org.chromium.base.Callback
                                            public final ZE e0(Object obj3) {
                                                return new ZE(this, obj3);
                                            }
                                        }, Profile.d(), "COPTD", String.format(Locale.US, "https://task-management-chrome.sandbox.google.com/promotions?url=%s", tab2.getUrl().i()), "GET", C0391Da0.p, "", 10000L, C0391Da0.r);
                                    }
                                }
                            }, C0391Da0.class, r0);
                        }
                    }
                }, false);
                return;
            }
        }
        PD2 pd210 = AbstractC9627sA3.x;
        if (pd210 == fd2) {
            final StoreHoursCardView storeHoursCardView = (StoreHoursCardView) viewLookupCachingFrameLayout.c(R.id.store_hours_box_outer);
            if (propertyModel.i(pd210) != null) {
                C0774Fy3 c0774Fy3 = (C0774Fy3) propertyModel.i(pd210);
                final ?? r2 = new Callback() { // from class: Bw3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C1364Km3 c1364Km3 = (C1364Km3) obj;
                        StoreHoursCardView storeHoursCardView2 = StoreHoursCardView.this;
                        if (c1364Km3 == null || TextUtils.isEmpty(c1364Km3.o())) {
                            storeHoursCardView2.setVisibility(8);
                            return;
                        }
                        storeHoursCardView2.a.setText(c1364Km3.o());
                        storeHoursCardView2.setVisibility(0);
                    }
                };
                c0774Fy3.getClass();
                Callback callback = new Callback() { // from class: Ey3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        r2.onResult((C1364Km3) obj);
                    }
                };
                String[] strArr = C1364Km3.p;
                final Tab tab = c0774Fy3.a;
                AbstractC4368cs2.e(tab, new InterfaceC7117ks2() { // from class: Dm3
                    @Override // defpackage.InterfaceC7117ks2
                    public final void a(ByteBuffer byteBuffer, InterfaceC7805ms2 interfaceC7805ms2, String str2, C3337Zr2 c3337Zr2) {
                        c3337Zr2.onResult(new C1364Km3(Tab.this, interfaceC7805ms2, str2));
                    }
                }, new Callback() { // from class: Em3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        final Callback callback2 = (Callback) obj;
                        String[] strArr2 = C1364Km3.p;
                        final Tab tab2 = Tab.this;
                        AbstractC4133cB0.a(new Callback() { // from class: Fm3
                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                C1364Km3 c1364Km3;
                                Tab tab3 = tab2;
                                String[] strArr3 = C1364Km3.p;
                                try {
                                    c1364Km3 = new C1364Km3(tab3, C1364Km3.n(new JSONObject(((EndpointResponse) obj2).a).optJSONArray("representations").optJSONObject(0).optJSONArray("storeHours")));
                                } catch (Exception e) {
                                    AbstractC4851eH1.a("STPTD", "Error parsing JSON: " + e.getMessage(), new Object[0]);
                                    c1364Km3 = null;
                                }
                                Callback.this.onResult(c1364Km3);
                            }

                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }
                        }, Profile.d(), "STPTD", String.format(Locale.US, "https://task-management-chrome.sandbox.google.com/tabs/representations?url=%s&locale=en:US", tab2.getUrl().i()), "GET", C1364Km3.p, "", 10000L, C5463g32.b);
                    }
                }, C1364Km3.class, callback);
                return;
            }
            storeHoursCardView.setVisibility(8);
            return;
        }
        LD2 ld22 = AbstractC9627sA3.D;
        if (ld22 == fd2) {
            if (propertyModel.j(ld22)) {
                View findViewById = ((PriceCardView) viewLookupCachingFrameLayout.c(R.id.price_info_box_outer)).findViewById(R.id.current_price);
                WeakReference weakReference = LargeMessageCardView.p;
                C3823bH3 c3823bH3 = new C3823bH3(findViewById.getContext(), findViewById, R.string.f82390_resource_name_obfuscated_res_0x7f14087f, R.string.f82390_resource_name_obfuscated_res_0x7f14087f, new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(findViewById), C10021tL.f().c(), 0);
                c3823bH3.i.k.setFocusable(true);
                c3823bH3.g(true);
                c3823bH3.h();
                return;
            }
            return;
        }
        PD2 pd211 = AbstractC9627sA3.z;
        if (pd211 == fd2) {
            final InterfaceC0904Gy3 interfaceC0904Gy32 = (InterfaceC0904Gy3) propertyModel.i(pd211);
            ChipView chipView2 = (ChipView) viewLookupCachingFrameLayout.c(R.id.page_info_button);
            if (interfaceC0904Gy32 == null) {
                chipView2.setOnClickListener(null);
                return;
            } else {
                chipView2.setOnClickListener(new View.OnClickListener() { // from class: Cw3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        interfaceC0904Gy32.a(PropertyModel.this.h(AbstractC9627sA3.a));
                    }
                });
                return;
            }
        }
        ND2 nd22 = AbstractC9627sA3.A;
        if (nd22 == fd2) {
            ChipView chipView3 = (ChipView) viewLookupCachingFrameLayout.c(R.id.page_info_button);
            int h2 = propertyModel.h(nd22);
            chipView3.b(h2, h2 != R.drawable.f48310_resource_name_obfuscated_res_0x7f09024f);
            return;
        }
        LD2 ld23 = AbstractC9627sA3.i;
        if (ld23 == fd2) {
            viewLookupCachingFrameLayout.setSelected(propertyModel.j(ld23));
            boolean j5 = propertyModel.j(hd2);
            boolean j6 = propertyModel.j(ld23);
            ImageView imageView2 = (ImageView) viewLookupCachingFrameLayout.c(R.id.action_button);
            imageView2.setImageTintList(AbstractC5521gD3.a(imageView2.getContext(), j5, j6));
            return;
        }
        if (AbstractC5177fD3.c() && (pd2 = AbstractC9627sA3.C) == fd2) {
            viewLookupCachingFrameLayout.c(R.id.action_button).setContentDescription((CharSequence) propertyModel.i(pd2));
        }
    }

    public static void c(final PropertyModel propertyModel, final ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, FD2 fd2) {
        final int h = propertyModel.h(AbstractC9627sA3.a);
        LD2 ld2 = AbstractC9627sA3.i;
        if (ld2 == fd2) {
            g(viewLookupCachingFrameLayout, propertyModel.j(AbstractC9627sA3.o), propertyModel.j(ld2));
            return;
        }
        if (AbstractC9627sA3.m == fd2) {
            viewLookupCachingFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: sw3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((InterfaceC0904Gy3) propertyModel.i(AbstractC9627sA3.m)).a(h);
                    ((SelectableTabGridView) viewLookupCachingFrameLayout).j();
                }
            });
            viewLookupCachingFrameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: vw3
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    ((InterfaceC0904Gy3) propertyModel.i(AbstractC9627sA3.m)).a(h);
                    ViewLookupCachingFrameLayout viewLookupCachingFrameLayout2 = viewLookupCachingFrameLayout;
                    return ((SelectableTabGridView) viewLookupCachingFrameLayout2).onLongClick(viewLookupCachingFrameLayout2);
                }
            });
            return;
        }
        PD2 pd2 = AbstractC9627sA3.n;
        if (pd2 == fd2) {
            SelectableTabGridView selectableTabGridView = (SelectableTabGridView) viewLookupCachingFrameLayout;
            selectableTabGridView.m((C7526m33) propertyModel.i(pd2));
            selectableTabGridView.k(Integer.valueOf(h));
        } else {
            HD2 hd2 = AbstractC9627sA3.o;
            if (hd2 == fd2) {
                f(viewLookupCachingFrameLayout, propertyModel.j(hd2), propertyModel.j(ld2));
                g(viewLookupCachingFrameLayout, propertyModel.j(hd2), propertyModel.j(ld2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [uw3] */
    public static void d(PropertyModel propertyModel, final Callback callback, final boolean z) {
        PD2 pd2 = AbstractC9627sA3.w;
        if (propertyModel.i(pd2) == null) {
            callback.onResult(null);
            return;
        }
        final C0514Dy3 c0514Dy3 = (C0514Dy3) propertyModel.i(pd2);
        final ?? r0 = new Callback() { // from class: uw3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C6469iz2 c6469iz2;
                C10307u93 c10307u93 = (C10307u93) obj;
                Callback callback2 = Callback.this;
                if (c10307u93 == null) {
                    callback2.onResult(null);
                    return;
                }
                if (z && (c6469iz2 = c10307u93.q) != null) {
                    c6469iz2.a(System.currentTimeMillis() - C1695Nb0.m(c10307u93.a).s, "EnterTabSwitcher");
                }
                callback2.onResult(c10307u93.q());
            }
        };
        c0514Dy3.getClass();
        C10307u93.o(new Callback() { // from class: By3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final C10307u93 c10307u93 = (C10307u93) obj;
                final C0514Dy3 c0514Dy32 = C0514Dy3.this;
                c0514Dy32.getClass();
                r0.onResult(c10307u93);
                new Handler().post(new Runnable() { // from class: Cy3
                    @Override // java.lang.Runnable
                    public final void run() {
                        XC3 xc3;
                        C10307u93 c10307u932;
                        C0514Dy3 c0514Dy33 = C0514Dy3.this;
                        c0514Dy33.getClass();
                        if (!AbstractC2077Pz2.b() || (xc3 = c0514Dy33.b) == null || (c10307u932 = c10307u93) == null || c10307u932.q() == null) {
                            return;
                        }
                        C12304zz2 c12304zz2 = new C12304zz2(c0514Dy33.a.getId(), c10307u932.q());
                        n nVar = (n) xc3;
                        if (nVar.A == null || !AbstractC2077Pz2.b()) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = nVar.p.a.d;
                        if (!(linkedHashMap.containsKey(3) && ((PU1) linkedHashMap.get(3)).b.h(WU1.b) == 0) && nVar.A.e(0, c12304zz2)) {
                            nVar.s(3);
                            nVar.k.j.o(AbstractC1678Mx3.d, Integer.valueOf(((AbstractC11276wz3) nVar.n).c.d().index()));
                        }
                    }
                });
            }
        }, c0514Dy3.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [Dw3] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Iy3] */
    public static void i(final ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, final PropertyModel propertyModel) {
        C1294Jy3 c1294Jy3 = (C1294Jy3) propertyModel.i(AbstractC9627sA3.e);
        final TabGridThumbnailView tabGridThumbnailView = (TabGridThumbnailView) viewLookupCachingFrameLayout.c(R.id.tab_thumbnail);
        tabGridThumbnailView.getClass();
        if (!AbstractC5177fD3.c()) {
            if (AbstractC5177fD3.f()) {
                tabGridThumbnailView.setMinimumHeight(Math.min(tabGridThumbnailView.getHeight(), (int) ((tabGridThumbnailView.getWidth() * 1.0d) / AbstractC7239lD3.c(tabGridThumbnailView.getContext()))));
            } else {
                tabGridThumbnailView.setMinimumHeight(tabGridThumbnailView.getWidth());
            }
        }
        Size size = null;
        if (c1294Jy3 == null) {
            tabGridThumbnailView.setImageDrawable(null);
            return;
        }
        tabGridThumbnailView.setImageDrawable(new ColorDrawable(AbstractC5521gD3.b(tabGridThumbnailView.getContext(), propertyModel.j(AbstractC9627sA3.o), propertyModel.j(AbstractC9627sA3.i))));
        Size size2 = (Size) propertyModel.i(AbstractC9627sA3.f);
        if (AbstractC5177fD3.i(viewLookupCachingFrameLayout.getContext()) && size2 != null) {
            Context context = viewLookupCachingFrameLayout.getContext();
            size = new Size(size2.getWidth() - ((((int) AbstractC5521gD3.c(context)) + ((int) context.getResources().getDimension(R.dimen.f41070_resource_name_obfuscated_res_0x7f080787))) * 2), size2.getHeight() - AbstractC7239lD3.d(context));
        }
        Size size3 = size;
        final ?? r2 = new Callback() { // from class: Dw3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ViewLookupCachingFrameLayout viewLookupCachingFrameLayout2 = ViewLookupCachingFrameLayout.this;
                    boolean i = AbstractC5177fD3.i(viewLookupCachingFrameLayout2.getContext());
                    TabGridThumbnailView tabGridThumbnailView2 = tabGridThumbnailView;
                    if (i) {
                        PD2 pd2 = AbstractC9627sA3.f;
                        PropertyModel propertyModel2 = propertyModel;
                        if (propertyModel2.i(pd2) != null) {
                            Size size4 = (Size) propertyModel2.i(pd2);
                            Context context2 = viewLookupCachingFrameLayout2.getContext();
                            Size size5 = new Size(size4.getWidth() - ((((int) AbstractC5521gD3.c(context2)) + ((int) context2.getResources().getDimension(R.dimen.f41070_resource_name_obfuscated_res_0x7f080787))) * 2), size4.getHeight() - AbstractC7239lD3.d(context2));
                            int width = size5.getWidth();
                            int height = size5.getHeight();
                            if (width <= 0 || height <= 0 || (width == bitmap.getWidth() && height == bitmap.getHeight())) {
                                tabGridThumbnailView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            } else {
                                Matrix matrix = new Matrix();
                                float max = Math.max(width / bitmap.getWidth(), height / bitmap.getHeight());
                                matrix.setScale(max, max);
                                matrix.postTranslate((int) ((r1 - (bitmap.getWidth() * max)) / 2.0f), 0.0f);
                                tabGridThumbnailView2.setScaleType(ImageView.ScaleType.MATRIX);
                                tabGridThumbnailView2.setImageMatrix(matrix);
                            }
                            tabGridThumbnailView2.setImageBitmap(bitmap);
                        }
                    }
                    tabGridThumbnailView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    tabGridThumbnailView2.setAdjustViewBounds(true);
                    tabGridThumbnailView2.setImageBitmap(bitmap);
                }
            }
        };
        AbstractC5177fD3.c();
        c1294Jy3.a.a(c1294Jy3.b, size3, new Callback() { // from class: Iy3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r2.onResult((Bitmap) obj);
            }
        }, c1294Jy3.c, c1294Jy3.d);
    }

    public static void h(ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, PropertyModel propertyModel) {
        C4747dy3 c4747dy3 = (C4747dy3) propertyModel.i(AbstractC9627sA3.d);
        ImageView imageView = (ImageView) viewLookupCachingFrameLayout.c(R.id.tab_favicon);
        if (c4747dy3 == null) {
            imageView.setImageDrawable(null);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageDrawable(propertyModel.j(AbstractC9627sA3.i) ? c4747dy3.b : c4747dy3.a);
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.f41020_resource_name_obfuscated_res_0x7f080782);
            imageView.setPadding(dimension, dimension, dimension, dimension);
        }
    }

    public static void f(ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, boolean z, boolean z2) {
        int b;
        int f;
        ColorStateList valueOf;
        View c = viewLookupCachingFrameLayout.c(R.id.card_view);
        View c2 = viewLookupCachingFrameLayout.c(R.id.divider_view);
        TextView textView = (TextView) viewLookupCachingFrameLayout.c(R.id.tab_title);
        TabGridThumbnailView tabGridThumbnailView = (TabGridThumbnailView) viewLookupCachingFrameLayout.c(R.id.tab_thumbnail);
        ChromeImageView chromeImageView = (ChromeImageView) viewLookupCachingFrameLayout.c(R.id.background_view);
        c.getBackground().mutate();
        Context context = c.getContext();
        if (z) {
            int i = z2 ? R.color.f22350_resource_name_obfuscated_res_0x7f0705a0 : R.color.f22340_resource_name_obfuscated_res_0x7f07059f;
            Object obj = Y50.a;
            b = context.getColor(i);
        } else {
            float dimension = context.getResources().getDimension(R.dimen.f40980_resource_name_obfuscated_res_0x7f08077d);
            if (z2) {
                b = AbstractC9685sM1.c(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context, "TabUiThemeProvider");
            } else {
                C2720Uy0 c2720Uy0 = new C2720Uy0(context);
                b = c2720Uy0.b(c2720Uy0.d, dimension);
            }
        }
        ColorStateList valueOf2 = ColorStateList.valueOf(b);
        WeakHashMap weakHashMap = Ec4.a;
        c.setBackgroundTintList(valueOf2);
        Context context2 = c2.getContext();
        if (!z) {
            f = AbstractC10957w33.f(context2);
        } else {
            f = context2.getColor(R.color.f26730_resource_name_obfuscated_res_0x7f07089e);
        }
        c2.setBackgroundColor(f);
        textView.setTextColor(AbstractC5521gD3.g(textView.getContext(), z, z2));
        if (tabGridThumbnailView.getDrawable() == null || (tabGridThumbnailView.getDrawable() instanceof ColorDrawable)) {
            tabGridThumbnailView.setImageDrawable(new ColorDrawable(AbstractC5521gD3.b(tabGridThumbnailView.getContext(), z, z2)));
        }
        if (AbstractC5177fD3.e(viewLookupCachingFrameLayout.getContext())) {
            Context context3 = chromeImageView.getContext();
            if (z) {
                valueOf = Y50.b(context3, z2 ? R.color.f22410_resource_name_obfuscated_res_0x7f0705a6 : R.color.f22400_resource_name_obfuscated_res_0x7f0705a5);
            } else if (z2) {
                valueOf = ColorStateList.valueOf(AbstractC9685sM1.a(AbstractC9685sM1.c(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context3, "TabUiThemeProvider"), context3.getResources().getInteger(R.integer.f55000_resource_name_obfuscated_res_0x7f0c0097)));
            } else {
                float dimension2 = context3.getResources().getDimension(R.dimen.f30420_resource_name_obfuscated_res_0x7f080174);
                C2720Uy0 c2720Uy02 = new C2720Uy0(context3);
                valueOf = ColorStateList.valueOf(AbstractC9685sM1.a(c2720Uy02.b(c2720Uy02.d, dimension2), context3.getResources().getInteger(R.integer.f54990_resource_name_obfuscated_res_0x7f0c0096)));
            }
            chromeImageView.setBackgroundTintList(valueOf);
        }
    }

    public static void g(ViewLookupCachingFrameLayout viewLookupCachingFrameLayout, boolean z, boolean z2) {
        ColorStateList colorStateList;
        int integer = viewLookupCachingFrameLayout.getResources().getInteger(R.integer.f54680_resource_name_obfuscated_res_0x7f0c0043);
        int integer2 = viewLookupCachingFrameLayout.getResources().getInteger(R.integer.f54700_resource_name_obfuscated_res_0x7f0c0045);
        ImageView imageView = (ImageView) viewLookupCachingFrameLayout.c(R.id.action_button);
        Drawable background = imageView.getBackground();
        if (z2) {
            integer = integer2;
        }
        background.setLevel(integer);
        imageView.getBackground().mutate().setTintList(AbstractC5521gD3.a(viewLookupCachingFrameLayout.getContext(), z, z2));
        imageView.getDrawable().setAlpha(z2 ? 255 : 0);
        if (z2) {
            Context context = viewLookupCachingFrameLayout.getContext();
            if (z) {
                colorStateList = Y50.b(context, R.color.f22350_resource_name_obfuscated_res_0x7f0705a0);
            } else {
                colorStateList = ColorStateList.valueOf(AbstractC9685sM1.c(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context, "TabUiThemeProvider"));
            }
        } else {
            colorStateList = null;
        }
        imageView.setImageTintList(colorStateList);
        if (z2) {
            ((C6674jc) imageView.getDrawable()).start();
        }
    }
}
