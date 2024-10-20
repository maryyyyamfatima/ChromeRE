package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.HasCapabilitiesRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3418a61 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Account account = null;
        String[] strArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
            } else if (i == 2) {
                strArr = QT2.j(readInt, parcel);
            } else if (i == 3) {
                bundle = QT2.a(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new HasCapabilitiesRequest(account, strArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new HasCapabilitiesRequest[i];
    }
}
