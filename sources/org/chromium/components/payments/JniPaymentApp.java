package org.chromium.components.payments;

import J.N;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import defpackage.C0858Gp2;
import defpackage.C10881vq2;
import defpackage.C1730Ni0;
import defpackage.C2287Rp2;
import defpackage.C5037ep2;
import defpackage.C6755jp2;
import defpackage.C7787mp2;
import defpackage.C8697pU1;
import defpackage.InterfaceC5719go2;
import defpackage.InterfaceC6063ho2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.components.payments.JniPaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class JniPaymentApp extends PaymentApp {
    public final Handler p;
    public final int q;
    public long r;
    public InterfaceC5719go2 s;
    public InterfaceC6063ho2 t;

    public JniPaymentApp(String str, String str2, String str3, Bitmap bitmap, int i, long j) {
        super(new BitmapDrawable(bitmap), str, str2, str3);
        this.p = new Handler();
        this.q = i;
        this.r = j;
    }

    public void onAbortResult(final boolean z) {
        this.p.post(new Runnable() { // from class: qt1
            @Override // java.lang.Runnable
            public final void run() {
                JniPaymentApp jniPaymentApp = JniPaymentApp.this;
                InterfaceC5719go2 interfaceC5719go2 = jniPaymentApp.s;
                if (interfaceC5719go2 == null) {
                    return;
                }
                ((C2287Rp2) interfaceC5719go2).m(z);
                jniPaymentApp.s = null;
            }
        });
    }

    public void onInvokeResult(final String str, final String str2, final PayerData payerData) {
        this.p.post(new Runnable() { // from class: rt1
            @Override // java.lang.Runnable
            public final void run() {
                JniPaymentApp jniPaymentApp = JniPaymentApp.this;
                InterfaceC6063ho2 interfaceC6063ho2 = jniPaymentApp.t;
                if (interfaceC6063ho2 == null) {
                    return;
                }
                ((C2287Rp2) interfaceC6063ho2).o(str, str2, payerData);
                jniPaymentApp.t = null;
            }
        });
    }

    public void onInvokeError(final String str) {
        this.p.post(new Runnable() { // from class: pt1
            @Override // java.lang.Runnable
            public final void run() {
                JniPaymentApp jniPaymentApp = JniPaymentApp.this;
                InterfaceC6063ho2 interfaceC6063ho2 = jniPaymentApp.t;
                if (interfaceC6063ho2 == null) {
                    return;
                }
                ((C2287Rp2) interfaceC6063ho2).n(str);
                jniPaymentApp.t = null;
            }
        });
    }

    public static PayerData createPayerData(String str, String str2, String str3, Address address, String str4) {
        return new PayerData(str, str2, str3, address, str4);
    }

    public static Address createShippingAddress(String str, String[] strArr, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new Address(str, strArr, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final Set o() {
        return new HashSet(Arrays.asList(N.McL$JgEC(this.r)));
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean z(String str, C6755jp2 c6755jp2) {
        return N.MRag5HOD(this.r, str, c6755jp2 != null ? c6755jp2.b() : null);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean u() {
        return N.McrEaHZb(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean s() {
        return N.MFs5Lo5_(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean r() {
        return N.MxH2M7Qu(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean t() {
        return N.Mz9bB0kb(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final String n() {
        return N.MVauQfUP(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean i() {
        return N.MSRfo5q7(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean j() {
        return N.MOoH91qV(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void v(String str, String str2, String str3, String str4, byte[][] bArr, Map map, C5037ep2 c5037ep2, List list, Map map2, C7787mp2 c7787mp2, List list2, InterfaceC6063ho2 interfaceC6063ho2) {
        this.t = interfaceC6063ho2;
        N.MdDxV11A(this.r, this);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void E(C0858Gp2 c0858Gp2) {
        N.MKIICwOk(this.r, c0858Gp2.b());
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void B() {
        N.M1KlGngz(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean A() {
        return N.MY9Q_PcC(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void g(C2287Rp2 c2287Rp2) {
        this.s = c2287Rp2;
        N.Mix09tOZ(this.r, this);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final String l() {
        return N.MJ23g7SX(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final Set m() {
        return new HashSet(Arrays.asList(N.MMxfB3ye(this.r)));
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final long q() {
        return N.MNEirz5D(this.r);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void D(PaymentHandlerHost paymentHandlerHost) {
        N.M_McFosm(this.r, paymentHandlerHost);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void k() {
        long j = this.r;
        if (j == 0) {
            return;
        }
        N.MvY3Yqx_(j);
        this.r = 0L;
    }

    public final void finalize() {
        k();
        super.finalize();
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final int p() {
        return this.q;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final C10881vq2 C(C10881vq2 c10881vq2) {
        return C10881vq2.d(new C1730Ni0(new C8697pU1(ByteBuffer.wrap(N.MpldTTna(this.r, c10881vq2.b())), new ArrayList())));
    }
}
