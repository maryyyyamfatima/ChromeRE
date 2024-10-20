package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import com.android.chrome.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.components.payments.GooglePayDataCallbacksService;
import org.chromium.components.payments.PayerData;
import org.chromium.components.payments.PaymentApp;
import org.chromium.components.payments.PaymentRequestUpdateEventListener;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class N31 extends PaymentApp implements InterfaceC9914t11, InterfaceC10257u11, InterfaceC4352cp4, I31 {
    public static final URI B = URI.create("https://pay.google.com/gp/p/");
    public InterfaceC1572Mc2 A;
    public final WebContents p;
    public final AbstractC10600v11 q;
    public final String r;
    public final boolean s;
    public final int t;
    public final PaymentRequestUpdateEventListener u;
    public final M31 v;
    public InterfaceC6063ho2 w;
    public Cart x;
    public String y;
    public String z;

    @Override // org.chromium.components.payments.PaymentApp
    public final int p() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N31(WebContents webContents, N11 n11, String str, boolean z, C2287Rp2 c2287Rp2, M31 m31) {
        super(null, "Google_Pay_Internal", "", "");
        WindowAndroid Q0;
        Context context = null;
        this.p = webContents;
        this.q = n11;
        this.r = str;
        this.s = z;
        this.t = z ? R.string.0_resource_name_obfuscated_res_0x7f1407ed : R.string.0_resource_name_obfuscated_res_0x7f1401e9;
        this.u = c2287Rp2;
        this.v = m31;
        if (webContents != null && !webContents.isDestroyed() && (Q0 = webContents.Q0()) != null) {
            context = (Context) Q0.j.get();
        }
        if (context == null) {
            return;
        }
        this.n[0] = context.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f1407ee : R.string.0_resource_name_obfuscated_res_0x7f1401ea);
        this.m = AbstractC2884Wf.a(context, z ? R.drawable.0_resource_name_obfuscated_res_0x7f0901a2 : R.drawable.0_resource_name_obfuscated_res_0x7f09009a);
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final Set o() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.r);
        return hashSet;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean y() {
        return this.s;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void v(String str, String str2, String str3, String str4, byte[][] bArr, Map map, C5037ep2 c5037ep2, List list, Map map2, C7787mp2 c7787mp2, List list2, InterfaceC6063ho2 interfaceC6063ho2) {
        this.w = interfaceC6063ho2;
        if (N.M1X7xdZV("GPayAppDynamicUpdate")) {
            GooglePayDataCallbacksService.h = this;
        }
        Cart cart = new Cart();
        C9840so2 c9840so2 = c5037ep2.c;
        cart.g = c9840so2.b;
        cart.a = c9840so2.c;
        this.x = cart;
        C6755jp2 c6755jp2 = (C6755jp2) map.get(this.r);
        this.y = N.MR6Af3ZS(str4, 1);
        this.z = c6755jp2.c;
        AbstractC10600v11 abstractC10600v11 = this.q;
        boolean h = abstractC10600v11.h();
        abstractC10600v11.k(this);
        abstractC10600v11.j(this);
        if (h) {
            return;
        }
        abstractC10600v11.i();
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        Ym4 r1 = WebPaymentDataRequest.r1();
        Cart cart = this.x;
        WebPaymentDataRequest webPaymentDataRequest = r1.a;
        webPaymentDataRequest.a = cart;
        webPaymentDataRequest.g = this.y;
        webPaymentDataRequest.h = this.z;
        this.v.getClass();
        AbstractC10600v11 abstractC10600v11 = this.q;
        abstractC10600v11.f(new PO0(abstractC10600v11, webPaymentDataRequest)).l(new L31(this));
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        G(null);
    }

    @Override // defpackage.C30
    public final void e(int i) {
        G(null);
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        if (intent == null) {
            G(null);
            return;
        }
        if (i != -1) {
            G(null);
            return;
        }
        this.v.getClass();
        Parcelable.Creator creator = WebPaymentData.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.WebPaymentData");
        WebPaymentData webPaymentData = (WebPaymentData) (byteArrayExtra == null ? null : ST2.a(byteArrayExtra, creator));
        String str = webPaymentData != null ? webPaymentData.a : null;
        if (str != null) {
            G(str);
        } else {
            G(null);
        }
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void k() {
        AbstractC10600v11 abstractC10600v11 = this.q;
        abstractC10600v11.l(this);
        abstractC10600v11.m(this);
        abstractC10600v11.e();
    }

    public static String F(C0858Gp2 c0858Gp2) {
        C2152Qo2[] c2152Qo2Arr;
        C2152Qo2 c2152Qo2;
        C2022Po2 c2022Po2;
        String str;
        if (c0858Gp2 != null && (c2152Qo2Arr = c0858Gp2.d) != null && c2152Qo2Arr.length != 0 && (c2152Qo2 = c2152Qo2Arr[0]) != null && (c2022Po2 = c2152Qo2.c) != null && (str = c2022Po2.c) != null) {
            return str;
        }
        AbstractC4851eH1.a("GooglePayPaymentApp", "Failed to extract stringifiedData from paymentRequestDetailsUpdate, completing with empty data.", new Object[0]);
        return "{}";
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final String l() {
        return B.toString();
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean A() {
        return N.M1X7xdZV("GPayAppDynamicUpdate") && this.A != null;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void B() {
        if (N.M1X7xdZV("GPayAppDynamicUpdate")) {
            this.A.a(null);
            this.A = null;
        }
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void E(C0858Gp2 c0858Gp2) {
        if (N.M1X7xdZV("GPayAppDynamicUpdate")) {
            this.A.a(c0858Gp2);
            this.A = null;
        }
    }

    public final void G(String str) {
        C2021Po1 c2021Po1;
        SparseArray sparseArray;
        int indexOfValue;
        if (N.M1X7xdZV("GPayAppDynamicUpdate")) {
            GooglePayDataCallbacksService.h = null;
        }
        WebContents webContents = this.p;
        WindowAndroid Q0 = (webContents == null || webContents.isDestroyed()) ? null : webContents.Q0();
        if (Q0 != null && (c2021Po1 = Q0.a) != null && (indexOfValue = (sparseArray = c2021Po1.a).indexOfValue(this)) >= 0) {
            sparseArray.remove(indexOfValue);
            c2021Po1.d.remove(Integer.valueOf(indexOfValue));
        }
        k();
        InterfaceC6063ho2 interfaceC6063ho2 = this.w;
        if (interfaceC6063ho2 == null) {
            return;
        }
        if (str != null) {
            ((C2287Rp2) interfaceC6063ho2).o(this.r, str, new PayerData());
        } else {
            ((C2287Rp2) interfaceC6063ho2).n("User closed the Payment Request UI.");
        }
        this.w = null;
    }

    public final void H(String str, InterfaceC1572Mc2 interfaceC1572Mc2) {
        if (N.M1X7xdZV("GPayAppDynamicUpdate")) {
            PaymentRequestUpdateEventListener paymentRequestUpdateEventListener = this.u;
            if (paymentRequestUpdateEventListener == null || !paymentRequestUpdateEventListener.changePaymentMethodFromInvokedApp(this.r, str)) {
                AbstractC4851eH1.a("GooglePayPaymentApp", "Failed to call changePaymentMethod, running on payment details not updated.", new Object[0]);
                interfaceC1572Mc2.a(null);
            } else {
                this.A = interfaceC1572Mc2;
            }
        }
    }
}
