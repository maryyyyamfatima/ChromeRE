package defpackage;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.SharedLibInfo;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035Ah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        byte[] bArr = null;
        PackageInfo packageInfo = null;
        byte[] bArr2 = null;
        int i = 0;
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
                case 10:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    arrayList = QT2.m(parcel, readInt, Route.CREATOR);
                    break;
                case 6:
                    arrayList2 = QT2.m(parcel, readInt, AtomInfo.CREATOR);
                    break;
                case 7:
                    i = QT2.u(readInt, parcel);
                    break;
                case 8:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 9:
                    packageInfo = (PackageInfo) QT2.h(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = QT2.m(parcel, readInt, SharedLibInfo.CREATOR);
                    break;
                case 12:
                    bArr2 = QT2.b(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new AppInfo(str, str2, arrayList, arrayList2, arrayList3, i, bArr, packageInfo, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppInfo[i];
    }
}
