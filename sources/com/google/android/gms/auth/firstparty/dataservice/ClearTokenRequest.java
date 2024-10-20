package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10061tT;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10061tT();
    public final int a;
    public String g;

    public ClearTokenRequest() {
        this.a = 1;
    }

    public ClearTokenRequest(int i, String str) {
        this.a = i;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 2, this.g);
        RT2.b(a, parcel);
    }
}
