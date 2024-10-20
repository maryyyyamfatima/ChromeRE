package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractBinderC10116td1;
import defpackage.AbstractBinderC3584ac1;
import defpackage.AbstractBinderC9088qd1;
import defpackage.AbstractC2444Sv;
import defpackage.C3256Zb1;
import defpackage.C8745pd1;
import defpackage.C9773sd1;
import defpackage.InterfaceC10459ud1;
import defpackage.InterfaceC3928bc1;
import defpackage.InterfaceC9430rd1;
import defpackage.JG1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new JG1();
    public final int a;
    public final LocationRequestInternal g;
    public final InterfaceC10459ud1 h;
    public final InterfaceC9430rd1 i;
    public final PendingIntent j;
    public final InterfaceC3928bc1 k;
    public final String l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.n(parcel, 2, this.g, i);
        IInterface iInterface = this.h;
        RT2.g(parcel, 3, iInterface == null ? null : ((AbstractC2444Sv) iInterface).a);
        RT2.n(parcel, 4, this.j, i);
        InterfaceC9430rd1 interfaceC9430rd1 = this.i;
        RT2.g(parcel, 5, interfaceC9430rd1 == null ? null : interfaceC9430rd1.asBinder());
        InterfaceC3928bc1 interfaceC3928bc1 = this.k;
        RT2.g(parcel, 6, interfaceC3928bc1 != null ? interfaceC3928bc1.asBinder() : null);
        RT2.o(parcel, 8, this.l);
        RT2.b(a, parcel);
    }

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        InterfaceC10459ud1 interfaceC10459ud1;
        InterfaceC9430rd1 interfaceC9430rd1;
        this.a = i;
        this.g = locationRequestInternal;
        InterfaceC3928bc1 interfaceC3928bc1 = null;
        if (iBinder != null) {
            int i2 = AbstractBinderC10116td1.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof InterfaceC10459ud1) {
                interfaceC10459ud1 = (InterfaceC10459ud1) queryLocalInterface;
            } else {
                interfaceC10459ud1 = new C9773sd1(iBinder);
            }
        } else {
            interfaceC10459ud1 = null;
        }
        this.h = interfaceC10459ud1;
        this.j = pendingIntent;
        if (iBinder2 != null) {
            int i3 = AbstractBinderC9088qd1.a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof InterfaceC9430rd1) {
                interfaceC9430rd1 = (InterfaceC9430rd1) queryLocalInterface2;
            } else {
                interfaceC9430rd1 = new C8745pd1(iBinder2);
            }
        } else {
            interfaceC9430rd1 = null;
        }
        this.i = interfaceC9430rd1;
        if (iBinder3 != null) {
            int i4 = AbstractBinderC3584ac1.a;
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof InterfaceC3928bc1) {
                interfaceC3928bc1 = (InterfaceC3928bc1) queryLocalInterface3;
            } else {
                interfaceC3928bc1 = new C3256Zb1(iBinder3);
            }
        }
        this.k = interfaceC3928bc1;
        this.l = str;
    }
}
