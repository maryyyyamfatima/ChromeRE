package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import org.chromium.base.ThreadUtils;
import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JY1 implements InterfaceC8818pp2 {
    public final YO a;
    public C2287Rp2 g;

    public JY1(YO yo) {
        this.a = yo;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    @Override // defpackage.InterfaceC8818pp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F0(defpackage.InterfaceC9161qp2 r23, defpackage.C6755jp2[] r24, defpackage.C10869vo2 r25, defpackage.C7787mp2 r26) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JY1.F0(qp2, jp2[], vo2, mp2):void");
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void l(boolean z) {
        C7443lp2 r;
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null || c2287Rp2.B == null) {
            return;
        }
        if (c2287Rp2.w) {
            c2287Rp2.g.a(2);
            c2287Rp2.j(1, "Attempted show twice.");
            return;
        }
        if (C2287Rp2.M != null) {
            c2287Rp2.t(2, 4, "Another PaymentRequest UI is already showing in a different tab or window.");
            return;
        }
        C2287Rp2.M = c2287Rp2;
        C1137It1 c1137It1 = c2287Rp2.g;
        N.MpLIjj0f(c1137It1.a, c1137It1, 1);
        c2287Rp2.w = true;
        c2287Rp2.x = z;
        if (!c2287Rp2.v || (r = c2287Rp2.r()) == null) {
            return;
        }
        c2287Rp2.t(r.a, r.c, r.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    @Override // defpackage.InterfaceC8818pp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(defpackage.C10869vo2 r15) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JY1.E(vo2):void");
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void D() {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null || c2287Rp2.B == null) {
            return;
        }
        if (!c2287Rp2.w) {
            c2287Rp2.g.a(2);
            c2287Rp2.j(1, "Attempted updateWith without show.");
            return;
        }
        N.M_B2Caox(c2287Rp2.t.a);
        PaymentApp paymentApp = c2287Rp2.L;
        if (paymentApp != null && paymentApp.A()) {
            c2287Rp2.L.B();
            return;
        }
        C4546dP c4546dP = c2287Rp2.B;
        String MCGOhrza = N.MCGOhrza(c2287Rp2.t.a);
        C1642Mq2 c1642Mq2 = c4546dP.f;
        c1642Mq2.v(MCGOhrza);
        c1642Mq2.h();
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void S() {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null) {
            return;
        }
        PaymentApp paymentApp = c2287Rp2.L;
        if (paymentApp != null) {
            paymentApp.g(c2287Rp2);
        } else {
            c2287Rp2.m(true);
        }
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void Y0(int i) {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null || c2287Rp2.B == null) {
            return;
        }
        if (i != 0) {
            C1137It1 c1137It1 = c2287Rp2.g;
            if (!c1137It1.b) {
                c1137It1.b = true;
                N.My$biNCo(c1137It1.a, c1137It1);
            }
        }
        C4546dP c4546dP = c2287Rp2.B;
        if (i != 0) {
            c4546dP.getClass();
            Q83 q83 = O83.a;
            if (!q83.e("payment_complete_once", false)) {
                q83.p("payment_complete_once", true);
            }
        }
        String str = c4546dP.f.o().l;
        Q83 q832 = O83.a;
        q832.d(AbstractC6265iP.m.b(str));
        q832.s(System.currentTimeMillis(), AbstractC6265iP.n.b(str));
        InterfaceC9161qp2 interfaceC9161qp2 = c2287Rp2.A;
        if (interfaceC9161qp2 != null) {
            ((C0468Dp2) interfaceC9161qp2).e();
        }
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void t0(final C1772Nq2 c1772Nq2) {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null || c2287Rp2.B == null) {
            return;
        }
        if (!(c1772Nq2 == null ? false : N.MQ3mQqrV(c1772Nq2.b()))) {
            c2287Rp2.g.a(2);
            c2287Rp2.j(1, "Invalid payment validation errors.");
            return;
        }
        N.MiyjJ0og(c2287Rp2.t.a, c1772Nq2.b());
        C4546dP c4546dP = c2287Rp2.B;
        c4546dP.g = true;
        Context a = ((C3515aP) c4546dP.c).a(c4546dP.b);
        if (a == null) {
            c4546dP.b("Unable to find Chrome context.");
        } else {
            final C1642Mq2 c1642Mq2 = c4546dP.f;
            C8545p13 c8545p13 = new C8545p13(4, 0, new ArrayList(Arrays.asList(c1642Mq2.o())));
            c1642Mq2.C = c8545p13;
            c1642Mq2.z.o(4, c8545p13);
            ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = c1642Mq2.z;
            C1508Lp2 c1508Lp2 = viewOnClickListenerC5731gq2.E;
            c1508Lp2.x = false;
            c1508Lp2.k(viewOnClickListenerC5731gq2.O);
            ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq22 = c1642Mq2.z;
            viewOnClickListenerC5731gq22.I = false;
            viewOnClickListenerC5731gq22.a(false);
            C1513Lq2 c1513Lq2 = viewOnClickListenerC5731gq22.j;
            c1513Lq2.b = true;
            c1513Lq2.a();
            viewOnClickListenerC5731gq22.n();
            if (!TextUtils.isEmpty(c1772Nq2.b)) {
                c1642Mq2.z.l(c1772Nq2.b);
            } else {
                c1642Mq2.z.l(a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140819));
            }
            boolean u = c1642Mq2.u();
            LinkedList linkedList = c1642Mq2.i;
            if (u) {
                M7 m7 = c1772Nq2.d;
                if ((TextUtils.isEmpty(m7.b) && TextUtils.isEmpty(m7.c) && TextUtils.isEmpty(m7.d) && TextUtils.isEmpty(m7.e) && TextUtils.isEmpty(m7.f) && TextUtils.isEmpty(m7.g) && TextUtils.isEmpty(m7.h) && TextUtils.isEmpty(m7.i) && TextUtils.isEmpty(m7.j) && TextUtils.isEmpty(m7.k)) ? false : true) {
                    linkedList.add(new Runnable() { // from class: Aq2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1642Mq2 c1642Mq22 = C1642Mq2.this;
                            c1642Mq22.getClass();
                            M7 m72 = c1772Nq2.d;
                            K7 k7 = c1642Mq22.u;
                            k7.w = m72;
                            C1634Mp c1634Mp = (C1634Mp) c1642Mq22.D.c();
                            k7.d(new C1123Iq2(c1642Mq22, c1634Mp), c1634Mp);
                        }
                    });
                }
            }
            if (c1642Mq2.t()) {
                C4344co2 c4344co2 = c1772Nq2.c;
                if ((TextUtils.isEmpty(c4344co2.c) && TextUtils.isEmpty(c4344co2.d) && TextUtils.isEmpty(c4344co2.b)) ? false : true) {
                    linkedList.add(new Runnable() { // from class: Bq2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1642Mq2 c1642Mq22 = C1642Mq2.this;
                            c1642Mq22.l.j = c1772Nq2.c;
                            c1642Mq22.g((C7446lq) c1642Mq22.E.c());
                        }
                    });
                }
            }
            if (!linkedList.isEmpty()) {
                c1642Mq2.h.post((Runnable) linkedList.remove());
            }
        }
        C0203Bo2.a().getClass();
        Object obj = ThreadUtils.a;
        C0203Bo2.e = null;
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void B() {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null) {
            return;
        }
        if (c2287Rp2.v) {
            c2287Rp2.u();
        } else {
            c2287Rp2.f11465J = true;
        }
    }

    @Override // defpackage.InterfaceC8818pp2
    public final void p0() {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null) {
            return;
        }
        if (c2287Rp2.v) {
            c2287Rp2.v();
        } else {
            c2287Rp2.K = true;
        }
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null) {
            return;
        }
        c2287Rp2.g.a(4);
        c2287Rp2.i();
        this.g = null;
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        C2287Rp2 c2287Rp2 = this.g;
        if (c2287Rp2 == null) {
            return;
        }
        c2287Rp2.g.a(3);
        c2287Rp2.i();
        this.g = null;
    }
}
