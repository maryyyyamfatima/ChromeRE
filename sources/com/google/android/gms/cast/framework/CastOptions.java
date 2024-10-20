package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.DH;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CastOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new DH();
    public String a;
    public final ArrayList g;
    public final boolean h;
    public final LaunchOptions i;
    public final boolean j;
    public final boolean k;
    public final double l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final List p;
    public final boolean q;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.q(parcel, 3, Collections.unmodifiableList(this.g));
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.n(parcel, 5, this.i, i);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.f(parcel, 9, 8);
        parcel.writeDouble(this.l);
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.m ? 1 : 0);
        RT2.f(parcel, 11, 4);
        parcel.writeInt(this.n ? 1 : 0);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.o ? 1 : 0);
        RT2.q(parcel, 13, Collections.unmodifiableList(this.p));
        RT2.f(parcel, 14, 4);
        parcel.writeInt(this.q ? 1 : 0);
        RT2.b(a, parcel);
    }

    public CastOptions(String str, ArrayList arrayList, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7) {
        this.a = TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.g = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.h = z;
        this.i = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.j = z2;
        this.k = z3;
        this.l = d;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = arrayList2;
        this.q = z7;
    }
}
