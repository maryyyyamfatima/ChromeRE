package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11704yE2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11704yE2();
    public final String a;
    public final String g;
    public final int h;
    public final int i;

    public ProxyCard(int i, String str, int i2, String str2) {
        this.a = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i);
        RT2.b(a, parcel);
    }
}
