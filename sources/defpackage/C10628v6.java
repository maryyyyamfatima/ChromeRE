package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.VastAdsRequest;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10628v6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        VastAdsRequest vastAdsRequest = null;
        long j = 0;
        long j2 = 0;
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
                    j = QT2.w(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 6:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 7:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 8:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    str7 = QT2.i(readInt, parcel);
                    break;
                case 10:
                    str8 = QT2.i(readInt, parcel);
                    break;
                case 11:
                    j2 = QT2.w(readInt, parcel);
                    break;
                case 12:
                    str9 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) QT2.h(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new AdBreakClipInfo(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vastAdsRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AdBreakClipInfo[i];
    }
}
