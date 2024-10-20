package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class SwipeRefreshLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new a();
    public final boolean a;

    public SwipeRefreshLayout$SavedState(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }

    public SwipeRefreshLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
