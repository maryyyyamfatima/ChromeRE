package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hw4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6113hw4 extends Binder implements IInterface {
    public AbstractBinderC6113hw4() {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        Iu4 iu4 = (Iu4) this;
        switch (i) {
            case 2:
                iu4.t0(parcel.readInt(), (Bundle) AbstractC8175nw4.a(parcel, Bundle.CREATOR));
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int readInt = parcel.readInt();
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onCompleteInstall(%d)", new Object[]{Integer.valueOf(readInt)});
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onCancelInstall(%d)", new Object[]{Integer.valueOf(readInt2)});
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                int readInt3 = parcel.readInt();
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onGetSession(%d)", new Object[]{Integer.valueOf(readInt3)});
                return true;
            case 6:
                Bundle bundle = (Bundle) AbstractC8175nw4.a(parcel, Bundle.CREATOR);
                Pt4 pt4 = (Pt4) iu4;
                pt4.g.b.a();
                int i3 = bundle.getInt("error_code");
                St4.c.b(6, "onError(%d)", new Object[]{Integer.valueOf(i3)});
                pt4.a.a(new C1988Ph3(i3));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onGetSessionStates", new Object[0]);
                return true;
            case 8:
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onDeferredUninstall", new Object[0]);
                return true;
            case 9:
                iu4.P((Bundle) AbstractC8175nw4.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onGetSplitsForAppUpdate", new Object[0]);
                return true;
            case 11:
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onCompleteInstallForAppUpdate", new Object[0]);
                return true;
            case 12:
                iu4.B0((Bundle) AbstractC8175nw4.a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                ((Pt4) iu4).g.b.a();
                St4.c.b(4, "onDeferredLanguageUninstall", new Object[0]);
                return true;
            default:
                return false;
        }
    }
}
