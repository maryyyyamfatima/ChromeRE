package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C12240zo1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C12240zo1();
    public final String a;
    public final String g;
    public final int h;

    public InstrumentInfo(int i, String str, String str2) {
        this.a = str;
        this.g = str2;
        this.h = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        int i2 = this.h;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i2);
        RT2.b(a, parcel);
    }
}
