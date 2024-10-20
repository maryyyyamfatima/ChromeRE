package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5216fL2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String[] strArr2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 2) {
                strArr = QT2.j(readInt, parcel);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                str2 = QT2.i(readInt, parcel);
            } else if (i2 == 6) {
                str3 = QT2.i(readInt, parcel);
            } else if (i2 == 7) {
                strArr2 = QT2.j(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new RegisterCorpusIMEInfo(i, strArr, str, str2, strArr2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RegisterCorpusIMEInfo[i];
    }
}
