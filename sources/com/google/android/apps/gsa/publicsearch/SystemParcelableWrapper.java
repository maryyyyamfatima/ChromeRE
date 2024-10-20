package com.google.android.apps.gsa.publicsearch;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C0754Fu3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SystemParcelableWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0754Fu3();
    public final Parcelable a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SystemParcelableWrapper(Parcelable parcelable) {
        String name = parcelable.getClass().getName();
        if (!(name.startsWith("android.os.") || name.equals("android.content.Intent") || name.equals("android.app.PendingIntent"))) {
            throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
        }
        this.a = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
