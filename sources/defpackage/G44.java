package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G44 implements Parcelable.Creator {
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
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str3 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    str7 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    str8 = QT2.i(readInt, parcel);
                    break;
                case 10:
                    str9 = QT2.i(readInt, parcel);
                    break;
                case 11:
                    str10 = QT2.i(readInt, parcel);
                    break;
                case 12:
                    str11 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    str12 = QT2.i(readInt, parcel);
                    break;
                case 14:
                    z = QT2.q(readInt, parcel);
                    break;
                case 15:
                    str13 = QT2.i(readInt, parcel);
                    break;
                case 16:
                    str14 = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UserAddress[i];
    }
}
