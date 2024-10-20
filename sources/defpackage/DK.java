package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.Executor;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DK implements ServiceConnection {
    public final Context a;
    public final Intent g;
    public final int h;
    public final Handler i;
    public final Executor j;
    public OJ k;
    public final String l;
    public boolean m;

    public DK(Context context, Intent intent, int i, Handler handler, Executor executor, OJ oj, String str) {
        this.a = context;
        this.g = intent;
        this.h = i;
        this.i = handler;
        this.j = executor;
        this.k = oj;
        this.l = str;
    }

    public final void b() {
        if (this.m) {
            this.a.unbindService(this);
            this.m = false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        final OJ oj = this.k;
        if (oj != null) {
            VJ vj = oj.a;
            if (vj.b.getLooper() == Looper.myLooper()) {
                vj.h(iBinder);
                return;
            } else {
                vj.b.post(new Runnable() { // from class: MJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        OJ.this.a.h(iBinder);
                    }
                });
                return;
            }
        }
        AbstractC4851eH1.f("ChildServiceConn", "onServiceConnected after timeout " + componentName, new Object[0]);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        final OJ oj = this.k;
        if (oj != null) {
            VJ vj = oj.a;
            if (vj.b.getLooper() == Looper.myLooper()) {
                vj.i();
            } else {
                vj.b.post(new Runnable() { // from class: NJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        OJ.this.a.i();
                    }
                });
            }
        }
    }

    public final boolean a() {
        try {
            TraceEvent.b("ChildServiceConnectionImpl.bindServiceConnection", null);
            this.m = AbstractC2064Px.b(this.a, this.g, this, this.h, this.i, this.j, this.l);
            TraceEvent.c("ChildServiceConnectionImpl.bindServiceConnection");
            return this.m;
        } catch (Throwable th) {
            TraceEvent.c("ChildServiceConnectionImpl.bindServiceConnection");
            throw th;
        }
    }
}
