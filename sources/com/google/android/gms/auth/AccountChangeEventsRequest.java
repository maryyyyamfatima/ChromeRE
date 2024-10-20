package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C9918t2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C9918t2();
    public final int a;
    public int g;
    public String h;
    public final Account i;

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.a = i;
        this.g = i2;
        this.h = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.i = new Account(str, "com.google");
        } else {
            this.i = account;
        }
    }

    public AccountChangeEventsRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        int i2 = this.g;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        RT2.o(parcel, 3, this.h);
        RT2.n(parcel, 4, this.i, i);
        RT2.b(a, parcel);
    }
}
