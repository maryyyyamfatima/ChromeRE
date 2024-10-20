package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i4 == 2) {
                i2 = QT2.u(readInt, parcel);
            } else if (i4 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i4 == 4) {
                i3 = QT2.u(readInt, parcel);
            } else if (i4 == 5) {
                bArr = QT2.b(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GetParentVerificationIntentRequest(i, i2, str, i3, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GetParentVerificationIntentRequest[i];
    }
}
