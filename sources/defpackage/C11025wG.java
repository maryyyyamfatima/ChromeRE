package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11025wG implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 2) {
                str2 = QT2.i(readInt, parcel);
            } else if (i2 == 3) {
                str3 = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 5) {
                userAddress = (UserAddress) QT2.h(parcel, readInt, UserAddress.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
