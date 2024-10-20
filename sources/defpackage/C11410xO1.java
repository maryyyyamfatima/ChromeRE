package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11410xO1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d = 0.0d;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                arrayList = QT2.m(parcel, readInt, MediaMetadata.CREATOR);
            } else if (i2 == 5) {
                arrayList2 = QT2.m(parcel, readInt, WebImage.CREATOR);
            } else if (i2 == 6) {
                d = QT2.r(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new MediaQueueContainerMetadata(i, str, arrayList, arrayList2, d);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }
}
