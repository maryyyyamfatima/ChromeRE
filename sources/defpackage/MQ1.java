package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MQ1 {
    public static C11420xQ1 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public MQ1(Context context) {
        this.a = context;
    }

    public static MQ1 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (c == null) {
            c = new C11420xQ1(context.getApplicationContext());
        }
        ArrayList arrayList = c.g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                MQ1 mq1 = (MQ1) ((WeakReference) arrayList.get(size)).get();
                if (mq1 == null) {
                    arrayList.remove(size);
                } else if (mq1.a == context) {
                    return mq1;
                }
            } else {
                MQ1 mq12 = new MQ1(context);
                arrayList.add(new WeakReference(mq12));
                return mq12;
            }
        }
    }

    public static C11420xQ1 c() {
        C0104Au3 c0104Au3;
        C11420xQ1 c11420xQ1 = c;
        if (c11420xQ1 == null) {
            return null;
        }
        if (!c11420xQ1.b) {
            c11420xQ1.b = true;
            int i = Build.VERSION.SDK_INT;
            Context context = c11420xQ1.a;
            if (i >= 30) {
                int i2 = AbstractC6282iS1.a;
                Intent intent = new Intent(context, (Class<?>) AbstractC6282iS1.class);
                intent.setPackage(context.getPackageName());
                c11420xQ1.e = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
            } else {
                c11420xQ1.e = false;
            }
            if (c11420xQ1.e) {
                c11420xQ1.f = new C6267iP1(context, new C10391uQ1(c11420xQ1));
            } else {
                c11420xQ1.f = null;
            }
            if (i >= 24) {
                c0104Au3 = new C10563uu3(context, c11420xQ1);
            } else {
                c0104Au3 = new C0104Au3(context, c11420xQ1);
            }
            c11420xQ1.c = c0104Au3;
            c11420xQ1.p = new NQ1(new RunnableC7990nQ1(c11420xQ1));
            c11420xQ1.a(c11420xQ1.c);
            C6267iP1 c6267iP1 = c11420xQ1.f;
            if (c6267iP1 != null) {
                c11420xQ1.a(c6267iP1);
            }
            C11396xL2 c11396xL2 = new C11396xL2(context, c11420xQ1);
            c11420xQ1.d = c11396xL2;
            if (!c11396xL2.f) {
                c11396xL2.f = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                Handler handler = c11396xL2.c;
                c11396xL2.a.registerReceiver(c11396xL2.g, intentFilter, null, handler);
                handler.post(c11396xL2.h);
            }
        }
        return c;
    }

    public static List f() {
        b();
        C11420xQ1 c2 = c();
        if (c2 == null) {
            return Collections.emptyList();
        }
        return c2.h;
    }

    public static DQ1 g() {
        b();
        return c().f();
    }

    public static void k(DQ1 dq1) {
        if (dq1 == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        b();
        c().k(dq1, 3);
    }

    public static void m(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        C11420xQ1 c2 = c();
        DQ1 c3 = c2.c();
        if (c2.f() != c3) {
            c2.k(c3, i);
        }
    }

    public static boolean i(C6614jQ1 c6614jQ1, int i) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b();
        C11420xQ1 c2 = c();
        c2.getClass();
        if (c6614jQ1.d()) {
            return false;
        }
        if ((i & 2) != 0 || !c2.o) {
            C5245fR1 c5245fR1 = c2.q;
            boolean z = c5245fR1 != null && c5245fR1.b && c2.g();
            ArrayList arrayList = c2.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                DQ1 dq1 = (DQ1) arrayList.get(i2);
                if (((i & 1) != 0 && dq1.d()) || ((z && !dq1.d() && dq1.b() != c2.f) || !dq1.h(c6614jQ1))) {
                }
            }
            return false;
        }
        return true;
    }

    public final void a(C6614jQ1 c6614jQ1, AbstractC6958kQ1 abstractC6958kQ1, int i) {
        C7302lQ1 c7302lQ1;
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (abstractC6958kQ1 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C7302lQ1) arrayList.get(i2)).b == abstractC6958kQ1) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            c7302lQ1 = new C7302lQ1(this, abstractC6958kQ1);
            arrayList.add(c7302lQ1);
        } else {
            c7302lQ1 = (C7302lQ1) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != c7302lQ1.d) {
            c7302lQ1.d = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        c7302lQ1.e = elapsedRealtime;
        C6614jQ1 c6614jQ12 = c7302lQ1.c;
        c6614jQ12.a();
        c6614jQ1.a();
        if (c6614jQ12.b.containsAll(c6614jQ1.b)) {
            z2 = z;
        } else {
            C6272iQ1 c6272iQ1 = new C6272iQ1(c7302lQ1.c);
            c6272iQ1.a(c6614jQ1.c());
            c7302lQ1.c = c6272iQ1.b();
        }
        if (z2) {
            c().m();
        }
    }

    public final void j(AbstractC6958kQ1 abstractC6958kQ1) {
        if (abstractC6958kQ1 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((C7302lQ1) arrayList.get(i)).b == abstractC6958kQ1) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().m();
        }
    }

    public static void l(C11768yR1 c11768yR1) {
        b();
        C11420xQ1 c2 = c();
        c2.E = c11768yR1;
        C10048tQ1 c10048tQ1 = c11768yR1 != null ? new C10048tQ1(c2, c11768yR1) : null;
        C10048tQ1 c10048tQ12 = c2.D;
        if (c10048tQ12 != null) {
            c10048tQ12.a();
        }
        c2.D = c10048tQ1;
        if (c10048tQ1 != null) {
            c2.n();
        }
    }

    public static MediaSessionCompat$Token e() {
        C11420xQ1 c11420xQ1 = c;
        if (c11420xQ1 != null) {
            C10048tQ1 c10048tQ1 = c11420xQ1.D;
            if (c10048tQ1 == null) {
                C11768yR1 c11768yR1 = c11420xQ1.E;
                if (c11768yR1 != null) {
                    return c11768yR1.a.b;
                }
            } else {
                C11768yR1 c11768yR12 = c10048tQ1.a;
                if (c11768yR12 != null) {
                    return c11768yR12.a.b;
                }
            }
        }
        return null;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static boolean h() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        C5245fR1 c5245fR1 = c().q;
        return c5245fR1 == null || (bundle = c5245fR1.d) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }
}
