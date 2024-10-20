package org.chromium.base.process_launcher;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.C8656pM0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FileDescriptorInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8656pM0();
    public final int a;
    public final ParcelFileDescriptor g;
    public final long h;
    public final long i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    public FileDescriptorInfo(int i, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
        this.a = i;
        this.g = parcelFileDescriptor;
        this.h = j;
        this.i = j2;
    }

    public FileDescriptorInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.g = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        this.h = parcel.readLong();
        this.i = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.g, 1);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
    }
}
