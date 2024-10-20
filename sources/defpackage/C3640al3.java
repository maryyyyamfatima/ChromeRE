package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: al3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3640al3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = QT2.u(readInt, parcel);
            } else if (i3 == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) QT2.h(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 == 4) {
                connectionResult = (ConnectionResult) QT2.h(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i3 == 1000) {
                i = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Status[i];
    }
}
