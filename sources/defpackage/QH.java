package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QH extends E43 {
    public static final C4856eI1 l = new C4856eI1("CastSession");
    public final Context c;
    public final HashSet d;
    public final InterfaceC1691Na1 e;
    public final KR1 f;
    public C8136nq1 g;
    public KM2 h;
    public CastDevice i;
    public R43 j;
    public final KH k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QH(Context context, String str, String str2, CastOptions castOptions, KR1 kr1) {
        super(context, str, str2);
        InterfaceC1691Na1 f1;
        KH kh = new KH();
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = kr1;
        this.k = kh;
        InterfaceC9436re1 a = a();
        NH nh = new NH(this);
        C4856eI1 c4856eI1 = AbstractC11373xH.a;
        if (a != null) {
            try {
                f1 = ((C0652Fa1) AbstractC11373xH.a(context)).f1(castOptions, a, nh);
            } catch (GY1 | RemoteException unused) {
                AbstractC11373xH.a.b("Unable to call %s on %s.", "newCastSessionImpl", InterfaceC0912Ha1.class.getSimpleName());
            }
            this.e = f1;
        }
        f1 = null;
        this.e = f1;
    }

    public final ApplicationMetadata g() {
        C8136nq1 c8136nq1 = this.g;
        if (c8136nq1 == null || !c8136nq1.k()) {
            return null;
        }
        return this.g.u;
    }

    public final void j(final double d) {
        C8136nq1 c8136nq1 = this.g;
        if (c8136nq1 == null || !c8136nq1.k()) {
            return;
        }
        final C8136nq1 c8136nq12 = this.g;
        c8136nq12.getClass();
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.a = new InterfaceC5565gM2() { // from class: Zp1
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C8136nq1 c8136nq13 = C8136nq1.this;
                    c8136nq13.getClass();
                    InterfaceC0262Ca1 interfaceC0262Ca1 = (InterfaceC0262Ca1) ((C9658sH) obj).m();
                    double d2 = c8136nq13.w;
                    boolean z = c8136nq13.x;
                    C0002Aa1 c0002Aa1 = (C0002Aa1) interfaceC0262Ca1;
                    Parcel a = c0002Aa1.a();
                    a.writeDouble(d);
                    a.writeDouble(d2);
                    ClassLoader classLoader = AbstractC11786yV.a;
                    a.writeInt(z ? 1 : 0);
                    c0002Aa1.M0(7, a);
                    ((C6905kF3) obj2).b(null);
                }
            };
            c5531gF3.d = 8411;
            c8136nq12.b(1, c5531gF3.a());
            return;
        }
        throw new IllegalArgumentException("Volume cannot be " + d);
    }

    public static void d(QH qh) {
        qh.f.getClass();
        C8136nq1 c8136nq1 = qh.g;
        if (c8136nq1 != null) {
            c8136nq1.j();
            qh.g = null;
        }
        qh.i = null;
        KM2 km2 = qh.h;
        if (km2 != null) {
            km2.o(null);
            qh.h = null;
        }
    }

    public final void i(final boolean z) {
        C8136nq1 c8136nq1 = this.g;
        if (c8136nq1 == null || !c8136nq1.k()) {
            return;
        }
        final C8136nq1 c8136nq12 = this.g;
        c8136nq12.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Sp1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C8136nq1 c8136nq13 = C8136nq1.this;
                c8136nq13.getClass();
                InterfaceC0262Ca1 interfaceC0262Ca1 = (InterfaceC0262Ca1) ((C9658sH) obj).m();
                double d = c8136nq13.w;
                boolean z2 = c8136nq13.x;
                C0002Aa1 c0002Aa1 = (C0002Aa1) interfaceC0262Ca1;
                Parcel a = c0002Aa1.a();
                ClassLoader classLoader = AbstractC11786yV.a;
                a.writeInt(z ? 1 : 0);
                a.writeDouble(d);
                a.writeInt(z2 ? 1 : 0);
                c0002Aa1.M0(8, a);
                ((C6905kF3) obj2).b(null);
            }
        };
        c5531gF3.d = 8412;
        c8136nq12.b(1, c5531gF3.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QH.f(android.os.Bundle):void");
    }

    public static void e(QH qh, String str, AF3 af3) {
        C4856eI1 c4856eI1 = l;
        InterfaceC1691Na1 interfaceC1691Na1 = qh.e;
        if (interfaceC1691Na1 == null) {
            return;
        }
        try {
            if (af3.l()) {
                C7255lH c7255lH = (C7255lH) af3.k();
                Status status = c7255lH.a;
                if (status != null && status.r1()) {
                    c4856eI1.a("%s() -> success result", str);
                    KM2 km2 = new KM2(new C6257iN1());
                    qh.h = km2;
                    km2.o(qh.g);
                    KM2 km22 = qh.h;
                    InterfaceC6911kH interfaceC6911kH = km22.f;
                    if (interfaceC6911kH != null) {
                        ((C8136nq1) interfaceC6911kH).o(km22.c.b, km22);
                        if (!km22.h()) {
                            KM2.f();
                        } else {
                            KM2.b(new C8315oM2(km22));
                        }
                    }
                    qh.f.getClass();
                    ApplicationMetadata applicationMetadata = c7255lH.g;
                    String str2 = c7255lH.h;
                    String str3 = c7255lH.i;
                    boolean z = c7255lH.j;
                    C1432La1 c1432La1 = (C1432La1) interfaceC1691Na1;
                    Parcel a = c1432La1.a();
                    AbstractC11786yV.b(a, applicationMetadata);
                    a.writeString(str2);
                    a.writeString(str3);
                    a.writeInt(z ? 1 : 0);
                    c1432La1.h(4, a);
                    return;
                }
                Status status2 = c7255lH.a;
                if (status2 != null) {
                    c4856eI1.a("%s() -> failure result", str);
                    int i = status2.g;
                    C1432La1 c1432La12 = (C1432La1) interfaceC1691Na1;
                    Parcel a2 = c1432La12.a();
                    a2.writeInt(i);
                    c1432La12.h(5, a2);
                    return;
                }
            } else {
                Exception j = af3.j();
                if (j instanceof C10114td) {
                    int i2 = ((C10114td) j).a.g;
                    C1432La1 c1432La13 = (C1432La1) interfaceC1691Na1;
                    Parcel a3 = c1432La13.a();
                    a3.writeInt(i2);
                    c1432La13.h(5, a3);
                    return;
                }
            }
            C1432La1 c1432La14 = (C1432La1) interfaceC1691Na1;
            Parcel a4 = c1432La14.a();
            a4.writeInt(2476);
            c1432La14.h(5, a4);
        } catch (RemoteException unused) {
            c4856eI1.b("Unable to call %s on %s.", "methods", InterfaceC1691Na1.class.getSimpleName());
        }
    }

    public final void h() {
        R43 r43 = this.j;
        if (r43 != null) {
            int i = r43.d;
            C4856eI1 c4856eI1 = R43.h;
            if (i == 0) {
                c4856eI1.a("No need to notify non remote-to-local transfer", new Object[0]);
                return;
            }
            if (r43.g == null) {
                c4856eI1.a("No need to notify with null sessionState", new Object[0]);
            } else {
                c4856eI1.a("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i), r43.g);
                Iterator it = new HashSet(r43.a).iterator();
                if (it.hasNext()) {
                    X5.a(it.next());
                    throw null;
                }
            }
            r43.b.removeCallbacks(r43.c);
            r43.d = 0;
            r43.g = null;
            r43.a();
        }
    }
}
