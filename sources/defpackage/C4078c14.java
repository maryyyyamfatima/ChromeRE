package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.UnguessableToken;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c14, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4078c14 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong == 0 || readLong2 == 0) {
            return null;
        }
        return new UnguessableToken(readLong, readLong2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UnguessableToken[i];
    }
}
