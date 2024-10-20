package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E43 {
    public static final C4856eI1 b = new C4856eI1("Session");
    public final InterfaceC9785sf1 a;

    public E43(Context context, String str, String str2) {
        InterfaceC9785sf1 interfaceC9785sf1;
        try {
            interfaceC9785sf1 = ((C0652Fa1) AbstractC11373xH.a(context)).g1(str, str2, new D43(this));
        } catch (GY1 | RemoteException unused) {
            AbstractC11373xH.a.b("Unable to call %s on %s.", "newSessionImpl", InterfaceC0912Ha1.class.getSimpleName());
            interfaceC9785sf1 = null;
        }
        this.a = interfaceC9785sf1;
    }

    public final boolean b() {
        InterfaceC9785sf1 interfaceC9785sf1 = this.a;
        if (interfaceC9785sf1 == null) {
            return false;
        }
        try {
            C9100qf1 c9100qf1 = (C9100qf1) interfaceC9785sf1;
            Parcel e = c9100qf1.e(5, c9100qf1.a());
            ClassLoader classLoader = AbstractC11786yV.a;
            boolean z = e.readInt() != 0;
            e.recycle();
            return z;
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "isConnected", InterfaceC9785sf1.class.getSimpleName());
            return false;
        }
    }

    public final void c(int i) {
        InterfaceC9785sf1 interfaceC9785sf1 = this.a;
        if (interfaceC9785sf1 == null) {
            return;
        }
        try {
            C9100qf1 c9100qf1 = (C9100qf1) interfaceC9785sf1;
            Parcel a = c9100qf1.a();
            a.writeInt(i);
            c9100qf1.h(13, a);
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "notifySessionEnded", InterfaceC9785sf1.class.getSimpleName());
        }
    }

    public final InterfaceC9436re1 a() {
        InterfaceC9436re1 c8408oe1;
        InterfaceC9785sf1 interfaceC9785sf1 = this.a;
        if (interfaceC9785sf1 == null) {
            return null;
        }
        try {
            C9100qf1 c9100qf1 = (C9100qf1) interfaceC9785sf1;
            Parcel e = c9100qf1.e(1, c9100qf1.a());
            IBinder readStrongBinder = e.readStrongBinder();
            String str = AbstractBinderC8751pe1.DESCRIPTOR;
            if (readStrongBinder == null) {
                c8408oe1 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                if (queryLocalInterface instanceof InterfaceC9436re1) {
                    c8408oe1 = (InterfaceC9436re1) queryLocalInterface;
                } else {
                    c8408oe1 = new C8408oe1(readStrongBinder);
                }
            }
            e.recycle();
            return c8408oe1;
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "getWrappedObject", InterfaceC9785sf1.class.getSimpleName());
            return null;
        }
    }
}
