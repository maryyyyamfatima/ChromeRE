package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.GY0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GetClientTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new GY0();
    public final byte[] a;

    public GetClientTokenResponse(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.d(parcel, 2, this.a);
        RT2.b(a, parcel);
    }
}