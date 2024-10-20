package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractBinderC8204o2;
import defpackage.AbstractC11786yV;
import defpackage.C6664ja1;
import defpackage.InterfaceC7008ka1;
import defpackage.RT2;
import defpackage.TY0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new TY0();
    public static final Scope[] t = new Scope[0];
    public static final Feature[] u = new Feature[0];
    public final int a;
    public final int g;
    public final int h;
    public String i;
    public IBinder j;
    public Scope[] k;
    public Bundle l;
    public Account m;
    public Feature[] n;
    public Feature[] o;
    public final boolean p;
    public final int q;
    public boolean r;
    public final String s;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.o(parcel, 4, this.i);
        RT2.g(parcel, 5, this.j);
        RT2.r(parcel, 6, this.k, i);
        RT2.c(parcel, 7, this.l);
        RT2.n(parcel, 8, this.m, i);
        RT2.r(parcel, 10, this.n, i);
        RT2.r(parcel, 11, this.o, i);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.p ? 1 : 0);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.q);
        boolean z = this.r;
        RT2.f(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        RT2.o(parcel, 15, this.s);
        RT2.b(a, parcel);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        IInterface c6664ja1;
        scopeArr = scopeArr == null ? t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = u;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.a = i;
        this.g = i2;
        this.h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.i = "com.google.android.gms";
        } else {
            this.i = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                int i5 = AbstractBinderC8204o2.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC7008ka1) {
                    c6664ja1 = (InterfaceC7008ka1) queryLocalInterface;
                } else {
                    c6664ja1 = new C6664ja1(iBinder);
                }
                if (c6664ja1 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        C6664ja1 c6664ja12 = (C6664ja1) c6664ja1;
                        Parcel e = c6664ja12.e(2, c6664ja12.a());
                        account2 = (Account) AbstractC11786yV.a(e, Account.CREATOR);
                        e.recycle();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                    this.m = account2;
                }
            }
            account2 = null;
            this.m = account2;
        } else {
            this.j = iBinder;
            this.m = account;
        }
        this.k = scopeArr;
        this.l = bundle;
        this.n = featureArr;
        this.o = featureArr2;
        this.p = z;
        this.q = i4;
        this.r = z2;
        this.s = str2;
    }
}
