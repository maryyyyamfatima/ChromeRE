package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.DI2;
import defpackage.QP2;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR = new DI2();
    public final List a;
    public final String g;

    public RecordConsentByConsentResultResponse(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.g = str;
    }

    @Override // defpackage.QP2
    public final Status S0() {
        if (this.g != null) {
            return Status.k;
        }
        return Status.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.q(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.b(a, parcel);
    }
}
