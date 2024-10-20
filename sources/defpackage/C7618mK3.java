package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mK3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7618mK3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        Bundle bundle = null;
        Thing.Metadata metadata = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = QT2.a(readInt, parcel);
            } else if (i2 == 2) {
                metadata = (Thing.Metadata) QT2.h(parcel, readInt, Thing.Metadata.CREATOR);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                str2 = QT2.i(readInt, parcel);
            } else if (i2 == 1000) {
                i = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new Thing(i, bundle, metadata, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Thing[i];
    }
}
