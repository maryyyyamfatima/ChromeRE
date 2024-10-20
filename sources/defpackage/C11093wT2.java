package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wT2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11093wT2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i == 3) {
                dataHolder = (DataHolder) QT2.h(parcel, readInt, DataHolder.CREATOR);
            } else if (i == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) QT2.h(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (i == 5) {
                j = QT2.w(readInt, parcel);
            } else if (i == 6) {
                bArr = QT2.b(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
