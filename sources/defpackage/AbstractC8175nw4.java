package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nw4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8175nw4 {
    public static final /* synthetic */ int a = 0;

    static {
        AbstractC8175nw4.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
