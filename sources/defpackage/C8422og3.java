package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.SourceStatsEntity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: og3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8422og3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i == 3) {
                num = QT2.v(readInt, parcel);
            } else if (i == 4) {
                num2 = QT2.v(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new SourceStatsEntity(str, num, num2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SourceStatsEntity[i];
    }
}
