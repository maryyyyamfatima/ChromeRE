package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.PendingCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yq2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3202Yq2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PendingCallback[i];
    }
}