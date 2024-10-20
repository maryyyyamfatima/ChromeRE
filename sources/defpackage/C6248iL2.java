package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6248iL2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Feature[] featureArr = null;
        String str4 = null;
        ScoringConfig scoringConfig = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 11) {
                str4 = QT2.i(readInt, parcel);
            } else if (i2 != 12) {
                switch (i2) {
                    case 1:
                        str = QT2.i(readInt, parcel);
                        break;
                    case 2:
                        str2 = QT2.i(readInt, parcel);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        z = QT2.q(readInt, parcel);
                        break;
                    case 4:
                        i = QT2.u(readInt, parcel);
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        z2 = QT2.q(readInt, parcel);
                        break;
                    case 6:
                        str3 = QT2.i(readInt, parcel);
                        break;
                    case 7:
                        featureArr = (Feature[]) QT2.l(parcel, readInt, Feature.CREATOR);
                        break;
                    default:
                        QT2.z(readInt, parcel);
                        break;
                }
            } else {
                scoringConfig = (ScoringConfig) QT2.h(parcel, readInt, ScoringConfig.CREATOR);
            }
        }
        QT2.o(A, parcel);
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, featureArr, str4, scoringConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }
}
