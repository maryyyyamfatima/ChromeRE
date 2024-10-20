package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C2382Si2;
import defpackage.G84;
import defpackage.H84;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2382Si2();
    public final H84 a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelImpl(H84 h84) {
        this.a = h84;
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new G84(parcel).h();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new G84(parcel).l(this.a);
    }
}
