package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10511um;
import defpackage.QP2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR = new C10511um();
    public final int a;
    public final int g;
    public final Intent h;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.g = i2;
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.n(parcel, 3, this.h, i);
        RT2.b(a, parcel);
    }

    @Override // defpackage.QP2
    public final Status S0() {
        if (this.g == 0) {
            return Status.k;
        }
        return Status.o;
    }
}
