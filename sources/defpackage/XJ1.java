package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XJ1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
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
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
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
                    i = QT2.u(readInt, parcel);
                    break;
                case 13:
                    arrayList4 = QT2.m(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) QT2.h(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList5 = QT2.m(parcel, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = QT2.i(readInt, parcel);
                    break;
                case 17:
                    str12 = QT2.i(readInt, parcel);
                    break;
                case 18:
                    arrayList6 = QT2.m(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = QT2.q(readInt, parcel);
                    break;
                case 20:
                    arrayList7 = QT2.m(parcel, readInt, UriData.CREATOR);
                    break;
                case 21:
                    arrayList8 = QT2.m(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    arrayList9 = QT2.m(parcel, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) QT2.h(parcel, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList4, timeInterval, arrayList5, str11, str12, arrayList6, z, arrayList7, arrayList8, arrayList9, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
