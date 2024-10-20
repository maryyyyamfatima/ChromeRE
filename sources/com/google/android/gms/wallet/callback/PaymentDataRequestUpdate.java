package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10526uo2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PaymentDataRequestUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10526uo2();
    public final String a;
    public final Bundle g;

    public PaymentDataRequestUpdate(String str, Bundle bundle) {
        this.a = str;
        this.g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.c(parcel, 2, this.g);
        RT2.b(a, parcel);
    }
}
