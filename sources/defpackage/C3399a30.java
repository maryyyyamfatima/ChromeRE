package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3399a30 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        Configuration[] configurationArr = null;
        byte[] bArr = null;
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
                    configurationArr = (Configuration[]) QT2.l(parcel, readInt, Configuration.CREATOR);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    z = QT2.q(readInt, parcel);
                    break;
                case 6:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 7:
                    j = QT2.w(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new Configurations(str, str2, configurationArr, z, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Configurations[i];
    }
}
