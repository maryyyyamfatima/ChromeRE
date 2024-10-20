package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7230lC implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i5 = 65535 & readInt;
            if (i5 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i5 == 3) {
                i2 = QT2.u(readInt, parcel);
            } else if (i5 == 4) {
                i3 = QT2.u(readInt, parcel);
            } else if (i5 == 5) {
                i4 = QT2.u(readInt, parcel);
            } else if (i5 == 6) {
                f = QT2.s(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new BoundingBoxParcel(i, i2, i3, i4, f);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BoundingBoxParcel[i];
    }
}
