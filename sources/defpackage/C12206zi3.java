package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.chrome.browser.explore_sites.StableScrollLayoutManager$SavedState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12206zi3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new StableScrollLayoutManager$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StableScrollLayoutManager$SavedState[i];
    }
}
