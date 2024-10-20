package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IG1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                locationRequest = (LocationRequest) QT2.h(parcel, readInt, LocationRequest.CREATOR);
            } else if (i == 5) {
                arrayList = QT2.m(parcel, readInt, ClientIdentity.CREATOR);
            } else {
                switch (i) {
                    case 8:
                        z = QT2.q(readInt, parcel);
                        break;
                    case 9:
                        z2 = QT2.q(readInt, parcel);
                        break;
                    case 10:
                        str = QT2.i(readInt, parcel);
                        break;
                    case 11:
                        z3 = QT2.q(readInt, parcel);
                        break;
                    case 12:
                        z4 = QT2.q(readInt, parcel);
                        break;
                    case 13:
                        str2 = QT2.i(readInt, parcel);
                        break;
                    case 14:
                        j = QT2.w(readInt, parcel);
                        break;
                    default:
                        QT2.z(readInt, parcel);
                        break;
                }
            }
        }
        QT2.o(A, parcel);
        return new LocationRequestInternal(locationRequest, arrayList, z, z2, str, z3, z4, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
