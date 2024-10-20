package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chromesync.firstparty.ListOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8612pD1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Long l = null;
        Long l2 = null;
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
            } else if (i3 == 4) {
                l = QT2.x(readInt, parcel);
            } else if (i3 == 5) {
                l2 = QT2.x(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new ListOptions(str, i, i2, l, l2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ListOptions[i];
    }
}
