package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new FragmentManager$LaunchedFragmentInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FragmentManager$LaunchedFragmentInfo[i];
    }
}
