package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10971w6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String[] strArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = QT2.w(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 4:
                    j2 = QT2.w(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    z = QT2.q(readInt, parcel);
                    break;
                case 6:
                    strArr = QT2.j(readInt, parcel);
                    break;
                case 7:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 8:
                    z3 = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new AdBreakInfo(j, str, j2, z, strArr, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AdBreakInfo[i];
    }
}
