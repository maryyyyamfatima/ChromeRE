package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DH implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        ArrayList arrayList = null;
        LaunchOptions launchOptions = null;
        CastMediaOptions castMediaOptions = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        double d = 0.0d;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case 4:
                    z = QT2.q(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    launchOptions = (LaunchOptions) QT2.h(parcel, readInt, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) QT2.h(parcel, readInt, CastMediaOptions.CREATOR);
                    break;
                case 8:
                    z3 = QT2.q(readInt, parcel);
                    break;
                case 9:
                    d = QT2.r(readInt, parcel);
                    break;
                case 10:
                    z4 = QT2.q(readInt, parcel);
                    break;
                case 11:
                    z5 = QT2.q(readInt, parcel);
                    break;
                case 12:
                    z6 = QT2.q(readInt, parcel);
                    break;
                case 13:
                    arrayList2 = QT2.k(readInt, parcel);
                    break;
                case 14:
                    z7 = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new CastOptions(str, arrayList, z, launchOptions, z2, castMediaOptions, z3, d, z4, z5, z6, arrayList2, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CastOptions[i];
    }
}
