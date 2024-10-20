package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12096zO1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        long j = 0;
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
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) QT2.h(parcel, readInt, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 8:
                    arrayList = QT2.m(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case 9:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 10:
                    j = QT2.w(readInt, parcel);
                    break;
                case 11:
                    z = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new MediaQueueData(str, str2, i, str3, mediaQueueContainerMetadata, i2, arrayList, i3, j, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaQueueData[i];
    }
}
