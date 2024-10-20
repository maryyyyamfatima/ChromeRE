package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.LaunchOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897Gx1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        boolean z = false;
        String str = null;
        CredentialsData credentialsData = null;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = QT2.q(readInt, parcel);
            } else if (i == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i == 4) {
                z2 = QT2.q(readInt, parcel);
            } else if (i == 5) {
                credentialsData = (CredentialsData) QT2.h(parcel, readInt, CredentialsData.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LaunchOptions(z, str, z2, credentialsData);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LaunchOptions[i];
    }
}
