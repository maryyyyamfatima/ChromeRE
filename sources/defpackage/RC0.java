package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.EqualizerBandSettings;
import com.google.android.gms.cast.EqualizerSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RC0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        EqualizerBandSettings equalizerBandSettings = null;
        EqualizerBandSettings equalizerBandSettings2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                equalizerBandSettings = (EqualizerBandSettings) QT2.h(parcel, readInt, EqualizerBandSettings.CREATOR);
            } else if (i == 3) {
                equalizerBandSettings2 = (EqualizerBandSettings) QT2.h(parcel, readInt, EqualizerBandSettings.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new EqualizerSettings(equalizerBandSettings, equalizerBandSettings2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new EqualizerSettings[i];
    }
}
