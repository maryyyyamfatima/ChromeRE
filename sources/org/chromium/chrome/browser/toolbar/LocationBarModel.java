package org.chromium.chrome.browser.toolbar;

import J.N;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.chrome.R;
import defpackage.AbstractC11140wc2;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC1741Nk1;
import defpackage.AbstractC2217Rb2;
import defpackage.AbstractC2290Rq0;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC5107f12;
import defpackage.AbstractC5647gc2;
import defpackage.AbstractC6832k23;
import defpackage.C11055wM;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C5242fQ3;
import defpackage.C6153i34;
import defpackage.C7252lG1;
import defpackage.InterfaceC11299x32;
import defpackage.InterfaceC1422Ky1;
import defpackage.InterfaceC3472aG1;
import defpackage.InterfaceC5925hP3;
import defpackage.KH;
import defpackage.NZ3;
import defpackage.QZ2;
import defpackage.T34;
import defpackage.YD3;
import defpackage.ZF1;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TrustedCdn;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LocationBarModel implements InterfaceC5925hP3, InterfaceC3472aG1 {
    public final Context a;
    public final InterfaceC11299x32 b;
    public final KH c;
    public final KH d;
    public final C5242fQ3 e;
    public final QZ2 f;
    public C11055wM g;
    public Profile h;
    public LruCache i;
    public boolean j;
    public Tab k;
    public int l;
    public InterfaceC1422Ky1 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public final C12157za2 s = new C12157za2();

    @Override // defpackage.InterfaceC3472aG1
    public final boolean e() {
        Tab a;
        return (g() || (a = a()) == null || !a.e()) ? false : true;
    }

    public LocationBarModel(Context context, InterfaceC11299x32 interfaceC11299x32, KH kh, KH kh2, C5242fQ3 c5242fQ3, QZ2 qz2) {
        this.a = context;
        this.b = interfaceC11299x32;
        this.c = kh;
        this.d = kh2;
        this.e = c5242fQ3;
        this.l = AbstractC11746yN.a(context, false);
        this.f = qz2;
    }

    public final WebContents getActiveWebContents() {
        if (o()) {
            return this.k.b();
        }
        return null;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final Tab a() {
        if (o()) {
            return this.k;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3472aG1
    public final boolean o() {
        Tab tab = this.k;
        return (tab == null || !tab.isInitialized() || this.k.isDestroyed()) ? false : true;
    }

    @Override // defpackage.InterfaceC3472aG1
    public final void l(ZF1 zf1) {
        this.s.a(zf1);
    }

    @Override // defpackage.InterfaceC3472aG1
    public final void r(ZF1 zf1) {
        this.s.d(zf1);
    }

    @Override // defpackage.InterfaceC5925hP3
    public final String h() {
        return g() ? "chrome-native://newtab/" : (a() == null || !a().isInitialized()) ? "" : a().getUrl().i().trim();
    }

    public final void y() {
        Iterator it = this.s.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ZF1) c11814ya2.next()).t();
            }
        }
    }

    @Override // defpackage.InterfaceC5925hP3
    public final InterfaceC11299x32 j() {
        return this.b;
    }

    public final C6153i34 u(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        C11055wM c11055wM;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str2);
        if (this.r != 0 && spannableStringBuilder3.length() > 0) {
            Tab tab = this.k;
            if (tab == null || TrustedCdn.e(tab) == null) {
                try {
                    z = T34.i(new NZ3(str));
                } catch (URISyntaxException unused) {
                    z = false;
                }
                boolean z2 = this.n;
                int i = i();
                Context context = this.a;
                int a = AbstractC5647gc2.a(i, context, z2);
                int d = AbstractC5647gc2.d(context, a);
                int c = AbstractC5647gc2.c(context, a);
                int color = context.getResources().getColor((a == 1 || a == 2) ? R.color.0_resource_name_obfuscated_res_0x7f070130 : a == 0 ? R.color.0_resource_name_obfuscated_res_0x7f07012f : R.color.0_resource_name_obfuscated_res_0x7f07012e);
                int color2 = context.getResources().getColor((a == 1 || a == 2) ? R.color.0_resource_name_obfuscated_res_0x7f070111 : a == 0 ? R.color.0_resource_name_obfuscated_res_0x7f070110 : R.color.0_resource_name_obfuscated_res_0x7f07010f);
                C7252lG1 c7252lG1 = new C7252lG1(str, str2, q(), d, c, color, color2);
                if (this.j) {
                    c11055wM = this.g;
                    spannableStringBuilder2 = (SpannableStringBuilder) this.i.get(c7252lG1);
                } else {
                    c11055wM = new C11055wM(b());
                    spannableStringBuilder2 = null;
                }
                try {
                    if (spannableStringBuilder2 != null) {
                        return C6153i34.c(str, spannableStringBuilder2, str3);
                    }
                    spannableStringBuilder = spannableStringBuilder3;
                    AbstractC11140wc2.b(spannableStringBuilder3, c11055wM, q(), z, (d() || this.n) ? false : true, d, c, color, color2);
                    if (this.j) {
                        this.i.put(c7252lG1, spannableStringBuilder);
                    }
                    if (!this.j) {
                        c11055wM.a();
                    }
                    return C6153i34.c(str, spannableStringBuilder, str3);
                } finally {
                    if (!this.j) {
                        c11055wM.a();
                    }
                }
            }
        }
        spannableStringBuilder = spannableStringBuilder3;
        return C6153i34.c(str, spannableStringBuilder, str3);
    }

    @Override // defpackage.InterfaceC3472aG1
    public final String getTitle() {
        if (!o()) {
            return "";
        }
        String title = a().getTitle();
        return TextUtils.isEmpty(title) ? title : title.trim();
    }

    public final void x() {
        Iterator it = this.s.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ZF1) c11814ya2.next()).n();
            }
        }
    }

    @Override // defpackage.InterfaceC5925hP3
    public final boolean isIncognito() {
        return this.n;
    }

    public final void z() {
        boolean z = this.n;
        this.o = (z || this.l == AbstractC11746yN.a(this.a, z) || !o() || this.k.isNativePage()) ? false : true;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final boolean g() {
        return this.p && this.m != null && this.q;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final boolean c() {
        return this.p;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final Profile b() {
        if (this.n) {
            Tab tab = this.k;
            WindowAndroid m = tab != null ? tab.m() : null;
            this.d.getClass();
            Profile a = AbstractC1741Nk1.a(m);
            return a != null ? a : this.h.f(true);
        }
        return this.h;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final int i() {
        if (g()) {
            return AbstractC11746yN.a(this.a, this.n);
        }
        return this.l;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final boolean d() {
        return g() || this.o;
    }

    public final void v() {
        Iterator it = this.s.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ZF1) c11814ya2.next()).v();
            }
        }
    }

    @Override // defpackage.InterfaceC3472aG1
    public final boolean t() {
        if (o()) {
            Tab tab = this.k;
            this.e.getClass();
            if (AbstractC2217Rb2.e(tab) && !g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC5925hP3
    public final boolean k() {
        return !g() && o() && YD3.b(this.k).c();
    }

    @Override // defpackage.InterfaceC3472aG1
    public final int q() {
        Tab a = a();
        String e = a != null ? TrustedCdn.e(a) : null;
        boolean t = t();
        if (a == null || t || g()) {
            return 0;
        }
        if (e != null) {
            try {
                return new NZ3(e).h().equals("https") ? 3 : 6;
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        return AbstractC6832k23.a(a.b());
    }

    @Override // defpackage.InterfaceC3472aG1
    public final int p(boolean z) {
        if (this.r == 0) {
            return 0;
        }
        if (g()) {
            return 1;
        }
        return N.MY48gn2Q(this.r, this, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:            if (r8.k.isCustomTab() == false) goto L216;     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // defpackage.InterfaceC5925hP3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.q()
            r1 = 1
            r9 = r9 ^ r1
            boolean r2 = r8.t()
            boolean r3 = r8.k()
            if (r3 == 0) goto L11
            goto L25
        L11:
            if (r2 == 0) goto L18
            r9 = 2131297004(0x7f0902ec, float:1.821194E38)
            goto L88
        L18:
            r2 = 0
            if (r0 == 0) goto L1f
            r4 = 6
            if (r0 != r4) goto L29
        L1f:
            long r4 = r8.r
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
        L25:
            r9 = 2131297266(0x7f0903f2, float:1.8212472E38)
            goto L88
        L29:
            boolean r4 = r8.n
            QZ2 r5 = r8.f
            r5.getClass()
            r4 = r4 ^ r1
            r5 = 0
            if (r4 == 0) goto L45
            x32 r4 = r8.b
            boolean r4 = r4.h()
            if (r4 != 0) goto L45
            boolean r4 = r8.g()
            if (r4 == 0) goto L43
            goto L45
        L43:
            r4 = r5
            goto L46
        L45:
            r4 = r1
        L46:
            long r6 = r8.r
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L61
            org.chromium.chrome.browser.profiles.Profile r2 = org.chromium.chrome.browser.profiles.Profile.d()
            org.chromium.components.prefs.PrefService r2 = defpackage.R44.a(r2)
            java.lang.String r3 = "omnibox.lock_icon_in_address_bar_enabled"
            boolean r6 = r2.d(r3)
            if (r6 == 0) goto L61
            boolean r2 = r2.a(r3)
            goto L62
        L61:
            r2 = r5
        L62:
            boolean r3 = defpackage.AbstractC8293oI0.a()
            if (r3 == 0) goto L83
            nE r3 = defpackage.UN.a
            java.lang.String r3 = "OmniboxUpdatedConnectionSecurityIndicators"
            boolean r3 = J.N.M09VlOh_(r3)
            if (r3 == 0) goto L83
            if (r2 != 0) goto L83
            boolean r2 = r8.o()
            if (r2 == 0) goto L84
            org.chromium.chrome.browser.tab.Tab r2 = r8.k
            boolean r2 = r2.isCustomTab()
            if (r2 != 0) goto L83
            goto L84
        L83:
            r1 = r5
        L84:
            int r9 = defpackage.AbstractC7176l23.a(r9, r0, r4, r1)
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.toolbar.LocationBarModel.f(boolean):int");
    }

    @Override // defpackage.InterfaceC3472aG1
    public final int n() {
        int q = q();
        if (q != 0) {
            if (q == 3 || q == 4) {
                return R.string.0_resource_name_obfuscated_res_0x7f14015f;
            }
            if (q == 5) {
                return R.string.0_resource_name_obfuscated_res_0x7f14015e;
            }
            if (q != 6) {
                return 0;
            }
        }
        return R.string.0_resource_name_obfuscated_res_0x7f140160;
    }

    @Override // defpackage.InterfaceC3472aG1
    public final C6153i34 s() {
        TraceEvent i = TraceEvent.i("LocationBarModel.getUrlBarData", null);
        try {
            String h = h();
            if (!o()) {
                C6153i34 c6153i34 = C6153i34.h;
                if (i != null) {
                    i.close();
                }
                return c6153i34;
            }
            boolean z = this.n;
            HashSet hashSet = C6153i34.f;
            int b = AbstractC5107f12.b(h, null, z);
            boolean z2 = true;
            if ((b != 0) || T34.j(h)) {
                z2 = false;
            }
            if (!z2) {
                C6153i34 c6153i342 = C6153i34.h;
                if (i != null) {
                    i.close();
                }
                return c6153i342;
            }
            long j = this.r;
            String str = "";
            String MvJvjGzq = j == 0 ? "" : N.MvJvjGzq(j, this);
            if (this.k.l()) {
                C6153i34 u = u(h, MvJvjGzq, MvJvjGzq);
                if (i != null) {
                    i.close();
                }
                return u;
            }
            boolean b2 = AbstractC2290Rq0.b(h);
            KH kh = this.c;
            if (b2) {
                GURL a = AbstractC2290Rq0.a(new GURL(h));
                kh.getClass();
                String M5yzUycr = N.M5yzUycr(a);
                C6153i34 u2 = u(M5yzUycr, M5yzUycr, M5yzUycr);
                if (i != null) {
                    i.close();
                }
                return u2;
            }
            if (!t()) {
                long j2 = this.r;
                if (j2 != 0) {
                    str = N.Ml$ZWVQn(j2, this);
                }
                if (str.equals(MvJvjGzq)) {
                    C6153i34 u3 = u(h, MvJvjGzq, MvJvjGzq);
                    if (i != null) {
                        i.close();
                    }
                    return u3;
                }
                C6153i34 u4 = u(h, str, MvJvjGzq);
                if (i != null) {
                    i.close();
                }
                return u4;
            }
            GURL z3 = this.k.z();
            kh.getClass();
            String o = T34.o(N.M5yzUycr(z3));
            C5242fQ3 c5242fQ3 = this.e;
            WebContents b3 = this.k.b();
            c5242fQ3.getClass();
            if (AbstractC2217Rb2.f(b3)) {
                C6153i34 u5 = u(h, o, o);
                if (i != null) {
                    i.close();
                }
                return u5;
            }
            C6153i34 u6 = u(h, o, "");
            if (i != null) {
                i.close();
            }
            return u6;
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

    @Override // defpackage.InterfaceC3472aG1
    public final int m() {
        int a = AbstractC5647gc2.a(i(), this.a, this.n);
        int q = q();
        boolean z = this.n;
        if (q == 5) {
            if (z) {
                return R.color.0_resource_name_obfuscated_res_0x7f070032;
            }
            if (a == 3) {
                return R.color.0_resource_name_obfuscated_res_0x7f07012e;
            }
        }
        return AbstractC3494aK3.d(a);
    }

    public final void w() {
        Iterator it = this.s.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ZF1) c11814ya2.next()).a();
            }
        }
    }
}
