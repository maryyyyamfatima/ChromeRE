package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10261u2;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10261u2();
    public final int a;
    public final List g;

    public AccountChangeEventsResponse(int i, ArrayList arrayList) {
        this.a = i;
        this.g = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.t(parcel, 2, this.g);
        RT2.b(a, parcel);
    }
}
