package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0937Hf1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC0937Hf1() {
        attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return true;
        }
        if (i == 2) {
            ((BinderC7344lY3) this).a.a(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
