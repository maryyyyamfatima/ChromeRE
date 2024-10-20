package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ba2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133Ba2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 3) {
                str2 = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                commonWalletObject = (CommonWalletObject) QT2.h(parcel, readInt, CommonWalletObject.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new OfferWalletObject(i, str, str2, commonWalletObject);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OfferWalletObject[i];
    }
}
