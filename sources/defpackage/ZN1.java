package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZN1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int A = QT2.A(parcel);
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        double d = 0.0d;
        String str5 = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    mediaInfo = (MediaInfo) QT2.h(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    mediaQueueData = (MediaQueueData) QT2.h(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                case 4:
                    int y = QT2.y(readInt, parcel);
                    if (y != 0) {
                        QT2.n(parcel, y, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    j = QT2.w(readInt, parcel);
                    break;
                case 6:
                    d = QT2.r(readInt, parcel);
                    break;
                case 7:
                    jArr = QT2.f(readInt, parcel);
                    break;
                case 8:
                    str5 = QT2.i(readInt, parcel);
                    break;
                case 9:
                    str = QT2.i(readInt, parcel);
                    break;
                case 10:
                    str2 = QT2.i(readInt, parcel);
                    break;
                case 11:
                    str3 = QT2.i(readInt, parcel);
                    break;
                case 12:
                    str4 = QT2.i(readInt, parcel);
                    break;
                case 13:
                    j2 = QT2.w(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        Pattern pattern = WH.a;
        if (str5 != null) {
            try {
                jSONObject = new JSONObject(str5);
            } catch (JSONException unused) {
            }
            return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, jSONObject, str, str2, str3, str4, j2);
        }
        jSONObject = null;
        return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, jSONObject, str, str2, str3, str4, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }
}
