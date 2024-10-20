package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.LG0;
import defpackage.RT2;
import defpackage.V82;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FRDProductSpecificDataEntry extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new LG0();
    public final int a;
    public final int g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final byte[][] l;
    public final Boolean m;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.q(parcel, 4, this.h);
        RT2.l(parcel, 5, this.i);
        RT2.q(parcel, 6, this.j);
        RT2.l(parcel, 7, this.k);
        RT2.e(parcel, 8, this.l);
        Boolean bool = this.m;
        if (bool != null) {
            RT2.f(parcel, 9, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        RT2.b(a, parcel);
    }

    public FRDProductSpecificDataEntry(int i, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, byte[][] bArr, boolean z) {
        this.a = i;
        this.g = i2;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = arrayList4;
        this.l = bArr;
        this.m = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.g == fRDProductSpecificDataEntry.g && V82.a(this.h, fRDProductSpecificDataEntry.h) && V82.a(this.i, fRDProductSpecificDataEntry.i) && V82.a(this.j, fRDProductSpecificDataEntry.j) && V82.a(this.k, fRDProductSpecificDataEntry.k) && Arrays.equals(this.l, fRDProductSpecificDataEntry.l) && V82.a(this.m, fRDProductSpecificDataEntry.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.g), this.h, this.i, this.j, this.k, Integer.valueOf(Arrays.deepHashCode(this.l)), this.m});
    }
}
