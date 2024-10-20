package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2785Vl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        ApplicationMetadata applicationMetadata = null;
        EqualizerSettings equalizerSettings = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    d = QT2.r(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    z = QT2.q(readInt, parcel);
                    break;
                case 4:
                    i = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    applicationMetadata = (ApplicationMetadata) QT2.h(parcel, readInt, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 7:
                    equalizerSettings = (EqualizerSettings) QT2.h(parcel, readInt, EqualizerSettings.CREATOR);
                    break;
                case 8:
                    d2 = QT2.r(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new DeviceStatus(d, z, i, applicationMetadata, i2, equalizerSettings, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeviceStatus[i];
    }
}
