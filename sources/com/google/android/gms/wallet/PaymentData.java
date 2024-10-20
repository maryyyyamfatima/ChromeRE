package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.C10183to2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10183to2();
    public final String a;
    public final CardInfo g;
    public final UserAddress h;
    public final PaymentMethodToken i;
    public final String j;
    public final Bundle k;
    public final String l;
    public final Bundle m;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.n(parcel, 2, this.g, i);
        RT2.n(parcel, 3, this.h, i);
        RT2.n(parcel, 4, this.i, i);
        RT2.o(parcel, 5, this.j);
        RT2.c(parcel, 6, this.k);
        RT2.o(parcel, 7, this.l);
        RT2.c(parcel, 8, this.m);
        RT2.b(a, parcel);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.g = cardInfo;
        this.h = userAddress;
        this.i = paymentMethodToken;
        this.j = str2;
        this.k = bundle;
        this.l = str3;
        this.m = bundle2;
    }
}
