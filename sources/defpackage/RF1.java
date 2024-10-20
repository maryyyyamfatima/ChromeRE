package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RF1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        NetworkLocationStatus[] networkLocationStatusArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 2:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    j = QT2.w(readInt, parcel);
                    break;
                case 4:
                    i = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    networkLocationStatusArr = (NetworkLocationStatus[]) QT2.l(parcel, readInt, NetworkLocationStatus.CREATOR);
                    break;
                case 6:
                    QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new LocationAvailability(i, i2, i3, j, networkLocationStatusArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
