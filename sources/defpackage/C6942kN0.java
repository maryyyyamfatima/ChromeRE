package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.feedback.FileTeleporter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6942kN0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) QT2.h(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (i == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i == 4) {
                str2 = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new FileTeleporter(parcelFileDescriptor, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
