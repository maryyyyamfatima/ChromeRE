package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4909eT;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearCorpusCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4909eT();
    public String a;
    public String g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.b(a, parcel);
    }

    public ClearCorpusCall$Request() {
    }

    public ClearCorpusCall$Request(String str, String str2) {
        this.a = str;
        this.g = str2;
    }
}