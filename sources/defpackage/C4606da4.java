package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.VideoInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: da4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4606da4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i4 == 3) {
                i2 = QT2.u(readInt, parcel);
            } else if (i4 == 4) {
                i3 = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new VideoInfo(i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new VideoInfo[i];
    }
}
