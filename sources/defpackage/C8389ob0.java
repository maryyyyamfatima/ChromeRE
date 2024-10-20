package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ob0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8389ob0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                str = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new CredentialManagerAccount(str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CredentialManagerAccount[i];
    }
}
