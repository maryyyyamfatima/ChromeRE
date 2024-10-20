package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Da1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0392Da1 extends AbstractBinderC7826mw implements InterfaceC0522Ea1 {
    public AbstractBinderC0392Da1() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                j(readInt);
                return true;
            case 2:
                ApplicationMetadata applicationMetadata = (ApplicationMetadata) AbstractC11786yV.a(parcel, ApplicationMetadata.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                AbstractBinderC7826mw.g1(parcel);
                N(applicationMetadata, readString, readString2, z);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int readInt2 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                A(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                ClassLoader classLoader = AbstractC11786yV.a;
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                k();
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                AbstractBinderC7826mw.g1(parcel);
                A0(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                AbstractBinderC7826mw.g1(parcel);
                c1(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                O0(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                C0(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                T0(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                f0(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                AbstractBinderC7826mw.g1(parcel);
                z0(readLong2);
                return true;
            case 12:
                ApplicationStatus applicationStatus = (ApplicationStatus) AbstractC11786yV.a(parcel, ApplicationStatus.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                y(applicationStatus);
                return true;
            case 13:
                DeviceStatus deviceStatus = (DeviceStatus) AbstractC11786yV.a(parcel, DeviceStatus.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                R(deviceStatus);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                p0(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                d1(readInt8);
                return true;
            default:
                return false;
        }
    }
}
