package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C2347Sb2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OfflineSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C2347Sb2();
    public final String a;
    public final String g;
    public final String h;
    public final String i;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.a = str;
        this.g = str2;
        this.h = str4;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.b(a, parcel);
    }
}
