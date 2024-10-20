package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7116ks1;
import defpackage.RT2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7116ks1();
    public final ArrayList a;
    public String g;
    public String h;
    public final ArrayList i;
    public final boolean j;
    public final String k;

    public IsReadyToPayRequest() {
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.a = arrayList;
        this.g = str;
        this.h = str2;
        this.i = arrayList2;
        this.j = z;
        this.k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.i(parcel, 2, this.a);
        RT2.o(parcel, 4, this.g);
        RT2.o(parcel, 5, this.h);
        RT2.i(parcel, 6, this.i);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.o(parcel, 8, this.k);
        RT2.b(a, parcel);
    }
}
