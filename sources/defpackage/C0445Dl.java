package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445Dl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        int[] iArr = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 4:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 6:
                    i = QT2.u(readInt, parcel);
                    break;
                case 7:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 8:
                    iArr = QT2.d(readInt, parcel);
                    break;
                case 9:
                    z = QT2.q(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new AtomInfo(str, str2, strArr, iArr, i, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AtomInfo[i];
    }
}
