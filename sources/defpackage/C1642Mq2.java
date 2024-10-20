package defpackage;

import J.N;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import com.android.chrome.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.components.payments.PaymentApp;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mq2 */
/* loaded from: classes.dex */
public final class C1642Mq2 implements G53, InterfaceC1113Io2, InterfaceC1248Jp2, PersonalDataManager.NormalizedAddressRequestDelegate, InterfaceC3669aq2, InterfaceC1292Jy1 {
    public static final C0473Dq2 L = new Comparator() { // from class: Dq2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C4733dw0) obj2).g, ((C4733dw0) obj).g);
        }
    };
    public U83 A;
    public boolean B;
    public C8545p13 C;
    public C8545p13 D;
    public C40 E;
    public InterfaceC2549Tq F;
    public List H;
    public InterfaceC10590uz3 I;

    /* renamed from: J */
    public TabModel f11458J;
    public InterfaceC10240ty1 K;
    public final C6406io2 a;
    public final boolean g;
    public final C0733Fq2 j;
    public final C0863Gq2 k;
    public G40 l;
    public C1243Jo2 m;
    public Callback n;
    public C8545p13 o;
    public final InterfaceC1383Kq2 p;
    public final WebContents q;
    public final String r;
    public final String s;
    public final HashMap t;
    public final K7 u;
    public final C9310rG v;
    public final C1513Lq2 w;
    public final InterfaceC7437lo2 x;
    public final C1137It1 y;
    public ViewOnClickListenerC5731gq2 z;
    public final Handler h = new Handler();
    public final LinkedList i = new LinkedList();
    public boolean G = true;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    public C1642Mq2(InterfaceC1383Kq2 interfaceC1383Kq2, InterfaceC7437lo2 interfaceC7437lo2, WebContents webContents, boolean z, C1137It1 c1137It1, String str) {
        this.p = interfaceC1383Kq2;
        this.x = interfaceC7437lo2;
        K7 k7 = new K7(!z);
        this.u = k7;
        this.v = new C9310rG(webContents, k7, z);
        this.y = c1137It1;
        this.q = webContents;
        this.r = str;
        this.s = webContents.getTitle();
        this.w = new C1513Lq2(this);
        this.t = new HashMap();
        this.g = z;
        this.a = new C6406io2(interfaceC7437lo2);
        this.j = new C0733Fq2(this);
        this.k = new C0863Gq2(this);
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        C4546dP c4546dP = (C4546dP) this.p;
        c4546dP.e.a(0);
        c4546dP.b("Tab overview mode dismissed Payment Request UI.");
    }

    public final ArrayList m() {
        ArrayList arrayList = new ArrayList();
        C8545p13 c8545p13 = this.C;
        if (c8545p13 == null) {
            return arrayList;
        }
        Iterator it = c8545p13.a.iterator();
        while (it.hasNext()) {
            arrayList.add((PaymentApp) ((C4733dw0) it.next()));
        }
        return arrayList;
    }

    public final PaymentApp o() {
        C8545p13 c8545p13 = this.C;
        if (c8545p13 == null) {
            return null;
        }
        return (PaymentApp) c8545p13.c();
    }

    public final C11212wo2 k(PaymentApp paymentApp) {
        C2287Rp2 c2287Rp2 = (C2287Rp2) this.x;
        if (c2287Rp2.u) {
            return null;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(c2287Rp2.t.b());
        if (!unmodifiableMap.isEmpty() && paymentApp != null) {
            HashSet hashSet = new HashSet(paymentApp.o());
            hashSet.retainAll(unmodifiableMap.keySet());
            if (hashSet.isEmpty()) {
                return null;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C11212wo2 c11212wo2 = (C11212wo2) unmodifiableMap.get(str);
                if (paymentApp.z(str, c11212wo2.d)) {
                    return c11212wo2;
                }
            }
        }
        return null;
    }

    public final C8395oc0 l(C9840so2 c9840so2) {
        String str = c9840so2.b;
        HashMap hashMap = this.t;
        C8395oc0 c8395oc0 = (C8395oc0) hashMap.get(str);
        if (c8395oc0 != null) {
            return c8395oc0;
        }
        C8395oc0 c8395oc02 = new C8395oc0(c9840so2.b, Locale.getDefault());
        hashMap.put(str, c8395oc02);
        return c8395oc02;
    }

    public final List j(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C5037ep2 c5037ep2 = (C5037ep2) list.get(i);
            C8395oc0 l = l(c5037ep2.c);
            arrayList.add(new AB1(c5037ep2.b, this.t.size() > 1 ? N.MnbePYrk(l.a, l) : "", l.b(c5037ep2.c.c), c5037ep2.d));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void x(C10869vo2 c10869vo2) {
        List asList;
        C8545p13 c8545p13;
        C5037ep2 c5037ep2 = c10869vo2.b;
        if (c5037ep2 != null) {
            l(c5037ep2.c);
        }
        C5037ep2[] c5037ep2Arr = c10869vo2.c;
        if (c5037ep2Arr != null) {
            for (C5037ep2 c5037ep22 : c5037ep2Arr) {
                l(c5037ep22.c);
            }
        }
        C12253zq2[] c12253zq2Arr = c10869vo2.d;
        if (c12253zq2Arr != null) {
            for (C12253zq2 c12253zq2 : c12253zq2Arr) {
                l(c12253zq2.d);
            }
        }
        C11212wo2[] c11212wo2Arr = c10869vo2.e;
        if (c11212wo2Arr != null) {
            for (C11212wo2 c11212wo2 : c11212wo2Arr) {
                C5037ep2 c5037ep23 = c11212wo2.b;
                if (c5037ep23 != null) {
                    l(c5037ep23.c);
                }
                for (C5037ep2 c5037ep24 : c11212wo2.c) {
                    l(c5037ep24.c);
                }
            }
        }
        C8395oc0 l = l(c10869vo2.b.c);
        AB1 ab1 = new AB1(c10869vo2.b.b, N.MnbePYrk(l.a, l), l.b(c10869vo2.b.c.c), false);
        C5037ep2[] c5037ep2Arr2 = c10869vo2.c;
        if (c5037ep2Arr2 == null) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList(c5037ep2Arr2);
        }
        this.A = new U83(ab1, j(asList));
        if (this.o == null || c10869vo2.d != null) {
            C12253zq2[] c12253zq2Arr2 = c10869vo2.d;
            if (c12253zq2Arr2 == null || c12253zq2Arr2.length == 0) {
                c8545p13 = new C8545p13(2);
            } else {
                ArrayList arrayList = new ArrayList();
                int i = -1;
                for (int i2 = 0; i2 < c12253zq2Arr2.length; i2++) {
                    C12253zq2 c12253zq22 = c12253zq2Arr2[i2];
                    C8395oc0 l2 = l(c12253zq22.d);
                    String str = this.t.size() > 1 ? N.MnbePYrk(l2.a, l2) + " " : "";
                    String str2 = c12253zq22.b;
                    String str3 = c12253zq22.c;
                    StringBuilder a = AbstractC10761vV3.a(str);
                    a.append(l2.b(c12253zq22.d.c));
                    arrayList.add(new C4733dw0(null, str2, str3, a.toString()));
                    if (c12253zq22.e) {
                        i = i2;
                    }
                }
                c8545p13 = new C8545p13(2, i, Collections.unmodifiableList(arrayList));
            }
            this.o = c8545p13;
        }
        w();
    }

    public final void h() {
        if (this.n != null && this.C != null) {
            s();
            return;
        }
        this.z.m(this.A);
        if (u()) {
            this.z.o(2, this.o);
        }
    }

    public final void v(String str) {
        if (u()) {
            if ((this.o.a.isEmpty() || !TextUtils.isEmpty(str)) && this.D.c() != null) {
                this.D.c().o = false;
                C8545p13 c8545p13 = this.D;
                c8545p13.c = -2;
                c8545p13.e = str;
            }
        }
    }

    public final boolean u() {
        InterfaceC7437lo2 interfaceC7437lo2 = this.x;
        if (((C2287Rp2) interfaceC7437lo2).u || !((C2287Rp2) interfaceC7437lo2).n.e) {
            return false;
        }
        PaymentApp o = o();
        return o == null || !o.u();
    }

    public final boolean t() {
        PaymentApp o = o();
        InterfaceC7437lo2 interfaceC7437lo2 = this.x;
        if (((C2287Rp2) interfaceC7437lo2).u) {
            return false;
        }
        C7787mp2 c7787mp2 = ((C2287Rp2) interfaceC7437lo2).n;
        if (c7787mp2.b && (o == null || !o.s())) {
            return true;
        }
        if (!c7787mp2.d || (o != null && o.t())) {
            return c7787mp2.c && (o == null || !o.r());
        }
        return true;
    }

    public final void s() {
        C8545p13 c8545p13 = this.C;
        PaymentApp o = o();
        c8545p13.d = (o == null ? 0 : o.p()) != 3;
        this.n.onResult(new C4693dp2(this.A, this.D, this.o, this.E, this.C));
        this.n = null;
    }

    public final void g(C7446lq c7446lq) {
        C1281Jw0 c1281Jw0;
        C1281Jw0 c1281Jw02;
        String str;
        final G40 g40 = this.l;
        final C0993Hq2 c0993Hq2 = new C0993Hq2(this, c7446lq);
        final C7446lq c7446lq2 = c7446lq == null ? new C7446lq(g40.b, new PersonalDataManager.AutofillProfile(), null, null, null, 7, g40.c, g40.d, g40.e) : c7446lq;
        C1281Jw0 c = g40.c ? C1281Jw0.c(4, g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14081e), g40.g, null, null, null, g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841), null, c7446lq2.v) : null;
        if (g40.d) {
            String string = g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140252);
            HashSet hashSet = g40.h;
            C2827Vt2 c2827Vt2 = new C2827Vt2();
            if (g40.k == null) {
                g40.k = new E40();
            }
            c1281Jw0 = C1281Jw0.c(1, string, hashSet, c2827Vt2, g40.k, null, g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841), g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140823), c7446lq2.w);
        } else {
            c1281Jw0 = null;
        }
        if (g40.e) {
            String string2 = g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140250);
            HashSet hashSet2 = g40.i;
            if (g40.l == null) {
                g40.l = new F40();
            }
            c1281Jw02 = C1281Jw0.c(2, string2, hashSet2, null, g40.l, null, g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841), g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140817), c7446lq2.x);
        } else {
            c1281Jw02 = null;
        }
        if (c7446lq != null) {
            str = c7446lq.j;
        } else {
            str = g40.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1407fc);
        }
        C1930Ow0 c1930Ow0 = new C1930Ow0(str, null);
        if (c != null) {
            C4344co2 c4344co2 = g40.j;
            c.n = c4344co2 != null ? c4344co2.c : null;
            c1930Ow0.a(c);
        }
        if (c1281Jw0 != null) {
            C4344co2 c4344co22 = g40.j;
            c1281Jw0.n = c4344co22 != null ? c4344co22.d : null;
            c1930Ow0.a(c1281Jw0);
        }
        if (c1281Jw02 != null) {
            C4344co2 c4344co23 = g40.j;
            c1281Jw02.n = c4344co23 != null ? c4344co23.b : null;
            c1930Ow0.a(c1281Jw02);
        }
        c1930Ow0.e = new ZE(c0993Hq2, c7446lq);
        final C1281Jw0 c1281Jw03 = c;
        final C1281Jw0 c1281Jw04 = c1281Jw0;
        final C1281Jw0 c1281Jw05 = c1281Jw02;
        c1930Ow0.d = new Runnable() { // from class: D40
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                String str3;
                G40 g402 = G40.this;
                g402.getClass();
                C7446lq c7446lq3 = c7446lq2;
                PersonalDataManager.AutofillProfile autofillProfile = c7446lq3.p;
                C1281Jw0 c1281Jw06 = c1281Jw03;
                String str4 = null;
                if (c1281Jw06 != null) {
                    str2 = c1281Jw06.s.toString();
                    autofillProfile.getClass();
                    autofillProfile.e = new C2042Ps2(str2, 4);
                } else {
                    str2 = null;
                }
                C1281Jw0 c1281Jw07 = c1281Jw04;
                if (c1281Jw07 != null) {
                    str3 = c1281Jw07.s.toString();
                    autofillProfile.getClass();
                    autofillProfile.n = new C2042Ps2(str3, 4);
                } else {
                    str3 = null;
                }
                C1281Jw0 c1281Jw08 = c1281Jw05;
                if (c1281Jw08 != null) {
                    str4 = c1281Jw08.s.toString();
                    autofillProfile.getClass();
                    autofillProfile.o = new C2042Ps2(str4, 4);
                }
                if (g402.f) {
                    PersonalDataManager d = PersonalDataManager.d();
                    d.getClass();
                    Object obj = ThreadUtils.a;
                    autofillProfile.a = N.McRRW$S3(d.a, d, autofillProfile);
                }
                if (autofillProfile.getGUID().isEmpty()) {
                    autofillProfile.a = UUID.randomUUID().toString();
                }
                autofillProfile.c = true;
                c7446lq3.i(autofillProfile.getGUID(), str2, str3, str4);
                c7446lq3.j(0);
                c0993Hq2.onResult(c7446lq3);
            }
        };
        g40.a.h(c1930Ow0);
        if (g40.j != null) {
            g40.a.i();
        }
    }

    public final int p(C2807Vp2 c2807Vp2, int i) {
        if (i == 1) {
            this.u.d(new C1123Iq2(this, null), null);
            this.n = c2807Vp2;
            return 1;
        }
        if (i == 3) {
            g(null);
            return 2;
        }
        if (i != 4) {
            return 3;
        }
        e(null);
        return 2;
    }

    public final void b(Context context) {
        int i;
        int g;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            PersonalDataManager.AutofillProfile autofillProfile = (PersonalDataManager.AutofillProfile) this.H.get(i2);
            String phoneNumber = autofillProfile.getPhoneNumber();
            K7 k7 = this.u;
            k7.getClass();
            if (!TextUtils.isEmpty(phoneNumber)) {
                k7.e.add(phoneNumber.toString());
            }
            if (!TextUtils.isEmpty(autofillProfile.getStreetAddress())) {
                arrayList.add(new C1634Mp(context, autofillProfile, 0));
            }
        }
        Collections.sort(arrayList, L);
        List subList = arrayList.subList(0, Math.min(arrayList.size(), 4));
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < subList.size(); i3++) {
            String j = C1634Mp.j(((C1634Mp) subList.get(i3)).q);
            if (!hashSet.contains(j)) {
                hashSet.add(j);
                PersonalDataManager d = PersonalDataManager.d();
                d.getClass();
                Object obj = ThreadUtils.a;
                N.Mj65Bkg_(d.a, d, j);
            }
        }
        boolean z = !subList.isEmpty() && ((C1634Mp) subList.get(0)).a;
        if (this.o.c() == null || !z) {
            i = -1;
        } else {
            C1634Mp c1634Mp = (C1634Mp) subList.get(0);
            if (c1634Mp.s == null) {
                PersonalDataManager d2 = PersonalDataManager.d();
                c1634Mp.s = N.MGlLlw0K(d2.a, d2, c1634Mp.q);
            }
            PersonalDataManager.AutofillProfile autofillProfile2 = c1634Mp.q;
            String str = c1634Mp.s;
            autofillProfile2.p = str;
            c1634Mp.n[1] = str;
            i = 0;
        }
        int size = subList.size();
        C1137It1 c1137It1 = this.y;
        N.MPFG5SwC(c1137It1.a, c1137It1, 2, size, z);
        if (subList.isEmpty()) {
            g = 11;
        } else {
            C1634Mp c1634Mp2 = (C1634Mp) subList.get(0);
            g = C1634Mp.g(c1634Mp2.q, c1634Mp2.u);
        }
        if (g != 0) {
            EI2.m(g, "PaymentRequest.MissingShippingFields");
        }
        this.D = new C8545p13(1, i, subList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    public final void e(C3069Xq c3069Xq) {
        C3069Xq c3069Xq2;
        C1930Ow0 c1930Ow0;
        final boolean z;
        ?? r0;
        C3069Xq c3069Xq3;
        final C1253Jq2 c1253Jq2 = new C1253Jq2(this, c3069Xq);
        final C9310rG c9310rG = this.v;
        WebContents webContents = c9310rG.c;
        if (c3069Xq == null) {
            c3069Xq2 = new C3069Xq(webContents, new PersonalDataManager.CreditCard("", "Chrome settings", "", "", "", "", ""), null, null);
            c1930Ow0 = new C1930Ow0(c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1407fa), null);
            z = true;
        } else {
            c3069Xq2 = c3069Xq;
            c1930Ow0 = new C1930Ow0(c3069Xq.j, null);
            z = false;
        }
        final PersonalDataManager.CreditCard creditCard = c3069Xq2.q;
        if (creditCard.getIsLocal()) {
            try {
                Calendar calendar = (Calendar) c9310rG.n.f();
                if (c9310rG.o == null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList3 = c9310rG.j;
                        if (i >= arrayList3.size()) {
                            break;
                        }
                        arrayList.add(Integer.valueOf(((C8968qG) arrayList3.get(i)).a));
                        arrayList2.add(Integer.valueOf(((C8968qG) arrayList3.get(i)).b));
                        i++;
                    }
                    String string = c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1407f7);
                    C1281Jw0 c1281Jw0 = new C1281Jw0(11);
                    c1281Jw0.p = string;
                    c1281Jw0.b = arrayList;
                    c1281Jw0.c = arrayList2;
                    c9310rG.o = c1281Jw0;
                }
                c1930Ow0.a(c9310rG.o);
                if (c9310rG.v == null) {
                    C0916Hb0 c1176Jb0 = C0916Hb0.h != null ? new C1176Jb0(webContents, c9310rG) : new C0916Hb0(webContents, c9310rG);
                    c9310rG.v = c1176Jb0;
                    c9310rG.x = c1176Jb0.a();
                }
                if (c9310rG.p == null) {
                    C1281Jw0 c = C1281Jw0.c(7, c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14022b), null, null, c9310rG.l, c9310rG.m, c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841), c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14080b), null);
                    c9310rG.p = c;
                    if (c9310rG.x) {
                        Runnable runnable = new Runnable() { // from class: kG
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9310rG c9310rG2 = C9310rG.this;
                                if (c9310rG2.y) {
                                    return;
                                }
                                c9310rG2.y = true;
                                c9310rG2.v.c();
                            }
                        };
                        c.x = R.drawable.0_resource_name_obfuscated_res_0x7f0902fa;
                        c.y = R.string.0_resource_name_obfuscated_res_0x7f140256;
                        c.v = runnable;
                    }
                }
                c9310rG.p.s = creditCard.getNumber();
                c1930Ow0.a(c9310rG.p);
                if (c9310rG.q == null) {
                    c9310rG.q = C1281Jw0.c(4, c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140229), null, null, null, null, c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841), null, null);
                }
                c9310rG.q.s = creditCard.getName();
                c1930Ow0.a(c9310rG.q);
                if (c9310rG.r == null) {
                    c9310rG.A = calendar.get(1);
                    c9310rG.z = calendar.get(2) + 1;
                    if (c9310rG.w == null) {
                        c9310rG.w = new C7938nG(c9310rG);
                    }
                    String string2 = c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140225);
                    ArrayList arrayList4 = new ArrayList();
                    Locale locale = Locale.getDefault();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM", locale);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMMM (MM)", locale);
                    calendar.set(5, 1);
                    for (int i2 = 0; i2 < 12; i2++) {
                        calendar.set(2, i2);
                        Date time = calendar.getTime();
                        arrayList4.add(new C1021Hw0(simpleDateFormat.format(time), simpleDateFormat2.format(time)));
                    }
                    C7938nG c7938nG = c9310rG.w;
                    String string3 = c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14080a);
                    C1281Jw0 a = C1281Jw0.a(string2, arrayList4, null);
                    a.j = c7938nG;
                    a.m = string3;
                    c9310rG.r = a;
                    a.z = false;
                }
                if (c9310rG.r.g.contains(creditCard.getMonth())) {
                    c9310rG.r.s = creditCard.getMonth();
                } else {
                    C1281Jw0 c1281Jw02 = c9310rG.r;
                    c1281Jw02.s = (String) ((Pair) ((C1021Hw0) c1281Jw02.d.get(0))).first;
                }
                c1930Ow0.a(c9310rG.r);
                String year = creditCard.getYear();
                ArrayList arrayList5 = new ArrayList();
                int i3 = calendar.get(1);
                boolean z2 = false;
                for (int i4 = i3; i4 < i3 + 10; i4++) {
                    String num = Integer.toString(i4);
                    if (num.equals(year)) {
                        z2 = true;
                    }
                    arrayList5.add(new C1021Hw0(num, num));
                }
                if (z2 || TextUtils.isEmpty(year)) {
                    r0 = 0;
                } else {
                    C1021Hw0 c1021Hw0 = new C1021Hw0(year, year);
                    r0 = 0;
                    arrayList5.add(0, c1021Hw0);
                }
                C1281Jw0 a2 = C1281Jw0.a(null, arrayList5, null);
                c9310rG.s = a2;
                a2.z = r0;
                if (a2.g.contains(creditCard.getYear())) {
                    c9310rG.s.s = creditCard.getYear();
                } else {
                    C1281Jw0 c1281Jw03 = c9310rG.s;
                    c1281Jw03.s = (String) ((Pair) ((C1021Hw0) c1281Jw03.d.get(r0))).first;
                }
                c1930Ow0.a(c9310rG.s);
            } catch (InterruptedException | ExecutionException unused) {
                c9310rG.k.post(new ZE(c1253Jq2, c3069Xq));
                return;
            }
        } else {
            String str = creditCard.g;
            String name = creditCard.getName();
            String string4 = c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14080f, creditCard.getMonth(), creditCard.getYear());
            int i5 = creditCard.k;
            C1281Jw0 c1281Jw04 = new C1281Jw0(13);
            c1281Jw04.p = str;
            c1281Jw04.q = name;
            c1281Jw04.r = string4;
            c1281Jw04.w = i5;
            c1930Ow0.a(c1281Jw04);
        }
        ArrayList arrayList6 = new ArrayList();
        int i6 = 0;
        while (true) {
            ArrayList arrayList7 = c9310rG.d;
            if (i6 >= arrayList7.size()) {
                break;
            }
            PersonalDataManager.AutofillProfile autofillProfile = (PersonalDataManager.AutofillProfile) arrayList7.get(i6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(autofillProfile.p);
            HashMap hashMap = c9310rG.e;
            if (hashMap.containsKey(autofillProfile.getGUID())) {
                spannableStringBuilder.append((CharSequence) c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14020a));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) c9310rG.b.getString(((Integer) hashMap.get(autofillProfile.getGUID())).intValue()));
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC10957w33.e(c9310rG.b)), length, length2, 0);
                c3069Xq3 = c3069Xq2;
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(14, true), length, length2, 0);
            } else {
                c3069Xq3 = c3069Xq2;
            }
            arrayList6.add(new C1021Hw0(((PersonalDataManager.AutofillProfile) arrayList7.get(i6)).getGUID(), spannableStringBuilder));
            i6++;
            c3069Xq2 = c3069Xq3;
        }
        final C3069Xq c3069Xq4 = c3069Xq2;
        arrayList6.add(new C1021Hw0("add", c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1407f8)));
        C1281Jw0 a3 = C1281Jw0.a(c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140224), arrayList6, c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1409e9));
        c9310rG.t = a3;
        a3.A = true;
        a3.l = c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841);
        C1281Jw0 c1281Jw05 = c9310rG.t;
        c1281Jw05.u = new C8625pG(c9310rG, creditCard, arrayList6);
        if (c1281Jw05.g.contains(creditCard.getBillingAddressId())) {
            c9310rG.t.s = creditCard.getBillingAddressId();
        }
        c1930Ow0.a(c9310rG.t);
        if (z && !c9310rG.B) {
            if (c9310rG.u == null) {
                String string5 = c9310rG.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14082a);
                C1281Jw0 c1281Jw06 = new C1281Jw0(12);
                c1281Jw06.p = string5;
                c1281Jw06.s = "check_save_card_to_device";
                c9310rG.u = c1281Jw06;
            }
            c1930Ow0.a(c9310rG.u);
        }
        c1930Ow0.e = new ZE(c1253Jq2, c3069Xq);
        c1930Ow0.d = new Runnable() { // from class: jG
            @Override // java.lang.Runnable
            public final void run() {
                C9310rG c9310rG2 = C9310rG.this;
                String charSequence = c9310rG2.t.s.toString();
                PersonalDataManager.CreditCard creditCard2 = creditCard;
                creditCard2.l = charSequence;
                PersonalDataManager d = PersonalDataManager.d();
                boolean isLocal = creditCard2.getIsLocal();
                boolean z3 = c9310rG2.B;
                if (isLocal) {
                    creditCard2.f = c9310rG2.p.s.toString().replace(" ", "").replace("-", "");
                    creditCard2.e = c9310rG2.q.s.toString();
                    creditCard2.h = c9310rG2.r.s.toString();
                    creditCard2.i = c9310rG2.s.s.toString();
                    String number = creditCard2.getNumber();
                    d.getClass();
                    Object obj = ThreadUtils.a;
                    PersonalDataManager.CreditCard creditCard3 = (PersonalDataManager.CreditCard) N.MHzz0BSK(d.a, d, number);
                    creditCard2.j = creditCard3.getBasicCardIssuerNetwork();
                    creditCard2.g = creditCard3.g;
                    creditCard2.k = creditCard3.k;
                    boolean z4 = z;
                    long j = d.a;
                    if (z4) {
                        C1281Jw0 c1281Jw07 = c9310rG2.u;
                        if (c1281Jw07 != null) {
                            C7432ln3 c2 = C7432ln3.c();
                            try {
                                boolean z5 = T60.a.getBoolean(c1281Jw07.s.toString(), true);
                                c2.close();
                                if (z5) {
                                    creditCard2.a = N.M7sdleUt(j, d, creditCard2);
                                }
                            } catch (Throwable th) {
                                try {
                                    c2.close();
                                } catch (Throwable unused2) {
                                }
                                throw th;
                            }
                        }
                    } else if (!z3) {
                        N.M7sdleUt(j, d, creditCard2);
                    }
                } else if (!z3) {
                    d.getClass();
                    Object obj2 = ThreadUtils.a;
                    N.MmUEbunT(d.a, d, creditCard2);
                }
                String basicCardIssuerNetwork = creditCard2.getBasicCardIssuerNetwork();
                if (c9310rG2.i.contains(basicCardIssuerNetwork)) {
                    basicCardIssuerNetwork = "basic-card";
                }
                PersonalDataManager.AutofillProfile c3 = C9310rG.c(creditCard2.getBillingAddressId(), c9310rG2.d);
                C3069Xq c3069Xq5 = c3069Xq4;
                c3069Xq5.q = creditCard2;
                c3069Xq5.t = basicCardIssuerNetwork;
                c3069Xq5.s = c3;
                Context context = V60.a;
                if (context != null) {
                    String guid = creditCard2.getGUID();
                    String str2 = creditCard2.g;
                    String name2 = creditCard2.getName();
                    Drawable a4 = AbstractC2884Wf.a(context, creditCard2.k);
                    c3069Xq5.f(guid, str2, name2, null);
                    c3069Xq5.m = a4;
                    c3069Xq5.F(context);
                }
                c1253Jq2.onResult(c3069Xq5);
            }
        };
        c9310rG.a.h(c1930Ow0);
    }

    public final void n(C3197Yp2 c3197Yp2, int i) {
        Object obj;
        if (i == 1) {
            obj = this.D;
        } else if (i == 2) {
            obj = this.o;
        } else if (i == 3) {
            obj = this.E;
        } else {
            obj = i != 4 ? null : this.C;
        }
        this.h.post(c3197Yp2.e0(obj));
    }

    public final int q(int i, C4733dw0 c4733dw0, C2807Vp2 c2807Vp2) {
        if (i == 1) {
            C1634Mp c1634Mp = (C1634Mp) c4733dw0;
            this.u.d(new C1123Iq2(this, c1634Mp), c1634Mp);
            this.n = c2807Vp2;
            return 1;
        }
        if (i == 3) {
            g((C7446lq) c4733dw0);
            return 2;
        }
        if (i != 4) {
            return 3;
        }
        e((C3069Xq) c4733dw0);
        return 2;
    }

    public final int r(int i, C4733dw0 c4733dw0, C2807Vp2 c2807Vp2) {
        InterfaceC9161qp2 interfaceC9161qp2;
        InterfaceC9161qp2 interfaceC9161qp22;
        C4546dP c4546dP = (C4546dP) this.p;
        Context a = ((C3515aP) c4546dP.c).a(c4546dP.b);
        if (a == null) {
            return 3;
        }
        boolean z = c4546dP.g;
        if (i == 1) {
            C1634Mp c1634Mp = (C1634Mp) c4733dw0;
            if (!c1634Mp.a) {
                this.u.d(new C1123Iq2(this, c1634Mp), c1634Mp);
            } else {
                this.D.e(c4733dw0);
                PersonalDataManager d = PersonalDataManager.d();
                PersonalDataManager.AutofillProfile autofillProfile = c1634Mp.q;
                d.getClass();
                Object obj = ThreadUtils.a;
                N.M7ysHTTC(d.a, d, autofillProfile, 5, this);
            }
            this.n = c2807Vp2;
            return 1;
        }
        if (i == 2) {
            this.o.e(c4733dw0);
            String str = c4733dw0.l;
            C2287Rp2 c2287Rp2 = c4546dP.a;
            if (c2287Rp2 != null && (interfaceC9161qp22 = c2287Rp2.A) != null) {
                ((C0468Dp2) interfaceC9161qp22).j(str);
            }
            this.n = c2807Vp2;
            return 1;
        }
        if (i == 3) {
            C7446lq c7446lq = (C7446lq) c4733dw0;
            if (c7446lq.a) {
                this.E.e(c4733dw0);
                if (!z) {
                    return 3;
                }
                C4001bo2 c4001bo2 = new C4001bo2(0);
                c4001bo2.c = c7446lq.v;
                c4001bo2.d = c7446lq.w;
                c4001bo2.b = c7446lq.x;
                C2287Rp2 c2287Rp22 = c4546dP.a;
                if (c2287Rp22 != null && c4546dP.g && (interfaceC9161qp2 = c2287Rp22.A) != null) {
                    C11561xp2 c11561xp2 = new C11561xp2(0);
                    c11561xp2.b = c4001bo2;
                    C6068hp1 c6068hp1 = ((C0468Dp2) interfaceC9161qp2).a;
                    c6068hp1.g.A(c11561xp2.c(c6068hp1.a, new C5953hV1(3)));
                }
            } else {
                g(c7446lq);
                if (!z) {
                    return 2;
                }
            }
            this.n = c2807Vp2;
            return 1;
        }
        if (i == 4) {
            if (u() && this.D == null) {
                b(a);
            }
            if (t() && this.E == null) {
                this.E = new C40(a, this.H, this.l, this.y);
            }
            ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.z;
            C8545p13 c8545p13 = this.D;
            C8545p13 c8545p132 = this.o;
            C40 c40 = this.E;
            C1642Mq2 c1642Mq2 = (C1642Mq2) viewOnClickListenerC5731gq2.h;
            if (c1642Mq2.u() && viewOnClickListenerC5731gq2.B.getVisibility() == 8) {
                viewOnClickListenerC5731gq2.o(1, c8545p13);
                viewOnClickListenerC5731gq2.o(2, c8545p132);
                viewOnClickListenerC5731gq2.B.setVisibility(0);
                viewOnClickListenerC5731gq2.t.getChildAt(viewOnClickListenerC5731gq2.t.indexOfChild(viewOnClickListenerC5731gq2.B) - 1).setVisibility(0);
                int indexOfChild = viewOnClickListenerC5731gq2.t.indexOfChild(viewOnClickListenerC5731gq2.C);
                if (indexOfChild != -1) {
                    viewOnClickListenerC5731gq2.C.setVisibility(0);
                    viewOnClickListenerC5731gq2.t.getChildAt(indexOfChild - 1).setVisibility(0);
                }
            } else if (!c1642Mq2.u() && viewOnClickListenerC5731gq2.B.getVisibility() == 0) {
                viewOnClickListenerC5731gq2.B.setVisibility(8);
                viewOnClickListenerC5731gq2.t.getChildAt(viewOnClickListenerC5731gq2.t.indexOfChild(viewOnClickListenerC5731gq2.B) - 1).setVisibility(8);
                int indexOfChild2 = viewOnClickListenerC5731gq2.t.indexOfChild(viewOnClickListenerC5731gq2.C);
                if (indexOfChild2 != -1) {
                    viewOnClickListenerC5731gq2.C.setVisibility(8);
                    viewOnClickListenerC5731gq2.t.getChildAt(indexOfChild2 - 1).setVisibility(8);
                }
            }
            if (c1642Mq2.t() && viewOnClickListenerC5731gq2.D.getVisibility() == 8) {
                viewOnClickListenerC5731gq2.o(3, c40);
                viewOnClickListenerC5731gq2.D.setVisibility(0);
                viewOnClickListenerC5731gq2.t.getChildAt(viewOnClickListenerC5731gq2.t.indexOfChild(viewOnClickListenerC5731gq2.D) - 1).setVisibility(0);
            } else if (!c1642Mq2.t() && viewOnClickListenerC5731gq2.D.getVisibility() == 0) {
                viewOnClickListenerC5731gq2.D.setVisibility(8);
                viewOnClickListenerC5731gq2.t.getChildAt(viewOnClickListenerC5731gq2.t.indexOfChild(viewOnClickListenerC5731gq2.D) - 1).setVisibility(8);
            }
            viewOnClickListenerC5731gq2.t.requestLayout();
            PaymentApp paymentApp = (PaymentApp) c4733dw0;
            if (paymentApp instanceof C3069Xq) {
                C3069Xq c3069Xq = (C3069Xq) paymentApp;
                if (!c3069Xq.a) {
                    e(c3069Xq);
                    return 2;
                }
            }
            y(paymentApp);
            this.C.e(c4733dw0);
        }
        return 3;
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.NormalizedAddressRequestDelegate
    public final void onAddressNormalized(PersonalDataManager.AutofillProfile autofillProfile) {
        C4546dP c4546dP = (C4546dP) this.p;
        Context a = ((C3515aP) c4546dP.c).a(c4546dP.b);
        if (a == null) {
            c4546dP.e.a(8);
            c4546dP.b("Unable to find Chrome context.");
            return;
        }
        C4687do2 n = new C1634Mp(a, autofillProfile, 0).n();
        C2287Rp2 c2287Rp2 = c4546dP.a;
        if (c2287Rp2 == null) {
            return;
        }
        c2287Rp2.q(n);
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.NormalizedAddressRequestDelegate
    public final void onCouldNotNormalize(PersonalDataManager.AutofillProfile autofillProfile) {
        onAddressNormalized(autofillProfile);
    }

    public final void w() {
        C5037ep2 c5037ep2;
        if (N.M1X7xdZV("WebPaymentsModifiers")) {
            C2287Rp2 c2287Rp2 = (C2287Rp2) this.x;
            if (c2287Rp2.u || c2287Rp2.k().isEmpty() || this.C == null) {
                return;
            }
            for (int i = 0; i < this.C.d(); i++) {
                PaymentApp paymentApp = (PaymentApp) this.C.b(i);
                C11212wo2 k = k(paymentApp);
                paymentApp.k = (k == null || (c5037ep2 = k.b) == null) ? null : l(c5037ep2.c).b(k.b.c.c);
            }
            y(o());
        }
    }

    public final void y(PaymentApp paymentApp) {
        if (N.M1X7xdZV("WebPaymentsModifiers")) {
            C2287Rp2 c2287Rp2 = (C2287Rp2) this.x;
            if (c2287Rp2.u) {
                return;
            }
            C11212wo2 k = k(paymentApp);
            C5037ep2 c5037ep2 = k == null ? null : k.b;
            if (c5037ep2 == null) {
                c5037ep2 = c2287Rp2.t.c().b;
            }
            C8395oc0 l = l(c5037ep2.c);
            this.A.a = new AB1(c5037ep2.b, N.MnbePYrk(l.a, l), l.b(c5037ep2.c.c), false);
            this.A.c = k != null ? j(Arrays.asList(k.c)) : null;
            ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.z;
            if (viewOnClickListenerC5731gq2 != null) {
                viewOnClickListenerC5731gq2.m(this.A);
            }
        }
    }
}
