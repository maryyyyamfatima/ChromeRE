package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import defpackage.QM1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QM1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
            public static final Parcelable.Creator CREATOR = new QM1();
            public final int a;
            public final MediaDescriptionCompat g;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            {
                this.a = parcel.readInt();
                this.g = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel2, int i) {
                parcel2.writeInt(this.a);
                this.g.writeToParcel(parcel2, i);
            }

            public final String toString() {
                return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.g + '}';
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}
