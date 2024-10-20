package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10789vb0;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CredentialManagerInvocationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10789vb0();
    public final CredentialManagerAccount a;
    public final CallerInfo g;

    public CredentialManagerInvocationParams(CredentialManagerAccount credentialManagerAccount, CallerInfo callerInfo) {
        this.a = credentialManagerAccount;
        this.g = callerInfo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CredentialManagerInvocationParams)) {
            return false;
        }
        CredentialManagerInvocationParams credentialManagerInvocationParams = (CredentialManagerInvocationParams) obj;
        CallerInfo callerInfo = credentialManagerInvocationParams.g;
        CallerInfo callerInfo2 = this.g;
        if (!(callerInfo == null && callerInfo2 == null) && (callerInfo == null || !callerInfo.equals(callerInfo2))) {
            return false;
        }
        return credentialManagerInvocationParams.a.equals(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.n(parcel, 2, this.g, i);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g});
    }
}
