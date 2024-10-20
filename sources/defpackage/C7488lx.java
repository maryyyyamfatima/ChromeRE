package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7488lx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                arrayList = QT2.m(parcel, readInt, LogErrorParcelable.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new BatchedLogErrorParcelable(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BatchedLogErrorParcelable[i];
    }
}
