package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5560gL2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Status status = null;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                status = (Status) QT2.h(parcel, readInt, Status.CREATOR);
            } else if (i == 2) {
                z = QT2.q(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new RegisterCorpusInfoCall$Response(status, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RegisterCorpusInfoCall$Response[i];
    }
}
