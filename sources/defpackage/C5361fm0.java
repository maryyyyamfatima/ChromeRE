package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5361fm0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        long j = 0;
        Account account = null;
        Account[] accountArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 3) {
                j = QT2.w(readInt, parcel);
            } else if (i3 == 4) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 5) {
                account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
            } else if (i3 == 6) {
                accountArr = (Account[]) QT2.l(parcel, readInt, Account.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new DiagnosticInfo(i, j, i2, account, accountArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DiagnosticInfo[i];
    }
}
