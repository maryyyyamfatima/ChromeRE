package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V34 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        DocumentId documentId = null;
        String str = null;
        DocumentContents documentContents = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    documentId = (DocumentId) QT2.h(parcel, readInt, DocumentId.CREATOR);
                    break;
                case 2:
                    j = QT2.w(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i = QT2.u(readInt, parcel);
                    break;
                case 4:
                    str = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    documentContents = (DocumentContents) QT2.h(parcel, readInt, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = QT2.q(readInt, parcel);
                    break;
                case 7:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 8:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 9:
                    str2 = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new UsageInfo(documentId, j, i, str, documentContents, z, i3, i2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UsageInfo[i];
    }
}
