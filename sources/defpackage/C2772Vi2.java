package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.chrome.browser.usage_stats.idl.ParcelableBrowserResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vi2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2772Vi2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ParcelableBrowserResponse(C5001ej2.a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableBrowserResponse[i];
    }
}
