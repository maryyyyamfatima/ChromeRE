package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.LU0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new LU0();
    public final String a;
    public final String g;
    public final ProxyCard h;
    public final String i;
    public final Address j;
    public final Address k;
    public final String[] l;
    public final UserAddress m;
    public final UserAddress n;
    public final InstrumentInfo[] o;
    public final PaymentMethodToken p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.n(parcel, 4, this.h, i);
        RT2.o(parcel, 5, this.i);
        RT2.n(parcel, 6, this.j, i);
        RT2.n(parcel, 7, this.k, i);
        RT2.p(parcel, 8, this.l);
        RT2.n(parcel, 9, this.m, i);
        RT2.n(parcel, 10, this.n, i);
        RT2.r(parcel, 11, this.o, i);
        RT2.n(parcel, 12, this.p, i);
        RT2.b(a, parcel);
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.a = str;
        this.g = str2;
        this.h = proxyCard;
        this.i = str3;
        this.j = address;
        this.k = address2;
        this.l = strArr;
        this.m = userAddress;
        this.n = userAddress2;
        this.o = instrumentInfoArr;
        this.p = paymentMethodToken;
    }
}
