package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.KY0;
import defpackage.QP2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GetCorpusStatusCall$Response extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR = new KY0();
    public Status a;
    public final CorpusStatus g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.n(parcel, 2, this.g, i);
        RT2.b(a, parcel);
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }

    public GetCorpusStatusCall$Response() {
    }

    public GetCorpusStatusCall$Response(Status status, CorpusStatus corpusStatus) {
        this.a = status;
        this.g = corpusStatus;
    }
}
