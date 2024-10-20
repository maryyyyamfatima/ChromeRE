package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4606da4;
import defpackage.C4856eI1;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VideoInfo extends AbstractSafeParcelable {
    public final int a;
    public final int g;
    public final int h;
    public static final C4856eI1 i = new C4856eI1("VideoInfo");
    public static final Parcelable.Creator CREATOR = new C4606da4();

    public VideoInfo(int i2, int i3, int i4) {
        this.a = i2;
        this.g = i3;
        this.h = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.g == videoInfo.g && this.a == videoInfo.a && this.h == videoInfo.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.a), Integer.valueOf(this.h)});
    }
}
