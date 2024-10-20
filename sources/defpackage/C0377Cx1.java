package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377Cx1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Intent intent = null;
        String str = null;
        String str2 = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                intent = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
            } else if (i == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i == 4) {
                str2 = QT2.i(readInt, parcel);
            } else if (i == 5) {
                bitmapTeleporter = (BitmapTeleporter) QT2.h(parcel, readInt, BitmapTeleporter.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LaunchData(intent, str, str2, bitmapTeleporter);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LaunchData[i];
    }
}
