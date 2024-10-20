package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754Fu3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SystemParcelableWrapper(parcel.readParcelable(null));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SystemParcelableWrapper[i];
    }
}
