package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11082wR1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$QueueItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaSessionCompat$QueueItem[i];
    }
}
