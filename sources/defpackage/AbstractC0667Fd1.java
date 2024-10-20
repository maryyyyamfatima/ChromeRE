package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0667Fd1 {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        } else {
            parcel.writeInt(0);
        }
    }
}
