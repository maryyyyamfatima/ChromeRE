package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentDataRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Zm4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Cart cart = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                cart = (Cart) QT2.h(parcel, readInt, Cart.CREATOR);
            } else if (i == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i == 4) {
                str2 = QT2.i(readInt, parcel);
            } else if (i == 5) {
                bundle = QT2.a(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new WebPaymentDataRequest(cart, str, str2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new WebPaymentDataRequest[i];
    }
}
