package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TN1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String str;
        JSONObject jSONObject;
        int readInt;
        int A = QT2.A(parcel);
        String str2 = null;
        String str3 = null;
        long j = 0;
        String str4 = null;
        Integer num = null;
        loop0: while (true) {
            str = str2;
            while (parcel.dataPosition() < A) {
                readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str4 = QT2.i(readInt, parcel);
                } else if (i != 3) {
                    if (i == 4) {
                        num = QT2.v(readInt, parcel);
                    } else if (i == 5) {
                        str = QT2.i(readInt, parcel);
                    } else if (i == 6) {
                        str3 = QT2.i(readInt, parcel);
                    } else {
                        QT2.z(readInt, parcel);
                    }
                }
            }
            j = QT2.w(readInt, parcel);
            str2 = str;
        }
        QT2.o(A, parcel);
        Pattern pattern = WH.a;
        if (str3 != null) {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException unused) {
            }
            return new MediaError(str4, j, num, str, jSONObject);
        }
        jSONObject = null;
        return new MediaError(str4, j, num, str, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaError[i];
    }
}
