package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ProxyCard;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yE2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11704yE2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 2) {
                str = QT2.i(readInt, parcel);
            } else if (i3 == 3) {
                str2 = QT2.i(readInt, parcel);
            } else if (i3 == 4) {
                i = QT2.u(readInt, parcel);
            } else if (i3 == 5) {
                i2 = QT2.u(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new ProxyCard(i, str, i2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProxyCard[i];
    }
}
