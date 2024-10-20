package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I02 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ActionImpl actionImpl = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = QT2.u(readInt, parcel);
                    break;
                case 2:
                    thingArr = (Thing[]) QT2.l(parcel, readInt, Thing.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 4:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    strArr2 = QT2.j(readInt, parcel);
                    break;
                case 6:
                    actionImpl = (ActionImpl) QT2.h(parcel, readInt, ActionImpl.CREATOR);
                    break;
                case 7:
                    str = QT2.i(readInt, parcel);
                    break;
                case 8:
                    str2 = QT2.i(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new MutateRequest(i, thingArr, strArr, strArr2, actionImpl, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MutateRequest[i];
    }
}
