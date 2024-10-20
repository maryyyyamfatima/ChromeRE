package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZN2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i == 2) {
                str2 = QT2.i(readInt, parcel);
            } else if (i == 3) {
                j = QT2.w(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new RequestIndexingCall$Request(j, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RequestIndexingCall$Request[i];
    }
}
