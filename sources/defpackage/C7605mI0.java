package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7605mI0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                j = QT2.w(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Feature(i, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Feature[i];
    }
}
