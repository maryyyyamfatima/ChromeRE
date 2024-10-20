package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9385rV implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                intent = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}
