package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DB0 extends Service {
    public final ExecutorService a;
    public BinderC11912yq4 g;
    public final Object h;
    public int i;
    public int j;

    public abstract void b(Intent intent);

    public DB0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new K02("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.h = new Object();
        this.j = 0;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.g == null) {
            this.g = new BinderC11912yq4(new CB0(this));
        }
        return this.g;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        C10963w43 c10963w43;
        boolean z;
        synchronized (this.h) {
            this.i = i2;
            this.j++;
        }
        synchronized (C10963w43.class) {
            if (C10963w43.d == null) {
                C10963w43.d = new C10963w43();
            }
            c10963w43 = C10963w43.d;
        }
        Intent intent2 = (Intent) c10963w43.c.poll();
        if (intent2 != null) {
            C6905kF3 c6905kF3 = new C6905kF3();
            this.a.execute(new BB0(this, intent2, c6905kF3));
            AF3 af3 = c6905kF3.a;
            synchronized (af3.a) {
                z = af3.c;
            }
            if (z) {
                a(intent);
                return 2;
            }
            af3.b(new VV0(), new InterfaceC1702Nc2() { // from class: AB0
                @Override // defpackage.InterfaceC1702Nc2
                public final void b(AF3 af32) {
                    DB0.this.a(intent);
                }
            });
            return 3;
        }
        a(intent);
        return 2;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            synchronized (Bj4.b) {
                if (Bj4.c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    Bj4.c.d();
                }
            }
        }
        synchronized (this.h) {
            int i = this.j - 1;
            this.j = i;
            if (i == 0) {
                stopSelfResult(this.i);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }
}
