package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.YJ3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new YJ3();
    public int a;
    public final int g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = this.a;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.b(a, parcel);
    }

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.g = i2;
    }

    public ThemeSettings() {
        this(3, 0);
    }
}
