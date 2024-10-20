package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: in3 */
/* loaded from: classes.dex */
public final class C6401in3 implements InterfaceC2131Qk1, Application.ActivityLifecycleCallbacks {
    public static final long o = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ST g;
    public final C3901bX1 h;
    public ScheduledFuture m;
    public final AtomicLong l = new AtomicLong(0);
    public final long i = 100;
    public final long j = o;
    public final boolean k = true;
    public final Object n = new Object();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C6401in3(ST st, ScheduledExecutorService scheduledExecutorService, C3901bX1 c3901bX1) {
        this.g = st;
        this.a = scheduledExecutorService;
        this.h = c3901bX1;
    }

    public final void a() {
        synchronized (this.n) {
            ScheduledFuture scheduledFuture = this.m;
            if (scheduledFuture != null && !scheduledFuture.isDone() && !this.m.isCancelled()) {
                ScheduledFuture scheduledFuture2 = this.m;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (scheduledFuture2.getDelay(timeUnit) > 100) {
                    synchronized (this.n) {
                        ScheduledFuture scheduledFuture3 = this.m;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(false);
                            this.m = null;
                        }
                    }
                    this.m = this.a.schedule(new RunnableC6058hn3(this), 1L, timeUnit);
                }
            }
            this.m = this.a.schedule(new RunnableC6058hn3(this), 1L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (!this.k) {
            return;
        }
        this.l.set(0L);
        ST st = this.g;
        C3901bX1 c3901bX1 = this.h;
        st.getClass();
        c3901bX1.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (c3901bX1.b) {
            Iterator it = c3901bX1.a.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC4592dY0) it.next()).b());
            }
        }
        C5370fn3 c5370fn3 = (C5370fn3) C5714gn3.k.j();
        Iterator it2 = arrayList.iterator();
        while (true) {
            FT ft = null;
            C5026en3 c5026en3 = null;
            if (!it2.hasNext()) {
                C5714gn3 c5714gn3 = (C5714gn3) c5370fn3.j();
                if (c5714gn3.j.size() != 0) {
                    ft = st.a.c(c5714gn3);
                    ft.j = st.b;
                    Iterator it3 = st.c.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        if (ft.a.d.equals(EnumC1717Nf2.j)) {
                            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                        }
                        if (ft.f == null) {
                            ft.f = new ArrayList();
                        }
                        ft.f.add(str);
                    }
                }
                if (ft != null) {
                    ft.c();
                    return;
                }
                return;
            }
            C5279fY0 c5279fY0 = (C5279fY0) it2.next();
            int i = 0;
            if (c5279fY0.d != 0) {
                C3053Xm3 c3053Xm3 = (C3053Xm3) C5026en3.o.j();
                String str2 = c5279fY0.a;
                long b = C3901bX1.b(str2);
                if (c3053Xm3.h) {
                    c3053Xm3.l();
                    c3053Xm3.h = false;
                }
                C5026en3 c5026en32 = (C5026en3) c3053Xm3.g;
                c5026en32.j |= 2;
                c5026en32.l = b;
                C4188cM0[] c4188cM0Arr = c5279fY0.b;
                for (C4188cM0 c4188cM0 : c4188cM0Arr) {
                    long b2 = C3901bX1.b(c4188cM0.a);
                    if (c3053Xm3.h) {
                        c3053Xm3.l();
                        c3053Xm3.h = false;
                    }
                    C5026en3 c5026en33 = (C5026en3) c3053Xm3.g;
                    InterfaceC1247Jp1 interfaceC1247Jp1 = c5026en33.m;
                    if (!((AbstractC7504m0) interfaceC1247Jp1).a) {
                        DI1 di1 = (DI1) interfaceC1247Jp1;
                        int i2 = di1.h;
                        c5026en33.m = di1.c(i2 == 0 ? 10 : i2 * 2);
                    }
                    ((DI1) c5026en33.m).d(b2);
                }
                for (Map.Entry entry : c5279fY0.c.entrySet()) {
                    C3183Ym3 c3183Ym3 = (C3183Ym3) C4683dn3.m.j();
                    C6230iI c6230iI = (C6230iI) entry.getKey();
                    InterfaceC9320rI interfaceC9320rI = (InterfaceC9320rI) entry.getValue();
                    if (c4188cM0Arr.length > 0) {
                        c6230iI.getClass();
                        Object[] objArr = c6230iI.a;
                        ArrayList arrayList2 = new ArrayList(objArr.length);
                        while (i < objArr.length) {
                            C3313Zm3 c3313Zm3 = (C3313Zm3) C3652an3.l.j();
                            Object obj = objArr[i];
                            if (obj instanceof String) {
                                String str3 = (String) obj;
                                if (c3313Zm3.h) {
                                    c3313Zm3.l();
                                    c3313Zm3.h = false;
                                }
                                C3652an3 c3652an3 = (C3652an3) c3313Zm3.g;
                                c3652an3.getClass();
                                str3.getClass();
                                c3652an3.j = 1;
                                c3652an3.k = str3;
                            } else if (obj instanceof Integer) {
                                int intValue = ((Integer) obj).intValue();
                                if (c3313Zm3.h) {
                                    c3313Zm3.l();
                                    c3313Zm3.h = false;
                                }
                                C3652an3 c3652an32 = (C3652an3) c3313Zm3.g;
                                c3652an32.j = 2;
                                c3652an32.k = Integer.valueOf(intValue);
                            } else {
                                if (!(obj instanceof Boolean)) {
                                    throw new IllegalArgumentException("Metric " + str2 + " has field " + i + " with an unexpected value: " + String.valueOf(obj));
                                }
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                if (c3313Zm3.h) {
                                    c3313Zm3.l();
                                    c3313Zm3.h = false;
                                }
                                C3652an3 c3652an33 = (C3652an3) c3313Zm3.g;
                                c3652an33.j = 3;
                                c3652an33.k = Boolean.valueOf(booleanValue);
                            }
                            arrayList2.add((C3652an3) c3313Zm3.j());
                            i++;
                        }
                        if (c3183Ym3.h) {
                            c3183Ym3.l();
                            c3183Ym3.h = false;
                        }
                        C4683dn3 c4683dn3 = (C4683dn3) c3183Ym3.g;
                        InterfaceC1377Kp1 interfaceC1377Kp1 = c4683dn3.k;
                        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                            c4683dn3.k = QX0.r(interfaceC1377Kp1);
                        }
                        InterfaceC1377Kp1 interfaceC1377Kp12 = c4683dn3.k;
                        Charset charset = AbstractC1507Lp1.a;
                        if (arrayList2 instanceof InterfaceC6812jz1) {
                            List e = ((InterfaceC6812jz1) arrayList2).e();
                            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) interfaceC1377Kp12;
                            int size = interfaceC1377Kp12.size();
                            for (Object obj2 : e) {
                                if (obj2 == null) {
                                    String a = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size, " is null.");
                                    int size2 = interfaceC6812jz1.size();
                                    while (true) {
                                        size2--;
                                        if (size2 < size) {
                                            break;
                                        } else {
                                            interfaceC6812jz1.remove(size2);
                                        }
                                    }
                                    throw new NullPointerException(a);
                                }
                                if (obj2 instanceof AbstractC4147cE) {
                                    interfaceC6812jz1.h((AbstractC4147cE) obj2);
                                } else {
                                    interfaceC6812jz1.add((String) obj2);
                                }
                            }
                        } else if (arrayList2 instanceof InterfaceC2337Rz2) {
                            interfaceC1377Kp12.addAll(arrayList2);
                        } else {
                            if (interfaceC1377Kp12 instanceof ArrayList) {
                                ((ArrayList) interfaceC1377Kp12).ensureCapacity(arrayList2.size() + interfaceC1377Kp12.size());
                            }
                            int size3 = interfaceC1377Kp12.size();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                if (next == null) {
                                    String a2 = AbstractC9307rF1.a("Element at index ", interfaceC1377Kp12.size() - size3, " is null.");
                                    int size4 = interfaceC1377Kp12.size();
                                    while (true) {
                                        size4--;
                                        if (size4 < size3) {
                                            break;
                                        } else {
                                            interfaceC1377Kp12.remove(size4);
                                        }
                                    }
                                    throw new NullPointerException(a2);
                                }
                                interfaceC1377Kp12.add(next);
                            }
                        }
                    }
                    W90 w90 = (W90) interfaceC9320rI;
                    w90.getClass();
                    C3996bn3 c3996bn3 = (C3996bn3) C4339cn3.l.j();
                    long j = w90.a;
                    if (c3996bn3.h) {
                        c3996bn3.l();
                        c3996bn3.h = false;
                    }
                    C4339cn3 c4339cn3 = (C4339cn3) c3996bn3.g;
                    c4339cn3.j = 1;
                    c4339cn3.k = Long.valueOf(j);
                    C4339cn3 c4339cn32 = (C4339cn3) c3996bn3.j();
                    if (c3183Ym3.h) {
                        c3183Ym3.l();
                        c3183Ym3.h = false;
                    }
                    C4683dn3 c4683dn32 = (C4683dn3) c3183Ym3.g;
                    c4683dn32.getClass();
                    c4339cn32.getClass();
                    c4683dn32.l = c4339cn32;
                    c4683dn32.j |= 1;
                    if (c3053Xm3.h) {
                        c3053Xm3.l();
                        c3053Xm3.h = false;
                    }
                    C5026en3 c5026en34 = (C5026en3) c3053Xm3.g;
                    C4683dn3 c4683dn33 = (C4683dn3) c3183Ym3.j();
                    c5026en34.getClass();
                    c4683dn33.getClass();
                    InterfaceC1377Kp1 interfaceC1377Kp13 = c5026en34.n;
                    if (!((AbstractC7504m0) interfaceC1377Kp13).a) {
                        c5026en34.n = QX0.r(interfaceC1377Kp13);
                    }
                    c5026en34.n.add(c4683dn33);
                    i = 0;
                }
                c5026en3 = (C5026en3) c3053Xm3.j();
            }
            if (c5026en3 != null) {
                if (c5370fn3.h) {
                    c5370fn3.l();
                    c5370fn3.h = false;
                }
                C5714gn3 c5714gn32 = (C5714gn3) c5370fn3.g;
                c5714gn32.getClass();
                InterfaceC1377Kp1 interfaceC1377Kp14 = c5714gn32.j;
                if (!((AbstractC7504m0) interfaceC1377Kp14).a) {
                    c5714gn32.j = QX0.r(interfaceC1377Kp14);
                }
                c5714gn32.j.add(c5026en3);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.n) {
            b();
            synchronized (this.n) {
                ScheduledFuture scheduledFuture = this.m;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.m = null;
                }
            }
        }
    }
}
