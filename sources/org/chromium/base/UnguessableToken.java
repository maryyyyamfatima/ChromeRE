package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C4078c14;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4078c14();
    public final long a;
    public final long g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UnguessableToken(long j, long j2) {
        this.a = j;
        this.g = j2;
    }

    public static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    public long getHighForSerialization() {
        return this.a;
    }

    public long getLowForSerialization() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.g);
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnguessableToken unguessableToken = (UnguessableToken) obj;
        return unguessableToken.a == this.a && unguessableToken.g == this.g;
    }

    public final int hashCode() {
        long j = this.g;
        long j2 = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public final UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }
}
