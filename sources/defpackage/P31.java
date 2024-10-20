package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P31 implements InterfaceC9914t11, InterfaceC10257u11, InterfaceC1702Nc2 {
    public InterfaceC6749jo2 a;
    public String g;
    public boolean h;
    public N11 i;
    public C2032Pq2 j;
    public IsReadyToPayRequest k;
    public final /* synthetic */ Q31 l;

    public P31(Q31 q31, C7781mo2 c7781mo2) {
        this.l = q31;
        this.a = c7781mo2;
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        c(null);
    }

    @Override // defpackage.C30
    public final void e(int i) {
        c(null);
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        InterfaceC6749jo2 interfaceC6749jo2 = this.a;
        if (interfaceC6749jo2 == null) {
            return;
        }
        if (!((C2287Rp2) interfaceC6749jo2.e()).u) {
            EI2.h(0, 2, "PaymentRequest.PrePurchaseQuery");
            O31 o31 = this.l.a;
            C2032Pq2 c2032Pq2 = this.j;
            final IsReadyToPayRequest isReadyToPayRequest = this.k;
            o31.getClass();
            c2032Pq2.getClass();
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.d = 23705;
            c5531gF3.a = new InterfaceC5565gM2() { // from class: Oq2
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    IsReadyToPayRequest isReadyToPayRequest2 = IsReadyToPayRequest.this;
                    Kj4 kj4 = (Kj4) obj;
                    kj4.getClass();
                    Ij4 ij4 = new Ij4((C6905kF3) obj2);
                    try {
                        InterfaceC11151we1 interfaceC11151we1 = (InterfaceC11151we1) kj4.m();
                        Bundle y = kj4.y();
                        C10465ue1 c10465ue1 = (C10465ue1) interfaceC11151we1;
                        Parcel a = c10465ue1.a();
                        AbstractC11786yV.b(a, isReadyToPayRequest2);
                        AbstractC11786yV.b(a, y);
                        AbstractC11786yV.c(a, ij4);
                        c10465ue1.M0(14, a);
                    } catch (RemoteException e) {
                        Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                        Status status = Status.m;
                        Bundle bundle2 = Bundle.EMPTY;
                        ij4.Y(status, false);
                    }
                }
            };
            c2032Pq2.b(0, c5531gF3.a()).a(this);
            return;
        }
        c(null);
    }

    @Override // defpackage.InterfaceC1702Nc2
    public final void b(AF3 af3) {
        if (this.a == null) {
            return;
        }
        if (!af3.l() || !((Boolean) af3.k()).booleanValue() || ((C2287Rp2) this.a.e()).u) {
            c(null);
            return;
        }
        WebContents webContents = ((C2287Rp2) this.a.e()).f;
        N11 n11 = this.i;
        String str = this.g;
        boolean z = this.h;
        C2287Rp2 c2287Rp2 = (C2287Rp2) this.a.e();
        c2287Rp2.getClass();
        this.l.a.getClass();
        c(new N31(webContents, n11, str, z, c2287Rp2, new M31()));
    }

    public final void c(N31 n31) {
        N11 n11;
        if (n31 == null && (n11 = this.i) != null) {
            n11.l(this);
            this.i.m(this);
            this.i.e();
            this.i = null;
        }
        InterfaceC6749jo2 interfaceC6749jo2 = this.a;
        if (interfaceC6749jo2 == null) {
            return;
        }
        interfaceC6749jo2.b(n31 != null);
        if (n31 != null) {
            this.a.g(n31);
        }
        this.a.d(this.l);
        this.a = null;
    }
}
