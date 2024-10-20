package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6452iw1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 2) {
                f = QT2.s(readInt, parcel);
            } else if (i3 == 3) {
                f2 = QT2.s(readInt, parcel);
            } else if (i3 == 4) {
                i2 = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LandmarkParcel(f, i, f2, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LandmarkParcel[i];
    }
}
