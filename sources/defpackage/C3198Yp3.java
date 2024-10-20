package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import org.chromium.content.common.SurfaceWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yp3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3198Yp3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SurfaceWrapper((Surface) Surface.CREATOR.createFromParcel(parcel), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SurfaceWrapper[i];
    }
}
