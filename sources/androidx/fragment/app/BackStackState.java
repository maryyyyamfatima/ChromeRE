package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final ArrayList a;
    public final ArrayList g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BackStackState(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.g);
    }
}
