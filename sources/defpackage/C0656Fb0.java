package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656Fb0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int[] iArr = null;
        int[] iArr2 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
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
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    z = QT2.q(readInt, parcel);
                    break;
                case 9:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 10:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 11:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 12:
                    str7 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    iArr = QT2.d(readInt, parcel);
                    break;
                case 14:
                    iArr2 = QT2.d(readInt, parcel);
                    break;
                case 15:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 16:
                    strArr2 = QT2.j(readInt, parcel);
                    break;
                case 17:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 18:
                    i5 = QT2.u(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new CreditCardOcrResult(str, i, i2, i3, str2, str3, z, str4, str5, str6, str7, iArr, iArr2, strArr, strArr2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CreditCardOcrResult[i];
    }
}
