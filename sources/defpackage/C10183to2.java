package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: to2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10183to2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = QT2.i(readInt, parcel);
                    break;
                case 2:
                    cardInfo = (CardInfo) QT2.h(parcel, readInt, CardInfo.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    userAddress = (UserAddress) QT2.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) QT2.h(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    bundle = QT2.a(readInt, parcel);
                    break;
                case 7:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    bundle2 = QT2.a(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
