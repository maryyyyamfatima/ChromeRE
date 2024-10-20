package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2581Tw1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        float f = -1.0f;
        Integer num = null;
        int i = 1;
        int i2 = 2;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                f = QT2.s(readInt, parcel);
            } else if (i3 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 3) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 4) {
                num = QT2.v(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LanguagePreferenceParams(f, i, i2, num);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LanguagePreferenceParams[i];
    }
}
