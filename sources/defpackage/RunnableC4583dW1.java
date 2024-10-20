package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4583dW1 implements Runnable {
    public final /* synthetic */ ServiceConnectionC5958hW1 a;

    public /* synthetic */ RunnableC4583dW1(ServiceConnectionC5958hW1 serviceConnectionC5958hW1) {
        this.a = serviceConnectionC5958hW1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ServiceConnectionC5958hW1 serviceConnectionC5958hW1 = this.a;
        while (true) {
            synchronized (serviceConnectionC5958hW1) {
                if (serviceConnectionC5958hW1.a != 2) {
                    return;
                }
                if (serviceConnectionC5958hW1.i.isEmpty()) {
                    serviceConnectionC5958hW1.f();
                    return;
                }
                final C6988kW1 c6988kW1 = (C6988kW1) serviceConnectionC5958hW1.i.poll();
                serviceConnectionC5958hW1.j.put(c6988kW1.a, c6988kW1);
                serviceConnectionC5958hW1.k.b.schedule(new Runnable() { // from class: fW1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC5958hW1 serviceConnectionC5958hW12 = ServiceConnectionC5958hW1.this;
                        C6988kW1 c6988kW12 = c6988kW1;
                        serviceConnectionC5958hW12.getClass();
                        int i = c6988kW12.a;
                        synchronized (serviceConnectionC5958hW12) {
                            C6988kW1 c6988kW13 = (C6988kW1) serviceConnectionC5958hW12.j.get(i);
                            if (c6988kW13 != null) {
                                Log.w("MessengerIpcClient", "Timing out request: " + i);
                                serviceConnectionC5958hW12.j.remove(i);
                                c6988kW13.a(new C7676mW1("Timed out waiting for response"));
                                serviceConnectionC5958hW12.f();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String.valueOf(c6988kW1);
                }
                Context context = serviceConnectionC5958hW1.k.a;
                Message obtain = Message.obtain();
                obtain.what = c6988kW1.c;
                obtain.arg1 = c6988kW1.a;
                obtain.replyTo = serviceConnectionC5958hW1.g;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", true);
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", c6988kW1.d);
                obtain.setData(bundle);
                try {
                    C6644jW1 c6644jW1 = serviceConnectionC5958hW1.h;
                    Messenger messenger = c6644jW1.a;
                    if (messenger != null) {
                        messenger.send(obtain);
                    } else {
                        CloudMessagingMessengerCompat cloudMessagingMessengerCompat = c6644jW1.b;
                        if (cloudMessagingMessengerCompat != null) {
                            Messenger messenger2 = cloudMessagingMessengerCompat.a;
                            messenger2.getClass();
                            messenger2.send(obtain);
                        } else {
                            throw new IllegalStateException("Both messengers are null");
                            break;
                        }
                    }
                } catch (RemoteException e) {
                    serviceConnectionC5958hW1.c(2, e.getMessage());
                }
            }
        }
    }
}
