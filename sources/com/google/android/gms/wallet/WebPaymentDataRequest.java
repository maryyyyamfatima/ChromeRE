package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.Ym4;
import defpackage.Zm4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Zm4();
    public Cart a;
    public String g;
    public String h;
    public final Bundle i;

    public WebPaymentDataRequest(Cart cart, String str, String str2, Bundle bundle) {
        this.a = cart;
        this.g = str;
        this.h = str2;
        this.i = bundle;
    }

    private WebPaymentDataRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.c(parcel, 5, this.i);
        RT2.b(a, parcel);
    }

    public static Ym4 r1() {
        return new Ym4(new WebPaymentDataRequest());
    }
}
