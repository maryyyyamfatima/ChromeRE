package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4856eI1;
import defpackage.RT2;
import defpackage.YN1;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long a;
    public final long g;
    public final boolean h;
    public final boolean i;
    public static final C4856eI1 j = new C4856eI1("MediaLiveSeekableRange");
    public static final Parcelable.Creator CREATOR = new YN1();

    public MediaLiveSeekableRange(long j2, long j3, boolean z, boolean z2) {
        this.a = Math.max(j2, 0L);
        this.g = Math.max(j3, 0L);
        this.h = z;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.a);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.a == mediaLiveSeekableRange.a && this.g == mediaLiveSeekableRange.g && this.h == mediaLiveSeekableRange.h && this.i == mediaLiveSeekableRange.i;
    }
}
