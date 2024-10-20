package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.SessionState;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N43 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A = QT2.A(parcel);
        JSONObject jSONObject = null;
        String str = null;
        MediaLoadRequestData mediaLoadRequestData = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                mediaLoadRequestData = (MediaLoadRequestData) QT2.h(parcel, readInt, MediaLoadRequestData.CREATOR);
            } else if (i == 3) {
                str = QT2.i(readInt, parcel);
            } else {
                QT2.z(readInt, parcel);
            }
        }
        QT2.o(A, parcel);
        Pattern pattern = WH.a;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return new SessionState(mediaLoadRequestData, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SessionState[i];
    }
}
