package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.Permissions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2167Qr2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String[] strArr4 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                strArr = QT2.j(readInt, parcel);
            } else if (i == 2) {
                strArr2 = QT2.j(readInt, parcel);
            } else if (i == 3) {
                strArr4 = QT2.j(readInt, parcel);
            } else if (i == 4) {
                strArr3 = QT2.j(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Permissions(strArr, strArr2, strArr3, strArr4);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Permissions[i];
    }
}
