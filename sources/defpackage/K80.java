package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.controller.api.ControllerPositionEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class K80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ControllerPositionEvent(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ControllerPositionEvent[i];
    }
}
