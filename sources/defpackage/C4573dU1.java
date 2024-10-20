package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.merchant_viewer.MerchantTrustSignalsEvent;
import org.chromium.chrome.browser.merchant_viewer.MerchantTrustSignalsEventStorage;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.commerce.core.ShoppingService;
import org.chromium.components.prefs.PrefService;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dU1 */
/* loaded from: classes.dex */
public final class C4573dU1 implements InterfaceC0298Ch2, UT1 {
    public final C5948hU1 a;
    public final RT1 b;
    public final JT1 c;
    public final Context d;
    public final WT1 e;
    public final C5260fU1 f;
    public final C6634jU1 g;
    public final InterfaceC7697ma2 h;
    public final WindowAndroid i;
    public final InterfaceC7697ma2 j;
    public InterfaceC4229cU1 k;

    /* JADX WARN: Type inference failed for: r7v7, types: [bU1] */
    public final void c(final PT1 pt1, final ShoppingService.MerchantInfo merchantInfo, boolean z) {
        boolean z2;
        long j;
        GURL gurl;
        NavigationHandle navigationHandle = pt1.b;
        final String i = (navigationHandle == null || (gurl = navigationHandle.e) == null) ? null : gurl.i();
        BD2 bd2 = new BD2(HU1.F);
        bd2.c(HU1.a, 7);
        PD2 pd2 = HU1.l;
        Context context = this.d;
        Resources resources = context.getResources();
        int i2 = 0;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            z2 = N.M6bsIDpc("CommerceMerchantViewer", "trust_signals_message_use_google_icon", false);
        } else {
            z2 = false;
        }
        int i3 = z2 ? R.drawable.0_resource_name_obfuscated_res_0x7f09024f : R.drawable.0_resource_name_obfuscated_res_0x7f090324;
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = GP2.a;
        bd2.e(pd2, resources.getDrawable(i3, theme));
        bd2.c(HU1.p, 0);
        PD2 pd22 = HU1.f;
        Resources resources2 = context.getResources();
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE2 = UN.a;
            i2 = N.M37SqSAy("CommerceMerchantViewer", "trust_signals_message_title_ui", 0);
        }
        int i4 = 1;
        bd2.e(pd22, resources2.getString(i2 == 1 ? R.string.0_resource_name_obfuscated_res_0x7f140651 : R.string.0_resource_name_obfuscated_res_0x7f140650));
        PD2 pd23 = HU1.h;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE3 = UN.a;
            i4 = N.M37SqSAy("CommerceMerchantViewer", "trust_signals_message_description_ui", 1);
        }
        bd2.e(pd23, VT1.a(context, merchantInfo, i4));
        bd2.e(HU1.c, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14064c));
        bd2.e(HU1.x, new Callback() { // from class: ST1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C4573dU1 c4573dU1 = (C4573dU1) UT1.this;
                WT1 wt1 = c4573dU1.e;
                wt1.e();
                EI2.h(intValue, 10, "MerchantTrust.Message.DismissReason");
                wt1.a = false;
                wt1.b = false;
                wt1.c = 0L;
                wt1.d = 0L;
                if (intValue == 3 || intValue == 4) {
                    c4573dU1.b(i, intValue == 3);
                }
            }
        });
        bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: TT1
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                WebContents b;
                C4573dU1 c4573dU1 = (C4573dU1) UT1.this;
                WT1 wt1 = c4573dU1.e;
                wt1.e();
                FI2.a("MerchantTrust.Message.Tapped");
                wt1.a = false;
                wt1.b = false;
                wt1.c = 0L;
                wt1.d = 0L;
                C8385oa2 c8385oa2 = (C8385oa2) c4573dU1.j;
                c8385oa2.getClass();
                if (AbstractC12248zp3.a(c8385oa2) && (b = ((Tab) c8385oa2.g).b()) != null) {
                    N.M$ejnyHh(b, "Shopping.MerchantTrust.MessageClicked", "HasOccurred");
                }
                c4573dU1.a(merchantInfo.c, 1, i);
                return 1;
            }
        });
        final PropertyModel a = bd2.a();
        final double d = merchantInfo.a;
        if (z) {
            j = 0;
        } else {
            int millis = (int) TimeUnit.SECONDS.toMillis(30L);
            if (AbstractC8293oI0.a()) {
                C7928nE c7928nE4 = UN.a;
                millis = N.M37SqSAy("CommerceMerchantViewer", "trust_signals_message_delay_ms", millis);
            }
            j = millis;
        }
        long j2 = j;
        final ?? r7 = new Callback() { // from class: bU1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PT1 pt12 = (PT1) obj;
                C4573dU1 c4573dU1 = C4573dU1.this;
                if (pt12 == null) {
                    c4573dU1.getClass();
                    return;
                }
                Profile profile = (Profile) ((C8385oa2) c4573dU1.g.a).g;
                PrefService prefService = null;
                MerchantTrustSignalsEventStorage merchantTrustSignalsEventStorage = profile == null ? null : (MerchantTrustSignalsEventStorage) C6634jU1.b.get(profile);
                if (merchantTrustSignalsEventStorage == null) {
                    return;
                }
                c4573dU1.e.getClass();
                WebContents webContents = pt12.a;
                if (webContents != null) {
                    N.M$ejnyHh(webContents, "Shopping.MerchantTrust.MessageSeen", "HasOccurred");
                }
                Profile profile2 = (Profile) ((C8385oa2) c4573dU1.h).g;
                if (profile2 != null && !profile2.i()) {
                    prefService = R44.a(profile2);
                }
                if (prefService != null) {
                    String l = Long.toString(System.currentTimeMillis());
                    String c = prefService.c("commerce_merchant_viewer_messages_shown_time");
                    if (TextUtils.isEmpty(c)) {
                        prefService.f("commerce_merchant_viewer_messages_shown_time", l);
                    } else {
                        String a2 = AbstractC8192o0.a(c, "_", l);
                        String[] split = a2.split("_");
                        int i5 = 3;
                        if (AbstractC8293oI0.a()) {
                            C7928nE c7928nE5 = UN.a;
                            i5 = N.M37SqSAy("CommerceMerchantViewer", "trust_signals_max_allowed_number_in_given_window", 3);
                        }
                        if (split.length <= i5) {
                            prefService.f("commerce_merchant_viewer_messages_shown_time", a2);
                        } else {
                            prefService.f("commerce_merchant_viewer_messages_shown_time", a2.substring(split[0].length() + 1));
                        }
                    }
                }
                MerchantTrustSignalsEvent merchantTrustSignalsEvent = new MerchantTrustSignalsEvent(pt12.a(), System.currentTimeMillis());
                N.MdTDFP2V(merchantTrustSignalsEventStorage.a, merchantTrustSignalsEvent.a, merchantTrustSignalsEvent.b, null);
            }
        };
        final RT1 rt1 = this.b;
        rt1.getClass();
        Pair pair = new Pair(pt1, a);
        synchronized (rt1.d) {
            rt1.e = pair;
        }
        WT1 wt1 = rt1.b;
        wt1.getClass();
        wt1.c = System.nanoTime();
        rt1.d.postDelayed(new Runnable() { // from class: QT1
            @Override // java.lang.Runnable
            public final void run() {
                NavigationHandle navigationHandle2;
                GURL gurl2;
                boolean z3;
                NavigationHandle navigationHandle3;
                GURL gurl3;
                RT1 rt12 = RT1.this;
                rt12.getClass();
                PT1 pt12 = pt1;
                WebContents webContents = pt12.a;
                boolean z4 = (webContents == null || webContents.isDestroyed() || (navigationHandle3 = pt12.b) == null || (gurl3 = navigationHandle3.e) == null || gurl3.k()) ? false : true;
                Callback callback = r7;
                InterfaceC7697ma2 interfaceC7697ma2 = rt12.c;
                WebContents webContents2 = pt12.a;
                if (z4) {
                    C8385oa2 c8385oa2 = (C8385oa2) interfaceC7697ma2;
                    c8385oa2.getClass();
                    if (AbstractC12248zp3.a(c8385oa2) && webContents2.equals(((Tab) c8385oa2.g).b())) {
                        String a2 = pt12.a();
                        WT1 wt12 = rt12.b;
                        wt12.getClass();
                        wt12.m = System.nanoTime();
                        wt12.n = 0;
                        wt12.p = a2;
                        wt12.o = d;
                        if (AbstractC8293oI0.a()) {
                            C7928nE c7928nE5 = UN.a;
                            z3 = N.M6bsIDpc("CommerceMerchantViewer", "trust_signals_message_disabled_for_impact_study", false);
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            callback.onResult(pt12);
                            rt12.b(0);
                            return;
                        }
                        ((C5265fV1) rt12.a).b(a, webContents2, 2, false);
                        wt12.d = System.nanoTime();
                        wt12.d();
                        callback.onResult(pt12);
                        synchronized (rt12.d) {
                            rt12.e = null;
                        }
                        return;
                    }
                }
                callback.onResult(null);
                WebContents webContents3 = pt12.a;
                if (!((webContents3 == null || webContents3.isDestroyed() || (navigationHandle2 = pt12.b) == null || (gurl2 = navigationHandle2.e) == null || gurl2.k()) ? false : true)) {
                    rt12.b(3);
                    return;
                }
                C8385oa2 c8385oa22 = (C8385oa2) interfaceC7697ma2;
                c8385oa22.getClass();
                if (AbstractC12248zp3.a(c8385oa22) && !webContents2.equals(((Tab) c8385oa22.g).b())) {
                    rt12.b(4);
                } else {
                    rt12.b(0);
                }
            }
        }, j2);
    }

    public C4573dU1(a aVar, C10285u6 c10285u6, m mVar, View view, InterfaceC4578dV1 interfaceC4578dV1, C6166i6 c6166i6, InterfaceC7697ma2 interfaceC7697ma2, WT1 wt1, C2021Po1 c2021Po1) {
        RT1 rt1 = new RT1(interfaceC4578dV1, wt1, c6166i6);
        C5260fU1 c5260fU1 = new C5260fU1();
        JT1 jt1 = new JT1(aVar, c10285u6, mVar, view, wt1, c2021Po1, interfaceC7697ma2);
        C6634jU1 c6634jU1 = new C6634jU1(interfaceC7697ma2);
        this.d = aVar;
        this.f = c5260fU1;
        this.e = wt1;
        this.g = c6634jU1;
        this.h = interfaceC7697ma2;
        this.i = c10285u6;
        this.j = c6166i6;
        this.a = new C5948hU1(c6166i6, new YT1(this), wt1);
        this.b = rt1;
        this.c = jt1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [XT1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [FT1] */
    /* JADX WARN: Type inference failed for: r8v3, types: [GT1] */
    public final void a(GURL gurl, final int i, final String str) {
        this.e.getClass();
        EI2.h(i, 3, "MerchantTrust.BottomSheet.OpenSource");
        String string = this.d.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140657);
        ?? r1 = new Runnable() { // from class: XT1
            @Override // java.lang.Runnable
            public final void run() {
                C4573dU1 c4573dU1 = C4573dU1.this;
                if (i == 1) {
                    c4573dU1.b(str, true);
                } else {
                    c4573dU1.getClass();
                }
            }
        };
        final JT1 jt1 = this.c;
        ET1 et1 = jt1.l;
        QB qb = jt1.g;
        OT1 ot1 = jt1.j;
        if (et1 == null) {
            Context context = jt1.a;
            jt1.o = new C6542jC(context);
            HashMap e = PropertyModel.e(AbstractC5512gC.m);
            PD2 pd2 = AbstractC5512gC.h;
            Runnable runnable = new Runnable() { // from class: GT1
                @Override // java.lang.Runnable
                public final void run() {
                    JT1 jt12 = JT1.this;
                    ((m) jt12.g).l(jt12.l, true, 0);
                }
            };
            GD2 gd2 = new GD2();
            gd2.a = runnable;
            e.put(pd2, gd2);
            ND2 nd2 = AbstractC5512gC.i;
            DD2 dd2 = new DD2();
            dd2.a = R.drawable.0_resource_name_obfuscated_res_0x7f09024f;
            e.put(nd2, dd2);
            LD2 ld2 = AbstractC5512gC.k;
            AD2 ad2 = new AD2();
            ad2.a = true;
            e.put(ld2, ad2);
            LD2 ld22 = AbstractC5512gC.l;
            AD2 ad22 = new AD2();
            ad22.a = false;
            e.put(ld22, ad22);
            PropertyModel propertyModel = new PropertyModel(e);
            jt1.p = propertyModel;
            jt1.q = UD2.a(propertyModel, jt1.o, new TD2() { // from class: HT1
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel2 = (PropertyModel) wd2;
                    C6542jC c6542jC = (C6542jC) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd22 = AbstractC5512gC.a;
                    if (pd22 != fd2) {
                        PD2 pd23 = AbstractC5512gC.b;
                        if (pd23 != fd2) {
                            MD2 md2 = AbstractC5512gC.c;
                            if (md2 != fd2) {
                                LD2 ld23 = AbstractC5512gC.d;
                                if (ld23 != fd2) {
                                    ND2 nd22 = AbstractC5512gC.e;
                                    if (nd22 != fd2) {
                                        PD2 pd24 = AbstractC5512gC.f;
                                        if (pd24 != fd2) {
                                            PD2 pd25 = AbstractC5512gC.g;
                                            if (pd25 == fd2) {
                                                final Runnable runnable2 = (Runnable) propertyModel2.i(pd25);
                                                ((ImageView) c6542jC.b.findViewById(R.id.security_icon)).setOnClickListener(new View.OnClickListener() { // from class: hC
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        Runnable runnable3 = runnable2;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            PD2 pd26 = AbstractC5512gC.h;
                                            if (pd26 == fd2) {
                                                final Runnable runnable3 = (Runnable) propertyModel2.i(pd26);
                                                ((ImageView) c6542jC.b.findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() { // from class: iC
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        Runnable runnable4 = runnable3;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            ND2 nd23 = AbstractC5512gC.i;
                                            if (nd23 != fd2) {
                                                PD2 pd27 = AbstractC5512gC.j;
                                                if (pd27 != fd2) {
                                                    LD2 ld24 = AbstractC5512gC.k;
                                                    if (ld24 != fd2) {
                                                        LD2 ld25 = AbstractC5512gC.l;
                                                        if (ld25 == fd2) {
                                                            ((ImageView) c6542jC.b.findViewById(R.id.open_in_new_tab)).setVisibility(propertyModel2.j(ld25) ? 0 : 8);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    ((ImageView) c6542jC.b.findViewById(R.id.favicon)).setVisibility(propertyModel2.j(ld24) ? 0 : 8);
                                                    return;
                                                }
                                                ((ImageView) c6542jC.b.findViewById(R.id.favicon)).setImageDrawable((Drawable) propertyModel2.i(pd27));
                                                return;
                                            }
                                            ((ImageView) c6542jC.b.findViewById(R.id.favicon)).setImageResource(propertyModel2.h(nd23));
                                            return;
                                        }
                                        ((ImageView) c6542jC.b.findViewById(R.id.security_icon)).setContentDescription((String) propertyModel2.i(pd24));
                                        return;
                                    }
                                    ((ImageView) c6542jC.b.findViewById(R.id.security_icon)).setImageResource(propertyModel2.h(nd22));
                                    return;
                                }
                                ((ProgressBar) c6542jC.b.findViewById(R.id.progress_bar)).setVisibility(propertyModel2.j(ld23) ? 0 : 8);
                                return;
                            }
                            ((ProgressBar) c6542jC.b.findViewById(R.id.progress_bar)).setProgress(Math.round(propertyModel2.g(md2) * 100.0f));
                            return;
                        }
                        ((TextView) c6542jC.b.findViewById(R.id.title)).setText((String) propertyModel2.i(pd23));
                        return;
                    }
                    ((TextView) c6542jC.b.findViewById(R.id.origin)).setText(AbstractC10615v34.b(1, (GURL) propertyModel2.i(pd22)));
                }
            });
            C6930kK3 c6930kK3 = new C6930kK3(context, new C6586jK3(), jt1.r);
            jt1.n = c6930kK3;
            c6930kK3.setLayoutParams(new FrameLayout.LayoutParams(-1, ((int) (((m) qb).f() * 0.9f)) - jt1.o.a));
            C6930kK3 c6930kK32 = jt1.n;
            c6930kK32.getClass();
            ((ViewGroup.MarginLayoutParams) c6930kK32.getLayoutParams()).topMargin = jt1.o.a;
            C6930kK3 c6930kK33 = jt1.n;
            ot1.h = jt1.p;
            WebContents webContents = (WebContents) N.MBvQ4D5k(Profile.d(), false, false);
            ot1.i = webContents;
            Q50 q50 = new Q50(ot1.a, webContents);
            ot1.j = q50;
            ot1.i.I(new ViewAndroidDelegate(q50), ot1.j, ot1.b, new C6047hl4());
            N.MpNVVknM(ot1.i, false);
            ot1.l = new LT1(ot1, ot1.i);
            ot1.k = new NT1(ot1);
            Q50 q502 = ot1.j;
            if (q502 != null && q502.getParent() != null) {
                ((ViewGroup) ot1.j.getParent()).removeView(ot1.j);
            }
            c6930kK33.a(ot1.i, ot1.j, ot1.k);
            View view = jt1.o.b;
            C6930kK3 c6930kK34 = jt1.n;
            c6930kK34.getClass();
            jt1.l = new ET1(view, c6930kK34, new InterfaceC0079Ap3() { // from class: FT1
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    WebContents webContents2 = JT1.this.j.i;
                    return Integer.valueOf(webContents2 == null ? 0 : ((WebContentsImpl) webContents2).m.c());
                }
            }, new Runnable() { // from class: GT1
                @Override // java.lang.Runnable
                public final void run() {
                    JT1 jt12 = JT1.this;
                    ((m) jt12.g).l(jt12.l, true, 0);
                }
            });
            IT1 it1 = new IT1(jt1, r1);
            jt1.k = it1;
            ((m) qb).a(it1);
            jt1.h.addOnLayoutChangeListener(jt1);
        }
        ot1.a(gurl);
        ot1.h.o(AbstractC5512gC.b, string);
        ((m) qb).p(jt1.l, true);
    }

    public final void b(String str, final boolean z) {
        InterfaceC4229cU1 interfaceC4229cU1;
        if (!N.MRiRQ_Ey(N.MDKqWa7S(1)) || (interfaceC4229cU1 = this.k) == null || str == null) {
            return;
        }
        Context context = this.d;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = GP2.a;
        Drawable drawable = resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f090324, theme);
        final C1359Kl3 c1359Kl3 = (C1359Kl3) interfaceC4229cU1;
        if (this.i == c1359Kl3.f11453J) {
            InterfaceC3472aG1 interfaceC3472aG1 = c1359Kl3.C;
            if (!str.equals(interfaceC3472aG1.h()) || interfaceC3472aG1.isIncognito()) {
                return;
            }
            c1359Kl3.a();
            C1618Ml3 c1618Ml3 = new C1618Ml3(drawable, false);
            c1618Ml3.e = 1;
            c1618Ml3.f = new Runnable() { // from class: Il3
                public final /* synthetic */ int h = R.string.0_resource_name_obfuscated_res_0x7f140652;

                @Override // java.lang.Runnable
                public final void run() {
                    C1359Kl3 c1359Kl32 = C1359Kl3.this;
                    if (!z) {
                        c1359Kl32.getClass();
                        return;
                    }
                    int i = c1359Kl32.P - 500;
                    C9798sh2 c9798sh2 = c1359Kl32.H;
                    View view = c9798sh2.b;
                    Resources resources2 = view.getContext().getResources();
                    int i2 = this.h;
                    C12180ze1 c12180ze1 = new C12180ze1(resources2, "IPH_PageInfoStoreInfo", i2, i2);
                    c12180ze1.m = i;
                    c12180ze1.h = view;
                    c12180ze1.e = true;
                    c9798sh2.a.a(c12180ze1.a());
                }
            };
            c1359Kl3.a.o(AbstractC1878Ol3.j, c1618Ml3);
            c1359Kl3.F.postDelayed(new Runnable() { // from class: Jl3
                @Override // java.lang.Runnable
                public final void run() {
                    C1359Kl3.this.d(1);
                }
            }, c1359Kl3.P);
            c1359Kl3.L = true;
            c1359Kl3.I.a(4);
        }
    }
}
