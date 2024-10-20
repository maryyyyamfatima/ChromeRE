package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.QP2;
import defpackage.RT2;
import defpackage.RY0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR = new RY0();
    public final Status a;
    public final List g;
    public final String[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.t(parcel, 2, this.g);
        RT2.p(parcel, 3, this.h);
        RT2.b(a, parcel);
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }

    public GetRecentContextCall$Response(Status status, ArrayList arrayList, String[] strArr) {
        this.a = status;
        this.g = arrayList;
        this.h = strArr;
    }
}
