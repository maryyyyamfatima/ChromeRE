package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454Sx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
