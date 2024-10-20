package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3947bf2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C3947bf2();
    public final int a;
    public final String g;
    public final Intent h;

    public OverflowMenuItem(int i, Intent intent, String str) {
        this.a = i;
        this.g = str;
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 3, this.g);
        RT2.n(parcel, 4, this.h, i);
        RT2.b(a, parcel);
    }
}
