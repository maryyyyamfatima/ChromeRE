package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.preference.Preference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class TwoStatePreference$SavedState extends Preference.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new f();
    public boolean a;

    public TwoStatePreference$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() == 1;
    }

    public TwoStatePreference$SavedState(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
