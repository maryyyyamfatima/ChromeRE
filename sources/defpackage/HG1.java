package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HG1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        WorkSource workSource = new WorkSource();
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        long j6 = -1;
        String str = null;
        ClientIdentity clientIdentity = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = QT2.u(readInt, parcel);
                    break;
                case 2:
                    j = QT2.w(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    j2 = QT2.w(readInt, parcel);
                    break;
                case 4:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    j4 = QT2.w(readInt, parcel);
                    break;
                case 6:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 7:
                    f = QT2.s(readInt, parcel);
                    break;
                case 8:
                    j3 = QT2.w(readInt, parcel);
                    break;
                case 9:
                    z = QT2.q(readInt, parcel);
                    break;
                case 10:
                    j5 = QT2.w(readInt, parcel);
                    break;
                case 11:
                    j6 = QT2.w(readInt, parcel);
                    break;
                case 12:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 13:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 14:
                    str = QT2.i(readInt, parcel);
                    break;
                case 15:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 16:
                    workSource = (WorkSource) QT2.h(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) QT2.h(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new LocationRequest(i, j, j2, j3, j4, j5, i2, f, z, j6, i3, i4, str, z2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
