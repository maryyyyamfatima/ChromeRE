package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12262zs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    arrayList = QT2.m(parcel, readInt, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    l2 = QT2.x(readInt, parcel);
                    break;
                case 6:
                    l3 = QT2.x(readInt, parcel);
                    break;
                case 7:
                    l = QT2.x(readInt, parcel);
                    break;
                case 8:
                    deviceVersionEntity = (DeviceVersionEntity) QT2.h(parcel, readInt, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new BackedUpContactsPerDeviceEntity(str, l, arrayList, str2, l2, l3, deviceVersionEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }
}
