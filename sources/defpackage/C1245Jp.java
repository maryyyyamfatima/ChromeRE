package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.AutocompleteResult;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jp */
/* loaded from: classes.dex */
public final class C1245Jp implements InterfaceC2799Vo, InterfaceC8740pc2, InterfaceC6070hp3 {
    public boolean D;
    public boolean E;
    public String F;
    public boolean G;
    public long H;
    public final Context a;
    public final InterfaceC9158qp g;
    public final InterfaceC6495j34 h;
    public final PropertyModel i;
    public final Handler j;
    public final InterfaceC3472aG1 k;
    public final InterfaceC0079Ap3 l;
    public final C9189qu0 m;
    public final C9531ru0 n;
    public final Callback o;
    public final InterfaceC0079Ap3 p;
    public final InterfaceC6092ht1 q;
    public Runnable s;
    public Runnable t;
    public PropertyModel u;
    public boolean v;
    public AutocompleteController w;
    public long x;
    public boolean y;
    public int z;
    public AutocompleteResult r = AutocompleteResult.e;
    public int A = 0;
    public int B = 0;
    public long C = -1;
    public boolean I = true;

    public C1245Jp(Context context, InterfaceC9158qp interfaceC9158qp, C5809h34 c5809h34, PropertyModel propertyModel, Handler handler, InterfaceC7697ma2 interfaceC7697ma2, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC3472aG1 interfaceC3472aG1, Callback callback, InterfaceC0079Ap3 interfaceC0079Ap33, InterfaceC6114hx interfaceC6114hx, InterfaceC6092ht1 interfaceC6092ht1, C4959ec2 c4959ec2) {
        this.a = context;
        this.g = interfaceC9158qp;
        this.h = c5809h34;
        this.i = propertyModel;
        this.q = interfaceC6092ht1;
        this.l = interfaceC7697ma2;
        this.j = handler;
        this.k = interfaceC3472aG1;
        this.o = callback;
        this.p = interfaceC0079Ap33;
        C7616mK1 c7616mK1 = (C7616mK1) propertyModel.i(AbstractC6413ip3.c);
        C9189qu0 c9189qu0 = new C9189qu0(interfaceC0079Ap3, interfaceC6114hx, c4959ec2);
        this.m = c9189qu0;
        c9189qu0.e = interfaceC0079Ap32;
        this.n = new C9531ru0(context, c7616mK1);
    }

    public final void n() {
        boolean z = this.z == 2 && this.r.b.size() > 0;
        LD2 ld2 = AbstractC6413ip3.a;
        PropertyModel propertyModel = this.i;
        boolean j = propertyModel.j(ld2);
        propertyModel.k(ld2, z);
        if (!z || j) {
            return;
        }
        this.I = true;
    }

    public final void d(long j, String str) {
        AutocompleteController autocompleteController;
        AutocompleteMatch autocompleteMatch;
        boolean z = false;
        if (this.r.b.size() > 0 && str.trim().equals(this.F.trim())) {
            autocompleteMatch = (AutocompleteMatch) this.r.b.get(0);
            z = true;
        } else {
            if (!this.v || (autocompleteController = this.w) == null) {
                return;
            }
            boolean z2 = ((a) this.g).o.F;
            long j2 = autocompleteController.b;
            autocompleteMatch = j2 == 0 ? null : (AutocompleteMatch) N.MDxZMia5(j2, str, z2);
            if (autocompleteMatch == null) {
                return;
            }
        }
        AutocompleteMatch autocompleteMatch2 = autocompleteMatch;
        f(0, autocompleteMatch2, autocompleteMatch2.j, j, z);
    }

