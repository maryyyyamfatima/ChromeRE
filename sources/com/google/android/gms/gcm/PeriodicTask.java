package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C0088Ar2;
import defpackage.C12259zr2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new C12259zr2();
    public final long o;
    public final long p;

    public PeriodicTask(C0088Ar2 c0088Ar2) {
        super(c0088Ar2);
        this.o = -1L;
        this.p = -1L;
        long j = c0088Ar2.j;
        this.o = j;
        this.p = Math.min(c0088Ar2.k, j);
    }

    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.o = -1L;
        this.p = -1L;
        long readLong = parcel.readLong();
        this.o = readLong;
        this.p = Math.min(parcel.readLong(), readLong);
    }

    @Override // com.google.android.gms.gcm.Task
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("period", this.o);
        bundle.putLong("period_flex", this.p);
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
    }

    public final String toString() {
        return super.toString() + " period=" + this.o + " flex=" + this.p;
    }
}
