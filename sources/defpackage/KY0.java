package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Status status = null;
        CorpusStatus corpusStatus = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                status = (Status) QT2.h(parcel, readInt, Status.CREATOR);
            } else if (i == 2) {
                corpusStatus = (CorpusStatus) QT2.h(parcel, readInt, CorpusStatus.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GetCorpusStatusCall$Response(status, corpusStatus);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GetCorpusStatusCall$Response[i];
    }
}
