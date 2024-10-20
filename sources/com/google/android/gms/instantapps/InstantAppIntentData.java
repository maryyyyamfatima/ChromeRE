package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4686do1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstantAppIntentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C4686do1();
    public static final InstantAppIntentData i = new InstantAppIntentData(1, null, null);
    public final Intent a;
    public final int g;
    public final String h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i2);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 3, this.h);
        RT2.b(a, parcel);
    }

    public InstantAppIntentData(int i2, Intent intent, String str) {
        this.a = intent;
        this.g = i2;
        this.h = str;
    }
}
