package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h21 */
/* loaded from: classes.dex */
public final class C5800h21 implements Handler.Callback {
    public static final Status u = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status v = new Status(4, "The user must be signed in to make this API call.");
    public static final Object w = new Object();
    public static C5800h21 x;
    public long a;
    public boolean g;
    public TelemetryData h;
    public C7454lr1 i;
    public final Context j;
    public final C8543p11 k;
    public final C8886q11 l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final ConcurrentHashMap o;
    public W30 p;
    public final C5348fk q;
    public final C5348fk r;
    public final HandlerC10413uU3 s;
    public volatile boolean t;

    public static C5800h21 a(Context context) {
        C5800h21 c5800h21;
        HandlerThread handlerThread;
        synchronized (w) {
            if (x == null) {
                synchronized (D01.g) {
                    handlerThread = D01.i;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        D01.i = handlerThread2;
                        handlerThread2.start();
                        handlerThread = D01.i;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C8543p11.c;
                x = new C5800h21(applicationContext, looper);
            }
            c5800h21 = x;
        }
        return c5800h21;
    }

    public C5800h21(Context context, Looper looper) {
        C8543p11 c8543p11 = C8543p11.d;
        this.a = 10000L;
        this.g = false;
        this.m = new AtomicInteger(1);
        this.n = new AtomicInteger(0);
        this.o = new ConcurrentHashMap(5, 0.75f, 1);
        this.p = null;
        this.q = new C5348fk(0);
        this.r = new C5348fk(0);
        this.t = true;
        this.j = context;
        HandlerC10413uU3 handlerC10413uU3 = new HandlerC10413uU3(looper, this);
        this.s = handlerC10413uU3;
        this.k = c8543p11;
        this.l = new C8886q11(c8543p11);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC2655Ul0.d == null) {
            AbstractC2655Ul0.d = Boolean.valueOf(AbstractC0758Fv2.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC2655Ul0.d.booleanValue()) {
            this.t = false;
        }
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(6));
    }

