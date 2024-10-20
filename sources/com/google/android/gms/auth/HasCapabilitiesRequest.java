package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3418a61;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C3418a61();
    public final Account a;
    public final String[] g;
    public Bundle h;

    public HasCapabilitiesRequest(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.g = strArr;
        this.h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.p(parcel, 2, this.g);
        RT2.c(parcel, 3, this.h);
        RT2.b(a, parcel);
    }
}
