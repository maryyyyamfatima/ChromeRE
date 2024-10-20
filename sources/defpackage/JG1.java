package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JG1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 1;
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = QT2.u(readInt, parcel);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) QT2.h(parcel, readInt, LocationRequestInternal.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    iBinder = QT2.t(readInt, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) QT2.h(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    iBinder2 = QT2.t(readInt, parcel);
                    break;
                case 6:
                    iBinder3 = QT2.t(readInt, parcel);
                    break;
                case 7:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 8:
                    str = QT2.i(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new LocationRequestUpdateData(i, locationRequestInternal, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
