package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3947bf2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        Intent intent = null;
        String str = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = QT2.u(readInt, parcel);
            } else if (i2 == 3) {
                str = QT2.i(readInt, parcel);
            } else if (i2 == 4) {
                intent = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new OverflowMenuItem(i, intent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
