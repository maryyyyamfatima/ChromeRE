package org.chromium.chrome.browser.contextualsearch;

import J.N;
import android.app.Activity;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractC8584p80;
import defpackage.C0129Az3;
import defpackage.C0967Hl1;
import defpackage.C10285u6;
import defpackage.C10978w70;
import defpackage.C11321x70;
import defpackage.C11664y70;
import defpackage.C12157za2;
import defpackage.C3847bM2;
import defpackage.C4803e80;
import defpackage.C5491g80;
import defpackage.C6166i6;
import defpackage.C70;
import defpackage.C7928nE;
import defpackage.C8241o80;
import defpackage.C9263r70;
import defpackage.C9897sy1;
import defpackage.CC;
import defpackage.CL;
import defpackage.D70;
import defpackage.E70;
import defpackage.EI2;
import defpackage.F70;
import defpackage.FO2;
import defpackage.G1;
import defpackage.H70;
import defpackage.IG3;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC5835h80;
import defpackage.InterfaceC9949t70;
import defpackage.OX2;
import defpackage.Q70;
import defpackage.S70;
import defpackage.T34;
import defpackage.UN;
import defpackage.VK2;
import defpackage.ViewTreeObserverOnGlobalFocusChangeListenerC10635v70;
import defpackage.XU0;
import defpackage.ZU0;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.translate.TranslateBridge;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextualSearchManager implements InterfaceC9949t70, H70, InterfaceC5835h80, G1 {
    public C11664y70 A;
    public boolean B;
    public boolean C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ContextualSearchContext I;

    /* renamed from: J */
    public boolean f11521J;
    public boolean K;
    public C4803e80 L;
    public C4803e80 M;
    public C3847bM2 N;
    public boolean O;
    public FO2 P;
    public boolean Q;
    public boolean R;
    public int S;
    public D70 T;
    public final InterfaceC0079Ap3 U;
    public C9897sy1 V;
    public final C12157za2 a = new C12157za2();
    public final Activity g;
    public final F70 h;
    public final ViewTreeObserverOnGlobalFocusChangeListenerC10635v70 i;
    public final C10978w70 j;
    public final C8241o80 k;
    public final E70 l;
    public final OX2 m;
    public final ZU0 n;
    public final WindowAndroid o;
    public final InterfaceC10590uz3 p;
    public final InterfaceC0079Ap3 q;
    public final C5491g80 r;
    public final ContextualSearchManager s;
    public final S70 t;
    public final C9263r70 u;
    public Q70 v;
    public long w;
    public ViewGroup x;
    public VK2 y;
    public C11321x70 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "default_query_chip"
            r1 = 0
            if (r13 == 0) goto Le
            nE r2 = defpackage.UN.a
            java.lang.String r2 = "RelatedSearchesInBar"
            boolean r0 = J.N.M6bsIDpc(r2, r0, r1)
            goto L16
        Le:
            nE r2 = defpackage.UN.a
            java.lang.String r2 = "RelatedSearchesAlternateUx"
            boolean r0 = J.N.M6bsIDpc(r2, r0, r1)
        L16:
            bM2 r2 = r11.N
            if (r2 != 0) goto L1b
            return
        L1b:
            if (r13 == 0) goto L2c
            Q70 r2 = r11.v
            boolean r2 = r2.t()
            if (r2 == 0) goto L2c
            Q70 r2 = r11.v
            r3 = 12
            r2.e0(r3)
        L2c:
            if (r0 == 0) goto L51
            if (r12 != 0) goto L51
            e80 r12 = new e80
            FO2 r13 = r11.P
            java.lang.String r5 = r13.a
            java.lang.String r6 = r13.b
            java.lang.String r7 = r13.c
            r10 = 0
            java.lang.String r8 = r13.j
            java.lang.String r9 = r13.k
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.L = r12
            Q70 r12 = r11.v
            FO2 r13 = r11.P
            java.lang.String r13 = r13.a
            r12.H(r13)
            r11.O = r1
            goto Lc0
        L51:
            bM2 r2 = r11.N
            java.util.ArrayList r2 = r2.a(r13)
            int r12 = r12 - r0
            java.lang.Object r0 = r2.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            bM2 r2 = r11.N
            org.json.JSONArray r13 = r2.b(r13)
            if (r13 != 0) goto L67
            goto L9c
        L67:
            org.json.JSONObject r13 = r13.getJSONObject(r12)     // Catch: org.json.JSONException -> L7a
            java.lang.String r2 = "searchUrl"
            java.lang.String r13 = r13.getString(r2)     // Catch: org.json.JSONException -> L7a
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch: org.json.JSONException -> L7a
            android.net.Uri r12 = defpackage.C4190cM2.b(r12, r13)     // Catch: org.json.JSONException -> L7a
            goto L9d
        L7a:
            r13 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RelatedSearchesList cannot find a searchUrl in suggestion "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r12 = "\n"
            r2.append(r12)
            java.lang.String r12 = r13.getMessage()
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.String r2 = "ContextualSearch"
            defpackage.AbstractC4851eH1.f(r2, r12, r13)
        L9c:
            r12 = 0
        L9d:
            if (r12 == 0) goto Lb1
            e80 r13 = new e80
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            java.lang.String r6 = r12.toString()
            r7 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.L = r13
            goto Lb8
        Lb1:
            e80 r12 = new e80
            r12.<init>(r0, r1)
            r11.L = r12
        Lb8:
            Q70 r12 = r11.v
            r12.H(r0)
            r12 = 1
            r11.O = r12
        Lc0:
            r11.l()
            org.chromium.content_public.browser.WebContents r12 = r11.g()
            if (r12 == 0) goto Ld0
            org.chromium.content_public.browser.WebContents r12 = r11.g()
            r12.T0()
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.n(int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.FO2 r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.e(FO2, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSearchTermResolutionResponse(boolean r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, int r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, java.lang.String r36, java.lang.String r37, int r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.onSearchTermResolutionResponse(boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public void onTextSurroundingSelectionAvailable(String str, String str2, int i, int i2) {
        int i3;
        C9263r70 c9263r70 = this.u;
        if (c9263r70.d == 9) {
            if (str2.length() == 0) {
                c9263r70.c(0);
                return;
            }
            ContextualSearchContext contextualSearchContext = this.I;
            contextualSearchContext.i = str;
            contextualSearchContext.c = str2;
            contextualSearchContext.d = i;
            contextualSearchContext.e = i2;
            if (i == i2 && i <= str2.length()) {
                if (!(contextualSearchContext.g >= 0)) {
                    contextualSearchContext.g = i;
                    int i4 = i - 1;
                    while (true) {
                        if (i4 < 0) {
                            i3 = -1;
                            break;
                        }
                        if ((Character.isLetterOrDigit(contextualSearchContext.c.charAt(i4)) || contextualSearchContext.c.charAt(i4) == 173) ? false : true) {
                            i3 = i4 + 1;
                            break;
                        }
                        i4--;
                    }
                    int i5 = contextualSearchContext.g;
                    while (true) {
                        if (i5 >= contextualSearchContext.c.length()) {
                            i5 = -1;
                            break;
                        } else {
                            if ((Character.isLetterOrDigit(contextualSearchContext.c.charAt(i5)) || contextualSearchContext.c.charAt(i5) == 173) ? false : true) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    if (i3 != -1 && i5 != -1) {
                        contextualSearchContext.c.substring(i3, i5);
                    }
                }
            }
            if (i2 > i) {
                contextualSearchContext.a();
            }
            if (contextualSearchContext.f == null) {
                contextualSearchContext.f = N.Mi_5NNCP(contextualSearchContext.a, contextualSearchContext);
            }
            String str3 = contextualSearchContext.f;
            String str4 = contextualSearchContext.j;
            String str5 = contextualSearchContext.k;
            if (str4.equals(str5)) {
                str5 = "";
            }
            N.Mv7i3uKU(contextualSearchContext.a, contextualSearchContext, str3, str4, str5);
            ContextualSearchContext contextualSearchContext2 = this.I;
            if (contextualSearchContext2.f == null) {
                contextualSearchContext2.f = N.Mi_5NNCP(contextualSearchContext2.a, contextualSearchContext2);
            }
            if (this.t.c.a(contextualSearchContext2.f)) {
                EI2.b("Search.RelatedSearches.QualifiedUsers", true);
            }
            c9263r70.b(9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(org.chromium.chrome.browser.contextualsearch.ContextualSearchManager r8) {
        /*
            g80 r0 = r8.r
            boolean r0 = r0.p
            org.chromium.chrome.browser.contextualsearch.ContextualSearchContext r1 = r8.I
            java.lang.String r2 = r1.f
            if (r2 != 0) goto L12
            long r2 = r1.a
            java.lang.String r2 = J.N.Mi_5NNCP(r2, r1)
            r1.f = r2
        L12:
            java.lang.String r2 = r1.f
            S70 r3 = r8.t
            cM2 r3 = r3.c
            boolean r2 = r3.a(r2)
            r3 = 0
            r4 = 1
            java.lang.String r5 = "RelatedSearches"
            if (r2 == 0) goto L2c
            nE r2 = defpackage.UN.a
            boolean r2 = J.N.M09VlOh_(r5)
            if (r2 == 0) goto L2c
            r2 = r4
            goto L2d
        L2c:
            r2 = r3
        L2d:
            java.lang.String r6 = ""
            if (r2 != 0) goto L33
            r2 = r6
            goto L7f
        L33:
            nE r2 = defpackage.UN.a
            java.lang.String r2 = "language_allowlist"
            java.lang.String r2 = J.N.MMltG$kc(r5, r2)
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 == 0) goto L43
            java.lang.String r2 = "en"
        L43:
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ r4
            java.lang.String r7 = "stamp"
            java.lang.String r5 = J.N.MMltG$kc(r5, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L56
            java.lang.String r5 = "1Rn"
        L56:
            java.lang.StringBuilder r5 = defpackage.AbstractC10761vV3.a(r5)
            if (r2 == 0) goto L61
            java.lang.String r2 = "l"
            r5.append(r2)
        L61:
            java.lang.String r2 = "RelatedSearchesUi"
            boolean r7 = J.N.M09VlOh_(r2)
            if (r7 != 0) goto L6c
            java.lang.String r2 = "d"
            goto L72
        L6c:
            java.lang.String r7 = "verbosity"
            java.lang.String r2 = J.N.MMltG$kc(r2, r7)
        L72:
            int r7 = r2.length()
            if (r7 <= 0) goto L7b
            r5.append(r2)
        L7b:
            java.lang.String r2 = r5.toString()
        L7f:
            java.lang.String r5 = r1.c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto La2
            int r5 = r1.e
            int r7 = r1.d
            if (r5 < r7) goto La2
            if (r7 < 0) goto La2
            java.lang.String r7 = r1.c
            int r7 = r7.length()
            if (r5 <= r7) goto L98
            goto La2
        L98:
            java.lang.String r5 = r1.c
            int r6 = r1.d
            int r7 = r1.e
            java.lang.String r6 = r5.substring(r6, r7)
        La2:
            r1.h = r6
            long r5 = r1.a
            J.N.MTiIgddI(r5, r1, r0, r2)
            org.chromium.chrome.browser.contextualsearch.ContextualSearchManager r8 = r8.s
            long r0 = r8.w
            org.chromium.chrome.browser.contextualsearch.ContextualSearchContext r2 = r8.I
            org.chromium.content_public.browser.WebContents r5 = r8.f()
            J.N.MciyR$hg(r0, r8, r2, r5)
            g80 r8 = r8.r
            int r8 = r8.f
            if (r8 != r4) goto Lbd
            r3 = r4
        Lbd:
            java.util.regex.Pattern r8 = defpackage.AbstractC8584p80.a
            java.lang.String r8 = "Search.ContextualSearch.ResolveRequested"
            defpackage.EI2.b(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.b(org.chromium.chrome.browser.contextualsearch.ContextualSearchManager):void");
    }

    public ContextualSearchManager(Activity activity, F70 f70, OX2 ox2, C6166i6 c6166i6, XU0 xu0, CC cc, C10285u6 c10285u6, InterfaceC10590uz3 interfaceC10590uz3, CL cl) {
        this.g = activity;
        this.h = f70;
        this.m = ox2;
        this.U = c6166i6;
        this.n = xu0;
        this.o = c10285u6;
        this.p = interfaceC10590uz3;
        this.q = cl;
        this.i = new ViewTreeObserverOnGlobalFocusChangeListenerC10635v70(this, activity.findViewById(R.id.control_container));
        C10978w70 c10978w70 = new C10978w70(this);
        this.j = c10978w70;
        xu0.a(c10978w70);
        C5491g80 c5491g80 = new C5491g80(activity, this, c6166i6);
        this.r = c5491g80;
        this.s = this;
        S70 s70 = new S70(c5491g80, this);
        this.t = s70;
        this.k = new C8241o80();
        this.u = new C9263r70(s70, new C70(this));
        this.l = new E70(this);
    }

    public final boolean j() {
        Q70 q70 = this.v;
        return q70 != null && q70.a();
    }

    public final WebContents g() {
        Q70 q70 = this.v;
        if (q70 == null) {
            return null;
        }
        return q70.b();
    }

    public final WebContents f() {
        return this.r.b();
    }

    public final void i(int i) {
        this.u.c(Integer.valueOf(i));
    }

    public static void c(ContextualSearchManager contextualSearchManager, int i) {
        C4803e80 c4803e80;
        ((C0129Az3) contextualSearchManager.p).f();
        if (!contextualSearchManager.v.a()) {
            Tab tab = (Tab) contextualSearchManager.U.get();
            InfoBarContainer c = tab == null ? null : InfoBarContainer.c(tab);
            if (c != null) {
                C0967Hl1 c0967Hl1 = c.q;
                if ((c0967Hl1 != null ? c0967Hl1.getVisibility() : 8) == 0) {
                    contextualSearchManager.F = true;
                    c.e(true);
                }
            }
        }
        int v = contextualSearchManager.v.v();
        if (!contextualSearchManager.E && contextualSearchManager.D != 0 && v != 0 && v != 1 && (c4803e80 = contextualSearchManager.M) != null) {
            contextualSearchManager.v.g(contextualSearchManager.D, c4803e80.b());
        }
        contextualSearchManager.v.e();
        String str = contextualSearchManager.r.e;
        S70 s70 = contextualSearchManager.t;
        int i2 = s70.b.f;
        boolean z = i2 == 1 || i2 == 3;
        if (z) {
            contextualSearchManager.f11521J = false;
        }
        if (!z || !S70.c()) {
            if (!TextUtils.isEmpty(str)) {
                boolean g = s70.g();
                C4803e80 c4803e802 = new C4803e80(str, g);
                contextualSearchManager.L = c4803e802;
                contextualSearchManager.k.a.getClass();
                c4803e802.a("", N.MMKf4EpW());
                contextualSearchManager.B = false;
                contextualSearchManager.v.H(str);
                contextualSearchManager.O = false;
                if (g) {
                    contextualSearchManager.l();
                }
            } else {
                contextualSearchManager.i(0);
                return;
            }
        }
        contextualSearchManager.E = false;
        if (S70.e()) {
            contextualSearchManager.v.y(true);
            contextualSearchManager.v.B();
        }
        contextualSearchManager.v.U(i);
    }

    public void clearNativeManager() {
        this.w = 0L;
    }

    public void setNativeManager(long j) {
        this.w = j;
    }

    public static void a(ContextualSearchManager contextualSearchManager) {
        boolean Mfmn09fr;
        C8241o80 c8241o80 = contextualSearchManager.k;
        c8241o80.a.getClass();
        String MMKf4EpW = N.MMKf4EpW();
        String str = "";
        if (MMKf4EpW == null) {
            MMKf4EpW = "";
        }
        c8241o80.a.getClass();
        String join = TextUtils.join(",", TranslateBridge.a());
        if (join == null) {
            join = "";
        }
        ContextualSearchContext contextualSearchContext = contextualSearchManager.I;
        S70 s70 = contextualSearchManager.t;
        s70.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) contextualSearchManager.g.getSystemService("phone");
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(simCountryIso)) {
                str = simCountryIso;
            }
        }
        if ((S70.c() || S70.d()) && IG3.a().e()) {
            WebContents f = ((ContextualSearchManager) s70.d).f();
            GURL f2 = f == null ? null : f.f();
            if (f2 != null) {
                Pattern pattern = T34.a;
                if (T34.l(f2.h())) {
                    Mfmn09fr = N.Mfmn09fr(Profile.d());
                    contextualSearchContext.b = true;
                    N.MjXeVW3V(contextualSearchContext.getNativePointer(), contextualSearchContext, str, Mfmn09fr);
                    contextualSearchContext.j = MMKf4EpW;
                    contextualSearchContext.k = join;
                }
            }
        }
        Mfmn09fr = false;
        contextualSearchContext.b = true;
        N.MjXeVW3V(contextualSearchContext.getNativePointer(), contextualSearchContext, str, Mfmn09fr);
        contextualSearchContext.j = MMKf4EpW;
        contextualSearchContext.k = join;
    }

    public final void l() {
        this.D = System.currentTimeMillis();
        C4803e80 c4803e80 = this.L;
        this.M = c4803e80;
        this.v.f0(c4803e80.b());
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("RelatedSearches")) {
            this.v.d().setFocusableInTouchMode(false);
        }
        this.B = true;
        if (!this.v.a0() || g() == null) {
            return;
        }
        g().T0();
    }

    @Override // defpackage.G1
    public final void D(boolean z) {
        this.Q = z;
        if (z) {
            i(0);
        }
    }

    public final void m(String str) {
        if (this.G || this.v == null || "about:blank".equals(str) || str.startsWith("intent:")) {
            return;
        }
        if (this.v.i() && !this.v.I()) {
            this.G = true;
            this.v.N();
        }
    }

    public final void o() {
        this.K = true;
        if (this.L != null && g() != null) {
            WebContents g = g();
            NavigationEntry w = g.i().w();
            String i = (w != null ? w.b : g.f()).i();
            if (i.equals(this.L.b())) {
                i = this.L.c();
            }
            if (i != null) {
                this.h.i(i);
                this.v.j0(11, false);
            }
        }
        this.K = false;
    }

    public final void h() {
        if (!k() && j() && !this.K && this.v.t()) {
            i(6);
        }
    }

    public final ArrayList d(String str, boolean z, boolean z2) {
        String str2 = z ? "RelatedSearchesInBar" : "RelatedSearchesAlternateUx";
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_(str2)) {
            return null;
        }
        ArrayList a = this.N.a(z);
        if (!z2 || a.size() == 0) {
            return a;
        }
        ArrayList arrayList = new ArrayList(a.size() + 1);
        arrayList.add(str);
        arrayList.addAll(a);
        return arrayList;
    }

    public final boolean k() {
        boolean z = false;
        if (this.R || this.Q) {
            return true;
        }
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("ContextualSearchSuppressShortView")) {
            return false;
        }
        Tab tab = (Tab) this.U.get();
        int height = (tab == null || tab.a() == null) ? 0 : tab.a().getHeight();
        if (height > 0 && height < this.g.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08014f)) {
            z = true;
        }
        Pattern pattern = AbstractC8584p80.a;
        EI2.b("Search.ContextualSearch.SuppressedViewTooSmall", z);
        return z;
    }
}
