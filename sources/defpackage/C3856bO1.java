package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3856bO1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
