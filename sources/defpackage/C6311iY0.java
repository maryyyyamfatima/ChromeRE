package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6311iY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                d = QT2.r(readInt, parcel);
            } else if (i == 3) {
                d2 = QT2.r(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Barcode.GeoPoint(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Barcode.GeoPoint[i];
    }
}
