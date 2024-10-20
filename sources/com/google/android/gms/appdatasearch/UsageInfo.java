package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.V34;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new V34();
    public final DocumentId a;
    public final long g;
    public final int h;
    public final String i;
    public final DocumentContents j;
    public final boolean k;
    public final int l;
    public final int m;
    public final String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.o(parcel, 4, this.i);
        RT2.n(parcel, 5, this.j, i);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.l);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.m);
        RT2.o(parcel, 9, this.n);
        RT2.b(a, parcel);
    }

    public UsageInfo(DocumentId documentId, long j, int i, DocumentContents documentContents) {
        this(documentId, j, i, "", documentContents, false, -1, 0, null);
    }

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.a = documentId;
        this.g = j;
        this.h = i;
        this.i = str;
        this.j = documentContents;
        this.k = z;
        this.l = i2;
        this.m = i3;
        this.n = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.a, Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.m));
    }
}
