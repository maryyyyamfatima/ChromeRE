package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2577Tv2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
