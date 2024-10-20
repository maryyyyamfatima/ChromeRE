package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a53, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3414a53 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                bArr = QT2.b(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new SetUpBiometricAuthenticationKeysResponse(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SetUpBiometricAuthenticationKeysResponse[i];
    }
}
