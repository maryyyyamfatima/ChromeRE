package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.chrome.browser.password_check.CompromisedCredential;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K20 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        GURL a = GURL.a(parcel.readString());
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        boolean[] zArr = new boolean[4];
        parcel.readBooleanArray(zArr);
        return new CompromisedCredential(readString, a, readString2, readString3, readString4, readString5, readString6, readString7, readLong, readLong2, zArr[0], zArr[1], zArr[2], zArr[3]);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CompromisedCredential[i];
    }
}
