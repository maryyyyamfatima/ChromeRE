package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C0341Cq0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DocumentId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0341Cq0();
    public final String a;
    public final String g;
    public final String h;

    public DocumentId(String str, String str2, String str3) {
        this.a = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.o(parcel, 3, this.h);
        RT2.b(a, parcel);
    }

    public final String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", this.a, this.g, this.h);
    }
}
