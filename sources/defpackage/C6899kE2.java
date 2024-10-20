package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kE2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6899kE2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new ProtoParsers$InternalDontUse(bArr, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProtoParsers$InternalDontUse[i];
    }
}
