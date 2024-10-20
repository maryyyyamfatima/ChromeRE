package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC5958hW1 implements ServiceConnection {
    public C6644jW1 h;
    public final /* synthetic */ C8707pW1 k;
    public int a = 0;
    public final Messenger g = new Messenger(new HandlerC10413uU3(Looper.getMainLooper(), new Handler.Callback() { // from class: XV1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC5958hW1 serviceConnectionC5958hW1 = ServiceConnectionC5958hW1.this;
            serviceConnectionC5958hW1.getClass();
            int i = message.arg1;
            synchronized (serviceConnectionC5958hW1) {
                C6988kW1 c6988kW1 = (C6988kW1) serviceConnectionC5958hW1.j.get(i);
                if (c6988kW1 == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                serviceConnectionC5958hW1.j.remove(i);
                serviceConnectionC5958hW1.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    c6988kW1.a(new C7676mW1("Not supported by GmsCore"));
                    return true;
                }
                if (data.getBoolean("ack", false)) {
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String.valueOf(c6988kW1);
                    }
                    c6988kW1.b.b(null);
                    return true;
                }
                c6988kW1.a(new C7676mW1("Invalid response to one way request"));
                return true;
            }
        }
    }));
    public final ArrayDeque i = new ArrayDeque();
    public final SparseArray j = new SparseArray();

    public ServiceConnectionC5958hW1(C8707pW1 c8707pW1) {
        this.k = c8707pW1;
    }

    public final synchronized boolean a(C6988kW1 c6988kW1) {
        int i = this.a;
        if (i == 0) {
            this.i.add(c6988kW1);
            e();
            return true;
        }
        if (i == 1) {
            this.i.add(c6988kW1);
            return true;
        }
        if (i == 2) {
            this.i.add(c6988kW1);
            this.k.b.execute(new RunnableC4583dW1(this));
            return true;
        }
        if (i != 3 && i != 4) {
            throw new IllegalStateException("Unknown state: " + this.a);
        }
        return false;
    }

    public final void e() {
        C8707pW1 c8707pW1 = this.k;
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!S30.c().b(c8707pW1.a, intent, this, 1)) {
                c(0, "Unable to bind to service");
                return;
            }
            c8707pW1.b.schedule(new Runnable() { // from class: eW1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC5958hW1 serviceConnectionC5958hW1 = ServiceConnectionC5958hW1.this;
                    synchronized (serviceConnectionC5958hW1) {
                        if (serviceConnectionC5958hW1.a == 1) {
                            serviceConnectionC5958hW1.c(1, "Timed out while binding");
                        }
                    }
                }
            }, 30L, TimeUnit.SECONDS);
        } catch (SecurityException e) {
            d(0, "Unable to bind to service", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.k.b.execute(new Runnable() { // from class: ZV1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5958hW1 serviceConnectionC5958hW1 = ServiceConnectionC5958hW1.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC5958hW1) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC5958hW1.c(0, "Null service connection");
                        } else {
                            try {
                                serviceConnectionC5958hW1.h = new C6644jW1(iBinder2);
                                serviceConnectionC5958hW1.a = 2;
                                serviceConnectionC5958hW1.k.b.execute(new RunnableC4583dW1(serviceConnectionC5958hW1));
                            } catch (RemoteException e) {
                                serviceConnectionC5958hW1.c(0, e.getMessage());
                            }
                        }
                    } finally {
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.k.b.execute(new Runnable() { // from class: bW1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5958hW1.this.c(2, "Service disconnected");
            }
        });
    }

    public final synchronized void c(int i, String str) {
        d(i, str, null);
    }

    public final synchronized void d(int i, String str, SecurityException securityException) {
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 == 1 || i2 == 2) {
            this.a = 4;
            S30.c().d(this.k.a, this);
            b(new C7676mW1(str, securityException));
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            throw new IllegalStateException("Unknown state: " + this.a);
        }
    }

    public final void b(C7676mW1 c7676mW1) {
        ArrayDeque arrayDeque = this.i;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((C6988kW1) it.next()).a(c7676mW1);
        }
        arrayDeque.clear();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.j;
            if (i < sparseArray.size()) {
                ((C6988kW1) sparseArray.valueAt(i)).a(c7676mW1);
                i++;
            } else {
                sparseArray.clear();
                return;
            }
        }
    }

    public final synchronized void f() {
        if (this.a == 2 && this.i.isEmpty() && this.j.size() == 0) {
            this.a = 3;
            S30.c().d(this.k.a, this);
        }
    }
}
