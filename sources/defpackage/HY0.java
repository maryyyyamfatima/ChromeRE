package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Status status = null;
        RegisterCorpusInfo registerCorpusInfo = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                status = (Status) QT2.h(parcel, readInt, Status.CREATOR);
            } else if (i == 2) {
                registerCorpusInfo = (RegisterCorpusInfo) QT2.h(parcel, readInt, RegisterCorpusInfo.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GetCorpusInfoCall$Response(status, registerCorpusInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GetCorpusInfoCall$Response[i];
    }
}