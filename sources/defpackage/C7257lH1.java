package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7257lH1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i3 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 3) {
                i2 = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LogErrorParcelable(i, i2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LogErrorParcelable[i];
    }
}
