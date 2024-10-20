package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F21 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i == 2) {
                iBinder = QT2.t(readInt, parcel);
            } else if (i == 3) {
                z = QT2.q(readInt, parcel);
            } else if (i == 4) {
                z2 = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GoogleCertificatesQuery(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GoogleCertificatesQuery[i];
    }
}
