package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ie1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1062Ie1 implements InterfaceC1192Je1 {
    public final IBinder a;

    public C1062Ie1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final void e(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
