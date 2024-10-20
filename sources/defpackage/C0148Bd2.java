package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.OneoffTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148Bd2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OneoffTask[i];
    }
}
