package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770Nq0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        byte[] bArr = null;
        int i = -1;
        RegisterSectionInfo registerSectionInfo = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 3) {
                registerSectionInfo = (RegisterSectionInfo) QT2.h(parcel, readInt, RegisterSectionInfo.CREATOR);
            } else if (i2 == 4) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 5) {
                bArr = QT2.b(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new DocumentSection(str, registerSectionInfo, i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DocumentSection[i];
    }
}
