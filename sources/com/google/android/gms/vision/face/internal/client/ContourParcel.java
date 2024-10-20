package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.A80;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ContourParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new A80();
    public final PointF[] a;
    public final int g;

    public ContourParcel(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.g = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.r(parcel, 2, this.a, i);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.b(a, parcel);
    }
}
