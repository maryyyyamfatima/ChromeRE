package org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.AbstractC4851eH1;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class Linker$LibInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public String a;
    public long mLoadAddress;
    public long mLoadSize;
    public int mRelroFd;
    public long mRelroSize;
    public long mRelroStart;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    public Linker$LibInfo() {
        this.mRelroFd = -1;
    }

    public Linker$LibInfo(Parcel parcel) {
        this.mRelroFd = -1;
        this.a = parcel.readString();
        this.mLoadAddress = parcel.readLong();
        this.mLoadSize = parcel.readLong();
        this.mRelroStart = parcel.readLong();
        this.mRelroSize = parcel.readLong();
        if (parcel.readInt() != 0) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            if (parcelFileDescriptor != null) {
                this.mRelroFd = parcelFileDescriptor.detachFd();
                return;
            }
            return;
        }
        this.mRelroFd = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.mLoadAddress);
        parcel.writeLong(this.mLoadSize);
        parcel.writeLong(this.mRelroStart);
        parcel.writeLong(this.mRelroSize);
        parcel.writeInt(this.mRelroFd >= 0 ? 1 : 0);
        int i2 = this.mRelroFd;
        if (i2 >= 0) {
            try {
                ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i2);
                fromFd.writeToParcel(parcel, 0);
                fromFd.close();
            } catch (IOException e) {
                AbstractC4851eH1.a("Linker", "Can't write LibInfo file descriptor to parcel", e);
            }
        }
    }
}
