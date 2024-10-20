package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.sdk.intent.LensImage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907Gz1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new LensImage(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LensImage[i];
    }
}
