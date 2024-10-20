package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RM2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RemoveHarmfulAppData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new RM2();
    public final int a;
    public final boolean g;

    public RemoveHarmfulAppData(int i, boolean z) {
        this.a = i;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.b(a, parcel);
    }
}
