package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.GenericDimension;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4935eY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 2) {
                i2 = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GenericDimension(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GenericDimension[i];
    }
}