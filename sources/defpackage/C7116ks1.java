package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ks1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7116ks1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    arrayList = QT2.e(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 4:
                    str = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    arrayList2 = QT2.e(readInt, parcel);
                    break;
                case 7:
                    z = QT2.q(readInt, parcel);
                    break;
                case 8:
                    str3 = QT2.i(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
