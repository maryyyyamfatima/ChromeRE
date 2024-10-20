package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11314x6;
import defpackage.C4856eI1;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public final long a;
    public final long g;
    public final String h;
    public final String i;
    public final long j;
    public static final C4856eI1 k = new C4856eI1("AdBreakStatus");
    public static final Parcelable.Creator CREATOR = new C11314x6();

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.g = j2;
        this.h = str;
        this.i = str2;
        this.j = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.a);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.f(parcel, 6, 8);
        parcel.writeLong(this.j);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.g), this.h, this.i, Long.valueOf(this.j)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.a == adBreakStatus.a && this.g == adBreakStatus.g && WH.a(this.h, adBreakStatus.h) && WH.a(this.i, adBreakStatus.i) && this.j == adBreakStatus.j;
    }
}
