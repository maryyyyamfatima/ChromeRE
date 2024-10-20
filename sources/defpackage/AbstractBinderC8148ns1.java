package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ns1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC8148ns1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC8148ns1() {
        attachInterface(this, "org.chromium.IsReadyToPayServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.IsReadyToPayServiceCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.IsReadyToPayServiceCallback");
            return true;
        }
        if (i == 1) {
            final boolean z = parcel.readInt() != 0;
            ServiceConnectionC9520rs1 serviceConnectionC9520rs1 = (ServiceConnectionC9520rs1) this;
            if (serviceConnectionC9520rs1.g != null) {
                EI2.b("PaymentRequest.EventResponse.IsReadyToPay", z);
                final C0000Aa c0000Aa = (C0000Aa) serviceConnectionC9520rs1.g;
                c0000Aa.getClass();
                PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: ra
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0000Aa.this.G(z);
                    }
                });
                serviceConnectionC9520rs1.g = null;
                if (serviceConnectionC9520rs1.h) {
                    serviceConnectionC9520rs1.a.unbindService(serviceConnectionC9520rs1);
                    serviceConnectionC9520rs1.h = false;
                }
                serviceConnectionC9520rs1.j.removeCallbacksAndMessages(null);
            }
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
