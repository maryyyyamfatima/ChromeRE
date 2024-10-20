package org.chromium.chrome.browser.locale;

import J.N;
import android.app.Activity;
import android.text.TextUtils;
import defpackage.EI2;
import defpackage.IF1;
import defpackage.IG3;
import defpackage.InterfaceC9814sk0;
import defpackage.LF1;
import defpackage.O83;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.url.GURL;
import org.chromium.url.Parsed;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LocaleManager implements InterfaceC9814sk0 {
    public static final LocaleManager b = new LocaleManager();
    public final IF1 a;

    public static LocaleManager getInstance() {
        return b;
    }

    public LocaleManager() {
        IF1 if1 = new IF1();
        this.a = if1;
        if1.g = this;
    }

    public final void c(final Activity activity, final Callback callback) {
        final IF1 if1 = this.a;
        if1.getClass();
        IG3.a().i(new Runnable() { // from class: yF1
            /* JADX WARN: Type inference failed for: r1v0, types: [zF1] */
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0079Ap3 interfaceC0079Ap3;
                final EF1 ef1 = if1;
                ef1.getClass();
                final Callback callback2 = callback;
                final C12051zF1 r1 = new Callback() { // from class: zF1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        */
                    @Override // org.chromium.base.Callback
                    public final void onResult(java.lang.Object r5) {
                        /*
                            r4 = this;
                            java.lang.Boolean r5 = (java.lang.Boolean) r5
                            EF1 r0 = defpackage.EF1.this
                            r1 = 1
                            if (r5 == 0) goto L13
                            r0.getClass()
                            boolean r2 = r5.booleanValue()
                            if (r2 == 0) goto L13
                            r0.c = r1
                            goto L2c
                        L13:
                            int r2 = r0.b()
                            if (r2 == r1) goto L1c
                            r1 = 2
                            if (r2 != r1) goto L2c
                        L1c:
                            IF1 r0 = (defpackage.IF1) r0
                            SZ2 r0 = r0.i()
                            KF1 r1 = new KF1
                            java.lang.String r3 = ""
                            r1.<init>(r2, r3)
                            defpackage.UZ2.a(r0, r2, r3, r1)
                        L2c:
                            org.chromium.base.Callback r0 = r2
                            if (r0 == 0) goto L33
                            r0.onResult(r5)
                        L33:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12051zF1.onResult(java.lang.Object):void");
                    }
                };
                TemplateUrlService a = IG3.a();
                if (N.MELaF8Vs(a.c, a) || AbstractC9771sd.e()) {
                    r1.onResult(Boolean.TRUE);
                    return;
                }
                final int b2 = ef1.b();
                if (b2 == -1) {
                    r1.onResult(Boolean.TRUE);
                    return;
                }
                final Activity activity2 = activity;
                if (b2 == 0) {
                    interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: AF1
                        @Override // defpackage.InterfaceC0079Ap3
                        public final /* synthetic */ boolean i() {
                            return AbstractC12248zp3.a(this);
                        }

                        /* JADX WARN: Type inference failed for: r2v0, types: [CF1] */
                        @Override // defpackage.InterfaceC0079Ap3
                        public final Object get() {
                            final EF1 ef12 = EF1.this;
                            ef12.getClass();
                            return new DialogC6359ig3(activity2, new Callback() { // from class: CF1
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    EF1 ef13 = EF1.this;
                                    ef13.getClass();
                                    O83.a.p("LocaleManager_PREF_AUTO_SWITCH", booleanValue);
                                    if (ef13.c()) {
                                        MF1 a2 = ef13.a();
                                        a2.b = N.Mhja8Ht3(a2.a);
                                    }
                                    if (booleanValue) {
                                        ef13.e();
                                    }
                                }
                            }, r1, ef12.f);
                        }
                    };
                } else if (b2 == 1 || b2 == 2) {
                    interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: BF1
                        @Override // defpackage.InterfaceC0079Ap3
                        public final /* synthetic */ boolean i() {
                            return AbstractC12248zp3.a(this);
                        }

                        @Override // defpackage.InterfaceC0079Ap3
                        public final Object get() {
                            EF1 ef12 = EF1.this;
                            ef12.getClass();
                            return new DialogC11529xk0(activity2, ef12.g, b2, r1);
                        }
                    };
                } else {
                    r1.onResult(Boolean.TRUE);
                    return;
                }
                if (ApplicationStatus.c(activity2) == 6) {
                    r1.onResult(Boolean.FALSE);
                } else {
                    ((OC2) interfaceC0079Ap3.get()).show();
                    ef1.b = true;
                }
            }
        });
    }

    public String getYandexReferralId() {
        return this.a.j();
    }

    public String getMailRUReferralId() {
        return this.a.g();
    }

    public final boolean a() {
        IF1 if1 = this.a;
        if1.getClass();
        boolean m = IF1.m();
        boolean k = if1.k();
        if1.i.getClass();
        boolean z = LF1.d("BY") || LF1.d("RU");
        if (m || (z && !k)) {
            return !if1.c && O83.a.f(-1, "com.android.chrome.SEARCH_ENGINE_PROMO_SHOWN") == -1;
        }
        return false;
    }

    public void recordUserTypeMetrics() {
        EI2.h(this.a.j.a(), 6, "ChinaMode.UserType");
    }

    public final void b(String str, int i, boolean z) {
        String str2;
        IF1 if1 = this.a;
        if (if1.a && IF1.m() && i == 1) {
            TemplateUrlService a = IG3.a();
            String b2 = IG3.a().c().b();
            if (TextUtils.equals(if1.i().a(), b2)) {
                str2 = "clid=" + if1.j();
            } else {
                if1.i().getClass();
                if (!TextUtils.equals("mail.ru", b2)) {
                    return;
                }
                str2 = "gp=" + if1.g();
            }
            GURL gurl = new GURL(str);
            a.getClass();
            Object obj = ThreadUtils.a;
            if (N.MF3JCGn0(a.c, a, gurl)) {
                Parsed parsed = gurl.c;
                if (gurl.c(parsed.m, parsed.n).contains(str2)) {
                    EI2.h(IF1.h(b2), 64, "Search.PartnershipSearchEngineUsed");
                    EI2.h(!z ? 1 : 0, 2, "Search.PartnershipSearchPerformed");
                }
            }
        }
    }
}
