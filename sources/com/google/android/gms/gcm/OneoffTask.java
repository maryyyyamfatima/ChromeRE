package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C0148Bd2;
import defpackage.C0278Cd2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new C0148Bd2();
    public final long o;
    public final long p;

    public OneoffTask(C0278Cd2 c0278Cd2) {
        super(c0278Cd2);
        this.o = c0278Cd2.j;
        this.p = c0278Cd2.k;
    }

    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.o = parcel.readLong();
        this.p = parcel.readLong();
    }

    @Override // com.google.android.gms.gcm.Task
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("window_start", this.o);
        bundle.putLong("window_end", this.p);
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
    }

    public final String toString() {
        return super.toString() + " windowStart=" + this.o + " windowEnd=" + this.p;
    }
}
