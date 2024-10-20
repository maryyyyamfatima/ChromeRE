package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wQ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11078wQ2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = QT2.u(readInt, parcel);
            } else if (i4 == 2) {
                z = QT2.q(readInt, parcel);
            } else if (i4 == 3) {
                z2 = QT2.q(readInt, parcel);
            } else if (i4 == 4) {
                i2 = QT2.u(readInt, parcel);
            } else if (i4 == 5) {
                i3 = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new RootTelemetryConfiguration(i, i2, i3, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
