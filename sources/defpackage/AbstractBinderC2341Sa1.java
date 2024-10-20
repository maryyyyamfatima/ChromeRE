package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2341Sa1 extends Binder implements InterfaceC2471Ta1 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2341Sa1() {
        attachInterface(this, "org.chromium.base.process_launcher.IChildProcessService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.base.process_launcher.IChildProcessService");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.base.process_launcher.IChildProcessService");
            return true;
        }
        InterfaceC0542Ee1 interfaceC0542Ee1 = null;
        switch (i) {
            case 1:
                boolean y0 = ((BinderC12074zK) this).y0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(y0 ? 1 : 0);
                return true;
            case 2:
                ApplicationInfo b0 = ((BinderC12074zK) this).b0();
                parcel2.writeNoException();
                if (b0 != null) {
                    parcel2.writeInt(1);
                    b0.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.base.process_launcher.IParentProcess");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0542Ee1)) {
                        interfaceC0542Ee1 = (InterfaceC0542Ee1) queryLocalInterface;
                    } else {
                        interfaceC0542Ee1 = new C0412De1(readStrongBinder);
                    }
                }
                ((BinderC12074zK) this).r0(bundle, interfaceC0542Ee1, parcel.createBinderArrayList());
                return true;
            case 4:
                ((BinderC12074zK) this).X0();
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                ((BinderC12074zK) this).W0(parcel.readInt());
                return true;
            case 6:
                ((BinderC12074zK) this).q0();
                return true;
            case 7:
                ((BinderC12074zK) this).n((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
