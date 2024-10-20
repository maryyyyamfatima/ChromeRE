package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TY0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        Scope[] scopeArr = GetServiceRequest.t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.u;
        Feature[] featureArr2 = featureArr;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = QT2.u(readInt, parcel);
                    break;
                case 2:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 4:
                    str = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    iBinder = QT2.t(readInt, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) QT2.l(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = QT2.a(readInt, parcel);
                    break;
                case 8:
                    account = (Account) QT2.h(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 10:
                    featureArr = (Feature[]) QT2.l(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) QT2.l(parcel, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = QT2.q(readInt, parcel);
                    break;
                case 13:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 14:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 15:
                    str2 = QT2.i(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
