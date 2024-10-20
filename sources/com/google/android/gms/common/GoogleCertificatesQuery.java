package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.AbstractBinderC11635y21;
import defpackage.AbstractBinderC1951Pa1;
import defpackage.BinderC11978z21;
import defpackage.C1821Oa1;
import defpackage.F21;
import defpackage.InterfaceC2081Qa1;
import defpackage.InterfaceC9436re1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new F21();
    public final String a;
    public final AbstractBinderC11635y21 g;
    public final boolean h;
    public final boolean i;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        InterfaceC2081Qa1 c1821Oa1;
        this.a = str;
        BinderC11978z21 binderC11978z21 = null;
        if (iBinder != null) {
            try {
                int i = AbstractBinderC1951Pa1.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof InterfaceC2081Qa1) {
                    c1821Oa1 = (InterfaceC2081Qa1) queryLocalInterface;
                } else {
                    c1821Oa1 = new C1821Oa1(iBinder);
                }
                InterfaceC9436re1 L = c1821Oa1.L();
                byte[] bArr = L == null ? null : (byte[]) ObjectWrapper.h1(L);
                if (bArr != null) {
                    binderC11978z21 = new BinderC11978z21(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.g = binderC11978z21;
        this.h = z;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        AbstractBinderC11635y21 abstractBinderC11635y21 = this.g;
        if (abstractBinderC11635y21 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            asBinder = null;
        } else {
            asBinder = abstractBinderC11635y21.asBinder();
        }
        RT2.g(parcel, 2, asBinder);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.b(a, parcel);
    }

    public GoogleCertificatesQuery(String str, AbstractBinderC11635y21 abstractBinderC11635y21, boolean z, boolean z2) {
        this.a = str;
        this.g = abstractBinderC11635y21;
        this.h = z;
        this.i = z2;
    }
}
