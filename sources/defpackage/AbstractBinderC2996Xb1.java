package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2996Xb1 extends AbstractBinderC7826mw implements InterfaceC3126Yb1 {
    public AbstractBinderC2996Xb1() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static InterfaceC3126Yb1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof InterfaceC3126Yb1) {
            return (InterfaceC3126Yb1) queryLocalInterface;
        }
        return new C2866Wb1(iBinder);
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC9436re1 c8408oe1;
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                ClassLoader classLoader = AbstractC11786yV.a;
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                boolean booleanFlagValue = getBooleanFlagValue(readString, z, readInt);
                parcel2.writeNoException();
                parcel2.writeInt(booleanFlagValue ? 1 : 0);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                int intFlagValue = getIntFlagValue(readString2, readInt2, readInt3);
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
            } else if (i == 4) {
                String readString3 = parcel.readString();
                long readLong = parcel.readLong();
                int readInt4 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                long longFlagValue = getLongFlagValue(readString3, readLong, readInt4);
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
            } else {
                if (i != 5) {
                    return false;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt5 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                String stringFlagValue = getStringFlagValue(readString4, readString5, readInt5);
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
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
            AbstractBinderC7826mw.g1(parcel);
            init(c8408oe1);
            parcel2.writeNoException();
        }
        return true;
    }
}
