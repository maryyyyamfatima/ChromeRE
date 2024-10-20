package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667Mv2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = true;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = QT2.i(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i = QT2.u(readInt, parcel);
                    break;
                case 4:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 6:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 7:
                    z3 = QT2.q(readInt, parcel);
                    break;
                case 8:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    z = QT2.q(readInt, parcel);
                    break;
                case 10:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 11:
                    num = QT2.v(readInt, parcel);
                    break;
                case 12:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 13:
                    i4 = QT2.u(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new PlayLoggerContext(str, i, i2, str2, z3, str3, z, i3, num, z2, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
