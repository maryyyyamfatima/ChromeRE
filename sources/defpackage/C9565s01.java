package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9565s01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int[] iArr = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                iArr = QT2.d(readInt, parcel);
            } else if (i == 2) {
                featureArr = (Feature[]) QT2.l(parcel, readInt, Feature.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GlobalSearchCorpusConfig(iArr, featureArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GlobalSearchCorpusConfig[i];
    }
}
