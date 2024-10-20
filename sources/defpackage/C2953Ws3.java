package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.SymbolBoxParcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ws3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2953Ws3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        while (parcel.dataPosition() < A) {
            QT2.z(parcel.readInt(), parcel);
        }
        QT2.o(A, parcel);
        return new SymbolBoxParcel();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SymbolBoxParcel[i];
    }
}
