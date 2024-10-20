package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6290iU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        List list = OL2.j;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        ClientIdentity clientIdentity = null;
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
                    str = QT2.i(readInt, parcel);
                    break;
                case 4:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 6:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    clientIdentity = (ClientIdentity) QT2.h(parcel, readInt, ClientIdentity.CREATOR);
                    break;
                case 8:
                    list = QT2.m(parcel, readInt, Feature.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new ClientIdentity(i, i2, str, str2, str3, i3, list, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
