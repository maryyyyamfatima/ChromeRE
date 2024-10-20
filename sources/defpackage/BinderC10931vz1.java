package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import java.nio.charset.StandardCharsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC10931vz1 extends Binder {
    public final Context a;
    public Integer g;
    public final FutureC10588uz1 h = new FutureC10588uz1(this);

    public BinderC10931vz1(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte[] byteArray;
        long j;
        if (parcel == null) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
        if (i != 1) {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            if (readBundle != null) {
                synchronized (this.h) {
                    this.g = Integer.valueOf(readBundle.getInt("activity_result"));
                    this.h.notifyAll();
                }
            }
            return true;
        }
        if (readBundle != null && (byteArray = readBundle.getByteArray("challenge")) != null && parcel2 != null) {
            if (byteArray.length != 0) {
                if (byteArray.length == 0) {
                    j = 0;
                } else {
                    int i3 = -2078137563;
                    for (byte b : byteArray) {
                        i3 = (i3 ^ b) * 435;
                    }
                    j = i3 & 4294967295L;
                }
                byteArray = Long.toHexString(j).getBytes(StandardCharsets.UTF_8);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putByteArray("challenge_reply", byteArray);
            bundle.putString("caller_package", this.a.getApplicationContext().getPackageName());
            parcel2.writeNoException();
            parcel2.writeBundle(bundle);
        }
        return true;
    }
}
