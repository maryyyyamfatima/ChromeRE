package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3640al3;
import defpackage.CY;
import defpackage.QP2;
import defpackage.RT2;
import defpackage.U82;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements QP2, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final Status n;
    public static final Status o;
    public final int a;
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final ConnectionResult j;

    @Override // defpackage.QP2
    public final Status S0() {
        return this;
    }

    static {
        new Status(-1, null);
        k = new Status(0, null);
        l = new Status(14, null);
        m = new Status(8, null);
        n = new Status(15, null);
        o = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new C3640al3();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 2, this.h);
        RT2.n(parcel, 3, this.i, i);
        RT2.n(parcel, 4, this.j, i);
        RT2.f(parcel, 1000, 4);
        parcel.writeInt(this.a);
        RT2.b(a, parcel);
    }

    public final String toString() {
        U82 u82 = new U82(this);
        String str = this.h;
        if (str == null) {
            str = CY.a(this.g);
        }
        u82.a(str, "statusCode");
        u82.a(this.i, "resolution");
        return u82.toString();
    }

    public Status(int i, String str, int i2) {
        this(1, i, str, null, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i;
        this.g = i2;
        this.h = str;
        this.i = pendingIntent;
        this.j = connectionResult;
    }

    public Status(int i, String str) {
        this(i, str, 0);
    }

    public final boolean r1() {
        return this.g <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && this.g == status.g && W82.a(this.h, status.h) && W82.a(this.i, status.i) && W82.a(this.j, status.j);
    }
}
