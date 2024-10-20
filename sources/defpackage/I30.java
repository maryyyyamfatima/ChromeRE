package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I30 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = QT2.a(readInt, parcel);
            } else if (i2 == 2) {
                featureArr = (Feature[]) QT2.l(parcel, readInt, Feature.CREATOR);
            } else if (i2 == 3) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 4) {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) QT2.h(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new ConnectionInfo(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
