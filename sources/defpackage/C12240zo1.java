package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.InstrumentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12240zo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 3) {
                str2 = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                i = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new InstrumentInfo(i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new InstrumentInfo[i];
    }
}
