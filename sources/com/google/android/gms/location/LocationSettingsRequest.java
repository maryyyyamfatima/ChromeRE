package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.OG1;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new OG1();
    public final List a;
    public final boolean g;
    public final boolean h;

    public LocationSettingsRequest(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.g = z;
        this.h = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.t(parcel, 1, Collections.unmodifiableList(this.a));
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.b(a, parcel);
    }
}
