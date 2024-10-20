package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.firebase.appindexing.internal.ActionImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ActionImpl.MetadataImpl metadataImpl = null;
        String str5 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = QT2.i(readInt, parcel);
                    break;
                case 2:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 4:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    metadataImpl = (ActionImpl.MetadataImpl) QT2.h(parcel, readInt, ActionImpl.MetadataImpl.CREATOR);
                    break;
                case 6:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    bundle = QT2.a(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new ActionImpl(str, str2, str3, str4, metadataImpl, str5, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ActionImpl[i];
    }
}
