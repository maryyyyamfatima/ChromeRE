package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.VV1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new VV1();
    public final Messenger a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MessengerCompat(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((MessengerCompat) obj).a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}