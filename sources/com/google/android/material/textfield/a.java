package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new TextInputLayout.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TextInputLayout.SavedState[i];
    }
}
