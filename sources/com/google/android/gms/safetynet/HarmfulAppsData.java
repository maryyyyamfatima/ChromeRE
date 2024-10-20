package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.Y51;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Y51();
    public final String a;
    public final byte[] g;
    public final int h;

    public HarmfulAppsData(int i, byte[] bArr, String str) {
        this.a = str;
        this.g = bArr;
        this.h = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.d(parcel, 3, this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.b(a, parcel);
    }
}
