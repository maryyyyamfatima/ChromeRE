package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5441g implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (parcel.readParcelable(null) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return AbsSavedState.g;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return AbsSavedState.g;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AbsSavedState[i];
    }
}
