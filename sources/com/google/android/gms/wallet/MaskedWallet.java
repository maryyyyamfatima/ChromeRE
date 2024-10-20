package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.C5908hM1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C5908hM1();
    public final String a;
    public final String g;
    public final String[] h;
    public final String i;
    public final Address j;
    public final Address k;
    public final LoyaltyWalletObject[] l;
    public final OfferWalletObject[] m;
    public final UserAddress n;
    public final UserAddress o;
    public final InstrumentInfo[] p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.p(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.n(parcel, 6, this.j, i);
        RT2.n(parcel, 7, this.k, i);
        RT2.r(parcel, 8, this.l, i);
        RT2.r(parcel, 9, this.m, i);
        RT2.n(parcel, 10, this.n, i);
        RT2.n(parcel, 11, this.o, i);
        RT2.r(parcel, 12, this.p, i);
        RT2.b(a, parcel);
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.a = str;
        this.g = str2;
        this.h = strArr;
        this.i = str3;
        this.j = address;
        this.k = address2;
        this.l = loyaltyWalletObjectArr;
        this.m = offerWalletObjectArr;
        this.n = userAddress;
        this.o = userAddress2;
        this.p = instrumentInfoArr;
    }
}
