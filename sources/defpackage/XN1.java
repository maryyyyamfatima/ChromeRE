package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XN1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
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
                    str2 = QT2.i(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    mediaMetadata = (MediaMetadata) QT2.h(parcel, readInt, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = QT2.w(readInt, parcel);
                    break;
                case 7:
                    arrayList = QT2.m(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) QT2.h(parcel, readInt, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 10:
                    arrayList2 = QT2.m(parcel, readInt, AdBreakInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = QT2.m(parcel, readInt, AdBreakClipInfo.CREATOR);
                    break;
                case 12:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) QT2.h(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = QT2.w(readInt, parcel);
                    break;
                case 15:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 16:
                    str6 = QT2.i(readInt, parcel);
                    break;
                case 17:
                    str7 = QT2.i(readInt, parcel);
                    break;
                case 18:
                    str8 = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
