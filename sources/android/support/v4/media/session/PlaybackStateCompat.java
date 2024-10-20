package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.C11768yR1;
import defpackage.C2447Sv2;
import defpackage.C2577Tv2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2447Sv2();
    public final int a;
    public final long g;
    public final long h;
    public final float i;
    public final long j;
    public final int k;
    public final CharSequence l;
    public final long m;
    public final ArrayList n;
    public final long o;
    public final Bundle p;
    public PlaybackState q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.a = i;
        this.g = j;
        this.h = j2;
        this.i = f;
        this.j = j3;
        this.k = i2;
        this.l = charSequence;
        this.m = j4;
        this.n = new ArrayList(arrayList);
        this.o = j5;
        this.p = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.g = parcel.readLong();
        this.i = parcel.readFloat();
        this.m = parcel.readLong();
        this.h = parcel.readLong();
        this.j = parcel.readLong();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.o = parcel.readLong();
        this.p = parcel.readBundle(C11768yR1.class.getClassLoader());
        this.k = parcel.readInt();
    }

    public final String toString() {
        return "PlaybackState {state=" + this.a + ", position=" + this.g + ", buffered position=" + this.h + ", speed=" + this.i + ", updated=" + this.m + ", actions=" + this.j + ", error code=" + this.k + ", error message=" + this.l + ", custom actions=" + this.n + ", active item id=" + this.o + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.g);
        parcel.writeFloat(this.i);
        parcel.writeLong(this.m);
        parcel.writeLong(this.h);
        parcel.writeLong(this.j);
        TextUtils.writeToParcel(this.l, parcel, i);
        parcel.writeTypedList(this.n);
        parcel.writeLong(this.o);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.k);
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction2 : customActions) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle extras = customAction3.getExtras();
                    C11768yR1.a(extras);
                    customAction = new CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), extras);
                    customAction.j = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle extras2 = playbackState.getExtras();
        C11768yR1.a(extras2);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
        playbackStateCompat.q = playbackState;
        return playbackStateCompat;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C2577Tv2();
        public final String a;
        public final CharSequence g;
        public final int h;
        public final Bundle i;
        public PlaybackState.CustomAction j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.g = charSequence;
            this.h = i;
            this.i = bundle;
        }

        public CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = parcel.readInt();
            this.i = parcel.readBundle(C11768yR1.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.g, parcel, i);
            parcel.writeInt(this.h);
            parcel.writeBundle(this.i);
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.g) + ", mIcon=" + this.h + ", mExtras=" + this.i;
        }
    }
}
