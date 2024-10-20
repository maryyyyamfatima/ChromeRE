package org.chromium.content.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import defpackage.C3198Yp3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SurfaceWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3198Yp3();
    public final Surface a;
    public final boolean g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SurfaceWrapper(Surface surface, boolean z) {
        this.a = surface;
        this.g = z;
    }

    public Surface getSurface() {
        return this.a;
    }

    public boolean canBeUsedWithSurfaceControl() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public static SurfaceWrapper create(Surface surface, boolean z) {
        return new SurfaceWrapper(surface, z);
    }
}
