package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.InstantAppIntentData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: do1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4686do1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Intent intent = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                intent = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
            } else if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new InstantAppIntentData(i, intent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new InstantAppIntentData[i];
    }
}