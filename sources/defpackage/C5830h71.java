package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h71, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5830h71 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new HeadTrackingState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new HeadTrackingState[i];
    }
}
