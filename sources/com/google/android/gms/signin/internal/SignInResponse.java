package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7698ma3;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7698ma3();
    public final int a;
    public final ConnectionResult g;
    public final ResolveAccountResponse h;

    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.a = i;
        this.g = connectionResult;
        this.h = resolveAccountResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.n(parcel, 2, this.g, i);
        RT2.n(parcel, 3, this.h, i);
        RT2.b(a, parcel);
    }
}
