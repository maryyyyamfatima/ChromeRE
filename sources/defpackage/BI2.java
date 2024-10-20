package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.ocr.RecognitionScreen;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BI2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 4:
                    i = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    z = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new RecognitionScreen(str, str2, i, str3, str4, str5, str6, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RecognitionScreen[i];
    }
}