package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12251zq0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        DocumentSection[] documentSectionArr = null;
        Account account = null;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                documentSectionArr = (DocumentSection[]) QT2.l(parcel, readInt, DocumentSection.CREATOR);
            } else if (i == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i == 3) {
                z = QT2.q(readInt, parcel);
            } else if (i == 4) {
                account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new DocumentContents(documentSectionArr, str, z, account);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DocumentContents[i];
    }
}
