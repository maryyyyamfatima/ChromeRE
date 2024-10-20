package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9728sV implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new CloudMessagingMessengerCompat(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CloudMessagingMessengerCompat[i];
    }
}
