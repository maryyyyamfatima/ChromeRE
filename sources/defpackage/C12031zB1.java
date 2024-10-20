package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12031zB1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) QT2.l(parcel, readInt, WordBoxParcel.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    boundingBoxParcel = (BoundingBoxParcel) QT2.h(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) QT2.h(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    boundingBoxParcel3 = (BoundingBoxParcel) QT2.h(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = QT2.i(readInt, parcel);
                    break;
                case 7:
                    f = QT2.s(readInt, parcel);
                    break;
                case 8:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    i = QT2.u(readInt, parcel);
                    break;
                case 10:
                    z = QT2.q(readInt, parcel);
                    break;
                case 11:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 12:
                    i3 = QT2.u(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new LineBoxParcel(wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i, z, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LineBoxParcel[i];
    }
}
