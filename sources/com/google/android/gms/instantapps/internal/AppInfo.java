package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C0035Ah;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AppInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0035Ah();
    public final String a;
    public final String g;
    public final List h;
    public final List i;
    public final int j;
    public final byte[] k;
    public final PackageInfo l;
    public final List m;
    public final byte[] n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.t(parcel, 5, this.h);
        RT2.t(parcel, 6, this.i);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.j);
        RT2.d(parcel, 8, this.k);
        RT2.n(parcel, 9, this.l, i);
        RT2.t(parcel, 11, this.m);
        RT2.d(parcel, 12, this.n);
        RT2.b(a, parcel);
    }

    public AppInfo(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, byte[] bArr, PackageInfo packageInfo, byte[] bArr2) {
        this.a = str;
        this.g = str2;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = i;
        this.k = bArr;
        this.l = packageInfo;
        this.m = arrayList3;
        this.n = bArr2;
    }
}
