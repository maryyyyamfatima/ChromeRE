package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11425xR1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaSessionCompat$Token[i];
    }
}
