package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.preference.Preference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class PreferenceGroup$SavedState extends Preference.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new c();
    public final int a;

    public PreferenceGroup$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public PreferenceGroup$SavedState(AbsSavedState absSavedState, int i) {
        super(absSavedState);
        this.a = i;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
