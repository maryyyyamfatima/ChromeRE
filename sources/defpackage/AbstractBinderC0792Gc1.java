package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.vr.sdk.common.deps.b;
import com.google.vr.sdk.common.deps.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gc1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC0792Gc1 extends b implements InterfaceC0922Hc1 {
    public AbstractBinderC0792Gc1() {
        attachInterface(this, "com.google.vr.vrcore.library.api.IGvrLayout");
    }

    public static InterfaceC0922Hc1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrLayout");
        if (queryLocalInterface instanceof InterfaceC0922Hc1) {
            return (InterfaceC0922Hc1) queryLocalInterface;
        }
        return new C0662Fc1(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        InterfaceC9094qe1 interfaceC9094qe1 = null;
        switch (i) {
            case 2:
                long nativeGvrContext = getNativeGvrContext();
                parcel2.writeNoException();
                parcel2.writeLong(nativeGvrContext);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                InterfaceC9094qe1 rootView = getRootView();
                parcel2.writeNoException();
                c.a(parcel2, rootView);
                return true;
            case 4:
                InterfaceC1312Kc1 uiLayout = getUiLayout();
                parcel2.writeNoException();
                c.a(parcel2, uiLayout);
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                onResume();
                parcel2.writeNoException();
                return true;
            case 7:
                shutdown();
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    interfaceC9094qe1 = queryLocalInterface instanceof InterfaceC9094qe1 ? (InterfaceC9094qe1) queryLocalInterface : new C8064ne1(readStrongBinder);
                }
                setPresentationView(interfaceC9094qe1);
                parcel2.writeNoException();
                return true;
            case 9:
                boolean enableAsyncReprojection = enableAsyncReprojection(parcel.readInt());
                parcel2.writeNoException();
                c.a(parcel2, enableAsyncReprojection);
                return true;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    interfaceC9094qe1 = queryLocalInterface2 instanceof InterfaceC9094qe1 ? (InterfaceC9094qe1) queryLocalInterface2 : new C8064ne1(readStrongBinder2);
                }
                boolean enableCardboardTriggerEmulation = enableCardboardTriggerEmulation(interfaceC9094qe1);
                parcel2.writeNoException();
                c.a(parcel2, enableCardboardTriggerEmulation);
                return true;
            case 11:
                setStereoModeEnabled(c.a(parcel));
                parcel2.writeNoException();
                return true;
            case 12:
                onBackPressed();
                parcel2.writeNoException();
                return true;
            case 13:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    interfaceC9094qe1 = queryLocalInterface3 instanceof InterfaceC9094qe1 ? (InterfaceC9094qe1) queryLocalInterface3 : new C8064ne1(readStrongBinder3);
                }
                setReentryIntent(interfaceC9094qe1);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    interfaceC9094qe1 = queryLocalInterface4 instanceof InterfaceC9094qe1 ? (InterfaceC9094qe1) queryLocalInterface4 : new C8064ne1(readStrongBinder4);
                }
                boolean onDonNotNeededListener = setOnDonNotNeededListener(interfaceC9094qe1);
                parcel2.writeNoException();
                c.a(parcel2, onDonNotNeededListener);
                return true;
            default:
                return false;
        }
    }
}
