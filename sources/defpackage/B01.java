package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B01 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int g = 2;
    public boolean h;
    public IBinder i;
    public final A01 j;
    public ComponentName k;
    public final /* synthetic */ D01 l;

    public B01(D01 d01, A01 a01) {
        this.l = d01;
        this.j = a01;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.l.a) {
            this.l.c.removeMessages(1, this.j);
            this.i = iBinder;
            this.k = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.g = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.l.a) {
            this.l.c.removeMessages(1, this.j);
            this.i = null;
            this.k = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.g = 2;
        }
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.g = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            D01 d01 = this.l;
            S30 s30 = d01.d;
            Context context = d01.b;
            boolean a = s30.a(this.j.d, context, this.j.a(context), this, str, executor);
            this.h = a;
            if (a) {
                this.l.c.sendMessageDelayed(this.l.c.obtainMessage(1, this.j), this.l.f);
            } else {
                this.g = 2;
                try {
                    D01 d012 = this.l;
                    d012.d.d(d012.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
