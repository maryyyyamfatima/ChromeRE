package org.chromium.chrome.browser.omnibox;

import J.N;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import com.android.chrome.R;
import defpackage.AN3;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC1878Ol3;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC4159cG1;
import defpackage.AbstractC5038ep3;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC5107f12;
import defpackage.AbstractC5647gc2;
import defpackage.AbstractC6413ip3;
import defpackage.AbstractC8215o34;
import defpackage.C0257Bz1;
import defpackage.C0538Ed2;
import defpackage.C10021tL;
import defpackage.C10285u6;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C1245Jp;
import defpackage.C1297Jz1;
import defpackage.C1359Kl3;
import defpackage.C2336Rz1;
import defpackage.C2649Uk;
import defpackage.C4496dF;
import defpackage.C5303fc2;
import defpackage.C5809h34;
import defpackage.C5878hG1;
import defpackage.C6153i34;
import defpackage.C6222iG1;
import defpackage.C7183l34;
import defpackage.C7815mu0;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.C8815pp;
import defpackage.C9531ru0;
import defpackage.C9861ss;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.HG3;
import defpackage.InterfaceC0408Dd2;
import defpackage.InterfaceC10272u34;
import defpackage.InterfaceC1068If2;
import defpackage.InterfaceC2519Tk;
import defpackage.InterfaceC3403a34;
import defpackage.InterfaceC3472aG1;
import defpackage.InterfaceC5991hc2;
import defpackage.InterfaceC6564jG1;
import defpackage.InterfaceC6908kG1;
import defpackage.InterfaceC7114ks;
import defpackage.InterfaceC7458ls;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC7913nB;
import defpackage.InterpolatorC0485Dt;
import defpackage.JM1;
import defpackage.MD2;
import defpackage.ND2;
import defpackage.Pf4;
import defpackage.QZ2;
import defpackage.Qf4;
import defpackage.RunnableC0335Cp;
import defpackage.T34;
import defpackage.UN;
import defpackage.Vf4;
import defpackage.ViewOnClickListenerC3303Zk3;
import defpackage.Y5;
import defpackage.Y50;
import defpackage.ZF1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.omnibox.geo.GeolocationHeader;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class g implements ZF1, InterfaceC5991hc2, Pf4, Qf4, InterfaceC2519Tk, InterfaceC3403a34, View.OnKeyListener, ComponentCallbacks, HG3, InterfaceC7458ls {
    public static Boolean S;
    public final Rect A;
    public final QZ2 B;
    public final InterfaceC6908kG1 C;
    public final InterfaceC6564jG1 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final boolean I;

    /* renamed from: J */
    public boolean f11527J;
    public boolean K;
    public float L;
    public boolean M;
    public final C0257Bz1 N;
    public final InterfaceC7913nB O;
    public boolean P;
    public int Q;
    public final C8385oa2 R;
    public final C5878hG1 a = new C5878hG1(this);
    public final d g = new d(this);
    public final AbstractC4159cG1 h;
    public Vf4 i;
    public final InterfaceC3472aG1 j;
    public final C0538Ed2 k;
    public ViewOnClickListenerC3303Zk3 l;
    public C8815pp m;
    public C5303fc2 n;
    public C5809h34 o;
    public final InterfaceC7697ma2 p;
    public final InterfaceC1068If2 q;
    public final LocaleManager r;
    public final ArrayList s;
    public final InterfaceC0408Dd2 t;
    public final Context u;
    public final InterfaceC7114ks v;
    public final WindowAndroid w;
    public String x;
    public ObjectAnimator y;
    public final C12157za2 z;

    @Override // defpackage.ZF1
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void n() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // defpackage.InterfaceC3403a34
    public final void o(boolean z) {
        EI2.h(z ? 1 : 0, 15, "Android.OmniboxFocusReason");
    }

    public g(Context context, AbstractC4159cG1 abstractC4159cG1, InterfaceC3472aG1 interfaceC3472aG1, InterfaceC7697ma2 interfaceC7697ma2, InterfaceC1068If2 interfaceC1068If2, LocaleManager localeManager, C0538Ed2 c0538Ed2, InterfaceC7114ks interfaceC7114ks, C10285u6 c10285u6, boolean z, QZ2 qz2, C0257Bz1 c0257Bz1, Runnable runnable, InterfaceC6908kG1 interfaceC6908kG1, InterfaceC6564jG1 interfaceC6564jG1, InterfaceC7913nB interfaceC7913nB) {
        C0538Ed2 c0538Ed22 = new C0538Ed2();
        this.k = c0538Ed22;
        C4496dF c4496dF = new C4496dF();
        this.s = new ArrayList();
        this.x = "";
        this.z = new C12157za2();
        this.A = new Rect();
        this.Q = 3;
        this.R = new C8385oa2();
        this.u = context;
        this.h = abstractC4159cG1;
        this.j = interfaceC3472aG1;
        interfaceC3472aG1.l(this);
        this.q = interfaceC1068If2;
        this.r = localeManager;
        Vf4 vf4 = new Vf4(this, c0538Ed22, runnable, interfaceC7697ma2);
        this.i = vf4;
        vf4.f.a(this);
        this.p = interfaceC7697ma2;
        ((C8385oa2) interfaceC7697ma2).m(c4496dF.b(new Callback() { // from class: dG1
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                g.this.W((Profile) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }));
        this.t = c0538Ed2;
        this.v = interfaceC7114ks;
        this.w = c10285u6;
        this.I = z;
        this.B = qz2;
        this.K = z;
        this.N = c0257Bz1;
        this.C = interfaceC6908kG1;
        this.D = interfaceC6564jG1;
        this.O = interfaceC7913nB;
    }

    public final void a0(float f) {
        this.L = f;
        if (this.I) {
            this.j.j().a(f);
            return;
        }
        boolean z = f > 0.0f && !this.H;
        if (z != this.P) {
            this.P = z;
            i0();
        }
        AbstractC4159cG1 abstractC4159cG1 = this.h;
        if (f > 0.0f) {
            abstractC4159cG1.o.setVisibility(0);
        } else if (f == 0.0f && !this.H) {
            abstractC4159cG1.o.setVisibility(8);
        }
        C1359Kl3 c1359Kl3 = this.l.g;
        c1359Kl3.M = f;
        c1359Kl3.e();
        Object obj = c1359Kl3.i.get();
        MD2 md2 = AbstractC1878Ol3.h;
        PropertyModel propertyModel = c1359Kl3.a;
        if (obj == null || !T34.f(c1359Kl3.C.h())) {
            propertyModel.l(md2, 1.0f);
        } else {
            if (!c1359Kl3.k) {
                f = JM1.b((f - c1359Kl3.N) / c1359Kl3.O, 0.0f, 1.0f);
            }
            propertyModel.l(md2, f);
        }
        c1359Kl3.d(0);
    }

    public final void V() {
        boolean z = this.M;
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        if (z) {
            if (!(AbstractC5107f12.b(interfaceC3472aG1.h(), null, interfaceC3472aG1.isIncognito()) != 0)) {
                this.o.f(interfaceC3472aG1.s(), 0, 0);
            } else {
                this.o.f(C6153i34.h, 2, 0);
                H();
            }
            this.o.c(false, false);
            return;
        }
        Y(interfaceC3472aG1.h(), interfaceC3472aG1.s());
    }

    public final void N(String str, int i, long j, String str2, byte[] bArr) {
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        Tab a = interfaceC3472aG1.a();
        if (this.q.a(str, i, str2, bArr, interfaceC3472aG1.isIncognito())) {
            return;
        }
        if (a != null && (a.isNativePage() || T34.k(a.getUrl()))) {
            this.D.a(i, str);
            if (str.isEmpty()) {
                str = a.getUrl().i();
            }
        }
        if (a != null && !str.isEmpty()) {
            LoadUrlParams loadUrlParams = new LoadUrlParams(str, 0);
            AN3 an3 = new AN3("Android.Omnibox.SetGeolocationHeadersTime", 0);
            an3.h = SystemClock.uptimeMillis();
            try {
                Profile b = Profile.b(a.b());
                loadUrlParams.g = b == null ? null : GeolocationHeader.d(str, b, a);
                an3.close();
                loadUrlParams.d = 33554432 | i;
                if (j != 0) {
                    loadUrlParams.q = j;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder();
                    String str3 = loadUrlParams.g;
                    if (str3 != null && !str3.isEmpty()) {
                        sb.append(str3);
                        sb.append("\r\n");
                    }
                    loadUrlParams.g = Y5.a(sb, "Content-Type: ", str2);
                }
                if (bArr != null && bArr.length != 0) {
                    loadUrlParams.b(ResourceRequestBody.createFromEncodedNativeForm(N.MugoAW_d(bArr)));
                }
                a.d(loadUrlParams);
                FI2.a("MobileOmniboxUse");
            } catch (Throwable th) {
                try {
                    an3.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        this.r.b(str, i, false);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("PostTaskFocusTab")) {
            PostTask.c(AbstractC5103f04.c, new Runnable() { // from class: fG1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.G();
                }
            });
        } else {
            G();
        }
    }

    public final void Y(String str, C6153i34 c6153i34) {
        if (this.o.a.hasFocus()) {
            if (!this.G || T34.j(str)) {
                return;
            } else {
                Z(null, 12, false);
            }
        }
        this.x = str;
        this.o.f(c6153i34, 1, 0);
    }

    public final void b0(boolean z) {
        if (this.o == null) {
            return;
        }
        this.H = z;
        if (z) {
            return;
        }
        i0();
        if (this.F && this.M && C10021tL.f().c()) {
            String b = this.o.b();
            this.o.a.clearFocus();
            this.o.a.requestFocus();
            if (!TextUtils.isEmpty(b)) {
                this.o.f(C6153i34.b(b), 0, 1);
                H();
            }
        }
        Iterator it = this.z.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC10272u34) c11814ya2.next()).L(this.M);
            }
        }
    }

    public final void D(boolean z, boolean z2) {
        C5809h34 c5809h34 = this.o;
        if (c5809h34 == null) {
            return;
        }
        c5809h34.c(z2, true);
        b0(false);
        k0();
        if (this.I || z) {
            return;
        }
        this.h.o.setVisibility(8);
    }

    public final void J(boolean z) {
        if (z) {
            this.G = false;
        }
        Iterator it = this.z.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC10272u34) c11814ya2.next()).d(z);
            }
        }
        if (this.I) {
            ObjectAnimator objectAnimator = this.y;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.y.cancel();
                this.y = null;
            }
            if (this.j.j().h()) {
                D(z, z);
                return;
            }
            this.h.getRootView().getLocalVisibleRect(this.A);
            float height = r2.height() / Math.max(r2.height(), r2.width());
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.a, fArr);
            this.y = ofFloat;
            ofFloat.setDuration(height * 200.0f);
            this.y.addListener(new C6222iG1(this, z));
            this.y.start();
        }
    }

    public final ObjectAnimator B(View view) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        ofFloat.setInterpolator(InterpolatorC0485Dt.e);
        ofFloat.setStartDelay(75L);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    public final ObjectAnimator A(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        ofFloat.setInterpolator(InterpolatorC0485Dt.d);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    public final void H() {
        this.m.a(this.o.b(), this.o.a());
    }

    public final void W(Profile profile) {
        if (profile == null || !this.E) {
            return;
        }
        C5303fc2 c5303fc2 = this.n;
        N.MXz11HdP(c5303fc2.a, c5303fc2, profile);
        boolean i = profile.i();
        this.B.getClass();
        this.h.d(!i);
    }

    public final void G() {
        View a;
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        if (!interfaceC3472aG1.o() || (a = interfaceC3472aG1.a().a()) == null) {
            return;
        }
        a.requestFocus();
    }

    public final void h0() {
        C2649Uk c2649Uk = (C2649Uk) this.k.get();
        if (c2649Uk == null) {
            return;
        }
        ColorStateList b = c2649Uk.q ? null : Y50.b(this.u, AbstractC3494aK3.d(this.Q));
        AbstractC4159cG1 abstractC4159cG1 = this.h;
        abstractC4159cG1.g.setImageTintList(b);
        abstractC4159cG1.g.setImageDrawable(AbstractC2884Wf.a(c2649Uk.g, c2649Uk.q ? R.drawable.0_resource_name_obfuscated_res_0x7f0901de : R.drawable.0_resource_name_obfuscated_res_0x7f0900cb));
    }

    @Override // defpackage.ZF1
    public final void v() {
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        boolean isIncognito = interfaceC3472aG1.isIncognito();
        boolean z = this.M;
        Context context = this.u;
        int a = AbstractC5647gc2.a(z ? AbstractC11746yN.a(context, interfaceC3472aG1.isIncognito()) : interfaceC3472aG1.i(), context, isIncognito);
        this.Q = a;
        ColorStateList c = AbstractC3494aK3.c(context, a);
        AbstractC4159cG1 abstractC4159cG1 = this.h;
        abstractC4159cG1.a.setImageTintList(c);
        C5809h34 c5809h34 = this.o;
        int i = this.Q;
        C7183l34 c7183l34 = c5809h34.g;
        ND2 nd2 = AbstractC8215o34.l;
        PropertyModel propertyModel = c7183l34.a;
        int h = propertyModel.h(nd2);
        propertyModel.m(nd2, i);
        if ((h != i) && !this.M) {
            Y(interfaceC3472aG1.h(), interfaceC3472aG1.s());
        }
        ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = this.l;
        int i2 = this.Q;
        C1359Kl3 c1359Kl3 = viewOnClickListenerC3303Zk3.g;
        if (c1359Kl3.v != i2) {
            c1359Kl3.v = i2;
            c1359Kl3.c();
        }
        viewOnClickListenerC3303Zk3.b();
        C8815pp c8815pp = this.m;
        if (c8815pp != null) {
            int i3 = this.Q;
            C1245Jp c1245Jp = c8815pp.i;
            C9531ru0 c9531ru0 = c1245Jp.n;
            if (c9531ru0.e != i3) {
                c9531ru0.e = i3;
                for (int i4 = 0; i4 < c9531ru0.f.size(); i4++) {
                    ((C7815mu0) c9531ru0.f.get(i4)).b.m(AbstractC5038ep3.a, i3);
                }
            }
            c1245Jp.i.m(AbstractC6413ip3.e, i3);
        }
        h0();
        C2649Uk c2649Uk = (C2649Uk) this.k.get();
        if (c2649Uk == null) {
            return;
        }
        abstractC4159cG1.h.setImageTintList(c2649Uk.q ? null : Y50.b(context, AbstractC3494aK3.d(this.Q)));
    }

    public final void k0() {
        this.l.g.a.k(AbstractC1878Ol3.a, this.I ? this.M : this.M || this.H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:            if (r7.H != false) goto L391;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x005d, code lost:            if (r7.f11527J != false) goto L391;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.omnibox.g.i0():void");
    }

    public final boolean d0() {
        C5809h34 c5809h34 = this.o;
        return (c5809h34 != null && !TextUtils.isEmpty(c5809h34.a())) && (this.M || this.H);
    }

    public final boolean e0() {
        if (!this.E) {
            return false;
        }
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        if (interfaceC3472aG1.p(interfaceC3472aG1.isIncognito()) == 16) {
            return false;
        }
        if (this.I && this.K) {
            if (!this.M && !this.H) {
                return false;
            }
            if (S == null) {
                S = Boolean.valueOf(L(3));
            }
            return S.booleanValue();
        }
        if (d0()) {
            return false;
        }
        if (!this.M && !this.H && !this.P) {
            return false;
        }
        if (S == null) {
            S = Boolean.valueOf(L(3));
        }
        return S.booleanValue();
    }

    public final boolean f0() {
        InterfaceC3472aG1 interfaceC3472aG1;
        Tab a;
        if (!this.E || (interfaceC3472aG1 = this.j) == null || (a = interfaceC3472aG1.a()) == null) {
            return false;
        }
        return (!this.E || (!this.M && !this.H)) && !a.isIncognito();
    }

    @Override // defpackage.ZF1
    public final void t() {
        Profile profile;
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        Y(interfaceC3472aG1.h(), interfaceC3472aG1.s());
        C5303fc2 c5303fc2 = this.n;
        if (c5303fc2 != null && (profile = (Profile) ((C8385oa2) this.p).g) != null) {
            N.MZa0jqjv(c5303fc2.a, c5303fc2, profile);
        }
        i0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:            if (r4.onKeyDown(r10, r11) != false) goto L493;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0127, code lost:            if (r9.getSelectionEnd() == r9.getText().length()) goto L541;     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.omnibox.g.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public final void j0() {
        boolean isIncognito = this.j.isIncognito();
        this.B.getClass();
        boolean z = true;
        boolean z2 = !isIncognito;
        AbstractC4159cG1 abstractC4159cG1 = this.h;
        if (z2 && (abstractC4159cG1 instanceof LocationBarPhone)) {
            LocationBarPhone locationBarPhone = (LocationBarPhone) abstractC4159cG1;
            View view = locationBarPhone.s;
            locationBarPhone.q = view;
            view.setAlpha(1.0f);
            locationBarPhone.q.setVisibility(0);
            abstractC4159cG1.setClipToPadding(false);
        }
        boolean z3 = this.I;
        abstractC4159cG1.d(z2 || z3);
        ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = this.l;
        if (!z2 && !z3) {
            z = false;
        }
        C1359Kl3 c1359Kl3 = viewOnClickListenerC3303Zk3.g;
        c1359Kl3.o = z;
        c1359Kl3.d(0);
    }

    @Override // defpackage.ZF1
    public final void i() {
        S = Boolean.valueOf(L(3));
        i0();
        j0();
        C5809h34 c5809h34 = this.o;
        boolean isIncognito = this.j.isIncognito();
        C7183l34 c7183l34 = c5809h34.g;
        c7183l34.a.k(AbstractC8215o34.m, isIncognito);
    }

    @Override // defpackage.ZF1
    public final void e() {
        this.h.getClass();
    }

    @Override // defpackage.ZF1
    public final void c() {
        C1245Jp c1245Jp = this.m.i;
        c1245Jp.getClass();
        c1245Jp.i(new RunnableC0335Cp(c1245Jp), -1L);
    }

    @Override // defpackage.HG3
    public final void x() {
        S = Boolean.valueOf(L(3));
    }

    public final void Z(String str, int i, boolean z) {
        boolean z2 = this.M;
        if (!z) {
            this.o.a.clearFocus();
        } else {
            if (!z2) {
                EI2.h(i, 15, "Android.OmniboxFocusReason");
                if (e0()) {
                    FI2.a("MobileOmniboxFocusedLensShown");
                }
            }
            if (i == 2 || i == 3 || i == 7 || i == 6) {
                this.F = true;
            }
            if (!z2 || !this.G) {
                this.o.a.requestFocus();
            } else {
                J(true);
            }
        }
        if (str != null) {
            this.o.f(C6153i34.b(str), 0, 1);
            H();
        }
    }

    public final void R(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String d = ((TemplateUrlService) this.t.get()).d(str, list);
        if (!TextUtils.isEmpty(d)) {
            N(d, 5, 0L, null, null);
        } else {
            X(str);
        }
    }

    public final Vf4 I() {
        if (this.h == null) {
            return null;
        }
        return this.i;
    }

    public final void d(InterfaceC10272u34 interfaceC10272u34) {
        this.z.a(interfaceC10272u34);
    }

    public final void U(InterfaceC10272u34 interfaceC10272u34) {
        this.z.d(interfaceC10272u34);
    }

    public final void O() {
        this.h.b();
    }

    @Override // defpackage.InterfaceC2519Tk
    public final void b() {
        ColorStateList b;
        h0();
        C2649Uk c2649Uk = (C2649Uk) this.k.get();
        if (c2649Uk == null) {
            return;
        }
        int i = this.Q;
        if (c2649Uk.q) {
            b = null;
        } else {
            b = Y50.b(this.u, AbstractC3494aK3.d(i));
        }
        this.h.h.setImageTintList(b);
    }

    @Override // defpackage.Qf4
    public final void u() {
        i0();
    }

    public final void X(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.E) {
            this.s.add(new Runnable() { // from class: gG1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.X(str);
                }
            });
            return;
        }
        Z(null, 9, true);
        this.o.f(C6153i34.b(str), 0, 0);
        C1245Jp c1245Jp = this.m.i;
        if (c1245Jp.v && c1245Jp.w != null) {
            c1245Jp.m(false);
            InterfaceC3472aG1 interfaceC3472aG1 = c1245Jp.k;
            if (interfaceC3472aG1.o()) {
                c1245Jp.w.a(interfaceC3472aG1.p(false), -1, interfaceC3472aG1.h(), str, false);
            }
        }
        this.o.c(true, false);
    }

    @Override // defpackage.InterfaceC3403a34
    public final View f() {
        Tab a = this.j.a();
        if (a == null) {
            return null;
        }
        return a.a();
    }

    @Override // defpackage.InterfaceC3403a34
    public final boolean g() {
        return !this.j.isIncognito();
    }

    @Override // defpackage.InterfaceC3403a34
    public final void y() {
        if (!C9861ss.b()) {
            C9861ss.c(13);
        }
        if (this.v.k()) {
            return;
        }
        Z(null, 12, false);
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        Y(interfaceC3472aG1.h(), interfaceC3472aG1.s());
        G();
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        y();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.R;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.M && this.G && configuration.keyboard != 2) {
            Z(null, 12, false);
        }
    }

    public final boolean L(int i) {
        boolean isIncognito = this.j.isIncognito();
        Uri uri = Uri.EMPTY;
        C2336Rz1 c2336Rz1 = new C2336Rz1();
        c2336Rz1.h = i;
        c2336Rz1.a = uri;
        c2336Rz1.b = null;
        c2336Rz1.c = null;
        c2336Rz1.d = null;
        c2336Rz1.e = null;
        c2336Rz1.f = null;
        c2336Rz1.g = isIncognito;
        c2336Rz1.i = this.I;
        return this.N.a(c2336Rz1);
    }

    public final void g0(int i) {
        boolean isIncognito = this.j.isIncognito();
        Uri uri = Uri.EMPTY;
        C1297Jz1 c1297Jz1 = new C1297Jz1();
        c1297Jz1.e = isIncognito;
        c1297Jz1.i = i;
        c1297Jz1.f = 0;
        c1297Jz1.g = null;
        c1297Jz1.h = 0;
        if (!uri.equals(uri)) {
            c1297Jz1.a = uri;
        }
        this.N.a.a(this.w, c1297Jz1);
    }
}
