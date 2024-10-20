package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.languageprofile.LanguagePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2451Sw1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i == 2) {
                f = QT2.s(readInt, parcel);
            } else if (i == 3) {
                f2 = QT2.s(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LanguagePreference(str, f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LanguagePreference[i];
    }
}
