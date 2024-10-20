package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I40 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Barcode.PersonName personName = null;
        String str = null;
        String str2 = null;
        Barcode.Phone[] phoneArr = null;
        Barcode.Email[] emailArr = null;
        String[] strArr = null;
        Barcode.Address[] addressArr = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    personName = (Barcode.PersonName) QT2.h(parcel, readInt, Barcode.PersonName.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 4:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    phoneArr = (Barcode.Phone[]) QT2.l(parcel, readInt, Barcode.Phone.CREATOR);
                    break;
                case 6:
                    emailArr = (Barcode.Email[]) QT2.l(parcel, readInt, Barcode.Email.CREATOR);
                    break;
                case 7:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 8:
                    addressArr = (Barcode.Address[]) QT2.l(parcel, readInt, Barcode.Address.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new Barcode.ContactInfo(personName, str, str2, phoneArr, emailArr, strArr, addressArr);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Barcode.ContactInfo[i];
    }
}
