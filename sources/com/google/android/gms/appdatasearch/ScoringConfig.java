package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5620gX2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C5620gX2();
    public final boolean a;

    public ScoringConfig(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScoringConfig) && this.a == ((ScoringConfig) obj).a;
    }
}
