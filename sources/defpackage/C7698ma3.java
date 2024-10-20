package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ma3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7698ma3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 2) {
                connectionResult = (ConnectionResult) QT2.h(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 == 3) {
                resolveAccountResponse = (ResolveAccountResponse) QT2.h(parcel, readInt, ResolveAccountResponse.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new SignInResponse(i, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SignInResponse[i];
    }
}
