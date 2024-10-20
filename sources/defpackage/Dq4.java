package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.SymbolBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Dq4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) QT2.l(parcel, readInt, SymbolBoxParcel.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    boundingBoxParcel = (BoundingBoxParcel) QT2.h(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) QT2.h(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 6:
                    f = QT2.s(readInt, parcel);
                    break;
                case 7:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    z = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new WordBoxParcel(symbolBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, str, f, str2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new WordBoxParcel[i];
    }
}
