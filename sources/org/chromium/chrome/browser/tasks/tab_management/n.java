package org.chromium.chrome.browser.tasks.tab_management;

import J.N;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AA3;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC1683My3;
import defpackage.AbstractC1947Oz2;
import defpackage.AbstractC2077Pz2;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC6265iP;
import defpackage.AbstractC7157kz2;
import defpackage.AbstractC7158kz3;
import defpackage.AbstractC9627sA3;
import defpackage.C0388Cz2;
import defpackage.C0759Fv3;
import defpackage.C10218tu1;
import defpackage.C10656vA3;
import defpackage.C1553Ly3;
import defpackage.C1813Ny3;
import defpackage.C1817Nz2;
import defpackage.C2183Qu3;
import defpackage.C3166Yj1;
import defpackage.C3454aC3;
import defpackage.C3798bC3;
import defpackage.C4136cB3;
import defpackage.C5006ek1;
import defpackage.C6204iC3;
import defpackage.C6475j02;
import defpackage.C6772js1;
import defpackage.C7272lK1;
import defpackage.C7507m02;
import defpackage.C7573mB3;
import defpackage.C7578mC3;
import defpackage.C7851n02;
import defpackage.C7928nE;
import defpackage.C8174nw3;
import defpackage.C8266oC3;
import defpackage.C8875pz2;
import defpackage.C9537rv0;
import defpackage.CC;
import defpackage.GA3;
import defpackage.HO0;
import defpackage.I5;
import defpackage.IE2;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0186Bl0;
import defpackage.InterfaceC10318uB3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC12028zA3;
import defpackage.InterfaceC8947qB3;
import defpackage.InterfaceC9289rB3;
import defpackage.InterfaceC9377rT1;
import defpackage.InterfaceC9632sB3;
import defpackage.JC3;
import defpackage.KV1;
import defpackage.LD2;
import defpackage.MC3;
import defpackage.NU1;
import defpackage.O83;
import defpackage.OC3;
import defpackage.PU1;
import defpackage.Q83;
import defpackage.UD2;
import defpackage.UN;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.ViewOnLayoutChangeListenerC2588Tx3;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC2458Sx3;
import defpackage.WC3;
import defpackage.WU1;
import defpackage.XC3;
import defpackage.YC3;
import defpackage.ZC3;
import defpackage.ZX1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class n implements InterfaceC0186Bl0, InterfaceC10318uB3, InterfaceC9632sB3, YC3, WC3, XC3 {
    public static boolean K;
    public C0388Cz2 A;
    public final C3798bC3 B;
    public final ViewGroup C;
    public final ViewGroup D;
    public final TabContentManager E;
    public C5006ek1 F;
    public final C6204iC3 G;
    public C8174nw3 H;
    public C1817Nz2 I;

    /* renamed from: J */
    public final C8266oC3 f11530J;
    public final Activity a;
    public final UD2 g;
    public final I5 h;
    public final InterfaceC9377rT1 i;
    public final c j;
    public final ZC3 k;
    public final C6475j02 l;
    public final C0759Fv3 m;
    public final InterfaceC10590uz3 n;
    public final int o;
    public final NU1 p;
    public final C7507m02 q;
    public final InterfaceC0079Ap3 r;
    public final ViewOnClickListenerC1069If3 s;
    public final ZX1 t;
    public j u;
    public C7578mC3 v;
    public C7573mB3 w;
    public final C2183Qu3 x;
    public final ViewGroup y;
    public boolean z;

    @Override // defpackage.InterfaceC10318uB3
    public final InterfaceC9632sB3 q() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r7) {
        /*
            r6 = this;
            NU1 r0 = r6.p
            QU1 r0 = r0.a
            java.util.LinkedHashMap r1 = r0.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L43
            java.util.LinkedHashMap r2 = r0.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r3 = r2.containsKey(r3)
            if (r3 != 0) goto L1e
            r0 = 0
            goto L61
        L1e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object r3 = r2.get(r3)
            java.util.List r3 = (java.util.List) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 0
            java.lang.Object r5 = r3.remove(r5)
            PU1 r5 = (defpackage.PU1) r5
            r1.put(r4, r5)
            int r3 = r3.size()
            if (r3 != 0) goto L43
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.remove(r3)
        L43:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r1.get(r2)
            PU1 r1 = (defpackage.PU1) r1
            org.chromium.ui.modelutil.PropertyModel r2 = r1.b
            LD2 r3 = defpackage.WU1.s
            Ap3 r0 = r0.b
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.k(r3, r0)
            r0 = r1
        L61:
            if (r0 == 0) goto Lad
            org.chromium.ui.modelutil.PropertyModel r0 = r0.b
            boolean r1 = r6.z(r0)
            if (r1 != 0) goto L6c
            goto Lad
        L6c:
            org.chromium.chrome.browser.tasks.tab_management.c r1 = r6.j
            r2 = 3
            if (r7 != r2) goto La2
            Ly3 r7 = r1.a
            androidx.recyclerview.widget.GridLayoutManager r2 = r7.w
            int r2 = r2.F
            uz3 r3 = r7.g
            wz3 r3 = (defpackage.AbstractC11276wz3) r3
            lz3 r3 = r3.c
            kz3 r3 = r3.d()
            int r3 = r3.index()
            Ny3 r7 = r7.e
            int r3 = r7.H(r3)
            int r3 = r3 / r2
            int r3 = r3 + 1
            int r3 = r3 * r2
            int r2 = r7.size()
            int r7 = r7.F(r2)
            int r7 = r7 + 1
            int r7 = java.lang.Math.min(r3, r7)
            r2 = 6
            r1.a(r7, r2, r0)
            goto Lad
        La2:
            Ny3 r7 = r1.l
            int r7 = r7.size()
            Ly3 r1 = r1.a
            r1.b(r7, r2, r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.tasks.tab_management.n.s(int):void");
    }

    public static boolean t(int i) {
        C10218tu1 c10218tu1 = AbstractC6265iP.d;
        StringBuilder sb = new StringBuilder();
        sb.append("StartSurfaceAndroid");
        sb.append(":");
        sb.append("show_tabs_in_mru_order");
        return CachedFeatureFlags.b(c10218tu1.b(sb.toString()), false) && i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b8, code lost:            r13.Q(6, new defpackage.C2591Ty1(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0160), new org.chromium.chrome.browser.tasks.tab_management.m());     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0197 A[Catch: all -> 0x016d, TryCatch #2 {all -> 0x016d, blocks: (B:9:0x00bf, B:11:0x00eb, B:13:0x00f1, B:14:0x00f9, B:16:0x0115, B:18:0x011f, B:19:0x0141, B:22:0x0178, B:24:0x0181, B:26:0x018b, B:31:0x0197, B:32:0x01a8, B:34:0x01ae, B:39:0x01b8, B:40:0x01c9, B:42:0x01cf, B:44:0x01d5, B:46:0x01e1, B:49:0x01ed, B:51:0x01f5, B:55:0x020f, B:62:0x0206, B:64:0x0170), top: B:8:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cf A[Catch: all -> 0x016d, TryCatch #2 {all -> 0x016d, blocks: (B:9:0x00bf, B:11:0x00eb, B:13:0x00f1, B:14:0x00f9, B:16:0x0115, B:18:0x011f, B:19:0x0141, B:22:0x0178, B:24:0x0181, B:26:0x018b, B:31:0x0197, B:32:0x01a8, B:34:0x01ae, B:39:0x01b8, B:40:0x01c9, B:42:0x01cf, B:44:0x01d5, B:46:0x01e1, B:49:0x01ed, B:51:0x01f5, B:55:0x020f, B:62:0x0206, B:64:0x0170), top: B:8:0x00bf }] */
    /* JADX WARN: Type inference failed for: r2v20, types: [bC3, P83] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(android.app.Activity r27, defpackage.I5 r28, defpackage.InterfaceC10590uz3 r29, org.chromium.chrome.browser.compositor.layouts.content.TabContentManager r30, defpackage.JC r31, defpackage.InterfaceC10912vv3 r32, defpackage.InterfaceC9377rT1 r33, android.view.ViewGroup r34, defpackage.InterfaceC0079Ap3 r35, defpackage.C7507m02 r36, defpackage.OX2 r37, int r38, android.view.ViewGroup r39, defpackage.InterfaceC0079Ap3 r40, defpackage.ViewOnClickListenerC1069If3 r41, defpackage.ZX1 r42) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.tasks.tab_management.n.<init>(android.app.Activity, I5, uz3, org.chromium.chrome.browser.compositor.layouts.content.TabContentManager, JC, vv3, rT1, android.view.ViewGroup, Ap3, m02, OX2, int, android.view.ViewGroup, Ap3, If3, ZX1):void");
    }

    @Override // defpackage.InterfaceC9632sB3
    public final int d() {
        return this.j.g.P0;
    }

    @Override // defpackage.InterfaceC9632sB3
    public final long b() {
        return this.j.g.W0;
    }

    @Override // defpackage.InterfaceC10318uB3
    public final void a() {
        c cVar = this.j;
        Activity activity = this.a;
        if (this.z) {
            return;
        }
        TraceEvent i = TraceEvent.i("TabSwitcherCoordinator.initWithNative", null);
        try {
            cVar.d((C9537rv0) this.r.get());
            boolean e = AbstractC5177fD3.e(activity);
            int i2 = this.o;
            if (e || UN.m.a()) {
                this.u = new j(this.a, this.C, this.n, this.E, i2 == 2 ? 0 : i2, this.D);
            }
            boolean e2 = AbstractC5177fD3.e(activity);
            InterfaceC10590uz3 interfaceC10590uz3 = this.n;
            if (e2) {
                y(activity);
                C0759Fv3 c0759Fv3 = this.m;
                if (c0759Fv3 != null) {
                    c0759Fv3.b(activity, interfaceC10590uz3, this.E, cVar.a.D);
                }
            }
            j jVar = this.u;
            GA3 ga3 = jVar != null ? jVar.e : null;
            ZX1 zx1 = this.t;
            if (i2 == 0) {
                boolean a = UN.m.a();
                NU1 nu1 = this.p;
                if (a) {
                    this.w = new C7573mB3(activity, interfaceC10590uz3, this.h);
                    C4136cB3 c4136cB3 = new C4136cB3(activity, interfaceC10590uz3, ga3);
                    this.w.m.a(c4136cB3);
                    nu1.b(c4136cB3);
                }
                if (AbstractC5177fD3.e(activity) && !t(i2)) {
                    C8174nw3 c8174nw3 = new C8174nw3(activity, this.y, zx1);
                    this.H = c8174nw3;
                    nu1.b(new C6772js1(c8174nw3));
                }
                if (C3166Yj1.b() && this.F == null) {
                    C5006ek1 c5006ek1 = new C5006ek1(Profile.d(), O83.a, new C3454aC3());
                    this.F = c5006ek1;
                    nu1.b(c5006ek1);
                }
            }
            this.l.m.f(Profile.d());
            ZC3 zc3 = this.k;
            ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = this.s;
            if (ga3 != null) {
                zc3.x = ga3;
                ga3.o.m(new MC3(zc3));
            }
            zc3.L = viewOnClickListenerC1069If3;
            x(activity, zx1);
            this.z = true;
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

    public final void x(Activity activity, ZX1 zx1) {
        if (AbstractC1947Oz2.e()) {
            C8875pz2 a = AbstractC7157kz2.a();
            this.I = new C1817Nz2(activity, zx1, this, this.n, a, this.o);
            if (this.o == 0) {
                c cVar = this.j;
                ZC3 zc3 = this.k;
                C0388Cz2 c0388Cz2 = new C0388Cz2(cVar, zc3, a);
                this.A = c0388Cz2;
                this.p.b(c0388Cz2);
                zc3.z = this.A;
            }
        }
    }

    @Override // defpackage.InterfaceC10318uB3
    public final InterfaceC8947qB3 h() {
        return this.k;
    }

    @Override // defpackage.InterfaceC10318uB3
    public final InterfaceC0079Ap3 m() {
        final C0759Fv3 c0759Fv3 = this.m;
        if (c0759Fv3 != null) {
            Objects.requireNonNull(c0759Fv3);
            return new InterfaceC0079Ap3() { // from class: cC3
                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return Boolean.valueOf(C0759Fv3.this.c());
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }
            };
        }
        return new InterfaceC0079Ap3() { // from class: dC3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Boolean.FALSE;
            }
        };
    }

    @Override // defpackage.InterfaceC10318uB3
    public final C8266oC3 k() {
        return this.f11530J;
    }

    @Override // defpackage.InterfaceC9632sB3
    public final int p() {
        return this.j.b();
    }

    @Override // defpackage.InterfaceC9632sB3
    public final void j() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.n;
        if (((AbstractC11276wz3) interfaceC10590uz3).i) {
            androidx.recyclerview.widget.d G = this.j.g.G(((AbstractC11276wz3) interfaceC10590uz3).c.d().index());
            if (G == null) {
                return;
            }
            View view = G.a;
            view.requestFocus();
            view.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.InterfaceC9632sB3
    public final void o() {
        int M37SqSAy;
        this.j.h();
        ZC3 zc3 = this.k;
        zc3.getClass();
        org.chromium.base.library_loader.b bVar = org.chromium.base.library_loader.b.n;
        if (bVar.f()) {
            C7928nE c7928nE = UN.a;
            N.M37SqSAy("TabGridLayoutAndroid", "soft-cleanup-delay", 3000);
        }
        int i = 0;
        if (bVar.f()) {
            C7928nE c7928nE2 = UN.a;
            M37SqSAy = N.M37SqSAy("TabGridLayoutAndroid", "soft-cleanup-delay", 3000);
        } else {
            M37SqSAy = 0;
        }
        Handler handler = zc3.a;
        handler.postDelayed(zc3.g, M37SqSAy);
        if (bVar.f()) {
            C7928nE c7928nE3 = UN.a;
            N.M37SqSAy("TabGridLayoutAndroid", "cleanup-delay", 30000);
        }
        if (bVar.f()) {
            C7928nE c7928nE4 = UN.a;
            i = N.M37SqSAy("TabGridLayoutAndroid", "cleanup-delay", 30000);
        }
        handler.postDelayed(zc3.h, i);
    }

    @Override // defpackage.InterfaceC9632sB3
    public final Rect l(boolean z) {
        c cVar = this.j;
        C0759Fv3 c0759Fv3 = this.m;
        if (c0759Fv3 != null && c0759Fv3.c()) {
            c cVar2 = c0759Fv3.a;
            cVar2.l();
            Rect rect = new Rect();
            cVar2.g.getGlobalVisibleRect(rect);
            int i = rect.left;
            int i2 = rect.top;
            Rect rect2 = cVar2.j;
            rect2.offset(i, i2);
            cVar.getClass();
            Rect rect3 = new Rect();
            cVar.g.getGlobalVisibleRect(rect3);
            rect2.offset(-rect3.left, -rect3.top);
            return rect2;
        }
        if (z) {
            cVar.l();
        }
        return cVar.j;
    }

    public final boolean u(AbstractC7158kz3 abstractC7158kz3, boolean z, boolean z2) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = IE2.c;
        if (abstractC7158kz3 != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < abstractC7158kz3.getCount(); i++) {
                Tab tabAt = abstractC7158kz3.getTabAt(i);
                if (tabAt != null) {
                    arrayList.add(IE2.a(tabAt));
                }
            }
        } else {
            arrayList = null;
        }
        return v(arrayList, z, z2);
    }

    public final void y(Activity activity) {
        TraceEvent i = TraceEvent.i("TabSwitcherCoordintor.setUpTabGroupManualSelectionMode", null);
        try {
            String string = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b16);
            GA3 ga3 = this.u.e;
            this.v = new C7578mC3(string, new C10656vA3(ga3, 1), new AA3(ga3));
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

    public final boolean v(ArrayList arrayList, boolean z, boolean z2) {
        int f;
        final ZC3 zc3 = this.k;
        zc3.getClass();
        Object obj = ThreadUtils.a;
        if (zc3.H != null && !zc3.I) {
            zc3.I = true;
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) zc3.k;
            if (!abstractC11276wz3.i) {
                f = O83.a.f(0, "Chrome.StartSurface.RegularTabCount");
            } else {
                f = abstractC11276wz3.c.d().getCount();
            }
            if (!(f > 0)) {
                HO0.a(zc3.q, new Runnable() { // from class: NC3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZC3 zc32 = ZC3.this;
                        zc32.getClass();
                        Object obj2 = ThreadUtils.a;
                        VC3 vc3 = zc32.H;
                        vc3.getClass();
                        PostTask.c(AbstractC5103f04.b, new UC3(0, SystemClock.elapsedRealtime() - vc3.a));
                        zc32.H = null;
                    }
                });
            } else {
                OC3 oc3 = new OC3(zc3);
                TabContentManager tabContentManager = zc3.r;
                tabContentManager.getClass();
                if (tabContentManager.l == null) {
                    tabContentManager.l = new ArrayList();
                }
                tabContentManager.l.add(oc3);
                if (tabContentManager.k) {
                    tabContentManager.g();
                }
            }
        }
        C0388Cz2 c0388Cz2 = this.A;
        if (c0388Cz2 != null) {
            c0388Cz2.f = null;
            c0388Cz2.d();
        }
        c cVar = this.j;
        boolean k = cVar.k(arrayList, z, z2);
        if (k) {
            cVar.j(3, 5);
            cVar.j(6, 4);
        }
        if (arrayList != null && arrayList.size() > 0) {
            if (this.A != null && AbstractC2077Pz2.a()) {
                this.A.e(1, null);
            }
            int size = arrayList.size();
            C7507m02 c7507m02 = this.q;
            c7507m02.getClass();
            C7851n02.i.getClass();
            if (!C7851n02.p(c7507m02.a)) {
                ArrayList a = this.p.a();
                for (int i = 0; i < a.size(); i++) {
                    if (z(((PU1) a.get(i)).b)) {
                        if (((PU1) a.get(i)).a == 3) {
                            cVar.a(size, 6, ((PU1) a.get(i)).b);
                        } else if (((PU1) a.get(i)).a == 4) {
                            PropertyModel propertyModel = ((PU1) a.get(i)).b;
                            if (this.F.f(Profile.d())) {
                                cVar.a.b(cVar.l.size(), 6, propertyModel);
                                C5006ek1 c5006ek1 = this.F;
                                if (c5006ek1.e.f(0, "Chrome.IncognitoReauth.PromoShowCount") > c5006ek1.c) {
                                    c5006ek1.e();
                                } else {
                                    Q83 q83 = c5006ek1.e;
                                    q83.q(q83.f(0, "Chrome.IncognitoReauth.PromoShowCount") + 1, "Chrome.IncognitoReauth.PromoShowCount");
                                }
                            }
                        } else {
                            cVar.a(size, 3, ((PU1) a.get(i)).b);
                        }
                        size++;
                    }
                }
                a.size();
            }
        }
        return k;
    }

    public final void w() {
        ArrayList a = this.p.a();
        for (int i = 0; i < a.size(); i++) {
            if (z(((PU1) a.get(i)).b) && ((PU1) a.get(i)).a != 3) {
                int i2 = ((PU1) a.get(i)).a;
                c cVar = this.j;
                if (i2 == 4) {
                    PropertyModel propertyModel = ((PU1) a.get(i)).b;
                    cVar.a.b(cVar.l.size(), 6, propertyModel);
                } else {
                    PropertyModel propertyModel2 = ((PU1) a.get(i)).b;
                    cVar.a.b(cVar.l.size(), 3, propertyModel2);
                }
            }
        }
        a.size();
    }

    @Override // defpackage.InterfaceC9632sB3
    public final boolean r() {
        boolean u;
        C9537rv0 c9537rv0;
        ZC3 zc3 = this.k;
        JC3 jc3 = zc3.g;
        Handler handler = zc3.a;
        handler.removeCallbacks(jc3);
        handler.removeCallbacks(zc3.h);
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) zc3.k;
        if (abstractC11276wz3.i) {
            u = AbstractC5177fD3.g() ? ((n) zc3.i).u(abstractC11276wz3.c.d(), false, zc3.G) : false;
            zc3.f();
        } else {
            u = false;
        }
        c cVar = this.j;
        TabListRecyclerView tabListRecyclerView = cVar.g;
        ViewTreeObserverOnGlobalLayoutListenerC2458Sx3 viewTreeObserverOnGlobalLayoutListenerC2458Sx3 = cVar.p;
        if (viewTreeObserverOnGlobalLayoutListenerC2458Sx3 != null) {
            tabListRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2458Sx3);
        }
        ViewOnLayoutChangeListenerC2588Tx3 viewOnLayoutChangeListenerC2588Tx3 = cVar.q;
        if (viewOnLayoutChangeListenerC2588Tx3 != null) {
            cVar.g.addOnLayoutChangeListener(viewOnLayoutChangeListenerC2588Tx3);
        }
        ValueAnimator valueAnimator = tabListRecyclerView.Q0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = tabListRecyclerView.R0;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        if (!tabListRecyclerView.V0 && (c9537rv0 = tabListRecyclerView.T0) != null) {
            c9537rv0.d(tabListRecyclerView.P0, tabListRecyclerView.U0);
            tabListRecyclerView.V0 = true;
        }
        tabListRecyclerView.a1 = tabListRecyclerView.S;
        tabListRecyclerView.p0(null);
        C1553Ly3 c1553Ly3 = cVar.a;
        c1553Ly3.getClass();
        if (AbstractC5177fD3.g() && ((AbstractC11276wz3) c1553Ly3.g).i) {
            int i = 0;
            while (true) {
                C1813Ny3 c1813Ny3 = c1553Ly3.e;
                if (i >= c1813Ny3.size()) {
                    break;
                }
                if (((C7272lK1) c1813Ny3.get(i)).b.h(AbstractC1683My3.a) == 0) {
                    PropertyModel propertyModel = ((C7272lK1) c1813Ny3.get(i)).b;
                    LD2 ld2 = AbstractC9627sA3.i;
                    propertyModel.j(ld2);
                    ((C7272lK1) c1813Ny3.get(i)).b.k(ld2, false);
                }
                i++;
            }
        }
        return u;
    }

    public final boolean z(PropertyModel propertyModel) {
        Integer valueOf = Integer.valueOf(propertyModel.h(WU1.u));
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (intValue == 2) {
            return true;
        }
        if (((AbstractC11276wz3) this.n).o()) {
            if (intValue != 1) {
                return false;
            }
        } else if (intValue != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        ((ChromeActivity) this.i).L0.remove(this.G);
        this.j.onDestroy();
        int i = 0;
        while (true) {
            NU1 nu1 = this.p;
            ArrayList arrayList = nu1.b;
            if (i >= arrayList.size()) {
                break;
            }
            ((KV1) arrayList.get(i)).a.d(nu1.a);
            i++;
        }
        this.g.b();
        C0759Fv3 c0759Fv3 = this.m;
        if (c0759Fv3 != null) {
            c0759Fv3.a();
        }
        C8174nw3 c8174nw3 = this.H;
        if (c8174nw3 != null) {
            c8174nw3.a.getViewTreeObserver().removeOnGlobalLayoutListener(c8174nw3.e);
        }
        C6475j02 c6475j02 = this.l;
        ((AbstractC11276wz3) c6475j02.b).s(c6475j02.c);
        j jVar = this.u;
        if (jVar != null) {
            jVar.a();
        }
        ZC3 zc3 = this.k;
        InterfaceC12028zA3 interfaceC12028zA3 = zc3.x;
        if (interfaceC12028zA3 != null) {
            ((GA3) interfaceC12028zA3).o.n(new MC3(zc3));
        }
        C0759Fv3 c0759Fv32 = zc3.w;
        if (c0759Fv32 != null) {
            c0759Fv32.j.n(new MC3(zc3));
        }
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) zc3.k;
        abstractC11276wz3.s(zc3.m);
        ((CC) zc3.o).g(zc3.p);
        abstractC11276wz3.c.f(zc3.l);
        zc3.s.b.d(zc3.t);
        this.h.c(this);
        C2183Qu3 c2183Qu3 = this.x;
        if (c2183Qu3 != null) {
            c2183Qu3.c.destroy();
            AbstractC11276wz3 abstractC11276wz32 = (AbstractC11276wz3) c2183Qu3.a;
            AbstractC7158kz3 e = abstractC11276wz32.c.e(false);
            if (e != null) {
                e.g.d(c2183Qu3.b);
            }
            abstractC11276wz32.s(c2183Qu3.d);
        }
        C3798bC3 c3798bC3 = this.B;
        if (c3798bC3 != null) {
            O83.a.o(c3798bC3);
        }
    }

    @Override // defpackage.InterfaceC10318uB3
    public final void n(InterfaceC9289rB3 interfaceC9289rB3) {
        this.k.y = interfaceC9289rB3;
    }
}
