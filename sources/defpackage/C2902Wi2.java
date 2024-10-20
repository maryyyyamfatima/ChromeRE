package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2902Wi2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}
