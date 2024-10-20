package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Se1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2361Se1 extends Binder implements InterfaceC2491Te1 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2361Se1() {
        attachInterface(this, "android.support.customtabs.IPostMessageService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC8733pb1 c7702mb1;
        InterfaceC8733pb1 c7702mb12;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.customtabs.IPostMessageService");
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c7702mb1 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8733pb1)) {
                    c7702mb1 = (InterfaceC8733pb1) queryLocalInterface;
                } else {
                    c7702mb1 = new C7702mb1(readStrongBinder);
                }
            }
            ((BinderC0248Bx2) this).Y0(c7702mb1, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
        } else if (i == 3) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                c7702mb12 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC8733pb1)) {
                    c7702mb12 = (InterfaceC8733pb1) queryLocalInterface2;
                } else {
                    c7702mb12 = new C7702mb1(readStrongBinder2);
                }
            }
            ((BinderC0248Bx2) this).D0(c7702mb12, parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
        } else {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }
}
