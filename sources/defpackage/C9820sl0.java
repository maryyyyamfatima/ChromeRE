package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9820sl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Status status = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                status = (Status) QT2.h(parcel, readInt, Status.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new DeleteUsageReportCall$Response(status);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeleteUsageReportCall$Response[i];
    }
}
