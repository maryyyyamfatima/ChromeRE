package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.credential.manager.invocationparams.IssueType;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ss1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9863ss1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                i = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new IssueType(i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new IssueType[i];
    }
}
