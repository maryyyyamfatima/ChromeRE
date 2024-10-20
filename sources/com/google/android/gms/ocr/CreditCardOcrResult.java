package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C0656Fb0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CreditCardOcrResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C0656Fb0();
    public final String a;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final int[] q;
    public final int[] r;
    public final String[] s;
    public final String[] t;
    public final int u;
    public final int v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i);
        RT2.o(parcel, 6, this.j);
        RT2.o(parcel, 7, this.k);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        RT2.o(parcel, 9, this.m);
        RT2.o(parcel, 10, this.n);
        RT2.o(parcel, 11, this.o);
        RT2.o(parcel, 12, this.p);
        RT2.h(parcel, 13, this.q);
        RT2.h(parcel, 14, this.r);
        RT2.p(parcel, 15, this.s);
        RT2.p(parcel, 16, this.t);
        RT2.f(parcel, 17, 4);
        parcel.writeInt(this.u);
        RT2.f(parcel, 18, 4);
        parcel.writeInt(this.v);
        RT2.b(a, parcel);
    }

    public CreditCardOcrResult(String str, int i, int i2, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, int[] iArr, int[] iArr2, String[] strArr, String[] strArr2, int i4, int i5) {
        this.a = str;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str2;
        this.k = str3;
        this.l = z;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.r = iArr2;
        this.q = iArr;
        this.s = strArr;
        this.t = strArr2;
        this.u = i4;
        this.v = i5;
    }
}
