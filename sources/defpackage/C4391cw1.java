package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4391cw1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ArrayList arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i == 3) {
                str2 = QT2.i(readInt, parcel);
            } else if (i == 4) {
                arrayList = QT2.m(parcel, readInt, LabelValue.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new LabelValueRow(str, str2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
