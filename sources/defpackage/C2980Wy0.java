package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2980Wy0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                str2 = QT2.i(readInt, parcel);
            } else if (i2 == 5) {
                str3 = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Barcode.Email(str, i, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Barcode.Email[i];
    }
}
