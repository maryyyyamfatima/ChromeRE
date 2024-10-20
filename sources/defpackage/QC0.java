package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.EqualizerBandSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QC0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                f = QT2.s(readInt, parcel);
            } else if (i == 3) {
                f2 = QT2.s(readInt, parcel);
            } else if (i == 4) {
                f3 = QT2.s(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new EqualizerBandSettings(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new EqualizerBandSettings[i];
    }
}
