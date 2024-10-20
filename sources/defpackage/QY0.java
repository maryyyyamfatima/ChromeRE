package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.GetParentVerificationIntentResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 1) {
                pendingIntent = (PendingIntent) QT2.h(parcel, readInt, PendingIntent.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new GetParentVerificationIntentResponse(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GetParentVerificationIntentResponse[i];
    }
}
