package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C2151Qo1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2151Qo1();
    public final IntentSender a;
    public final Intent g;
    public final int h;
    public final int i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.a = intentSender;
        this.g = intent;
        this.h = i;
        this.i = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.g = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
