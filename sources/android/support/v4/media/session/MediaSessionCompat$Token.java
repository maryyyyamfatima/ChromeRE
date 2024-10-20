package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C11425xR1;
import defpackage.H84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C11425xR1();
    public final Object g;
    public b h;
    public final Object a = new Object();
    public H84 i = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.g = obj;
        this.h = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.g, i);
    }

    public final int hashCode() {
        Object obj = this.g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.g;
        if (obj2 == null) {
            return mediaSessionCompat$Token.g == null;
        }
        Object obj3 = mediaSessionCompat$Token.g;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final b a() {
        b bVar;
        synchronized (this.a) {
            bVar = this.h;
        }
        return bVar;
    }
}
