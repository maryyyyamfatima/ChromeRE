package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pJ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8644pJ3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) == 2) {
                str = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        return new TextRecognizerOptions(str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TextRecognizerOptions[i];
    }
}