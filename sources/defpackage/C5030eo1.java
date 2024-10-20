package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5030eo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        Intent intent = null;
        Intent intent2 = null;
        AppInfo appInfo = null;
        Route route = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = QT2.u(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str = QT2.i(readInt, parcel);
                    break;
                case 4:
                    z = QT2.q(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    intent = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
                    break;
                case 6:
                    intent2 = (Intent) QT2.h(parcel, readInt, Intent.CREATOR);
                    break;
                case 7:
                default:
                    QT2.z(readInt, parcel);
                    break;
                case 8:
                    appInfo = (AppInfo) QT2.h(parcel, readInt, AppInfo.CREATOR);
                    break;
                case 9:
                    route = (Route) QT2.h(parcel, readInt, Route.CREATOR);
                    break;
                case 10:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 11:
                    bArr = QT2.b(readInt, parcel);
                    break;
                case 12:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 14:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 15:
                    bundle = QT2.a(readInt, parcel);
                    break;
                case 16:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 17:
                    bArr2 = QT2.b(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new InstantAppPreLaunchInfo(i, str, z, intent, intent2, appInfo, route, z2, bArr, str2, i2, i3, str3, bArr2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new InstantAppPreLaunchInfo[i];
    }
}
