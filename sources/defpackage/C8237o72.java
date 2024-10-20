package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o72, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8237o72 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    iArr = QT2.d(readInt, parcel);
                    break;
                case 4:
                    j = QT2.w(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 6:
                    i = QT2.u(readInt, parcel);
                    break;
                case 7:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 8:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 9:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 10:
                    i5 = QT2.u(readInt, parcel);
                    break;
                case 11:
                    i6 = QT2.u(readInt, parcel);
                    break;
                case 12:
                    i7 = QT2.u(readInt, parcel);
                    break;
                case 13:
                    i8 = QT2.u(readInt, parcel);
                    break;
                case 14:
                    i9 = QT2.u(readInt, parcel);
                    break;
                case 15:
                    i10 = QT2.u(readInt, parcel);
                    break;
                case 16:
                    i11 = QT2.u(readInt, parcel);
                    break;
                case 17:
                    i12 = QT2.u(readInt, parcel);
                    break;
                case 18:
                    i13 = QT2.u(readInt, parcel);
                    break;
                case 19:
                    i14 = QT2.u(readInt, parcel);
                    break;
                case 20:
                    i15 = QT2.u(readInt, parcel);
                    break;
                case 21:
                    i16 = QT2.u(readInt, parcel);
                    break;
                case 22:
                    i17 = QT2.u(readInt, parcel);
                    break;
                case 23:
                    i18 = QT2.u(readInt, parcel);
                    break;
                case 24:
                    i19 = QT2.u(readInt, parcel);
                    break;
                case 25:
                    i20 = QT2.u(readInt, parcel);
                    break;
                case 26:
                    i21 = QT2.u(readInt, parcel);
                    break;
                case 27:
                    i22 = QT2.u(readInt, parcel);
                    break;
                case 28:
                    i23 = QT2.u(readInt, parcel);
                    break;
                case 29:
                    i24 = QT2.u(readInt, parcel);
                    break;
                case 30:
                    i25 = QT2.u(readInt, parcel);
                    break;
                case 31:
                    i26 = QT2.u(readInt, parcel);
                    break;
                case 32:
                    i27 = QT2.u(readInt, parcel);
                    break;
                case 33:
                    iBinder = QT2.t(readInt, parcel);
                    break;
                case 34:
                    z = QT2.q(readInt, parcel);
                    break;
                case 35:
                    z2 = QT2.q(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
