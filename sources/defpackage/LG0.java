package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LG0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        Boolean bool = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        byte[][] bArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = QT2.u(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 4:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    arrayList2 = QT2.g(readInt, parcel);
                    break;
                case 6:
                    arrayList3 = QT2.k(readInt, parcel);
                    break;
                case 7:
                    arrayList4 = QT2.g(readInt, parcel);
                    break;
                case 8:
                    bArr = QT2.c(readInt, parcel);
                    break;
                case 9:
                    int y = QT2.y(readInt, parcel);
                    if (y != 0) {
                        QT2.n(parcel, y, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new FRDProductSpecificDataEntry(i, i2, arrayList, arrayList2, arrayList3, arrayList4, bArr, bool.booleanValue());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FRDProductSpecificDataEntry[i];
    }
}
