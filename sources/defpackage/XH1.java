package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XH1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                z = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LogVerifierResultParcelable(z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LogVerifierResultParcelable[i];
    }
}
