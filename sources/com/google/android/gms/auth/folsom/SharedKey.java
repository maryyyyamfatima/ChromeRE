package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.H83;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SharedKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new H83();
    public final int a;
    public final byte[] g;

    public SharedKey(int i, byte[] bArr) {
        this.a = i;
        this.g = bArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.d(parcel, 2, this.g);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedKey)) {
            return false;
        }
        SharedKey sharedKey = (SharedKey) obj;
        return this.a == sharedKey.a && Arrays.equals(this.g, sharedKey.g);
    }
}
