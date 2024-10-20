package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.BI2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RecognitionScreen extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new BI2();
    public final String a;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.o(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.m ? 1 : 0);
        RT2.b(a, parcel);
    }

    public RecognitionScreen(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z) {
        this.l = "";
        this.a = str;
        this.g = str2;
        this.h = i;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = z;
    }
}