    public final void g(final int i, final AutocompleteMatch autocompleteMatch, final GURL gurl) {
        if (this.r.c && (!this.v || this.w == null)) {
            this.t = new Runnable() { // from class: Ep
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    AutocompleteMatch autocompleteMatch2 = autocompleteMatch;
                    GURL gurl2 = gurl;
                    C1245Jp c1245Jp = C1245Jp.this;
                    c1245Jp.f(i2, autocompleteMatch2, gurl2, c1245Jp.H, true);
                }
            };
        } else {
            f(i, autocompleteMatch, gurl, this.H, true);
        }
    }

    public final void l(AutocompleteMatch autocompleteMatch, String str, Runnable runnable) {
        ZX1 zx1;
        FI2.a("MobileOmniboxDeleteGesture");
        if (autocompleteMatch.o && (zx1 = (ZX1) this.l.get()) != null) {
            C0985Hp c0985Hp = new C0985Hp(this, runnable, zx1);
            Resources resources = this.a.getResources();
            int i = autocompleteMatch.a;
            int i2 = i == 19 || i == 26 || i == 27 ? R.string.0_resource_name_obfuscated_res_0x7f140722 : R.string.0_resource_name_obfuscated_res_0x7f140721;
            BD2 bd2 = new BD2(AbstractC4249cY1.B);
            bd2.e(AbstractC4249cY1.a, c0985Hp);
            bd2.e(AbstractC4249cY1.c, str);
            bd2.c(AbstractC4249cY1.d, 1);
            bd2.e(AbstractC4249cY1.f, resources.getString(i2));
            bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f140717);
            bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
            bd2.b(AbstractC4249cY1.r, true);
            this.u = bd2.a();
            m(false);
            zx1.l(this.u, 1, false);
        }
    }

    public final void h(final String str, String str2) {
        AutocompleteController autocompleteController;
        if (this.G) {
            return;
        }
        this.I = true;
        c();
        if (this.A == 0 && this.v && (autocompleteController = this.w) != null) {
            long j = autocompleteController.b;
            if (j != 0) {
                N.MHXditHc(j);
            }
            this.C = SystemClock.elapsedRealtime();
            this.A = 1;
        }
        m(false);
        boolean isEmpty = TextUtils.isEmpty(str);
        InterfaceC9158qp interfaceC9158qp = this.g;
        if (isEmpty) {
            e();
            i(new RunnableC0075Ap(this), -1L);
        } else {
            InterfaceC3472aG1 interfaceC3472aG1 = this.k;
            if (interfaceC3472aG1.o() || interfaceC3472aG1.g()) {
                C5809h34 c5809h34 = (C5809h34) this.h;
                InterfaceC11558xp interfaceC11558xp = c5809h34.a.m;
                final boolean z = !(interfaceC11558xp != null ? interfaceC11558xp.f() : false);
                final int selectionStart = c5809h34.a.getSelectionStart() == c5809h34.a.getSelectionEnd() ? c5809h34.a.getSelectionStart() : -1;
                final int p = interfaceC3472aG1.p(((a) interfaceC9158qp).o.F);
                final String h = interfaceC3472aG1.h();
                i(new Runnable() { // from class: Dp
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = h;
                        int i = p;
                        String str4 = str;
                        C1245Jp.this.w.a(i, selectionStart, str3, str4, z);
                    }
                }, 30L);
            }
        }
        ((a) interfaceC9158qp).o.i0();
    }

    @Override // defpackage.InterfaceC2799Vo
    public final void a(AutocompleteResult autocompleteResult, String str, boolean z) {
        SparseArray sparseArray;
        int i;
        int i2;
        boolean z2;
        int i3;
        C5348fk c5348fk;
        AutocompleteResult autocompleteResult2 = autocompleteResult;
        if (this.G || this.z == 0) {
            return;
        }
        int i4 = 0;
        boolean z3 = true;
        if (this.y) {
            Q83 q83 = O83.a;
            List list = autocompleteResult2.b;
            q83.q(0, "zero_suggest_list_size");
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                AutocompleteMatch autocompleteMatch = (AutocompleteMatch) list.get(i6);
                boolean z4 = autocompleteMatch.h != null;
                int i7 = autocompleteMatch.a;
                if ((z4 || i7 == 19 || i7 == 26 || i7 == 27 || i7 == 29) ? false : true) {
                    q83.t(AbstractC6265iP.r.a(i5), autocompleteMatch.j.m());
                    q83.t(AbstractC6265iP.s.a(i5), autocompleteMatch.d);
                    q83.t(AbstractC6265iP.t.a(i5), autocompleteMatch.f);
                    q83.q(i7, AbstractC6265iP.u.a(i5));
                    String a = AbstractC6265iP.v.a(i5);
                    Set set = autocompleteMatch.b;
                    if (set == null) {
                        c5348fk = null;
                    } else {
                        c5348fk = new C5348fk(set.size());
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            c5348fk.add(((Integer) it.next()).toString());
                        }
                    }
                    q83.u(a, c5348fk);
                    q83.p(AbstractC6265iP.w.a(i5), autocompleteMatch.c);
                    q83.p(AbstractC6265iP.z.a(i5), autocompleteMatch.o);
                    q83.t(AbstractC6265iP.A.a(i5), autocompleteMatch.p);
                    String a2 = AbstractC6265iP.B.a(i5);
                    byte[] bArr = autocompleteMatch.q;
                    q83.t(a2, bArr != null ? Base64.encodeToString(bArr, 0) : null);
                    q83.q(autocompleteMatch.r, AbstractC6265iP.y.a(i5));
                    i5++;
                }
            }
            q83.q(i5, "zero_suggest_list_size");
            SparseArray sparseArray2 = autocompleteResult2.a;
            int size = sparseArray2.size();
            q83.q(size, "zero_suggest_header_list_size");
            for (int i8 = 0; i8 < size; i8++) {
                C1375Kp c1375Kp = (C1375Kp) sparseArray2.valueAt(i8);
                String str2 = c1375Kp.a;
                q83.q(sparseArray2.keyAt(i8), AbstractC6265iP.C.a(i8));
                q83.t(AbstractC6265iP.D.a(i8), str2);
                q83.p(AbstractC6265iP.E.a(i8), c1375Kp.b);
            }
        }
        List list2 = autocompleteResult2.b;
        C5809h34 c5809h34 = (C5809h34) this.h;
        this.F = AbstractC7848n0.a(c5809h34.b(), str);
        if (!this.r.equals(autocompleteResult2)) {
            this.r = autocompleteResult2;
            C9189qu0 c9189qu0 = this.m;
            c9189qu0.d.getClass();
            int i9 = 0;
            while (true) {
                ArrayList arrayList = c9189qu0.a;
                if (i9 >= arrayList.size()) {
                    break;
                }
                ((InterfaceC7444lp3) arrayList.get(i9)).e();
                i9++;
            }
            List list3 = autocompleteResult2.b;
            int i10 = -1;
            if (list3.size() > 2) {
                int size2 = list3.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        i3 = 0;
                        break;
                    } else {
                        if (((AutocompleteMatch) list3.get(size2)).r == -1) {
                            i3 = size2 + 1;
                            break;
                        }
                        size2--;
                    }
                }
                if (c9189qu0.j == -1) {
                    i4 = Math.min(list3.size(), 5);
                } else {
                    int i11 = 0;
                    while (i4 < list3.size() && i11 < c9189qu0.j) {
                        AutocompleteMatch autocompleteMatch2 = (AutocompleteMatch) list3.get(i4);
                        if (autocompleteMatch2.r != -1) {
                            break;
                        }
                        i11 += c9189qu0.a(autocompleteMatch2, i4).h();
                        i4++;
                    }
                }
                if (i3 > 1) {
                    int min = Math.min(i4, i3);
                    if (autocompleteResult2.d == 0 || !autocompleteResult2.a(-1, 4)) {
                        z3 = true;
                    } else {
                        N.Mc_qvuuv(autocompleteResult2.d, 1, min);
                        z3 = true;
                    }
                }
                if (i4 < i3) {
                    c9189qu0.k = z3;
                    if (autocompleteResult2.d != 0) {
                        i10 = -1;
                        if (autocompleteResult2.a(-1, 4)) {
                            N.Mc_qvuuv(autocompleteResult2.d, i4, i3);
                        }
                    } else {
                        i10 = -1;
                    }
                } else {
                    i10 = -1;
                    c9189qu0.k = false;
                }
            }
            int size3 = list3.size();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < size3; i12++) {
                AutocompleteMatch autocompleteMatch3 = (AutocompleteMatch) list3.get(i12);
                arrayList3.add(new Pair(autocompleteMatch3, c9189qu0.a(autocompleteMatch3, i12)));
            }
            int i13 = 0;
            while (true) {
                sparseArray = autocompleteResult2.a;
                if (i13 >= size3) {
                    break;
                }
                Pair pair = (Pair) arrayList3.get(i13);
                AutocompleteMatch autocompleteMatch4 = (AutocompleteMatch) pair.first;
                InterfaceC7444lp3 interfaceC7444lp3 = (InterfaceC7444lp3) pair.second;
                int i14 = autocompleteMatch4.r;
                if (i10 != i14) {
                    C1375Kp c1375Kp2 = (C1375Kp) sparseArray.get(i14);
                    if (c1375Kp2 != null) {
                        PropertyModel g = c9189qu0.d.g();
                        C7548m71 c7548m71 = c9189qu0.d;
                        c7548m71.getClass();
                        g.o(AbstractC9264r71.c, c1375Kp2.a);
                        g.k(AbstractC9264r71.b, false);
                        g.k(AbstractC9264r71.d, c7548m71.c);
                        if (c7548m71.d) {
                            g.o(AbstractC9264r71.a, new C7204l71(c7548m71, g, i14));
                        }
                        arrayList2.add(new C7815mu0(c9189qu0.d, g, i14));
                    }
                    i10 = i14;
                }
                PropertyModel g2 = interfaceC7444lp3.g();
                interfaceC7444lp3.b(i13, autocompleteMatch4, g2);
                arrayList2.add(new C7815mu0(interfaceC7444lp3, g2, i10));
                i13++;
                autocompleteResult2 = autocompleteResult;
            }
            C9531ru0 c9531ru0 = this.n;
            c9531ru0.f = arrayList2;
            SparseBooleanArray sparseBooleanArray = c9531ru0.c;
            sparseBooleanArray.clear();
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                sparseBooleanArray.put(sparseArray.keyAt(i15), ((C1375Kp) sparseArray.valueAt(i15)).b);
            }
            ArrayList arrayList4 = new ArrayList();
            if (DeviceFormFactor.a(c9531ru0.a)) {
                i = 0;
                i2 = 2;
            } else {
                i = 0;
                i2 = 1;
            }
            while (i < c9531ru0.f.size()) {
                C7815mu0 c7815mu0 = (C7815mu0) c9531ru0.f.get(i);
                PropertyModel propertyModel = c7815mu0.b;
                propertyModel.m(AbstractC5038ep3.b, c9531ru0.d);
                propertyModel.m(AbstractC5038ep3.a, c9531ru0.e);
                propertyModel.m(AbstractC5038ep3.c, i2);
                int i16 = c7815mu0.c;
                if (!sparseBooleanArray.get(i16, false) || C9531ru0.a(c7815mu0, i16)) {
                    arrayList4.add(c7815mu0);
                }
                i++;
            }
            c9531ru0.b.A(arrayList4);
            boolean z5 = (TextUtils.isEmpty(c5809h34.b()) || list2.isEmpty()) ? true : ((AutocompleteMatch) list2.get(0)).c;
            g gVar = ((a) this.g).o;
            C1359Kl3 c1359Kl3 = gVar.l.g;
            if (z5 != c1359Kl3.K) {
                c1359Kl3.K = z5;
                z2 = false;
                c1359Kl3.d(0);
            } else {
                z2 = false;
            }
            String b = gVar.o.b();
            InterfaceC11558xp interfaceC11558xp = gVar.o.a.m;
            if (interfaceC11558xp != null) {
                z2 = interfaceC11558xp.f();
            }
            if (z2) {
                C7183l34 c7183l34 = gVar.o.g;
                if (c7183l34.h) {
                    c7183l34.a.o(AbstractC8215o34.c, new C7527m34(b, str));
                }
            }
            if (gVar.G && gVar.M) {
                gVar.J(true);
            }
            if (gVar.E && !AX.e().g("disable-instant") && C1096Il0.c().d && N.MaV3tKHW() != 0) {
                InterfaceC3472aG1 interfaceC3472aG1 = gVar.j;
                if (interfaceC3472aG1.o()) {
                    C5303fc2 c5303fc2 = gVar.n;
                    N.M5tjuSum(c5303fc2.a, c5303fc2, b, gVar.x, gVar.m.i.r.d, (Profile) ((C8385oa2) gVar.p).g, interfaceC3472aG1.a());
                }
            }
            n();
        }
        this.i.k(AbstractC6413ip3.d, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:            if (r5 == null) goto L297;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, org.chromium.components.omnibox.AutocompleteMatch r18, org.chromium.url.GURL r19, long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1245Jp.f(int, org.chromium.components.omnibox.AutocompleteMatch, org.chromium.url.GURL, long, boolean):void");
    }

    public static void b(C1245Jp c1245Jp) {
        c1245Jp.A = 0;
        c1245Jp.C = -1L;
        a aVar = (a) c1245Jp.g;
        if (aVar.o.M) {
            InterfaceC3472aG1 interfaceC3472aG1 = c1245Jp.k;
            if (interfaceC3472aG1.o() || interfaceC3472aG1.g()) {
                int p = interfaceC3472aG1.p(aVar.o.F);
                c1245Jp.y = p == 16;
                AutocompleteController autocompleteController = c1245Jp.w;
                String a = ((C5809h34) c1245Jp.h).a();
                String h = interfaceC3472aG1.h();
                String title = interfaceC3472aG1.getTitle();
                if (autocompleteController.b == 0 || TextUtils.isEmpty(h)) {
                    return;
                }
                N.MmFptZoy(autocompleteController.b, a, h, p, title);
            }
        }
    }

    public final void e() {
        if (!this.v || this.w == null) {
            return;
        }
        m(true);
        if (this.u != null) {
            ((ZX1) this.l.get()).c(5, this.u);
        }
        C9531ru0 c9531ru0 = this.n;
        c9531ru0.f.clear();
        c9531ru0.b.clear();
        c9531ru0.c.clear();
        this.r = AutocompleteResult.e;
        n();
    }

    public final void m(boolean z) {
        AutocompleteController autocompleteController;
        if (this.v && (autocompleteController = this.w) != null) {
            long j = autocompleteController.b;
            if (j != 0) {
                N.MktNJvjP(j, z);
            }
        }
        c();
    }

    public final void j(int i, int i2, AutocompleteMatch autocompleteMatch) {
        EI2.b("Android.Omnibox.UsedSuggestionFromCache", this.r.c);
        if (this.r.c) {
            return;
        }
        InterfaceC3472aG1 interfaceC3472aG1 = this.k;
        String h = interfaceC3472aG1.h();
        int p = interfaceC3472aG1.p(((a) this.g).o.F);
        long elapsedRealtime = this.C > 0 ? SystemClock.elapsedRealtime() - this.C : -1L;
        C5809h34 c5809h34 = (C5809h34) this.h;
        int length = c5809h34.a().length() - c5809h34.b().length();
        WebContents b = interfaceC3472aG1.o() ? interfaceC3472aG1.a().b() : null;
        AutocompleteController autocompleteController = this.w;
        int i3 = autocompleteMatch.a;
        if (autocompleteController.b != 0 && autocompleteController.c.a(i, 1)) {
            N.MqRSHXK7(autocompleteController.b, i, i2, h, p, elapsedRealtime, length, b);
        }
    }

    public final void i(Runnable runnable, long j) {
        c();
        RunnableC1115Ip runnableC1115Ip = new RunnableC1115Ip(this, runnable);
        this.s = runnableC1115Ip;
        if (!this.v || this.w == null) {
            return;
        }
        if (j == -1) {
            runnableC1115Ip.run();
        } else {
            this.j.postDelayed(runnableC1115Ip, j);
        }
    }

    public final void c() {
        this.y = false;
        Runnable runnable = this.s;
        if (runnable != null) {
            this.j.removeCallbacks(runnable);
            this.s = null;
        }
    }

    public final void k() {
        if (!this.v || this.w == null) {
            return;
        }
        Runnable runnable = this.t;
        Handler handler = this.j;
        if (runnable != null) {
            handler.post(runnable);
            this.t = null;
            c();
        } else {
            Runnable runnable2 = this.s;
            if (runnable2 != null) {
                handler.postAtFrontOfQueue(runnable2);
            }
        }
    }
}
