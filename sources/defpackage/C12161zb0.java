package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CredentialsData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12161zb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i == 2) {
                str2 = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new CredentialsData(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CredentialsData[i];
    }
}
