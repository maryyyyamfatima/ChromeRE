package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11450xW1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                z = QT2.q(readInt, parcel);
            } else if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                bundle = QT2.a(readInt, parcel);
            } else if (i2 == 5) {
                bundle2 = QT2.a(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Thing.Metadata(z, i, str, bundle, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Thing.Metadata[i];
    }
}
