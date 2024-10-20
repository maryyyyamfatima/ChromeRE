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
/* renamed from: gW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC5614gW1 implements ServiceConnection {
    public C6302iW1 h;
    public final /* synthetic */ C8364oW1 k;
    public int a = 0;
    public final Messenger g = new Messenger(new HandlerC10413uU3(Looper.getMainLooper(), new Handler.Callback() { // from class: YV1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC5614gW1 serviceConnectionC5614gW1 = ServiceConnectionC5614gW1.this;
            serviceConnectionC5614gW1.getClass();
            int i = message.arg1;
            synchronized (serviceConnectionC5614gW1) {
                C8020nW1 c8020nW1 = (C8020nW1) serviceConnectionC5614gW1.j.get(i);
                if (c8020nW1 == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                serviceConnectionC5614gW1.j.remove(i);
                serviceConnectionC5614gW1.e();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    c8020nW1.a(new C7332lW1(4, "Not supported by GmsCore"));
                    return true;
                }
                Bundle bundle = data.getBundle("data");
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String.valueOf(c8020nW1);
                    String.valueOf(bundle);
                }
                c8020nW1.b.b(bundle);
                return true;
            }
        }
    }));
    public final ArrayDeque i = new ArrayDeque();
    public final SparseArray j = new SparseArray();

    public ServiceConnectionC5614gW1(C8364oW1 c8364oW1) {
        this.k = c8364oW1;
    }

    public final synchronized boolean a(C8020nW1 c8020nW1) {
        int i = this.a;
        if (i == 0) {
            this.i.add(c8020nW1);
            d();
            return true;
        }
        if (i == 1) {
            this.i.add(c8020nW1);
            return true;
        }
        if (i == 2) {
            this.i.add(c8020nW1);
            this.k.b.execute(new WV1(this));
            return true;
        }
        if (i != 3 && i != 4) {
            throw new IllegalStateException("Unknown state: " + this.a);
        }
        return false;
    }

    public final void d() {
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        S30 c = S30.c();
        C8364oW1 c8364oW1 = this.k;
        if (!c.b(c8364oW1.a, intent, this, 1)) {
            c(0, "Unable to bind to service");
        } else {
            c8364oW1.b.schedule(new Runnable() { // from class: cW1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC5614gW1 serviceConnectionC5614gW1 = ServiceConnectionC5614gW1.this;
                    synchronized (serviceConnectionC5614gW1) {
                        if (serviceConnectionC5614gW1.a == 1) {
                            serviceConnectionC5614gW1.c(1, "Timed out while binding");
                        }
                    }
                }
            }, 30L, TimeUnit.SECONDS);
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            c(0, "Null service connection");
            return;
        }
        try {
            this.h = new C6302iW1(iBinder);
            this.a = 2;
            this.k.b.execute(new WV1(this));
        } catch (RemoteException e) {
            c(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        c(2, "Service disconnected");
    }

    public final synchronized void c(int i, String str) {
        Log.isLoggable("MessengerIpcClient", 3);
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 4;
            S30.c().d(this.k.a, this);
            b(new C7332lW1(i, str));
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            throw new IllegalStateException("Unknown state: " + this.a);
        }
    }

    public final void b(C7332lW1 c7332lW1) {
        ArrayDeque arrayDeque = this.i;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((C8020nW1) it.next()).a(c7332lW1);
        }
        arrayDeque.clear();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.j;
            if (i < sparseArray.size()) {
                ((C8020nW1) sparseArray.valueAt(i)).a(c7332lW1);
                i++;
            } else {
                sparseArray.clear();
                return;
            }
        }
    }

    public final synchronized void e() {
        if (this.a == 2 && this.i.isEmpty() && this.j.size() == 0) {
            this.a = 3;
            S30.c().d(this.k.a, this);
        }
    }
}
