package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5361fm0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DiagnosticInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C5361fm0();
    public final int a;
    public final long g;
    public final int h;
    public final Account i;
    public final Account[] j;

    public DiagnosticInfo(int i, long j, int i2, Account account, Account[] accountArr) {
        this.a = i;
        this.g = j;
        this.h = i2;
        this.i = account;
        this.j = accountArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.n(parcel, 5, this.i, i);
        RT2.r(parcel, 6, this.j, i);
        RT2.b(a, parcel);
    }
}
