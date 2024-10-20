package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7826mw extends Binder implements IInterface {
    public static SU3 globalInterceptor;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean f1(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public AbstractBinderC7826mw(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return f1(i, parcel, parcel2);
    }

    public static void g1(Parcel parcel) {
        ClassLoader classLoader = AbstractC11786yV.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AbstractC9076qb1.a("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
