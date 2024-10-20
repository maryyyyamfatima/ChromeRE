package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.F84;
import defpackage.G84;
import defpackage.H84;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(F84 f84) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        H84 h84 = remoteActionCompat.a;
        if (f84.e(1)) {
            h84 = f84.h();
        }
        remoteActionCompat.a = (IconCompat) h84;
        CharSequence charSequence = remoteActionCompat.b;
        if (f84.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((G84) f84).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (f84.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((G84) f84).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) f84.g(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (f84.e(5)) {
            z = ((G84) f84).e.readInt() != 0;
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (f84.e(6)) {
            z2 = ((G84) f84).e.readInt() != 0;
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, F84 f84) {
        f84.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        f84.i(1);
        f84.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        f84.i(2);
        Parcel parcel = ((G84) f84).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        f84.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        f84.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        f84.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        f84.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
