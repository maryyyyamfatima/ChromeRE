package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D43 extends AbstractBinderC7826mw {
    public final /* synthetic */ E43 a;

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        E43 e43 = this.a;
        switch (i) {
            case 1:
                ObjectWrapper objectWrapper = new ObjectWrapper(e43);
                parcel2.writeNoException();
                AbstractC11786yV.c(parcel2, objectWrapper);
                return true;
            case 2:
                Bundle bundle = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                ((QH) e43).f(bundle);
                parcel2.writeNoException();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Bundle bundle2 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                ((QH) e43).f(bundle2);
                parcel2.writeNoException();
                return true;
            case 4:
                ClassLoader classLoader = AbstractC11786yV.a;
                int i2 = parcel.readInt() != 0 ? 1 : 0;
                AbstractBinderC7826mw.g1(parcel);
                QH qh = (QH) e43;
                InterfaceC1691Na1 interfaceC1691Na1 = qh.e;
                if (interfaceC1691Na1 != null) {
                    try {
                        C1432La1 c1432La1 = (C1432La1) interfaceC1691Na1;
                        Parcel a = c1432La1.a();
                        a.writeInt(i2);
                        a.writeInt(0);
                        c1432La1.h(6, a);
                    } catch (RemoteException unused) {
                        QH.l.b("Unable to call %s on %s.", "disconnectFromDevice", InterfaceC1691Na1.class.getSimpleName());
                    }
                    qh.c(0);
                    qh.h();
                }
                parcel2.writeNoException();
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                QH qh2 = (QH) e43;
                KM2 km2 = qh2.h;
                long g = km2 == null ? 0L : km2.g() - qh2.h.c();
                parcel2.writeNoException();
                parcel2.writeLong(g);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(222980000);
                return true;
            case 7:
                Bundle bundle3 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                QH qh3 = (QH) e43;
                qh3.getClass();
                qh3.i = CastDevice.t1(bundle3);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle4 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                QH qh4 = (QH) e43;
                qh4.getClass();
                qh4.i = CastDevice.t1(bundle4);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundle5 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                QH qh5 = (QH) e43;
                qh5.getClass();
                CastDevice t1 = CastDevice.t1(bundle5);
                if (t1 != null && !t1.equals(qh5.i)) {
                    qh5.i = t1;
                    QH.l.a("update to device: %s", t1);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D43(E43 e43) {
        super("com.google.android.gms.cast.framework.ISessionProxy");
        this.a = e43;
    }
}
