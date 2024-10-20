package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class WV1 implements Runnable {
    public final /* synthetic */ ServiceConnectionC5614gW1 a;

    public /* synthetic */ WV1(ServiceConnectionC5614gW1 serviceConnectionC5614gW1) {
        this.a = serviceConnectionC5614gW1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ServiceConnectionC5614gW1 serviceConnectionC5614gW1 = this.a;
        while (true) {
            synchronized (serviceConnectionC5614gW1) {
                if (serviceConnectionC5614gW1.a != 2) {
                    return;
                }
                if (serviceConnectionC5614gW1.i.isEmpty()) {
                    serviceConnectionC5614gW1.e();
                    return;
                }
                final C8020nW1 c8020nW1 = (C8020nW1) serviceConnectionC5614gW1.i.poll();
                serviceConnectionC5614gW1.j.put(c8020nW1.a, c8020nW1);
                serviceConnectionC5614gW1.k.b.schedule(new Runnable() { // from class: aW1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC5614gW1 serviceConnectionC5614gW12 = ServiceConnectionC5614gW1.this;
                        C8020nW1 c8020nW12 = c8020nW1;
                        serviceConnectionC5614gW12.getClass();
                        int i = c8020nW12.a;
                        synchronized (serviceConnectionC5614gW12) {
                            C8020nW1 c8020nW13 = (C8020nW1) serviceConnectionC5614gW12.j.get(i);
                            if (c8020nW13 != null) {
                                Log.w("MessengerIpcClient", "Timing out request: " + i);
                                serviceConnectionC5614gW12.j.remove(i);
                                c8020nW13.a(new C7332lW1(3, "Timed out waiting for response"));
                                serviceConnectionC5614gW12.e();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String.valueOf(c8020nW1);
                }
                Context context = serviceConnectionC5614gW1.k.a;
                Message obtain = Message.obtain();
                obtain.what = c8020nW1.c;
                obtain.arg1 = c8020nW1.a;
                obtain.replyTo = serviceConnectionC5614gW1.g;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", false);
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", c8020nW1.d);
                obtain.setData(bundle);
                try {
                    C6302iW1 c6302iW1 = serviceConnectionC5614gW1.h;
                    Messenger messenger = c6302iW1.a;
                    if (messenger != null) {
                        messenger.send(obtain);
                    } else {
                        MessengerCompat messengerCompat = c6302iW1.b;
                        if (messengerCompat != null) {
                            Messenger messenger2 = messengerCompat.a;
                            messenger2.getClass();
                            messenger2.send(obtain);
                        } else {
                            throw new IllegalStateException("Both messengers are null");
                            break;
                        }
                    }
                } catch (RemoteException e) {
                    serviceConnectionC5614gW1.c(2, e.getMessage());
                }
            }
        }
    }
}
