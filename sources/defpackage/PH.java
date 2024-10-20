package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PH {
    public final /* synthetic */ QH a;

    public PH(QH qh) {
        this.a = qh;
    }

    public final void a() {
        InterfaceC6911kH interfaceC6911kH;
        final QH qh = this.a;
        if (qh.e == null) {
            return;
        }
        try {
            KM2 km2 = qh.h;
            if (km2 != null && (interfaceC6911kH = km2.f) != null) {
                ((C8136nq1) interfaceC6911kH).o(km2.c.b, km2);
                if (!km2.h()) {
                    KM2.f();
                } else {
                    KM2.b(new C8315oM2(km2));
                }
            }
            C1432La1 c1432La1 = (C1432La1) qh.e;
            Parcel a = c1432La1.a();
            AbstractC11786yV.b(a, null);
            c1432La1.h(1, a);
        } catch (RemoteException unused) {
            QH.l.b("Unable to call %s on %s.", "onConnected", InterfaceC1691Na1.class.getSimpleName());
        }
        final C8136nq1 c8136nq1 = qh.g;
        if (c8136nq1 == null) {
            return;
        }
        final String[] strArr = {"com.google.android.gms.cast.CLIENT_INFO_PLAYBACK_SESSION_NAME"};
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Up1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C8136nq1.this.getClass();
                BinderC5042eq1 binderC5042eq1 = new BinderC5042eq1((C6905kF3) obj2);
                C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) ((C9658sH) obj).m());
                Parcel a2 = c0002Aa1.a();
                AbstractC11786yV.c(a2, binderC5042eq1);
                a2.writeStringArray(strArr);
                c0002Aa1.M0(20, a2);
            }
        };
        c5531gF3.c = new Feature[]{FI0.d};
        c5531gF3.d = 8433;
        c5531gF3.b = false;
        AF3 b = c8136nq1.b(0, c5531gF3.a());
        if (b != null) {
            b.e(new InterfaceC7371ld2() { // from class: HH
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    QH qh2 = QH.this;
                    qh2.getClass();
                    String string = ((Bundle) obj).getString("com.google.android.gms.cast.CLIENT_INFO_PLAYBACK_SESSION_NAME");
                    qh2.getClass();
                    QH.l.a("playback session is updated to name: %s", string);
                }
            });
        }
    }

    public final void c(int i) {
        InterfaceC1691Na1 interfaceC1691Na1 = this.a.e;
        if (interfaceC1691Na1 == null) {
            return;
        }
        try {
            C1432La1 c1432La1 = (C1432La1) interfaceC1691Na1;
            Parcel a = c1432La1.a();
            a.writeInt(i);
            c1432La1.h(2, a);
        } catch (RemoteException unused) {
            QH.l.b("Unable to call %s on %s.", "onConnectionSuspended", InterfaceC1691Na1.class.getSimpleName());
        }
    }

    public final void b(int i) {
        InterfaceC1691Na1 interfaceC1691Na1 = this.a.e;
        if (interfaceC1691Na1 == null) {
            return;
        }
        try {
            ConnectionResult connectionResult = new ConnectionResult(i);
            C1432La1 c1432La1 = (C1432La1) interfaceC1691Na1;
            Parcel a = c1432La1.a();
            AbstractC11786yV.b(a, connectionResult);
            c1432La1.h(3, a);
        } catch (RemoteException unused) {
            QH.l.b("Unable to call %s on %s.", "onConnectionFailed", InterfaceC1691Na1.class.getSimpleName());
        }
    }

    public final void d(int i) {
        InterfaceC1691Na1 interfaceC1691Na1 = this.a.e;
        if (interfaceC1691Na1 == null) {
            return;
        }
        try {
            ConnectionResult connectionResult = new ConnectionResult(i);
            C1432La1 c1432La1 = (C1432La1) interfaceC1691Na1;
            Parcel a = c1432La1.a();
            AbstractC11786yV.b(a, connectionResult);
            c1432La1.h(3, a);
        } catch (RemoteException unused) {
            QH.l.b("Unable to call %s on %s.", "onDisconnected", InterfaceC1691Na1.class.getSimpleName());
        }
    }
}
