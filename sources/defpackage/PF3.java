package defpackage;

import J.N;
import android.os.Process;
import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PF3 implements MF3 {
    public static final ReferenceQueue j = new ReferenceQueue();
    public static final HashSet k = new HashSet();
    public final QF3 a;
    public final String b;
    public final int c;
    public volatile long d;
    public final NF3 e = new Runnable() { // from class: NF3
        @Override // java.lang.Runnable
        public final void run() {
            PF3.this.g();
        }
    };
    public final Object f = new Object();
    public boolean g;
    public LinkedList h;
    public ArrayList i;

    public static void d() {
        while (true) {
            OF3 of3 = (OF3) j.poll();
            if (of3 == null) {
                return;
            }
            N.MERCiIV8(of3.a);
            HashSet hashSet = k;
            synchronized (hashSet) {
                hashSet.remove(of3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [NF3] */
    public PF3(QF3 qf3, String str, int i) {
        if (!qf3.c) {
            if (!(qf3.d != 0)) {
                QF3 qf32 = new QF3(qf3);
                qf32.c = true;
                qf3 = qf32;
            }
        }
        this.a = qf3;
        this.b = str.concat(".PreNativeTask.run");
        this.c = i;
    }

    @Override // defpackage.MF3
    public final void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // defpackage.MF3
    public final void a(Runnable runnable, long j2) {
        if (this.d == 0) {
            synchronized (this.f) {
                f();
                if (this.d != 0) {
                    N.MGnQU$47(this.d, runnable, j2, runnable.getClass().getName());
                    return;
                }
                if (j2 == 0) {
                    this.h.add(runnable);
                    h();
                } else {
                    this.i.add(new Pair(runnable, Long.valueOf(j2)));
                }
                return;
            }
        }
        N.MGnQU$47(this.d, runnable, j2, runnable.getClass().getName());
    }

    public final void f() {
        if (this.g) {
            return;
        }
        boolean z = true;
        this.g = true;
        synchronized (PostTask.a) {
            ArrayList arrayList = PostTask.b;
            if (arrayList == null) {
                z = false;
            } else {
                arrayList.add(this);
            }
        }
        if (!z) {
            e();
        } else {
            this.h = new LinkedList();
            this.i = new ArrayList();
        }
    }

    public void g() {
        TraceEvent i = TraceEvent.i(this.b, null);
        try {
            synchronized (this.f) {
                LinkedList linkedList = this.h;
                if (linkedList == null) {
                    if (i != null) {
                        i.close();
                        return;
                    }
                    return;
                }
                Runnable runnable = (Runnable) linkedList.poll();
                int i2 = this.a.a;
                if (i2 == 1) {
                    Process.setThreadPriority(0);
                } else if (i2 == 2) {
                    Process.setThreadPriority(-1);
                } else {
                    Process.setThreadPriority(10);
                }
                runnable.run();
                if (i != null) {
                    i.close();
                }
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public void h() {
        PostTask.d.execute(this.e);
    }

    public void e() {
        int i = this.c;
        QF3 qf3 = this.a;
        long M5_IQXaH = N.M5_IQXaH(i, qf3.a, qf3.b, qf3.c, qf3.d, qf3.e);
        synchronized (this.f) {
            try {
                LinkedList linkedList = this.h;
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        Runnable runnable = (Runnable) it.next();
                        N.MGnQU$47(M5_IQXaH, runnable, 0L, runnable.getClass().getName());
                    }
                    this.h = null;
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        N.MGnQU$47(M5_IQXaH, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                    }
                    this.i = null;
                }
                this.d = M5_IQXaH;
            } catch (Throwable th) {
                throw th;
            }
        }
        HashSet hashSet = k;
        synchronized (hashSet) {
            hashSet.add(new OF3(this));
        }
        d();
    }
}
