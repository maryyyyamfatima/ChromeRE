package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2359Se implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout$BaseBehavior$SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new AppBarLayout$BaseBehavior$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppBarLayout$BaseBehavior$SavedState[i];
    }
}
