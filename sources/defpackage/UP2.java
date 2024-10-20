package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UP2 extends Binder implements InterfaceC4289cf1 {
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ ResultReceiver a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        if (i == 1) {
            int readInt = parcel.readInt();
            Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver resultReceiver = this.a;
            resultReceiver.getClass();
            resultReceiver.a(readInt, (Bundle) createFromParcel);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public UP2(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }
}
