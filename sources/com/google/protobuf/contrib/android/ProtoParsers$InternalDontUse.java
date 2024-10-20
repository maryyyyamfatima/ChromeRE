package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import defpackage.C6899kE2;
import defpackage.HV;
import defpackage.KV;
import defpackage.QX0;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ProtoParsers$InternalDontUse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6899kE2();
    public volatile byte[] a;
    public volatile MessageLite g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ProtoParsers$InternalDontUse(byte[] bArr, QX0 qx0) {
        this.a = bArr;
        this.g = qx0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            int e = this.g.e();
            byte[] bArr = new byte[e];
            try {
                MessageLite messageLite = this.g;
                boolean z = KV.b;
                messageLite.f(new HV(bArr, e));
                this.a = bArr;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
