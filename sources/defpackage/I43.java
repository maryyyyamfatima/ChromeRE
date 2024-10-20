package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I43 {
    public static final C4856eI1 c = new C4856eI1("SessionManager");
    public final InterfaceC10814vf1 a;
    public final Context b;

    public I43(InterfaceC10814vf1 interfaceC10814vf1, Context context) {
        this.a = interfaceC10814vf1;
        this.b = context;
    }

    public final E43 c() {
        InterfaceC9436re1 c8408oe1;
        try {
            C10128tf1 c10128tf1 = (C10128tf1) this.a;
            Parcel e = c10128tf1.e(1, c10128tf1.a());
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
            return (E43) ObjectWrapper.h1(c8408oe1);
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "getWrappedCurrentSession", InterfaceC10814vf1.class.getSimpleName());
            return null;
        }
    }

    public final void b(boolean z) {
        C4856eI1 c4856eI1 = c;
        try {
            c4856eI1.f("End session for %s", this.b.getPackageName());
            C10128tf1 c10128tf1 = (C10128tf1) this.a;
            Parcel a = c10128tf1.a();
            ClassLoader classLoader = AbstractC11786yV.a;
            a.writeInt(1);
            a.writeInt(z ? 1 : 0);
            c10128tf1.h(6, a);
        } catch (RemoteException unused) {
            c4856eI1.b("Unable to call %s on %s.", "endCurrentSession", InterfaceC10814vf1.class.getSimpleName());
        }
    }

    public final void a(J43 j43) {
        try {
            InterfaceC10814vf1 interfaceC10814vf1 = this.a;
            K43 k43 = new K43(j43);
            C10128tf1 c10128tf1 = (C10128tf1) interfaceC10814vf1;
            Parcel a = c10128tf1.a();
            AbstractC11786yV.c(a, k43);
            c10128tf1.h(2, a);
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "addSessionManagerListener", InterfaceC10814vf1.class.getSimpleName());
        }
    }
}
