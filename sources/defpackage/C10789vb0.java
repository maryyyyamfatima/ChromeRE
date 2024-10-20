package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10789vb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        CredentialManagerAccount credentialManagerAccount = null;
        CallerInfo callerInfo = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                credentialManagerAccount = (CredentialManagerAccount) QT2.h(parcel, readInt, CredentialManagerAccount.CREATOR);
            } else if (i == 2) {
                callerInfo = (CallerInfo) QT2.h(parcel, readInt, CallerInfo.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new CredentialManagerInvocationParams(credentialManagerAccount, callerInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CredentialManagerInvocationParams[i];
    }
}
