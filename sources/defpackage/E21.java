package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E21 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                z = QT2.q(readInt, parcel);
            } else if (i3 == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i3 == 3) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 4) {
                i = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GoogleCertificatesLookupResponse(str, z, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GoogleCertificatesLookupResponse[i];
    }
}
