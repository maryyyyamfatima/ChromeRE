package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.PeriodicTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12259zr2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PeriodicTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PeriodicTask[i];
    }
}
