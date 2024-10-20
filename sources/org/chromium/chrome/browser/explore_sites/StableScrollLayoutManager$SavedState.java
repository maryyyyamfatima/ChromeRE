package org.chromium.chrome.browser.explore_sites;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.C12206zi3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StableScrollLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12206zi3();
    public final Parcelable a;
    public int g;
    public int h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StableScrollLayoutManager$SavedState() {
        this.h = 0;
    }

    public StableScrollLayoutManager$SavedState(LinearLayoutManager.SavedState savedState) {
        this.h = 0;
        this.a = savedState;
    }

    public StableScrollLayoutManager$SavedState(Parcel parcel) {
        this.h = 0;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.a = parcel.readParcelable(getClass().getClassLoader());
    }

    public StableScrollLayoutManager$SavedState(StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState, LinearLayoutManager.SavedState savedState) {
        this.h = 0;
        this.g = stableScrollLayoutManager$SavedState.g;
        this.h = stableScrollLayoutManager$SavedState.h;
        this.a = savedState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.a, i);
    }
}
