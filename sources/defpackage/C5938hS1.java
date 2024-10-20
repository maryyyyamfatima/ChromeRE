package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5938hS1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int A = QT2.A(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = QT2.w(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i = QT2.u(readInt, parcel);
                    break;
                case 4:
                    str2 = QT2.i(readInt, parcel);
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
                    i2 = QT2.u(readInt, parcel);
                    break;
                case 9:
                    arrayList = QT2.k(readInt, parcel);
                    break;
                case 10:
                    str = QT2.i(readInt, parcel);
                    break;
                default:
                    QT2.z(readInt, parcel);
                    break;
            }
        }
        QT2.o(A, parcel);
        Pattern pattern = WH.a;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, jSONObject);
        }
        jSONObject = null;
        return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MediaTrack[i];
    }
}
