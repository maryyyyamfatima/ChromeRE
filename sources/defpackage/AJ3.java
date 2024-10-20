package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AJ3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    f = QT2.s(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i = QT2.u(readInt, parcel);
                    break;
                case 4:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 6:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 7:
                    i5 = QT2.u(readInt, parcel);
                    break;
                case 8:
                    i6 = QT2.u(readInt, parcel);
                    break;
                case 9:
                    i7 = QT2.u(readInt, parcel);
                    break;
                case 10:
                    str = QT2.i(readInt, parcel);
                    break;
                case 11:
                    i8 = QT2.u(readInt, parcel);
                    break;
                case 12:
                    i9 = QT2.u(readInt, parcel);
                    break;
                case 13:
                    str2 = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new TextTrackStyle(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TextTrackStyle[i];
    }
}
