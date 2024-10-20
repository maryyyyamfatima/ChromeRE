package org.chromium.base;

import android.app.Activity;
import defpackage.C10836vj;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC11179wj;
import defpackage.InterfaceC11522xj;
import defpackage.InterfaceC12208zj;
import defpackage.RunnableC10493uj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ApplicationStatus {
    public static final Map a = Collections.synchronizedMap(new HashMap());
    public static int b = 0;
    public static Activity c;
    public static InterfaceC11522xj d;
    public static C12157za2 e;
    public static C12157za2 f;
    public static C12157za2 g;

    public static void g(InterfaceC12208zj interfaceC12208zj) {
        if (g == null) {
            g = new C12157za2();
        }
        g.a(interfaceC12208zj);
    }

    public static void a(Activity activity, int i) {
        C10836vj c10836vj;
        C12157za2 c12157za2;
        if (activity == null) {
            throw new IllegalArgumentException("null activity is not supported");
        }
        int i2 = 2;
        if (c == null || i == 1 || i == 3 || i == 2) {
            c = activity;
        }
        int stateForApplication = getStateForApplication();
        Map map = a;
        synchronized (map) {
            if (i == 1) {
                map.put(activity, new C10836vj());
            }
            c10836vj = (C10836vj) map.get(activity);
            c10836vj.a = i;
            if (i == 6) {
                map.remove(activity);
                if (activity == c) {
                    c = null;
                }
            }
            Iterator it = map.values().iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (it.hasNext()) {
                    int i3 = ((C10836vj) it.next()).a;
                    if (i3 != 4 && i3 != 5 && i3 != 6) {
                        i2 = 1;
                        break;
                    } else if (i3 == 4) {
                        z = true;
                    } else if (i3 == 5) {
                        z2 = true;
                    }
                } else if (!z) {
                    i2 = z2 ? 3 : 4;
                }
            }
            b = i2;
        }
        Iterator it2 = c10836vj.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC11179wj) c11814ya2.next()).o(activity, i);
            }
        }
        C12157za2 c12157za22 = e;
        if (c12157za22 != null) {
            Iterator it3 = c12157za22.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it3;
                if (!c11814ya22.hasNext()) {
                    break;
                } else {
                    ((InterfaceC11179wj) c11814ya22.next()).o(activity, i);
                }
            }
        }
        int stateForApplication2 = getStateForApplication();
        if (stateForApplication2 == stateForApplication || (c12157za2 = f) == null) {
            return;
        }
        Iterator it4 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya23 = (C11814ya2) it4;
            if (!c11814ya23.hasNext()) {
                return;
            } else {
                ((InterfaceC11522xj) c11814ya23.next()).n(stateForApplication2);
            }
        }
    }

    public static ArrayList b() {
        ArrayList arrayList;
        Map map = a;
        synchronized (map) {
            arrayList = new ArrayList(map.keySet());
        }
        return arrayList;
    }

    public static int c(Activity activity) {
        C10836vj c10836vj;
        if (activity == null || (c10836vj = (C10836vj) a.get(activity)) == null) {
            return 6;
        }
        return c10836vj.a;
    }

    public static int getStateForApplication() {
        int i;
        synchronized (a) {
            i = b;
        }
        return i;
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    public static void f(InterfaceC11179wj interfaceC11179wj) {
        if (e == null) {
            e = new C12157za2();
        }
        e.a(interfaceC11179wj);
    }

    public static void e(InterfaceC11179wj interfaceC11179wj, Activity activity) {
        ((C10836vj) a.get(activity)).b.a(interfaceC11179wj);
    }

    public static void h(InterfaceC11179wj interfaceC11179wj) {
        C12157za2 c12157za2 = e;
        if (c12157za2 != null) {
            c12157za2.d(interfaceC11179wj);
        }
        Map map = a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((C10836vj) it.next()).b.d(interfaceC11179wj);
            }
        }
    }

    public static void d(InterfaceC11522xj interfaceC11522xj) {
        if (f == null) {
            f = new C12157za2();
        }
        f.a(interfaceC11522xj);
    }

    public static void i(InterfaceC11522xj interfaceC11522xj) {
        C12157za2 c12157za2 = f;
        if (c12157za2 == null) {
            return;
        }
        c12157za2.d(interfaceC11522xj);
    }

    public static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.e(new RunnableC10493uj());
    }
}
