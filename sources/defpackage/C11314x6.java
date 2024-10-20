package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11314x6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                j = QT2.w(readInt, parcel);
            } else if (i == 3) {
                j2 = QT2.w(readInt, parcel);
            } else if (i == 4) {
                str = QT2.i(readInt, parcel);
            } else if (i == 5) {
                str2 = QT2.i(readInt, parcel);
            } else if (i == 6) {
                j3 = QT2.w(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new AdBreakStatus(j, j2, str, str2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AdBreakStatus[i];
    }
}
