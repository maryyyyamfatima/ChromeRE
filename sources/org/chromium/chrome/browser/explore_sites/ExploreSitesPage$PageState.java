package org.chromium.chrome.browser.explore_sites;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class ExploreSitesPage$PageState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public final Parcelable a;
    public final Long g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ExploreSitesPage$PageState(Parcel parcel) {
        this.g = Long.valueOf(parcel.readLong());
        this.a = parcel.readParcelable(getClass().getClassLoader());
    }

    public ExploreSitesPage$PageState(Long l, StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState) {
        this.g = l;
        this.a = stableScrollLayoutManager$SavedState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.g.longValue());
        parcel.writeParcelable(this.a, i);
    }
}
