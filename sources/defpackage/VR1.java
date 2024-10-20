package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VR1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    mediaInfo = (MediaInfo) QT2.h(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    j = QT2.w(readInt, parcel);
                    break;
                case 4:
                    i = QT2.u(readInt, parcel);
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    d = QT2.r(readInt, parcel);
                    break;
                case 6:
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 7:
                    i3 = QT2.u(readInt, parcel);
                    break;
                case 8:
                    j2 = QT2.w(readInt, parcel);
                    break;
                case 9:
                    j3 = QT2.w(readInt, parcel);
                    break;
                case 10:
                    d2 = QT2.r(readInt, parcel);
                    break;
                case 11:
                    z = QT2.q(readInt, parcel);
                    break;
                case 12:
                    jArr = QT2.f(readInt, parcel);
                    break;
                case 13:
                    i4 = QT2.u(readInt, parcel);
                    break;
                case 14:
                    i5 = QT2.u(readInt, parcel);
                    break;
                case 15:
                    str = QT2.i(readInt, parcel);
                    break;
                case 16:
                    i6 = QT2.u(readInt, parcel);
                    break;
                case 17:
                    arrayList = QT2.m(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = QT2.q(readInt, parcel);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) QT2.h(parcel, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) QT2.h(parcel, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) QT2.h(parcel, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) QT2.h(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaStatus[i];
    }
}
