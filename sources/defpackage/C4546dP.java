package defpackage;

import J.N;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.components.payments.PaymentApp;
import org.chromium.components.payments.PaymentHandlerHost;
import org.chromium.components.payments.PaymentRequestSpec;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dP */
/* loaded from: classes.dex */
public final class C4546dP implements InterfaceC1383Kq2 {
    public C2287Rp2 a;
    public final RenderFrameHost b;
    public final InterfaceC4202cP c;
    public final WebContents d;
    public final C1137It1 e;
    public final C1642Mq2 f;
    public boolean g;
    public boolean h;
    public PaymentRequestSpec i;
    public boolean j;
    public PaymentHandlerHost k;
    public boolean l;

    public C4546dP(C2287Rp2 c2287Rp2, C3515aP c3515aP) {
        this.a = c2287Rp2;
        this.b = c2287Rp2.b;
        this.c = c3515aP;
        WebContents webContents = c2287Rp2.f;
        this.d = webContents;
        C1137It1 c1137It1 = c2287Rp2.g;
        this.e = c1137It1;
        this.f = new C1642Mq2(this, c2287Rp2, webContents, c2287Rp2.m, c1137It1, c2287Rp2.h);
    }

    public final boolean c(C4733dw0 c4733dw0, C4733dw0 c4733dw02, PaymentApp paymentApp) {
        PaymentRequestSpec paymentRequestSpec;
        C2287Rp2 c2287Rp2 = this.a;
        if (c2287Rp2 == null || (paymentRequestSpec = this.i) == null) {
            return false;
        }
        if (paymentRequestSpec.a == 0) {
            return false;
        }
        if (this.k == null) {
            ((C3515aP) this.c).getClass();
            this.k = new PaymentHandlerHost(this.d, c2287Rp2);
        }
        paymentApp.D(this.k);
        C40 c40 = this.f.E;
        this.a.l(paymentApp, new C4889eP(c4733dw0, c4733dw02, c40 != null ? (C7446lq) c40.c() : null, paymentApp, this.i.d()));
        return paymentApp.p() != 1;
    }

    public final void b(String str) {
        C2287Rp2 c2287Rp2 = this.a;
        if (c2287Rp2 != null) {
            c2287Rp2.j(1, str);
        }
        a();
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        C2287Rp2 c2287Rp2 = this.a;
        if (c2287Rp2 != null) {
            c2287Rp2.i();
            this.a = null;
        }
        C1642Mq2 c1642Mq2 = this.f;
        c1642Mq2.getClass();
        C1243Jo2 c1243Jo2 = c1642Mq2.m;
        if (c1243Jo2 != null) {
            RunnableC0983Ho2 runnableC0983Ho2 = c1243Jo2.a;
            if (runnableC0983Ho2 != null) {
                runnableC0983Ho2.run();
                c1243Jo2.a = null;
            }
            c1642Mq2.m = null;
        }
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = c1642Mq2.z;
        if (viewOnClickListenerC5731gq2 != null) {
            viewOnClickListenerC5731gq2.f11508J = true;
            viewOnClickListenerC5731gq2.b(false);
            C4546dP c4546dP = (C4546dP) c1642Mq2.p;
            ((C3515aP) c4546dP.c).getClass();
            ChromeActivity f1 = ChromeActivity.f1(c4546dP.d);
            I5 i5 = f1 == null ? null : f1.D;
            if (i5 != null) {
                i5.c(c1642Mq2.z);
            }
            c1642Mq2.z = null;
            c1642Mq2.w.b = false;
        }
        if (c1642Mq2.C != null) {
            Iterator it = c1642Mq2.m().iterator();
            while (it.hasNext()) {
                ((PaymentApp) it.next()).k();
            }
            c1642Mq2.C = null;
        }
        H53.a().getClass();
        H53.a.remove(c1642Mq2);
        InterfaceC10590uz3 interfaceC10590uz3 = c1642Mq2.I;
        if (interfaceC10590uz3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).s(c1642Mq2.j);
            c1642Mq2.I = null;
        }
        TabModel tabModel = c1642Mq2.f11458J;
        if (tabModel != null) {
            tabModel.i(c1642Mq2.k);
            c1642Mq2.f11458J = null;
        }
        InterfaceC10240ty1 interfaceC10240ty1 = c1642Mq2.K;
        if (interfaceC10240ty1 != null) {
            ((C9897sy1) interfaceC10240ty1).L(c1642Mq2);
            c1642Mq2.K = null;
        }
        HashMap hashMap = c1642Mq2.t;
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((C8395oc0) it2.next()).a();
        }
        hashMap.clear();
        PaymentHandlerHost paymentHandlerHost = this.k;
        if (paymentHandlerHost != null) {
            N.MDWZVETg(paymentHandlerHost.a);
            paymentHandlerHost.a = 0L;
            this.k = null;
        }
    }
}
