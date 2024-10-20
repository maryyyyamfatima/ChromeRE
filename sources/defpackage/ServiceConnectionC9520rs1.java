package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC9520rs1 extends AbstractBinderC8148ns1 implements ServiceConnection {
    public final Context a;
    public InterfaceC9178qs1 g;
    public boolean h;
    public boolean i;
    public final Handler j = new Handler();
    public final Intent k;

    public ServiceConnectionC9520rs1(Context context, Intent intent, C0000Aa c0000Aa) {
        this.a = context;
        this.g = c0000Aa;
        this.k = intent;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface c7460ls1;
        if (this.g == null) {
            return;
        }
        if (iBinder == null) {
            c7460ls1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.IsReadyToPayService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC7804ms1)) {
                c7460ls1 = (InterfaceC7804ms1) queryLocalInterface;
            } else {
                c7460ls1 = new C7460ls1(iBinder);
            }
        }
        if (c7460ls1 != null) {
            EI2.h(2, 2, "PaymentRequest.PrePurchaseQuery");
            this.i = true;
            try {
                C7460ls1 c7460ls12 = (C7460ls1) c7460ls1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("org.chromium.IsReadyToPayService");
                    obtain.writeStrongInterface(this);
                    c7460ls12.a.transact(1, obtain, null, 1);
                    this.j.postDelayed(new Runnable() { // from class: ps1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ServiceConnectionC9520rs1.this.a();
                        }
                    }, 400L);
                    return;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable unused) {
                a();
                return;
            }
        }
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a();
    }

    public final void a() {
        InterfaceC9178qs1 interfaceC9178qs1 = this.g;
        if (interfaceC9178qs1 == null) {
            return;
        }
        final C0000Aa c0000Aa = (C0000Aa) interfaceC9178qs1;
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: ta
            @Override // java.lang.Runnable
            public final void run() {
                C0000Aa.this.G(false);
            }
        });
        this.g = null;
        if (this.h) {
            this.a.unbindService(this);
            this.h = false;
        }
        this.j.removeCallbacksAndMessages(null);
    }
}
