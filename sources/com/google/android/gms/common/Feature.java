package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7605mI0;
import defpackage.RT2;
import defpackage.U82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7605mI0();
    public final String a;
    public final int g;
    public final long h;

    public Feature(String str, long j) {
        this.a = str;
        this.h = j;
        this.g = -1;
    }

    public Feature(int i, String str, long j) {
        this.a = str;
        this.g = i;
        this.h = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        long r1 = r1();
        RT2.f(parcel, 3, 8);
        parcel.writeLong(r1);
        RT2.b(a, parcel);
    }

    public final long r1() {
        long j = this.h;
        return j == -1 ? this.g : j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        String str = this.a;
        return ((str != null && str.equals(feature.a)) || (str == null && feature.a == null)) && r1() == feature.r1();
    }

    public final String toString() {
        U82 u82 = new U82(this);
        u82.a(this.a, "name");
        u82.a(Long.valueOf(r1()), "version");
        return u82.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(r1())});
    }
}
