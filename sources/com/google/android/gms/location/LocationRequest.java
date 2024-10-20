package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.HG1;
import defpackage.RT2;
import defpackage.UM3;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new HG1();
    public int a;
    public long g;
    public long h;
    public final long i;
    public final long j;
    public final int k;
    public final float l;
    public final boolean m;
    public long n;
    public final int o;
    public final int p;
    public final String q;
    public final boolean r;
    public final WorkSource s;
    public final ClientIdentity t;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = this.a;
        RT2.f(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.g;
        RT2.f(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.h;
        RT2.f(parcel, 3, 8);
        parcel.writeLong(j2);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.k);
        RT2.f(parcel, 7, 4);
        parcel.writeFloat(this.l);
        RT2.f(parcel, 8, 8);
        parcel.writeLong(this.i);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.m ? 1 : 0);
        RT2.f(parcel, 10, 8);
        parcel.writeLong(this.j);
        long j3 = this.n;
        RT2.f(parcel, 11, 8);
        parcel.writeLong(j3);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.o);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.p);
        RT2.o(parcel, 14, this.q);
        RT2.f(parcel, 15, 4);
        parcel.writeInt(this.r ? 1 : 0);
        RT2.n(parcel, 16, this.s, i);
        RT2.n(parcel, 17, this.t, i);
        RT2.b(a, parcel);
    }

    public static String r1(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = UM3.a;
        synchronized (sb2) {
            sb2.setLength(0);
            UM3.a(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        long j7 = j;
        this.g = j7;
        this.h = j2;
        this.i = j3;
        this.j = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.k = i2;
        this.l = f;
        this.m = z;
        this.n = j6 != -1 ? j6 : j7;
        this.o = i3;
        this.p = i4;
        this.q = str;
        this.r = z2;
        this.s = workSource;
        this.t = clientIdentity;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    public final boolean s1() {
        long j = this.i;
        return j > 0 && j / 2 >= this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.g), Long.valueOf(this.h), this.s});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = this.a;
        if (i != locationRequest.a) {
            return false;
        }
        if (((i == 105) || this.g == locationRequest.g) && this.h == locationRequest.h && s1() == locationRequest.s1()) {
            return (!s1() || this.i == locationRequest.i) && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m == locationRequest.m && this.o == locationRequest.o && this.p == locationRequest.p && this.r == locationRequest.r && this.s.equals(locationRequest.s) && W82.a(this.q, locationRequest.q) && W82.a(this.t, locationRequest.t);
        }
        return false;
    }
}
