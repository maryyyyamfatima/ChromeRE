package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.gcm.PendingCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AX0 extends Service {
    public final Object a = new Object();
    public int g;
    public ExecutorService h;
    public Messenger i;
    public ComponentName j;
    public C11111wX0 k;
    public C5186fF2 l;

    public void b() {
    }

    public abstract int c(LF3 lf3);

    @Override // android.app.Service
    public final void onCreate() {
        C11111wX0 c11111wX0;
        super.onCreate();
        synchronized (C11111wX0.class) {
            if (C11111wX0.c == null) {
                C11111wX0.c = new C11111wX0(getApplicationContext());
            }
            c11111wX0 = C11111wX0.c;
        }
        this.k = c11111wX0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11454xX0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.h = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.i = new Messenger(new HandlerC11797yX0(this, Looper.getMainLooper()));
        this.j = new ComponentName(this, getClass());
        this.l = AbstractC5530gF2.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        List<Runnable> shutdownNow = this.h.shutdownNow();
        if (shutdownNow.isEmpty()) {
            return;
        }
        Log.e("GcmTaskService", "Shutting down, but not all tasks are finished executing. Remaining: " + shutdownNow.size());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra("extras");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                if (!(parcelableExtra instanceof PendingCallback)) {
                    Log.e("GcmTaskService", getPackageName() + " " + stringExtra + ": Could not process request, invalid callback.");
                    return 2;
                }
                if (a(stringExtra)) {
                    return 2;
                }
                RunnableC12140zX0 runnableC12140zX0 = new RunnableC12140zX0(this, stringExtra, ((PendingCallback) parcelableExtra).a, bundleExtra, longExtra, parcelableArrayListExtra);
                try {
                    this.h.execute(runnableC12140zX0);
                } catch (RejectedExecutionException e) {
                    Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
                    runnableC12140zX0.b(1);
                }
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                b();
            } else {
                Log.e("GcmTaskService", "Unknown action received " + action + ", terminating");
            }
            return 2;
        } finally {
            d(i2);
        }
    }

    public final boolean a(String str) {
        boolean z;
        synchronized (this.a) {
            z = !this.k.a(str, this.j.getClassName());
            if (z) {
                Log.w("GcmTaskService", getPackageName() + " " + str + ": Task already running, won't start another");
            }
        }
        return z;
    }

    public final void d(int i) {
        synchronized (this.a) {
            this.g = i;
            if (!this.k.d(this.j.getClassName())) {
                stopSelf(this.g);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return this.i.getBinder();
    }
}
