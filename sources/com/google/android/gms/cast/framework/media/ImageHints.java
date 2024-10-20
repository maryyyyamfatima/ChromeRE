package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C1337Kh1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ImageHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C1337Kh1();
    public final int a;
    public final int g;
    public final int h;

    public ImageHints(int i, int i2, int i3) {
        this.a = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.b(a, parcel);
    }
}
