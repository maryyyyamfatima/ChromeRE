package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3045Xl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Integer num = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 2) {
                num = QT2.v(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new DeviceVersionEntity(num);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeviceVersionEntity[i];
    }
}
