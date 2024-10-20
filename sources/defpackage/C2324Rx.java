package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2324Rx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BinderBitmap(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BinderBitmap[i];
    }
}
