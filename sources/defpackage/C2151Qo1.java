package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2151Qo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new IntentSenderRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new IntentSenderRequest[i];
    }
}
