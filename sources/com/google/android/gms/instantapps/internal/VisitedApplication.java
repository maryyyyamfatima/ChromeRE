package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.Df4;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VisitedApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Df4();
    public final BitmapTeleporter a;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ArrayList k;
    public final ContentRating l;

    public VisitedApplication(BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, ArrayList arrayList, ContentRating contentRating) {
        this.a = bitmapTeleporter;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? 0 : arrayList.size());
        this.k = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.l = contentRating;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.q(parcel, 7, Collections.unmodifiableList(this.k));
        RT2.n(parcel, 8, this.l, i);
        RT2.b(a, parcel);
    }
}
