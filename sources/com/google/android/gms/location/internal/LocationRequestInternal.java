package com.google.android.gms.location.internal;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.GG1;
import defpackage.IG1;
import defpackage.Kq4;
import defpackage.RT2;
import defpackage.W82;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new IG1();
    public final LocationRequest a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.b(a, parcel);
    }

    public LocationRequestInternal(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, long j) {
        WorkSource workSource;
        GG1 gg1 = new GG1(locationRequest);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    Kq4.a(workSource, clientIdentity.a, clientIdentity.g);
                }
            }
            gg1.n = workSource;
        }
        if (z) {
            gg1.j = 1;
        }
        if (z2) {
            gg1.k = 2;
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT < 30) {
                gg1.l = str;
            }
        } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
            gg1.l = str2;
        }
        if (z3) {
            gg1.m = true;
        }
        if (z4) {
            gg1.h = true;
        }
        if (j != Long.MAX_VALUE) {
            gg1.i = j;
        }
        this.a = gg1.a();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return W82.a(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
