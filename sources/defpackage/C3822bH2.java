package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3822bH2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RatingCompat[i];
    }
}
