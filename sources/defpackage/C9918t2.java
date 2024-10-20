package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9918t2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 2) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i3 == 4) {
                account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new AccountChangeEventsRequest(i, i2, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
