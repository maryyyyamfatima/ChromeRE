package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.LogOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11718yH1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i == 3) {
                z = QT2.q(readInt, parcel);
            } else if (i == 4) {
                z2 = QT2.q(readInt, parcel);
            } else if (i == 5) {
                z3 = QT2.q(readInt, parcel);
            } else if (i == 6) {
                z4 = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LogOptions(str, z, z2, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LogOptions[i];
    }
}
