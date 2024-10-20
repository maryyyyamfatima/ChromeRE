package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Cq4 implements ServiceConnection {
    public final Context a;
    public final Intent g;
    public final ScheduledExecutorService h;
    public final ArrayDeque i;
    public BinderC11912yq4 j;
    public boolean k;

    public Cq4(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new K02("Firebase-FirebaseInstanceIdServiceConnection"));
        this.i = new ArrayDeque();
        this.k = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.g = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.h = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.i.isEmpty()) {
            BinderC11912yq4 binderC11912yq4 = this.j;
            if (binderC11912yq4 != null && binderC11912yq4.isBinderAlive()) {
                this.j.a((Bq4) this.i.poll());
            } else {
                if (!this.k) {
                    this.k = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!S30.c().b(this.a, this.g, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.k = false;
                        while (true) {
                            ArrayDeque arrayDeque = this.i;
                            if (arrayDeque.isEmpty()) {
                                break;
                            } else {
                                ((Bq4) arrayDeque.poll()).b.d(null);
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String.valueOf(componentName);
        }
        this.k = false;
        if (!(iBinder instanceof BinderC11912yq4)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
            while (true) {
                ArrayDeque arrayDeque = this.i;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((Bq4) arrayDeque.poll()).b.d(null);
                }
            }
        } else {
            this.j = (BinderC11912yq4) iBinder;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String.valueOf(componentName);
        }
        a();
    }
}
