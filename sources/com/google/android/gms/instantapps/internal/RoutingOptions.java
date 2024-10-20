package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C9368rR2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RoutingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C9368rR2();
    public final boolean a;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public RoutingOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str) {
        this.a = z;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
    }

    public RoutingOptions() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        RT2.o(parcel, 2, this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.l ? 1 : 0);
        RT2.b(a, parcel);
    }
}
