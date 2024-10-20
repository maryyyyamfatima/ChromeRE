package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.phenotype.Flag;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AP0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        double d = 0.0d;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    j = QT2.w(readInt, parcel);
                    break;
                case 4:
                    z = QT2.q(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    d = QT2.r(readInt, parcel);
                    break;
                case 6:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 8:
                    i = QT2.u(readInt, parcel);
                    break;
                case 9:
                    i2 = QT2.u(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new Flag(str, j, z, d, str2, bArr, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Flag[i];
    }
}
