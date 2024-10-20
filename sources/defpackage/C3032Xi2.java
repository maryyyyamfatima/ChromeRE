package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.chrome.browser.usage_stats.idl.ParcelableWellbeingRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xi2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3032Xi2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ParcelableWellbeingRequest(C5001ej2.a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableWellbeingRequest[i];
    }
}
