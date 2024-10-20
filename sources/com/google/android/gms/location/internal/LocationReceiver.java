package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.FG1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new FG1();
    public final int a;
    public final IBinder g;
    public final IBinder h;
    public final PendingIntent i;
    public final String j;
    public final String k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.g(parcel, 2, this.g);
        RT2.g(parcel, 3, this.h);
        RT2.n(parcel, 4, this.i, i);
        RT2.o(parcel, 5, this.j);
        RT2.o(parcel, 6, this.k);
        RT2.b(a, parcel);
    }

    public LocationReceiver(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.a = i;
        this.g = iBinder;
        this.h = iBinder2;
        this.i = pendingIntent;
        this.j = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.k = str2;
    }
}
