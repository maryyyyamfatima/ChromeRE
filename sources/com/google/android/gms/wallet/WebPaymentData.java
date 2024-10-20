package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.Wm4;
import defpackage.Xm4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WebPaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Xm4();
    public final String a;
    public final Bundle g;

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.g = bundle;
    }

    private WebPaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.c(parcel, 3, this.g);
        RT2.b(a, parcel);
    }

    public static Wm4 r1() {
        return new Wm4(new WebPaymentData());
    }
}
