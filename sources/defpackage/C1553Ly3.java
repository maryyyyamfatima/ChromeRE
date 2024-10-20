package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tasks.tab_management.a;
import org.chromium.chrome.browser.tasks.tab_management.d;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ly3 */
/* loaded from: classes.dex */
public final class C1553Ly3 {
    public static final C5779gy3 H = new Comparator() { // from class: gy3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((IE2) obj2).h(), ((IE2) obj).h());
        }
    };
    public static final HashMap I = new HashMap();
    public final C9556ry3 B;
    public C5435fy3 C;
    public C10242ty3 D;
    public C9899sy3 E;
    public d F;
    public boolean a;
    public boolean b;
    public final Context d;
    public final C1813Ny3 e;
    public final int f;
    public final InterfaceC10590uz3 g;
    public final C9214qy3 h;
    public final C4828eC3 i;
    public final C10999wA3 j;
    public final InterfaceC11271wy3 k;
    public final C2188Qv3 l;
    public final String m;
    public final C5091ey3 n;
    public final XC3 o;
    public final InterfaceC1424Ky3 p;
    public final boolean q;
    public ComponentCallbacksC6809jy3 r;
    public final a s;
    public final int u;
    public int v;
    public GridLayoutManager w;
    public final C7497ly3 c = new C7497ly3(this);
    public int t = -1;
    public final C7841my3 x = new C7841my3(this);
    public final C8185ny3 y = new C8185ny3(this);
    public final C8528oy3 z = new C8528oy3(this);
    public int G = -1;
    public final C8871py3 A = new C8871py3(this);

    public static int i() {
        return (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_search_term_chip_adaptive_icon"), false) && IG3.a().e()) ? R.drawable.0_resource_name_obfuscated_res_0x7f09024f : R.drawable.0_resource_name_obfuscated_res_0x7f090312;
    }

    public C1553Ly3(Context context, C1813Ny3 c1813Ny3, int i, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC1424Ky3 interfaceC1424Ky3, C4828eC3 c4828eC3, C5091ey3 c5091ey3, boolean z, C10999wA3 c10999wA3, ZC3 zc3, C2188Qv3 c2188Qv3, XC3 xc3, String str, int i2) {
        this.d = context;
        this.g = interfaceC10590uz3;
        this.p = interfaceC1424Ky3;
        this.e = c1813Ny3;
        this.f = i;
        this.n = c5091ey3;
        this.m = str;
        this.i = c4828eC3;
        this.j = c10999wA3;
        this.k = zc3;
        this.l = c2188Qv3;
        this.q = z;
        this.u = i2;
        this.o = xc3;
        C9214qy3 c9214qy3 = new C9214qy3(this);
        this.h = c9214qy3;
        this.s = new a(context, c1813Ny3, interfaceC10590uz3, c9214qy3, c2188Qv3, str, z, i);
        if (i == 0 && i2 != 0 && AbstractC1947Oz2.e()) {
            C9556ry3 c9556ry3 = new C9556ry3(this);
            this.B = c9556ry3;
            c1813Ny3.l(c9556ry3);
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [fy3] */
    public final void j(Profile profile) {
        this.n.f(profile);
        InterfaceC10590uz3 interfaceC10590uz3 = this.g;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.c.b(this.A);
        if (abstractC11276wz3.c.d() instanceof C1024Hw3) {
            this.E = new C9899sy3(this);
            ((C1024Hw3) abstractC11276wz3.c.e(false)).Q(this.E);
            ((C1024Hw3) abstractC11276wz3.c.e(true)).Q(this.E);
        }
        if (AbstractC5177fD3.d(this.d)) {
            this.D = new C10242ty3(this, interfaceC10590uz3);
        }
        if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_search_term_chip"), false)) {
            this.v = i();
            this.C = new HG3() { // from class: fy3
                @Override // defpackage.HG3
                public final void x() {
                    C1553Ly3 c1553Ly3 = C1553Ly3.this;
                    c1553Ly3.getClass();
                    c1553Ly3.v = C1553Ly3.i();
                    int i = 0;
                    while (true) {
                        C1813Ny3 c1813Ny3 = c1553Ly3.e;
                        if (i >= c1813Ny3.size()) {
                            return;
                        }
                        if (((C7272lK1) c1813Ny3.get(i)).b.h(AbstractC1683My3.a) == 0) {
                            ((C7272lK1) c1813Ny3.get(i)).b.m(AbstractC9627sA3.A, c1553Ly3.v);
                        }
                        i++;
                    }
                }
            };
            IG3.a().a(this.C);
        }
    }

    public final List h(int i) {
        AbstractC7158kz3 d = ((AbstractC11276wz3) this.g).c.d();
        return d == null ? new ArrayList() : d.G(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:            if (r7 == (-1)) goto L100;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.C1553Ly3 r5, org.chromium.chrome.browser.tab.Tab r6, boolean r7) {
        /*
            uz3 r0 = r5.g
            r1 = 0
            r2 = -1
            if (r6 != 0) goto L7
            goto L2a
        L7:
            Ny3 r3 = r5.e
            if (r7 == 0) goto L2c
            int r7 = r3.size()
            if (r7 != 0) goto L12
            goto L2a
        L12:
            java.lang.Object r7 = r3.get(r1)
            lK1 r7 = (defpackage.C7272lK1) r7
            org.chromium.ui.modelutil.PropertyModel r7 = r7.b
            ND2 r3 = defpackage.AbstractC9627sA3.a
            int r7 = r7.h(r3)
            java.util.List r7 = r5.h(r7)
            int r7 = r7.indexOf(r6)
            if (r7 != r2) goto L41
        L2a:
            r7 = r2
            goto L41
        L2c:
            r7 = r0
            wz3 r7 = (defpackage.AbstractC11276wz3) r7
            lz3 r7 = r7.c
            kz3 r7 = r7.d()
            int r4 = r6.getId()
            int r7 = defpackage.AbstractC1558Lz3.d(r7, r4)
            int r7 = r3.H(r7)
        L41:
            if (r7 != r2) goto L44
            goto L54
        L44:
            IE2 r2 = defpackage.IE2.a(r6)
            wz3 r0 = (defpackage.AbstractC11276wz3) r0
            org.chromium.chrome.browser.tab.Tab r0 = r0.h()
            if (r0 != r6) goto L51
            r1 = 1
        L51:
            r5.c(r2, r7, r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1553Ly3.a(Ly3, org.chromium.chrome.browser.tab.Tab, boolean):void");
    }

    public final boolean k(int i) {
        return i != -1 && i < this.e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0052, code lost:            if (r7 == null) goto L331;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r11, defpackage.IE2 r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1553Ly3.r(int, IE2, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:            if (defpackage.C7851n02.p((android.app.Activity) r0) != false) goto L107;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.recyclerview.widget.GridLayoutManager r3, int r4, int r5) {
        /*
            r2 = this;
            android.content.Context r0 = r2.d
            boolean r1 = org.chromium.ui.base.DeviceFormFactor.a(r0)
            if (r1 == 0) goto L1a
            boolean r1 = defpackage.AbstractC5177fD3.b(r0)
            if (r1 == 0) goto L1a
            r4 = 600(0x258, float:8.41E-43)
            if (r5 >= r4) goto L13
            goto L2d
        L13:
            r4 = 800(0x320, float:1.121E-42)
            if (r5 >= r4) goto L18
            goto L2b
        L18:
            r4 = 4
            goto L2e
        L1a:
            r5 = 1
            if (r4 == r5) goto L2d
            n02 r4 = defpackage.C7851n02.i
            android.app.Activity r0 = (android.app.Activity) r0
            r4.getClass()
            boolean r4 = defpackage.C7851n02.p(r0)
            if (r4 == 0) goto L2b
            goto L2d
        L2b:
            r4 = 3
            goto L2e
        L2d:
            r4 = 2
        L2e:
            r3.u1(r4)
            ky3 r4 = new ky3
            r4.<init>(r2, r3)
            r3.K = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1553Ly3.q(androidx.recyclerview.widget.GridLayoutManager, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0086, code lost:            if (r9 == null) goto L474;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.IE2 r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1553Ly3.c(IE2, int, boolean):void");
    }

    public final String f(Tab tab) {
        if (this.q && AbstractC5177fD3.e(this.d) && h(tab.getId()).size() > 1) {
            return null;
        }
        return C2183Qu3.d().getString(C2183Qu3.b(tab.getId()), null);
    }

    public final String e(Tab tab) {
        if (!AbstractC5177fD3.d(this.d)) {
            return "";
        }
        if (!this.q) {
            return d(tab);
        }
        List h = h(tab.getId());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < h.size(); i++) {
            arrayList.add(d((Tab) h.get(i)));
        }
        return TextUtils.join(", ", arrayList);
    }

    public final void n(IE2 ie2, PropertyModel propertyModel) {
        String string;
        if (this.q) {
            int size = h(ie2.c()).size();
            if (size > 1) {
                String g = g(ie2);
                C4828eC3 c4828eC3 = this.i;
                Context context = this.d;
                if (g.equals(ie2.j(context, c4828eC3))) {
                    g = "";
                }
                PD2 pd2 = AbstractC9627sA3.B;
                if (g.isEmpty()) {
                    string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140131, String.valueOf(size));
                } else {
                    string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140132, g, String.valueOf(size));
                }
                propertyModel.o(pd2, string);
                return;
            }
            propertyModel.o(AbstractC9627sA3.B, null);
        }
    }

    public final void m(IE2 ie2, PropertyModel propertyModel) {
        int size;
        if (AbstractC5177fD3.c()) {
            boolean z = this.q;
            Context context = this.d;
            if (z && (size = h(ie2.c()).size()) > 1) {
                String g = g(ie2);
                if (g.equals(ie2.j(context, this.i))) {
                    g = "";
                }
                if (g.isEmpty()) {
                    propertyModel.o(AbstractC9627sA3.C, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140123, String.valueOf(size)));
                    return;
                } else {
                    propertyModel.o(AbstractC9627sA3.C, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140124, g, String.valueOf(size)));
                    return;
                }
            }
            propertyModel.o(AbstractC9627sA3.C, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140179, ie2.i()));
        }
    }

    public static String d(Tab tab) {
        if (!tab.isInitialized()) {
            return "";
        }
        String b = T34.b(tab.getUrl().i(), false);
        return b.isEmpty() ? tab.getUrl().i() : b;
    }

    public final String g(IE2 ie2) {
        String j = ie2.j(this.d, this.i);
        if (!this.q || this.D == null || h(ie2.c()).size() <= 1) {
            return j;
        }
        C10242ty3 c10242ty3 = this.D;
        int f = ie2.f();
        c10242ty3.getClass();
        String a = AbstractC1414Kw3.a(f);
        return a == null ? j : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.IE2 r10, int r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1553Ly3.l(IE2, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hy3, org.chromium.base.Callback] */
    public final void o(final IE2 ie2, Bitmap bitmap) {
        int c = ie2.c();
        C1813Ny3 c1813Ny3 = this.e;
        int G = c1813Ny3.G(c);
        if (G == -1) {
            return;
        }
        List h = h(ie2.c());
        final ?? r5 = new Callback() { // from class: hy3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4747dy3 c4747dy3 = (C4747dy3) obj;
                C1553Ly3 c1553Ly3 = C1553Ly3.this;
                c1553Ly3.getClass();
                int c2 = ie2.c();
                C1813Ny3 c1813Ny32 = c1553Ly3.e;
                int G2 = c1813Ny32.G(c2);
                if (G2 == -1 || c4747dy3 == null) {
                    return;
                }
                ((C7272lK1) c1813Ny32.get(G2)).b.o(AbstractC9627sA3.d, c4747dy3);
            }
        };
        boolean z = this.q;
        final C5091ey3 c5091ey3 = this.n;
        if (!z || h.size() <= 1) {
            if (c5091ey3.i) {
                if (bitmap != null) {
                    Drawable g = c5091ey3.g(bitmap, c5091ey3.g);
                    ((C7272lK1) c1813Ny3.get(G)).b.o(AbstractC9627sA3.d, new C4747dy3(g, g, false));
                    return;
                }
                c5091ey3.c(ie2.k(), ie2.l(), r5);
                return;
            }
            return;
        }
        if (!AbstractC5177fD3.d(this.d)) {
            ((C7272lK1) c1813Ny3.get(G)).b.o(AbstractC9627sA3.d, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ie2.k());
        for (int i = 0; arrayList.size() < 4 && i < h.size(); i++) {
            if (ie2.c() != ((Tab) h.get(i)).getId()) {
                arrayList.add(((Tab) h.get(i)).getUrl());
            }
        }
        final boolean l = ie2.l();
        WH0 wh0 = c5091ey3.k;
        Profile profile = c5091ey3.j;
        int i2 = c5091ey3.e;
        FaviconHelper$FaviconImageCallback faviconHelper$FaviconImageCallback = new FaviconHelper$FaviconImageCallback() { // from class: ay3
            @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
            public final void onFaviconAvailable(Bitmap bitmap2, GURL gurl) {
                C4747dy3 c4747dy3;
                C5091ey3 c5091ey32 = C5091ey3.this;
                Callback callback = r5;
                if (bitmap2 == null) {
                    if (l) {
                        c5091ey32.getClass();
                        c4747dy3 = C5091ey3.q;
                    } else {
                        c4747dy3 = C5091ey3.n;
                        c5091ey32.a(c4747dy3);
                    }
                    callback.onResult(c4747dy3);
                    return;
                }
                Drawable g2 = c5091ey32.g(bitmap2, c5091ey32.g);
                callback.onResult(new C4747dy3(g2, g2, false));
            }
        };
        wh0.getClass();
        if (arrayList.size() <= 1 || arrayList.size() > 4) {
            throw new IllegalStateException("Only able to compose 2 to 4 favicon, but requested " + arrayList.size());
        }
        N.MYTn7kvC(wh0.a, profile, (GURL[]) arrayList.toArray(new GURL[0]), i2, faviconHelper$FaviconImageCallback);
    }

    public final void b(int i, int i2, PropertyModel propertyModel) {
        this.e.C(i, new C7272lK1(i2, propertyModel));
    }

    public final void p() {
        C1813Ny3 c1813Ny3;
        if (AbstractC2077Pz2.b()) {
            GridLayoutManager gridLayoutManager = this.w;
            int i = gridLayoutManager.F;
            AbstractC4099c51 abstractC4099c51 = gridLayoutManager.K;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                c1813Ny3 = this.e;
                if (i2 >= c1813Ny3.size()) {
                    break;
                }
                i3 += abstractC4099c51.c(i2);
                if (i3 != i) {
                    if (i3 <= i) {
                        continue;
                        i2++;
                    } else if (((C7272lK1) c1813Ny3.get(i2)).a == 6) {
                        break;
                    }
                }
                i3 = 0;
                i2++;
            }
            if (i3 <= i) {
                return;
            }
            int c = i - (i3 - abstractC4099c51.c(i2));
            for (int i4 = i2 + 1; i4 < c1813Ny3.size(); i4++) {
                if (abstractC4099c51.c(i4) <= c) {
                    c1813Ny3.w(i4, i2);
                    return;
                }
            }
        }
    }
}
