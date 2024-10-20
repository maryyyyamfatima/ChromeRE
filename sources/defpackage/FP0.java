package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FP0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Flag flag = null;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i == 3) {
                str2 = QT2.i(readInt, parcel);
            } else if (i == 4) {
                flag = (Flag) QT2.h(parcel, readInt, Flag.CREATOR);
            } else if (i == 5) {
                z = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new FlagOverride(str, str2, flag, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FlagOverride[i];
    }
}