    public final void f(W30 w30) {
        synchronized (w) {
            if (this.p != w30) {
                this.p = w30;
                this.q.clear();
            }
            this.q.addAll(w30.k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C6905kF3 r9, int r10, defpackage.AbstractC7856n11 r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7a
            Ee r3 = r11.e
            boolean r11 = r8.b()
            if (r11 != 0) goto Lb
            goto L41
        Lb:
            vQ2 r11 = defpackage.C10735vQ2.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.a
            r0 = 1
            if (r11 == 0) goto L4d
            boolean r1 = r11.g
            if (r1 != 0) goto L19
            goto L41
        L19:
            java.util.concurrent.ConcurrentHashMap r1 = r8.o
            java.lang.Object r1 = r1.get(r3)
            d21 r1 = (defpackage.C4425d21) r1
            if (r1 == 0) goto L4b
            Yc r2 = r1.g
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r4 != 0) goto L2a
            goto L41
        L2a:
            com.google.android.gms.common.internal.BaseGmsClient r2 = (com.google.android.gms.common.internal.BaseGmsClient) r2
            com.google.android.gms.common.internal.ConnectionInfo r4 = r2.A
            if (r4 == 0) goto L32
            r4 = r0
            goto L33
        L32:
            r4 = 0
        L33:
            if (r4 == 0) goto L4b
            boolean r4 = r2.r()
            if (r4 != 0) goto L4b
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = defpackage.ZW1.a(r1, r2, r10)
            if (r11 != 0) goto L43
        L41:
            r10 = 0
            goto L69
        L43:
            int r2 = r1.q
            int r2 = r2 + r0
            r1.q = r2
            boolean r0 = r11.h
            goto L4d
        L4b:
            boolean r0 = r11.h
        L4d:
            ZW1 r11 = new ZW1
            r1 = 0
            if (r0 == 0) goto L58
            long r4 = java.lang.System.currentTimeMillis()
            goto L59
        L58:
            r4 = r1
        L59:
            if (r0 == 0) goto L61
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L62
        L61:
            r6 = r1
        L62:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L69:
            if (r10 == 0) goto L7a
            AF3 r9 = r9.a
            uU3 r11 = r8.s
            java.util.Objects.requireNonNull(r11)
            W11 r0 = new W11
            r0.<init>()
            r9.b(r0, r10)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5800h21.c(kF3, int, n11):void");
    }

    public final C4425d21 e(AbstractC7856n11 abstractC7856n11) {
        C0540Ee c0540Ee = abstractC7856n11.e;
        ConcurrentHashMap concurrentHashMap = this.o;
        C4425d21 c4425d21 = (C4425d21) concurrentHashMap.get(c0540Ee);
        if (c4425d21 == null) {
            c4425d21 = new C4425d21(this, abstractC7856n11);
            concurrentHashMap.put(c0540Ee, c4425d21);
        }
        if (c4425d21.g.requiresSignIn()) {
            this.r.add(c0540Ee);
        }
        c4425d21.d();
        return c4425d21;
    }

    public final boolean b() {
        if (this.g) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C10735vQ2.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.g) {
            return false;
        }
        int i = this.l.a.get(203400000, -1);
        return i == -1 || i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Feature[] f;
        int i = message.what;
        C4425d21 c4425d21 = null;
        switch (i) {
            case 1:
                this.a = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                HandlerC10413uU3 handlerC10413uU3 = this.s;
                handlerC10413uU3.removeMessages(12);
                Iterator it = this.o.keySet().iterator();
                while (it.hasNext()) {
                    handlerC10413uU3.sendMessageDelayed(handlerC10413uU3.obtainMessage(12, (C0540Ee) it.next()), this.a);
                }
                return true;
            case 2:
                X5.a(message.obj);
                throw null;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                for (C4425d21 c4425d212 : this.o.values()) {
                    HandlerC10413uU3 handlerC10413uU32 = c4425d212.r.s;
                    c4425d212.p = null;
                    c4425d212.d();
                }
                return true;
            case 4:
            case 8:
            case 13:
                DG2 dg2 = (DG2) message.obj;
                C4425d21 c4425d213 = (C4425d21) this.o.get(dg2.c.e);
                if (c4425d213 == null) {
                    c4425d213 = e(dg2.c);
                }
                boolean requiresSignIn = c4425d213.g.requiresSignIn();
                AbstractC5994hd abstractC5994hd = dg2.a;
                if (!requiresSignIn || this.n.get() == dg2.b) {
                    c4425d213.f(abstractC5994hd);
                } else {
                    abstractC5994hd.b(u);
                    c4425d213.p();
                }
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.o.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C4425d21 c4425d214 = (C4425d21) it2.next();
                        if (c4425d214.l == i2) {
                            c4425d21 = c4425d214;
                        }
                    }
                }
                if (c4425d21 == null) {
                    Log.wtf("GoogleApiManager", AbstractC9307rF1.a("Could not find API instance ", i2, " while trying to fail enqueued calls."), new Exception());
                } else if (connectionResult.g == 13) {
                    C8543p11 c8543p11 = this.k;
                    int i3 = connectionResult.g;
                    c8543p11.getClass();
                    boolean z = X31.a;
                    c4425d21.g(new Status(17, "Error resolution was canceled by the user, original error message: " + ConnectionResult.r1(i3) + ": " + connectionResult.i, 0));
                } else {
                    c4425d21.g(h(c4425d21.h, connectionResult));
                }
                return true;
            case 6:
                if (this.j.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.j.getApplicationContext();
                    ComponentCallbacks2C0870Gs componentCallbacks2C0870Gs = ComponentCallbacks2C0870Gs.j;
                    synchronized (componentCallbacks2C0870Gs) {
                        if (!componentCallbacks2C0870Gs.i) {
                            application.registerActivityLifecycleCallbacks(componentCallbacks2C0870Gs);
                            application.registerComponentCallbacks(componentCallbacks2C0870Gs);
                            componentCallbacks2C0870Gs.i = true;
                        }
                    }
                    X11 x11 = new X11(this);
                    synchronized (componentCallbacks2C0870Gs) {
                        componentCallbacks2C0870Gs.h.add(x11);
                    }
                    AtomicBoolean atomicBoolean = componentCallbacks2C0870Gs.g;
                    boolean z2 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0870Gs.a;
                    if (!z2) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.a = 300000L;
                    }
                }
                return true;
            case 7:
                e((AbstractC7856n11) message.obj);
                return true;
            case 9:
                if (this.o.containsKey(message.obj)) {
                    C4425d21 c4425d215 = (C4425d21) this.o.get(message.obj);
                    HandlerC10413uU3 handlerC10413uU33 = c4425d215.r.s;
                    if (c4425d215.n) {
                        c4425d215.d();
                    }
                }
                return true;
            case 10:
                C5348fk c5348fk = this.r;
                c5348fk.getClass();
                C5004ek c5004ek = new C5004ek(c5348fk);
                while (c5004ek.hasNext()) {
                    C4425d21 c4425d216 = (C4425d21) this.o.remove((C0540Ee) c5004ek.next());
                    if (c4425d216 != null) {
                        c4425d216.p();
                    }
                }
                c5348fk.clear();
                return true;
            case 11:
                if (this.o.containsKey(message.obj)) {
                    C4425d21 c4425d217 = (C4425d21) this.o.get(message.obj);
                    C5800h21 c5800h21 = c4425d217.r;
                    HandlerC10413uU3 handlerC10413uU34 = c5800h21.s;
                    boolean z3 = c4425d217.n;
                    if (z3) {
                        if (z3) {
                            C0540Ee c0540Ee = c4425d217.h;
                            handlerC10413uU34.removeMessages(11, c0540Ee);
                            c5800h21.s.removeMessages(9, c0540Ee);
                            c4425d217.n = false;
                        }
                        c4425d217.g(c5800h21.k.g(c5800h21.j) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", 0) : new Status(22, "API failed to connect while resuming due to an unknown error.", 0));
                        c4425d217.g.a("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.o.containsKey(message.obj)) {
                    C4425d21 c4425d218 = (C4425d21) this.o.get(message.obj);
                    HandlerC10413uU3 handlerC10413uU35 = c4425d218.r.s;
                    InterfaceC3129Yc interfaceC3129Yc = c4425d218.g;
                    if (((BaseGmsClient) interfaceC3129Yc).isConnected() && c4425d218.k.size() == 0) {
                        V30 v30 = c4425d218.i;
                        if ((v30.a.isEmpty() && v30.b.isEmpty()) ? false : true) {
                            c4425d218.o();
                        } else {
                            interfaceC3129Yc.a("Timing out service connection.");
                        }
                    }
                }
                return true;
            case 14:
                X5.a(message.obj);
                throw null;
            case 15:
                C4768e21 c4768e21 = (C4768e21) message.obj;
                if (this.o.containsKey(c4768e21.a)) {
                    C4425d21 c4425d219 = (C4425d21) this.o.get(c4768e21.a);
                    if (c4425d219.o.contains(c4768e21) && !c4425d219.n) {
                        if (((BaseGmsClient) c4425d219.g).isConnected()) {
                            c4425d219.j();
                        } else {
                            c4425d219.d();
                        }
                    }
                }
                return true;
            case 16:
                C4768e21 c4768e212 = (C4768e21) message.obj;
                if (this.o.containsKey(c4768e212.a)) {
                    C4425d21 c4425d2110 = (C4425d21) this.o.get(c4768e212.a);
                    if (c4425d2110.o.remove(c4768e212)) {
                        C5800h21 c5800h212 = c4425d2110.r;
                        c5800h212.s.removeMessages(15, c4768e212);
                        c5800h212.s.removeMessages(16, c4768e212);
                        Feature feature = c4768e212.b;
                        LinkedList<AbstractC5994hd> linkedList = c4425d2110.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (AbstractC5994hd abstractC5994hd2 : linkedList) {
                            if ((abstractC5994hd2 instanceof AbstractC3932bd) && (f = ((AbstractC3932bd) abstractC5994hd2).f(c4425d2110)) != null) {
                                int length = f.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        i4 = -1;
                                    } else if (!W82.a(f[i4], feature)) {
                                        i4++;
                                    }
                                }
                                if (i4 >= 0) {
                                    arrayList.add(abstractC5994hd2);
                                }
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            AbstractC5994hd abstractC5994hd3 = (AbstractC5994hd) it3.next();
                            linkedList.remove(abstractC5994hd3);
                            abstractC5994hd3.c(new T14(feature));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.h;
                if (telemetryData != null) {
                    if (telemetryData.a > 0 || b()) {
                        if (this.i == null) {
                            this.i = new C7454lr1(this.j);
                        }
                        this.i.f(telemetryData);
                    }
                    this.h = null;
                }
                return true;
            case 18:
                C3557aX1 c3557aX1 = (C3557aX1) message.obj;
                long j = c3557aX1.c;
                MethodInvocation methodInvocation = c3557aX1.a;
                int i5 = c3557aX1.b;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i5, Arrays.asList(methodInvocation));
                    if (this.i == null) {
                        this.i = new C7454lr1(this.j);
                    }
                    this.i.f(telemetryData2);
                } else {
                    TelemetryData telemetryData3 = this.h;
                    HandlerC10413uU3 handlerC10413uU36 = this.s;
                    if (telemetryData3 != null) {
                        List list = telemetryData3.g;
                        if (telemetryData3.a != i5 || (list != null && list.size() >= c3557aX1.d)) {
                            handlerC10413uU36.removeMessages(17);
                            TelemetryData telemetryData4 = this.h;
                            if (telemetryData4 != null) {
                                if (telemetryData4.a > 0 || b()) {
                                    if (this.i == null) {
                                        this.i = new C7454lr1(this.j);
                                    }
                                    this.i.f(telemetryData4);
                                }
                                this.h = null;
                            }
                        } else {
                            TelemetryData telemetryData5 = this.h;
                            if (telemetryData5.g == null) {
                                telemetryData5.g = new ArrayList();
                            }
                            telemetryData5.g.add(methodInvocation);
                        }
                    }
                    if (this.h == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(methodInvocation);
                        this.h = new TelemetryData(i5, arrayList2);
                        handlerC10413uU36.sendMessageDelayed(handlerC10413uU36.obtainMessage(17), c3557aX1.c);
                    }
                }
                return true;
            case 19:
                this.g = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }

    public final boolean g(int i, ConnectionResult connectionResult) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent f;
        Boolean bool;
        C8543p11 c8543p11 = this.k;
        Context context = this.j;
        c8543p11.getClass();
        synchronized (AbstractC6405io1.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC6405io1.a;
            if (context2 != null && (bool = AbstractC6405io1.b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            } else {
                AbstractC6405io1.b = null;
                if (AbstractC0758Fv2.a()) {
                    isInstantApp = applicationContext.getPackageManager().isInstantApp();
                    AbstractC6405io1.b = Boolean.valueOf(isInstantApp);
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        AbstractC6405io1.b = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        AbstractC6405io1.b = Boolean.FALSE;
                    }
                }
                AbstractC6405io1.a = applicationContext;
                booleanValue = AbstractC6405io1.b.booleanValue();
            }
        }
        if (booleanValue) {
            return false;
        }
        if (!connectionResult.s1()) {
            f = c8543p11.f(connectionResult.g, context, null);
        } else {
            f = connectionResult.h;
        }
        if (f == null) {
            return false;
        }
        int i2 = connectionResult.g;
        int i3 = GoogleApiActivity.g;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", f);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        c8543p11.l(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728 | AbstractC4362cr2.a));
        return true;
    }

    public final void d(int i, ConnectionResult connectionResult) {
        if (g(i, connectionResult)) {
            return;
        }
        HandlerC10413uU3 handlerC10413uU3 = this.s;
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(5, i, 0, connectionResult));
    }

    public static Status h(C0540Ee c0540Ee, ConnectionResult connectionResult) {
        return new Status(1, 17, IR0.a("API: ", c0540Ee.b.c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.h, connectionResult);
    }
}
