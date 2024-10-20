package defpackage;

import J.N;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.payments.PayerData;
import org.chromium.components.payments.PaymentApp;
import org.chromium.components.payments.PaymentRequestSpec;
import org.chromium.components.payments.PaymentRequestUpdateEventListener;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rp2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2287Rp2 implements InterfaceC6749jo2, InterfaceC7437lo2, PaymentRequestUpdateEventListener, InterfaceC5719go2, InterfaceC6063ho2, InterfaceC11567xq2 {
    public static C2287Rp2 M;
    public InterfaceC9161qp2 A;
    public C4546dP B;
    public InterfaceC11910yq2 C;
    public R13 D;
    public C3396a23 E;
    public HashMap F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11465J;
    public boolean K;
    public PaymentApp L;
    public final Runnable a;
    public final RenderFrameHost b;
    public final InterfaceC4202cP c;
    public final InterfaceC0079Ap3 e;
    public WebContents f;
    public C1137It1 g;
    public String h;
    public String i;
    public Origin j;
    public String k;
    public byte[][] l;
    public boolean m;
    public C7787mp2 n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public PaymentRequestSpec t;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public final ArrayList d = new ArrayList();
    public int z = 0;
    public boolean u = false;

    @Override // org.chromium.components.payments.PaymentRequestUpdateEventListener
    public final /* synthetic */ boolean changeShippingAddress(ByteBuffer byteBuffer) {
        return AbstractC6075hq2.a(this, byteBuffer);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final InterfaceC7437lo2 e() {
        return this;
    }

    public C2287Rp2(RenderFrameHost renderFrameHost, InterfaceC9161qp2 interfaceC9161qp2, IY1 iy1, InterfaceC4202cP interfaceC4202cP, ZO zo) {
        this.b = renderFrameHost;
        this.A = interfaceC9161qp2;
        this.a = iy1;
        this.c = interfaceC4202cP;
        this.e = zo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:            if (r2.z != 1) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r3, java.lang.String r4) {
        /*
            r2 = this;
            qp2 r0 = r2.A
            if (r0 == 0) goto L2d
            java.lang.String r0 = "SecurePaymentConfirmationBrowser"
            boolean r0 = defpackage.AbstractC0333Co2.a(r0)
            if (r0 == 0) goto L1e
            org.chromium.components.payments.PaymentRequestSpec r0 = r2.t
            if (r0 == 0) goto L1e
            long r0 = r0.a
            boolean r0 = J.N.MdW7ZAFa(r0)
            if (r0 == 0) goto L1e
            int r0 = r2.z
            r1 = 1
            if (r0 == r1) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            qp2 r0 = r2.A
            if (r1 == 0) goto L24
            r3 = 6
        L24:
            if (r1 == 0) goto L28
            java.lang.String r4 = "The operation either timed out or was not allowed. See: https://www.w3.org/TR/webauthn-2/#sctn-privacy-considerations-client."
        L28:
            Dp2 r0 = (defpackage.C0468Dp2) r0
            r0.f(r3, r4)
        L2d:
            r2.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2287Rp2.j(int, java.lang.String):void");
    }

    public final void p(C10881vq2 c10881vq2) {
        this.B.getClass();
        if (c10881vq2.b.equals("secure-payment-confirmation")) {
            c10881vq2 = this.L.C(c10881vq2);
        }
        InterfaceC9161qp2 interfaceC9161qp2 = this.A;
        if (interfaceC9161qp2 != null) {
            C12247zp2 c12247zp2 = new C12247zp2(0);
            c12247zp2.b = c10881vq2;
            C6068hp1 c6068hp1 = ((C0468Dp2) interfaceC9161qp2).a;
            c6068hp1.g.A(c12247zp2.c(c6068hp1.a, new C5953hV1(4)));
        }
        this.C = null;
    }

    public final void l(PaymentApp paymentApp, InterfaceC11910yq2 interfaceC11910yq2) {
        List unmodifiableList;
        List arrayList;
        PackageInfo packageInfo;
        if (paymentApp.p() == 2) {
            C0203Bo2 a = C0203Bo2.a();
            C2757Vf2 c2757Vf2 = new C2757Vf2();
            a.getClass();
            Object obj = ThreadUtils.a;
            a.b = this;
            a.d = c2757Vf2;
            try {
                packageInfo = V60.a.getPackageManager().getPackageInfo(((C0000Aa) paymentApp).t, 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            a.c = packageInfo;
        }
        this.C = interfaceC11910yq2;
        C1137It1 c1137It1 = this.g;
        N.MpLIjj0f(c1137It1.a, c1137It1, 3);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (String str : paymentApp.o()) {
            if (this.t.a().containsKey(str)) {
                hashMap.put(str, (C6755jp2) this.t.a().get(str));
            }
            if (this.t.b().containsKey(str)) {
                hashMap2.put(str, (C11212wo2) this.t.b().get(str));
            }
        }
        C7787mp2 c7787mp2 = new C7787mp2(0);
        c7787mp2.e = this.o && paymentApp.u();
        c7787mp2.b = this.p && paymentApp.s();
        c7787mp2.d = this.q && paymentApp.t();
        c7787mp2.c = this.r && paymentApp.r();
        c7787mp2.f = (this.o && paymentApp.u()) ? this.s : 0;
        if (paymentApp.u()) {
            unmodifiableList = this.t.e();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList());
        }
        List list = unmodifiableList;
        String str2 = this.t.c().h;
        String str3 = this.k;
        String str4 = this.h;
        String str5 = this.i;
        byte[][] bArr = this.l;
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        C5037ep2 c5037ep2 = this.t.c().b;
        C5037ep2[] c5037ep2Arr = this.t.c().c;
        if (c5037ep2Arr != null) {
            arrayList = Arrays.asList(c5037ep2Arr);
        } else {
            arrayList = new ArrayList();
        }
        int i = 1;
        paymentApp.v(str2, str3, str4, str5, bArr, unmodifiableMap, c5037ep2, Collections.unmodifiableList(arrayList), Collections.unmodifiableMap(hashMap2), c7787mp2, list, this);
        this.L = paymentApp;
        C1137It1 c1137It12 = this.g;
        N.MWAyIl4$(c1137It12.a, c1137It12);
        if (paymentApp.p() != 1) {
            Iterator it = paymentApp.o().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 4;
                    break;
                }
                String str6 = (String) it.next();
                if (str6.equals("https://android.com/pay") || str6.equals("https://google.com/pay")) {
                    break;
                }
                if (!str6.equals("https://play.google.com/billing")) {
                    if (str6.equals("secure-payment-confirmation")) {
                        i = 3;
                        break;
                    }
                } else {
                    i = 2;
                    break;
                }
            }
        } else {
            i = 0;
        }
        C1137It1 c1137It13 = this.g;
        N.M9Jdo06k(c1137It13.a, c1137It13, i);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void f() {
        this.I = true;
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void d(InterfaceC7093ko2 interfaceC7093ko2) {
        ArrayList arrayList;
        int G;
        C7443lp2 r;
        if (this.B == null) {
            return;
        }
        this.v = true;
        boolean z = this.G | this.I;
        this.G = z;
        WebContents a = AbstractC2417Sp2.a(((C3515aP) this.c).a);
        this.G = z & (a != null && R44.a(Profile.b(a)).a("payments.can_make_payment_enabled"));
        C4546dP c4546dP = this.B;
        ArrayList arrayList2 = this.d;
        if (c4546dP.j) {
            arrayList = new ArrayList();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                if (!((PaymentApp) arrayList2.get(i)).x()) {
                    arrayList.add((PaymentApp) arrayList2.get(i));
                }
            }
        } else {
            arrayList = arrayList2;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String n = ((PaymentApp) arrayList.get(i2)).n();
            if (n != null && !hashSet.contains(n)) {
                hashSet.add(n);
                PersonalDataManager d = PersonalDataManager.d();
                d.getClass();
                Object obj = ThreadUtils.a;
                N.Mj65Bkg_(d.a, d, n);
            }
        }
        C1642Mq2 c1642Mq2 = c4546dP.f;
        Collections.sort(arrayList, c1642Mq2.a);
        c1642Mq2.C = new C8545p13(4, (arrayList.isEmpty() || !((PaymentApp) arrayList.get(0)).j()) ? -1 : 0, new ArrayList(arrayList));
        c1642Mq2.w();
        H53.a().getClass();
        H53.a.add(c1642Mq2);
        if (c1642Mq2.m().isEmpty()) {
            if (c1642Mq2.B) {
                G = 15;
            }
            G = 0;
        } else {
            PaymentApp paymentApp = (PaymentApp) c1642Mq2.m().get(0);
            if (paymentApp.p() == 1) {
                G = ((C3069Xq) paymentApp).G();
            }
            G = 0;
        }
        if (G != 0) {
            EI2.m(G, "PaymentRequest.MissingPaymentFields");
        }
        arrayList2.clear();
        C1137It1 c1137It1 = this.g;
        int size2 = this.B.f.m().size();
        ArrayList m = this.B.f.m();
        N.MPFG5SwC(c1137It1.a, c1137It1, 1, size2, !m.isEmpty() && ((PaymentApp) m.get(0)).d());
        if (!this.w || (r = r()) == null) {
            if (this.f11465J) {
                u();
            }
            if (this.K) {
                v();
                return;
            }
            return;
        }
        t(r.a, r.c, r.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e  */
    /* JADX WARN: Type inference failed for: r10v23, types: [W13] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7443lp2 r() {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2287Rp2.r():lp2");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String s() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2287Rp2.s():java.lang.String");
    }

    public final void t(int i, int i2, String str) {
        C1137It1 c1137It1 = this.g;
        if (!c1137It1.b) {
            c1137It1.b = true;
            N.MPhEgSJd(c1137It1.a, c1137It1, i);
        }
        j(i2, str);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void g(PaymentApp paymentApp) {
        C4546dP c4546dP = this.B;
        if (c4546dP == null) {
            return;
        }
        c4546dP.j |= paymentApp.y();
        boolean z = c4546dP.f.G;
        this.G |= paymentApp.i();
        paymentApp.p();
        if (N.M1X7xdZV("PaymentRequestBasicCard") && paymentApp.p() == 1) {
            C1137It1 c1137It1 = this.g;
            N.MH8h6Eyr(c1137It1.a, c1137It1, 0);
        } else if (paymentApp.o().contains("https://google.com/pay") || paymentApp.o().contains("https://android.com/pay")) {
            C1137It1 c1137It12 = this.g;
            N.MH8h6Eyr(c1137It12.a, c1137It12, 1);
        } else {
            C1137It1 c1137It13 = this.g;
            N.MH8h6Eyr(c1137It13.a, c1137It13, 4);
        }
        this.d.add(paymentApp);
    }

    public final void u() {
        int i;
        if (this.A == null) {
            return;
        }
        this.f11465J = false;
        if (this.H) {
            WebContents a = AbstractC2417Sp2.a(((C3515aP) this.c).a);
            if (a != null && R44.a(Profile.b(a)).a("payments.can_make_payment_enabled")) {
                i = 1;
                ((C0468Dp2) this.A).c(i ^ 1);
                C1137It1 c1137It1 = this.g;
                N.MzcQanKX(c1137It1.a, c1137It1, i == 0 || this.m);
            }
        }
        i = 0;
        ((C0468Dp2) this.A).c(i ^ 1);
        C1137It1 c1137It12 = this.g;
        N.MzcQanKX(c1137It12.a, c1137It12, i == 0 || this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        int i;
        if (this.A == null) {
            return;
        }
        boolean z = this.G;
        this.K = false;
        if (N.MNXjZ6_e(this.f, this.h, this.i, this.F)) {
            i = !z ? 1 : 0;
        } else {
            i = (this.f.isDestroyed() || !N.MSVZEfSr(this.f.f())) != false ? 2 : z ? 3 : 4;
        }
        ((C0468Dp2) this.A).h(i);
        C1137It1 c1137It1 = this.g;
        N.Ma1hMajT(c1137It1.a, c1137It1, z || this.m);
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void b(boolean z) {
        this.H = z || this.I;
        if (this.f11465J) {
            u();
        }
    }

    @Override // defpackage.InterfaceC6749jo2
    public final void c(String str, int i) {
        if (TextUtils.isEmpty(this.y)) {
            this.y = str;
            this.z = i;
        }
    }

    public final void h(String str) {
        C1137It1 c1137It1 = this.g;
        if (c1137It1 != null) {
            c1137It1.a(2);
        }
        j(5, str);
    }

    public final void i() {
        if (this.u) {
            return;
        }
        this.u = true;
        M = null;
        R13 r13 = this.D;
        if (r13 != null) {
            O13 o13 = r13.b;
            if (o13 != null) {
                o13.run();
                r13.b = null;
            }
            this.D = null;
        }
        C3396a23 c3396a23 = this.E;
        if (c3396a23 != null) {
            X13 x13 = c3396a23.b;
            if (x13 != null) {
                x13.run();
                c3396a23.b = null;
            }
            this.E = null;
        }
        C4546dP c4546dP = this.B;
        if (c4546dP != null) {
            c4546dP.a();
            this.B = null;
        }
        D30 d30 = this.A;
        if (d30 != null) {
            ((AbstractC6411ip1) d30).close();
            this.A = null;
        }
        this.a.run();
        C1137It1 c1137It1 = this.g;
        if (c1137It1 != null) {
            long j = c1137It1.a;
            if (j != 0) {
                N.MK$_cVJA(j, c1137It1);
                c1137It1.a = 0L;
            }
        }
        PaymentRequestSpec paymentRequestSpec = this.t;
        if (paymentRequestSpec != null) {
            long j2 = paymentRequestSpec.a;
            if (j2 != 0) {
                N.MiX2Cegu(j2);
                paymentRequestSpec.a = 0L;
            }
        }
        C0203Bo2.a().getClass();
        Object obj = ThreadUtils.a;
        C0203Bo2.e = null;
    }

    public final void q(C4687do2 c4687do2) {
        if (this.A != null) {
            if (AbstractC0333Co2.a("WebPaymentsRedactShippingAddress")) {
                c4687do2.i = "";
                c4687do2.k = "";
                c4687do2.j = "";
                c4687do2.c = new String[0];
            }
            C0468Dp2 c0468Dp2 = (C0468Dp2) this.A;
            c0468Dp2.getClass();
            C0078Ap2 c0078Ap2 = new C0078Ap2(0);
            c0078Ap2.b = c4687do2;
            C6068hp1 c6068hp1 = c0468Dp2.a;
            c6068hp1.g.A(c0078Ap2.c(c6068hp1.a, new C5953hV1(1)));
        }
    }

    public final C4317ck k() {
        return this.t.a();
    }

    @Override // org.chromium.components.payments.PaymentRequestUpdateEventListener
    public final boolean changePaymentMethodFromInvokedApp(String str, String str2) {
        PaymentApp paymentApp;
        InterfaceC9161qp2 interfaceC9161qp2;
        if (TextUtils.isEmpty(str) || str2 == null || (paymentApp = this.L) == null || paymentApp.A() || (interfaceC9161qp2 = this.A) == null) {
            return false;
        }
        ((C0468Dp2) interfaceC9161qp2).i(str, str2);
        return true;
    }

    @Override // org.chromium.components.payments.PaymentRequestUpdateEventListener
    public final boolean changeShippingOptionFromInvokedApp(String str) {
        PaymentApp paymentApp;
        boolean z;
        if (TextUtils.isEmpty(str) || (paymentApp = this.L) == null || paymentApp.A() || !this.o || this.t.e() == null || this.A == null) {
            return false;
        }
        Iterator it = this.t.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (str.equals(((C12253zq2) it.next()).b)) {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        ((C0468Dp2) this.A).j(str);
        return true;
    }

    @Override // org.chromium.components.payments.PaymentRequestUpdateEventListener
    public final boolean a(C4687do2 c4687do2) {
        PaymentApp paymentApp;
        if (c4687do2 == null || (paymentApp = this.L) == null || paymentApp.A() || !this.o || this.A == null) {
            return false;
        }
        q(c4687do2);
        return true;
    }

    public final void o(String str, String str2, PayerData payerData) {
        C4546dP c4546dP;
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2;
        if (this.C == null || (c4546dP = this.B) == null) {
            return;
        }
        C1642Mq2 c1642Mq2 = c4546dP.f;
        PaymentApp o = c1642Mq2.o();
        if (o != null && o.p() == 1 && !o.l.isEmpty()) {
            PersonalDataManager d = PersonalDataManager.d();
            String str3 = o.l;
            d.getClass();
            Object obj = ThreadUtils.a;
            N.M4tBhXBK(d.a, d, str3);
        }
        if (c4546dP.l && (viewOnClickListenerC5731gq2 = c1642Mq2.z) != null) {
            viewOnClickListenerC5731gq2.I = true;
            viewOnClickListenerC5731gq2.a(true);
            C1513Lq2 c1513Lq2 = viewOnClickListenerC5731gq2.j;
            c1513Lq2.b = true;
            c1513Lq2.a();
        }
        C1137It1 c1137It1 = this.g;
        N.MsVk_59O(c1137It1.a, c1137It1);
        this.C.a(str, str2, payerData, this);
    }

    public final void m(boolean z) {
        InterfaceC9161qp2 interfaceC9161qp2 = this.A;
        if (interfaceC9161qp2 != null) {
            C9846sp2 c9846sp2 = new C9846sp2(0);
            c9846sp2.b = z;
            C6068hp1 c6068hp1 = ((C0468Dp2) interfaceC9161qp2).a;
            c6068hp1.g.A(c9846sp2.c(c6068hp1.a, new C5953hV1(7)));
        }
        if (z) {
            this.g.a(1);
            i();
        }
    }

    public final void n(String str) {
        this.L = null;
        C0203Bo2.a().getClass();
        Object obj = ThreadUtils.a;
        C0203Bo2.e = null;
        C4546dP c4546dP = this.B;
        if (c4546dP == null) {
            return;
        }
        if (!c4546dP.l) {
            ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = c4546dP.f.z;
            if (viewOnClickListenerC5731gq2 != null) {
                viewOnClickListenerC5731gq2.I = false;
                viewOnClickListenerC5731gq2.a(false);
                C1513Lq2 c1513Lq2 = viewOnClickListenerC5731gq2.j;
                c1513Lq2.b = true;
                c1513Lq2.a();
                viewOnClickListenerC5731gq2.n();
                return;
            }
            return;
        }
        this.g.a(0);
        j(1, str);
    }
}
