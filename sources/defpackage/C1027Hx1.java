package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.LaunchSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027Hx1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        while (parcel.dataPosition() < A) {
            QT2.z(parcel.readInt(), parcel);
        }
        QT2.o(A, parcel);
        return new LaunchSettings();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LaunchSettings[i];
    }
}
