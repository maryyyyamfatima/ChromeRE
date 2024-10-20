package org.chromium.base;

import J.N;
import defpackage.AX;
import defpackage.C1535Lv0;
import defpackage.C1665Mv0;
import defpackage.T60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EarlyTraceEvent {
    public static volatile int a;
    public static volatile boolean b;
    public static boolean c;
    public static final Object d = new Object();
    public static ArrayList e;
    public static ArrayList f;

    public static void setBackgroundStartupTracingFlag(boolean z) {
        T60.a.edit().putBoolean("bg_startup_tracing", z).apply();
    }

    public static void g() {
        if (b) {
            Object obj = d;
            synchronized (obj) {
                if (AX.e().g("trace-early-java-in-child")) {
                    if (a == 0) {
                        d();
                    }
                } else {
                    synchronized (obj) {
                        a = 0;
                        e = null;
                        f = null;
                    }
                }
            }
        }
    }

    public static void d() {
        synchronized (d) {
            if (a != 0) {
                return;
            }
            e = new ArrayList();
            f = new ArrayList();
            a = 1;
        }
    }

    public static void b() {
        synchronized (d) {
            if (e()) {
                if (!e.isEmpty()) {
                    c(e);
                    e.clear();
                }
                if (!f.isEmpty()) {
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        C1535Lv0 c1535Lv0 = (C1535Lv0) it.next();
                        boolean z = c1535Lv0.a;
                        long j = c1535Lv0.d;
                        long j2 = c1535Lv0.c;
                        String str = c1535Lv0.b;
                        if (z) {
                            N.M_Gv8TwM(str, j2, j);
                        } else {
                            N.MrKsqeCD(str, j2, j);
                        }
                    }
                    f.clear();
                }
                a = 2;
                e = null;
                f = null;
            }
        }
    }

    public static boolean e() {
        return a == 1;
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return c;
    }

    public static void a(String str, boolean z) {
        if (e()) {
            C1665Mv0 c1665Mv0 = new C1665Mv0(str, true, z);
            synchronized (d) {
                if (e()) {
                    e.add(c1665Mv0);
                }
            }
        }
    }

    public static void f(String str, boolean z) {
        if (e()) {
            C1665Mv0 c1665Mv0 = new C1665Mv0(str, false, z);
            synchronized (d) {
                if (e()) {
                    e.add(c1665Mv0);
                }
            }
        }
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1665Mv0 c1665Mv0 = (C1665Mv0) it.next();
            boolean z = c1665Mv0.a;
            boolean z2 = c1665Mv0.b;
            if (z) {
                if (!z2) {
                    N.MrWG2uUW(c1665Mv0.c, c1665Mv0.e, c1665Mv0.d, c1665Mv0.f);
                } else {
                    N.M7UXCmoq(c1665Mv0.c, c1665Mv0.e, c1665Mv0.d, c1665Mv0.f);
                }
            } else if (!z2) {
                N.MmyrhqXB(c1665Mv0.c, c1665Mv0.e, c1665Mv0.d, c1665Mv0.f);
            } else {
                N.MRlw2LEn(c1665Mv0.c, c1665Mv0.e, c1665Mv0.d, c1665Mv0.f);
            }
        }
    }
}
