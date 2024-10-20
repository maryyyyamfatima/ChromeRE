package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.AbstractBinderC8751pe1;
import defpackage.C8408oe1;
import defpackage.D21;
import defpackage.InterfaceC9436re1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new D21();
    public final String a;
    public final boolean g;
    public final boolean h;
    public final Context i;
    public final boolean j;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        InterfaceC9436re1 c8408oe1;
        this.a = str;
        this.g = z;
        this.h = z2;
        String str2 = AbstractBinderC8751pe1.DESCRIPTOR;
        if (iBinder == null) {
            c8408oe1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
            if (queryLocalInterface instanceof InterfaceC9436re1) {
                c8408oe1 = (InterfaceC9436re1) queryLocalInterface;
            } else {
                c8408oe1 = new C8408oe1(iBinder);
            }
        }
        this.i = (Context) ObjectWrapper.h1(c8408oe1);
        this.j = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.g(parcel, 4, new ObjectWrapper(this.i).asBinder());
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.b(a, parcel);
    }
}
