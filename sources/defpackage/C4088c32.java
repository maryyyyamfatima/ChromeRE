package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.NetworkLocationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4088c32 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 1;
        int i2 = 1;
        long j = -1;
        long j2 = -1;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 2) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 3) {
                j = QT2.w(readInt, parcel);
            } else if (i3 == 4) {
                j2 = QT2.w(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new NetworkLocationStatus(i, i2, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NetworkLocationStatus[i];
    }
}
