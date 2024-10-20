package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C8389ob0;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CredentialManagerAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C8389ob0();
    public final String a;

    public CredentialManagerAccount(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CredentialManagerAccount) {
            return ((CredentialManagerAccount) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
