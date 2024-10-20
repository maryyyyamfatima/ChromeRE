package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OQ1 extends AbstractC6958kQ1 {
    public static final C4856eI1 b = new C4856eI1("MediaRouterCallback");
    public final InterfaceC0407Dd1 a;

    public OQ1(InterfaceC0407Dd1 interfaceC0407Dd1) {
        this.a = interfaceC0407Dd1;
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void h(MQ1 mq1, DQ1 dq1, int i) {
        InterfaceC0407Dd1 interfaceC0407Dd1 = this.a;
        String str = dq1.c;
        Object[] objArr = {Integer.valueOf(i), str};
        C4856eI1 c4856eI1 = b;
        c4856eI1.a("onRouteSelected with reason = %d, routeId = %s", objArr);
        if (dq1.k != 1) {
            return;
        }
        try {
            String m = m(mq1, dq1);
            C0277Cd1 c0277Cd1 = (C0277Cd1) interfaceC0407Dd1;
            Parcel e = c0277Cd1.e(7, c0277Cd1.a());
            int readInt = e.readInt();
            e.recycle();
            if (readInt >= 220400000) {
                Bundle bundle = dq1.r;
                C0277Cd1 c0277Cd12 = (C0277Cd1) interfaceC0407Dd1;
                Parcel a = c0277Cd12.a();
                a.writeString(m);
                a.writeString(str);
                AbstractC11786yV.b(a, bundle);
                c0277Cd12.h(8, a);
            } else {
                Bundle bundle2 = dq1.r;
                C0277Cd1 c0277Cd13 = (C0277Cd1) interfaceC0407Dd1;
                Parcel a2 = c0277Cd13.a();
                a2.writeString(m);
                AbstractC11786yV.b(a2, bundle2);
                c0277Cd13.h(4, a2);
            }
        } catch (RemoteException unused) {
            c4856eI1.b("Unable to call %s on %s.", "onRouteSelected", InterfaceC0407Dd1.class.getSimpleName());
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void j(MQ1 mq1, DQ1 dq1, int i) {
        String str = dq1.c;
        Object[] objArr = {Integer.valueOf(i), str};
        C4856eI1 c4856eI1 = b;
        c4856eI1.a("onRouteUnselected with reason = %d, routeId = %s", objArr);
        if (dq1.k != 1) {
            c4856eI1.a("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            InterfaceC0407Dd1 interfaceC0407Dd1 = this.a;
            Bundle bundle = dq1.r;
            C0277Cd1 c0277Cd1 = (C0277Cd1) interfaceC0407Dd1;
            Parcel a = c0277Cd1.a();
            a.writeString(str);
            AbstractC11786yV.b(a, bundle);
            a.writeInt(i);
            c0277Cd1.h(6, a);
        } catch (RemoteException unused) {
            c4856eI1.b("Unable to call %s on %s.", "onRouteUnselected", InterfaceC0407Dd1.class.getSimpleName());
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void d(DQ1 dq1) {
        try {
            InterfaceC0407Dd1 interfaceC0407Dd1 = this.a;
            String str = dq1.c;
            Bundle bundle = dq1.r;
            C0277Cd1 c0277Cd1 = (C0277Cd1) interfaceC0407Dd1;
            Parcel a = c0277Cd1.a();
            a.writeString(str);
            AbstractC11786yV.b(a, bundle);
            c0277Cd1.h(1, a);
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "onRouteAdded", InterfaceC0407Dd1.class.getSimpleName());
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void e(MQ1 mq1, DQ1 dq1) {
        try {
            InterfaceC0407Dd1 interfaceC0407Dd1 = this.a;
            String str = dq1.c;
            Bundle bundle = dq1.r;
            C0277Cd1 c0277Cd1 = (C0277Cd1) interfaceC0407Dd1;
            Parcel a = c0277Cd1.a();
            a.writeString(str);
            AbstractC11786yV.b(a, bundle);
            c0277Cd1.h(2, a);
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "onRouteChanged", InterfaceC0407Dd1.class.getSimpleName());
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void f(DQ1 dq1) {
        try {
            InterfaceC0407Dd1 interfaceC0407Dd1 = this.a;
            String str = dq1.c;
            Bundle bundle = dq1.r;
            C0277Cd1 c0277Cd1 = (C0277Cd1) interfaceC0407Dd1;
            Parcel a = c0277Cd1.a();
            a.writeString(str);
            AbstractC11786yV.b(a, bundle);
            c0277Cd1.h(3, a);
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "onRouteRemoved", InterfaceC0407Dd1.class.getSimpleName());
        }
    }

    public static String m(MQ1 mq1, DQ1 dq1) {
        CastDevice t1;
        CastDevice t12;
        String str = dq1.c;
        if (str == null || !str.endsWith("-groupRoute") || (t1 = CastDevice.t1(dq1.r)) == null) {
            return str;
        }
        String s1 = t1.s1();
        mq1.getClass();
        for (DQ1 dq12 : MQ1.f()) {
            String str2 = dq12.c;
            if (str2 != null && !str2.endsWith("-groupRoute") && (t12 = CastDevice.t1(dq12.r)) != null && TextUtils.equals(t12.s1(), s1)) {
                String str3 = dq12.c;
                b.a("routeId is changed from %s to %s", str, str3);
                return str3;
            }
        }
        return str;
    }
}
