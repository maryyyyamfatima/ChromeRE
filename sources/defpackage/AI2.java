package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AI2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Rect rect = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 2) {
                rect = (Rect) QT2.h(parcel, readInt, Rect.CREATOR);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new RecognitionOptions(rect);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RecognitionOptions[i];
    }
}
