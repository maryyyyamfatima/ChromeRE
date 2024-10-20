package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11966z01 implements Handler.Callback {
    public final InterfaceC11623y01 a;
    public final HandlerC10413uU3 m;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public volatile boolean j = false;
    public final AtomicInteger k = new AtomicInteger(0);
    public boolean l = false;
    public final Object n = new Object();

    public C11966z01(Looper looper, K11 k11) {
        this.a = k11;
        this.m = new HandlerC10413uU3(looper, this);
    }

    public final void a(InterfaceC9914t11 interfaceC9914t11) {
        synchronized (this.n) {
            if (this.g.contains(interfaceC9914t11)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(interfaceC9914t11) + " is already registered");
            } else {
                this.g.add(interfaceC9914t11);
            }
        }
        if (this.a.isConnected()) {
            HandlerC10413uU3 handlerC10413uU3 = this.m;
            handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(1, interfaceC9914t11));
        }
    }

    public final void b(InterfaceC10257u11 interfaceC10257u11) {
        synchronized (this.n) {
            if (this.i.contains(interfaceC10257u11)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(interfaceC10257u11) + " is already registered");
            } else {
                this.i.add(interfaceC10257u11);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            InterfaceC9914t11 interfaceC9914t11 = (InterfaceC9914t11) message.obj;
            synchronized (this.n) {
                if (this.j && this.a.isConnected() && this.g.contains(interfaceC9914t11)) {
                    interfaceC9914t11.h(this.a.b());
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", AbstractC9076qb1.a("Don't know how to handle message: ", i), new Exception());
        return false;
    }
}
