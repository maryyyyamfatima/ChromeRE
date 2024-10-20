package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: py2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8870py2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Preference.BaseSavedState[i];
    }
}
