package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11030wH implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        CastEurekaInfo castEurekaInfo = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
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
                    str3 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    i = QT2.u(readInt, parcel);
                    break;
                case 8:
                    arrayList = QT2.m(parcel, readInt, WebImage.CREATOR);
                    break;
                case 9:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 10:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 11:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 12:
                    str7 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 14:
                    str8 = QT2.i(readInt, parcel);
                    break;
                case 15:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 16:
                    str9 = QT2.i(readInt, parcel);
                    break;
                case 17:
                    z = QT2.q(readInt, parcel);
                    break;
                case 18:
                    castEurekaInfo = (CastEurekaInfo) QT2.h(parcel, readInt, CastEurekaInfo.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i4, str6, str7, i3, str8, bArr, str9, z, castEurekaInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
