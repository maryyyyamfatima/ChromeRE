package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.G01;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new G01();
    public final int a;
    public final boolean g;
    public final PendingIntent h;
    public final boolean i;
    public final long j;
    public final byte[] k;

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j, byte[] bArr) {
        this.a = i;
        this.g = z;
        this.h = pendingIntent;
        this.i = z2;
        this.j = j;
        this.k = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.n(parcel, 3, this.h, i);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.f(parcel, 5, 8);
        parcel.writeLong(this.j);
        RT2.d(parcel, 6, this.k);
        RT2.b(a, parcel);
    }
}
