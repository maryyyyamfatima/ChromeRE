package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.ScoringConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gX2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5620gX2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                z = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new ScoringConfig(z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ScoringConfig[i];
    }
}
