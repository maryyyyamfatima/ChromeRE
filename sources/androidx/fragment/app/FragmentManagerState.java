package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new i();
    public ArrayList a;
    public ArrayList g;
    public BackStackRecordState[] h;
    public int i;
    public String j;
    public final ArrayList k;
    public final ArrayList l;
    public ArrayList m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
        this.j = null;
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public FragmentManagerState(Parcel parcel) {
        this.j = null;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.g = parcel.createStringArrayList();
        this.h = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.createStringArrayList();
        this.l = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.m = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.g);
        parcel.writeTypedArray(this.h, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeStringList(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }
}
