package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RM2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                z = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new RemoveHarmfulAppData(i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RemoveHarmfulAppData[i];
    }
}
