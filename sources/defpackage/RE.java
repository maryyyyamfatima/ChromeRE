package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RE implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        String str = null;
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
                    i3 = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 6:
                    i5 = QT2.u(readInt, parcel);
                    break;
                case 7:
                    i6 = QT2.u(readInt, parcel);
                    break;
                case 8:
                    z = QT2.q(readInt, parcel);
                    break;
                case 9:
                    str = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new Barcode.CalendarDateTime(i, i2, i3, i4, i5, i6, z, str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }
}
