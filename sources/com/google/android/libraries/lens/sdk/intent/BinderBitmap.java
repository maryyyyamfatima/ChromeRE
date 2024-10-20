package com.google.android.libraries.lens.sdk.intent;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.C2324Rx;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BinderBitmap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2324Rx();
    public final Bundle a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BinderBitmap(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle;
        IBinder binder = readBundle.getBinder("binder");
        if (binder != null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                binder.transact(1, obtain, obtain2, 0);
            } catch (RemoteException unused) {
            }
            obtain2.readException();
            Bundle readBundle2 = obtain2.readBundle(Bundle.class.getClassLoader());
            if (readBundle2 != null) {
            }
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
