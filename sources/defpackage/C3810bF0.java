package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3810bF0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 4:
                    bArr2 = QT2.c(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    bArr3 = QT2.c(readInt, parcel);
                    break;
                case 6:
                    bArr4 = QT2.c(readInt, parcel);
                    break;
                case 7:
                    bArr5 = QT2.c(readInt, parcel);
                    break;
                case 8:
                    iArr = QT2.d(readInt, parcel);
                    break;
                case 9:
                    bArr6 = QT2.c(readInt, parcel);
                    break;
                case 10:
                    iArr2 = QT2.d(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
