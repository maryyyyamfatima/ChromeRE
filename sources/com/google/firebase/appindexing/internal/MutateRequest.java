package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.I02;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MutateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new I02();
    public final int a;
    public final Thing[] g;
    public final String[] h;
    public final String[] i;
    public final ActionImpl j;
    public final String k;
    public final String l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.r(parcel, 2, this.g, i);
        RT2.p(parcel, 3, this.h);
        RT2.p(parcel, 5, this.i);
        RT2.n(parcel, 6, this.j, i);
        RT2.o(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.b(a, parcel);
    }

    public MutateRequest(int i, Thing[] thingArr, String[] strArr, String[] strArr2, ActionImpl actionImpl, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.g = thingArr;
        this.h = strArr;
        this.i = strArr2;
        this.j = actionImpl;
        this.k = str;
        this.l = str2;
    }
}
