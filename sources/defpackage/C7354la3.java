package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: la3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7354la3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 2) {
                resolveAccountRequest = (ResolveAccountRequest) QT2.h(parcel, readInt, ResolveAccountRequest.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new SignInRequest(i, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SignInRequest[i];
    }
}
