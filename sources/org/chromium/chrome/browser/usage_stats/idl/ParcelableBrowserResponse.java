package org.chromium.chrome.browser.usage_stats.idl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C2772Vi2;
import defpackage.C5001ej2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ParcelableBrowserResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2772Vi2();
    public final C5001ej2 a;

    public ParcelableBrowserResponse(C5001ej2 c5001ej2) {
        this.a = c5001ej2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.c(parcel, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return (this.a.a.length <= 16384 ? 1 : 0) ^ 1;
    }
}
