package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5315fe2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OptInInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C5315fe2();
    public final int a;
    public final String g;
    public final Account[] h;

    public OptInInfo(int i, String str, Account[] accountArr) {
        this.a = i;
        this.g = str;
        this.h = accountArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 3, this.g);
        RT2.r(parcel, 4, this.h, i);
        RT2.b(a, parcel);
    }
}
