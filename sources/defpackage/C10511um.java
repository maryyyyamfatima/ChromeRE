package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10511um implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 2) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 3) {
                intent = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new AuthAccountResult(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AuthAccountResult[i];
    }
}
