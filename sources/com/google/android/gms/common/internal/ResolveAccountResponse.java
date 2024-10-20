package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractBinderC8204o2;
import defpackage.C6664ja1;
import defpackage.DO2;
import defpackage.InterfaceC7008ka1;
import defpackage.RT2;
import defpackage.W82;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new DO2();
    public final int a;
    public final IBinder g;
    public final ConnectionResult h;
    public final boolean i;
    public final boolean j;

    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.g = iBinder;
        this.h = connectionResult;
        this.i = z;
        this.j = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.g(parcel, 2, this.g);
        RT2.n(parcel, 3, this.h, i);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.b(a, parcel);
    }

    public final InterfaceC7008ka1 r1() {
        IBinder iBinder = this.g;
        if (iBinder == null) {
            return null;
        }
        int i = AbstractBinderC8204o2.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof InterfaceC7008ka1) {
            return (InterfaceC7008ka1) queryLocalInterface;
        }
        return new C6664ja1(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.h.equals(resolveAccountResponse.h) && W82.a(r1(), resolveAccountResponse.r1());
    }
}
