package org.chromium.base;

import J.N;
import android.app.Activity;
import defpackage.C1535Lv0;
import defpackage.RT3;
import defpackage.UT3;
import defpackage.WT3;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TraceEvent implements AutoCloseable {
    public static volatile boolean g;
    public static final AtomicBoolean h = new AtomicBoolean();
    public static final AtomicBoolean i = new AtomicBoolean();
    public static boolean j;
    public static RT3 k;
    public final String a;

    public static void dumpViewHierarchy(long j2) {
        boolean z;
        synchronized (ApplicationStatus.a) {
            z = ApplicationStatus.b != 0;
        }
        if (z) {
            Iterator it = ApplicationStatus.b().iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) it.next();
                WT3.a(0, activity.getWindow().getDecorView().getRootView(), N.MwX2YEhL(activity.getClass().getName(), j2));
            }
        }
    }

    public static void j(long j2, String str) {
        if (EarlyTraceEvent.e()) {
            C1535Lv0 c1535Lv0 = new C1535Lv0(j2, str, true);
            synchronized (EarlyTraceEvent.d) {
                if (EarlyTraceEvent.e()) {
                    EarlyTraceEvent.f.add(c1535Lv0);
                }
            }
        }
        if (g) {
            N.MHopMqLX(str, j2);
            return;
        }
        RT3 rt3 = k;
        if (rt3 != null) {
            int i2 = (int) j2;
            if (rt3.m) {
                try {
                    rt3.e.invoke(rt3.a, Long.valueOf(rt3.l), str, Integer.valueOf(i2));
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void e(long j2, String str) {
        if (EarlyTraceEvent.e()) {
            C1535Lv0 c1535Lv0 = new C1535Lv0(j2, str, false);
            synchronized (EarlyTraceEvent.d) {
                if (EarlyTraceEvent.e()) {
                    EarlyTraceEvent.f.add(c1535Lv0);
                }
            }
        }
        if (g) {
            N.MffNhCLU(str, j2);
            return;
        }
        RT3 rt3 = k;
        if (rt3 != null) {
            int i2 = (int) j2;
            if (rt3.m) {
                try {
                    rt3.f.invoke(rt3.a, Long.valueOf(rt3.l), str, Integer.valueOf(i2));
                } catch (Exception unused) {
                }
            }
        }
    }

    public TraceEvent(String str, String str2) {
        this.a = str;
        b(str, str2);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        c(this.a);
    }

    public static TraceEvent i(String str, String str2) {
        if (EarlyTraceEvent.e() || g) {
            return new TraceEvent(str, str2);
        }
        return null;
    }

    public static void setEnabled(boolean z) {
        if (z) {
            EarlyTraceEvent.b();
        }
        if (g != z) {
            g = z;
            RT3 rt3 = k;
            if (rt3 == null || !rt3.k.get()) {
                ThreadUtils.c().setMessageLogging(z ? UT3.a : null);
            }
        }
        if (i.get()) {
            WT3.b();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        j = z;
    }

    public static void f(String str) {
        if (g) {
            N.ML40H8ed(str, null);
        }
    }

    public static void h(String str, String str2) {
        if (g) {
            N.ML40H8ed(str, str2);
        }
    }

    public static void b(String str, String str2) {
        EarlyTraceEvent.a(str, false);
        if (g) {
            N.M9XfPu17(str, str2);
            return;
        }
        RT3 rt3 = k;
        if (rt3 != null && rt3.m) {
            try {
                rt3.c.invoke(rt3.a, Long.valueOf(rt3.l), str);
            } catch (Exception unused) {
            }
        }
    }

    public static void c(String str) {
        EarlyTraceEvent.f(str, false);
        if (g) {
            N.Mw73xTww(str, null);
            return;
        }
        RT3 rt3 = k;
        if (rt3 != null && rt3.m) {
            try {
                rt3.d.invoke(rt3.a, Long.valueOf(rt3.l));
            } catch (Exception unused) {
            }
        }
    }
}
