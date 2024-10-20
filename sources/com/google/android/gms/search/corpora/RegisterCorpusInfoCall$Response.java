package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5560gL2;
import defpackage.QP2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RegisterCorpusInfoCall$Response extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR = new C5560gL2();
    public final Status a;
    public final boolean g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.b(a, parcel);
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }

    public RegisterCorpusInfoCall$Response(Status status, boolean z) {
        this.a = status;
        this.g = z;
    }
}
