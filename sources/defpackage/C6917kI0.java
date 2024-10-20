package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kI0 */
/* loaded from: classes.dex */
public final class C6917kI0 {
    public static final Object c = new Object();
    public static Cq4 d;
    public final Context a;
    public final VV0 b = new VV0();

    public C6917kI0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [hI0] */
    public final AF3 b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean a = AbstractC0758Fv2.a();
        final Context context = this.a;
        boolean z = a && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent);
        }
        Callable callable = new Callable() { // from class: gI0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C10963w43 c10963w43;
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                synchronized (C10963w43.class) {
                    if (C10963w43.d == null) {
                        C10963w43.d = new C10963w43();
                    }
                    c10963w43 = C10963w43.d;
                }
                c10963w43.c.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c10963w43) {
                    str = c10963w43.a;
                    if (str == null) {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    c10963w43.a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    c10963w43.a = serviceInfo.name;
                                }
                                str = c10963w43.a;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            str = null;
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        str = null;
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (c10963w43.a(context2)) {
                        startService = Bj4.a(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(String.valueOf(e)));
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        };
        AF3 af3 = new AF3();
        VV0 vv0 = this.b;
        vv0.getClass();
        try {
            af3.n(callable.call());
        } catch (Exception e) {
            af3.m(e);
        } catch (Throwable th) {
            af3.m(new RuntimeException(th));
        }
        ?? r0 = new InterfaceC9269r80() { // from class: hI0
            @Override // defpackage.InterfaceC9269r80
            public final Object a(AF3 af32) {
                return (AbstractC0758Fv2.a() && ((Integer) af32.k()).intValue() == 402) ? C6917kI0.a(context, intent).h(new VV0(), new InterfaceC9269r80() { // from class: jI0
                    @Override // defpackage.InterfaceC9269r80
                    public final Object a(AF3 af33) {
                        return 403;
                    }
                }) : af32;
            }
        };
        AF3 af32 = new AF3();
        af3.b.a(new C11670y80(vv0, r0, af32));
        af3.i();
        return af32;
    }

    public static AF3 a(Context context, Intent intent) {
        Cq4 cq4;
        AF3 af3;
        synchronized (c) {
            if (d == null) {
                d = new Cq4(context);
            }
            cq4 = d;
        }
        synchronized (cq4) {
            final Bq4 bq4 = new Bq4(intent);
            ScheduledExecutorService scheduledExecutorService = cq4.h;
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: zq4
                @Override // java.lang.Runnable
                public final void run() {
                    Bq4 bq42 = Bq4.this;
                    Log.w("FirebaseMessaging", "Service took too long to process intent: " + bq42.a.getAction() + " App may get closed.");
                    bq42.b.d(null);
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            bq4.b.a.b(scheduledExecutorService, new InterfaceC1702Nc2() { // from class: Aq4
                @Override // defpackage.InterfaceC1702Nc2
                public final void b(AF3 af32) {
                    schedule.cancel(false);
                }
            });
            cq4.i.add(bq4);
            cq4.a();
            af3 = bq4.b.a;
        }
        return af3.h(new VV0(), new InterfaceC9269r80() { // from class: iI0
            @Override // defpackage.InterfaceC9269r80
            public final Object a(AF3 af32) {
                return -1;
            }
        });
    }
}
