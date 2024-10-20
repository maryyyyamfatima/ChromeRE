package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.vr.sdk.common.deps.b;
import com.google.vr.sdk.common.deps.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jc1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC1182Jc1 extends b implements InterfaceC1312Kc1 {
    public AbstractBinderC1182Jc1() {
        attachInterface(this, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    public static InterfaceC1312Kc1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrUiLayout");
        if (queryLocalInterface instanceof InterfaceC1312Kc1) {
            return (InterfaceC1312Kc1) queryLocalInterface;
        }
        return new C1052Ic1(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        InterfaceC9094qe1 interfaceC9094qe1 = null;
        switch (i) {
            case 2:
                InterfaceC9094qe1 rootView = getRootView();
                parcel2.writeNoException();
                c.a(parcel2, rootView);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                setEnabled(c.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean isEnabled = isEnabled();
                parcel2.writeNoException();
                c.a(parcel2, isEnabled);
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof InterfaceC9094qe1) {
                        interfaceC9094qe1 = (InterfaceC9094qe1) queryLocalInterface;
                    } else {
                        interfaceC9094qe1 = new C8064ne1(readStrongBinder);
                    }
                }
                setCloseButtonListener(interfaceC9094qe1);
                parcel2.writeNoException();
                return true;
            case 6:
                setTransitionViewEnabled(c.a(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof InterfaceC9094qe1) {
                        interfaceC9094qe1 = (InterfaceC9094qe1) queryLocalInterface2;
                    } else {
                        interfaceC9094qe1 = new C8064ne1(readStrongBinder2);
                    }
                }
                setTransitionViewListener(interfaceC9094qe1);
                parcel2.writeNoException();
                return true;
            case 8:
                setSettingsButtonEnabled(c.a(parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof InterfaceC9094qe1) {
                        interfaceC9094qe1 = (InterfaceC9094qe1) queryLocalInterface3;
                    } else {
                        interfaceC9094qe1 = new C8064ne1(readStrongBinder3);
                    }
                }
                setSettingsButtonListener(interfaceC9094qe1);
                parcel2.writeNoException();
                return true;
            case 10:
                setViewerName(parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
