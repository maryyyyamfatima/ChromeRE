package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.logging.api.VREventParcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class I74 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new VREventParcelable(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new VREventParcelable[i];
    }
}
