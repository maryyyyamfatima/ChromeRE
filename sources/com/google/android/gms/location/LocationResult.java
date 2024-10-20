package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.KG1;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List a;
    public static final List g = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new KG1();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.t(parcel, 1, this.a);
        RT2.b(a, parcel);
    }

    public LocationResult(List list) {
        this.a = list;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i = Build.VERSION.SDK_INT;
        List<Location> list = this.a;
        if (i >= 31) {
            return list.equals(locationResult.a);
        }
        if (list.size() != locationResult.a.size()) {
            return false;
        }
        Iterator it = locationResult.a.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !W82.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "LocationResult".concat(String.valueOf(this.a));
    }
}
