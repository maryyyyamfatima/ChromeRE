package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.callback.PaymentAuthorizationResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: po2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8812po2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i == 2) {
                bundle = QT2.a(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new PaymentAuthorizationResult(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PaymentAuthorizationResult[i];
    }
}
