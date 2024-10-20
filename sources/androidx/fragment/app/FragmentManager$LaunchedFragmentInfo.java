package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new g();
    public final String a;
    public final int g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManager$LaunchedFragmentInfo(String str, int i) {
        this.a = str;
        this.g = i;
    }

    public FragmentManager$LaunchedFragmentInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.g);
    }
}
