package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11718yH1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11718yH1();
    public final String a;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.b(a, parcel);
    }
}
