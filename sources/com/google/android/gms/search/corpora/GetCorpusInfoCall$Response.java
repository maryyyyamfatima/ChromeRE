package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.HY0;
import defpackage.QP2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GetCorpusInfoCall$Response extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR = new HY0();
    public final Status a;
    public final RegisterCorpusInfo g;

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

    public GetCorpusInfoCall$Response(Status status, RegisterCorpusInfo registerCorpusInfo) {
        this.a = status;
        this.g = registerCorpusInfo;
    }
}
