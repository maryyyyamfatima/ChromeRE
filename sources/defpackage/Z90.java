package defpackage;

import android.util.Log;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Z90 {
    public final String a;
    public final Object b;
    public final C1593Mg3 c;
    public int d;
    public final /* synthetic */ C6663ja0 e;

    public Z90(C6663ja0 c6663ja0, Z90 z90) {
        this(c6663ja0, z90.a);
        synchronized (z90.b) {
            this.d = z90.d;
            C1593Mg3 c1593Mg3 = this.c;
            this.c = z90.c;
            z90.c = c1593Mg3;
            z90.d = 0;
        }
    }

    public Z90(C6663ja0 c6663ja0, String str) {
        this.e = c6663ja0;
        this.b = new Object();
        this.c = new C1593Mg3();
        int i = c6663ja0.b;
        if (c6663ja0.j.containsKey(str)) {
            throw new IllegalStateException(AbstractC4809e90.a("counter/histogram already exists: ", str));
        }
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            for (int i = 0; i < this.c.i(); i++) {
                C3487aJ1 c3487aJ1 = (C3487aJ1) this.c.j(i);
                sb.append(this.c.f(i));
                sb.append(" -> [");
                for (int i2 = 0; i2 < c3487aJ1.k(); i2++) {
                    sb.append(c3487aJ1.h(i2));
                    sb.append(" = ");
                    sb.append(((long[]) c3487aJ1.l(i2))[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void a(long j, C4945ea0 c4945ea0) {
        Integer num;
        boolean z;
        Integer num2;
        if (c4945ea0 == null) {
            c4945ea0 = C6663ja0.q;
        }
        this.e.d.readLock().lock();
        try {
            C4945ea0 c4945ea02 = C6663ja0.r;
            if (c4945ea0 != c4945ea02) {
                num = (Integer) this.e.l.get(c4945ea0);
            } else {
                num = this.e.m;
            }
            if (num == null) {
                z = true;
            } else {
                b(num.intValue(), j);
                z = false;
            }
            if (z) {
                C6663ja0 c6663ja0 = this.e;
                Lock writeLock = c6663ja0.d.writeLock();
                writeLock.lock();
                TreeMap treeMap = c6663ja0.l;
                try {
                    if (c4945ea0 != c4945ea02) {
                        num2 = (Integer) treeMap.get(c4945ea0);
                        if (num2 == null) {
                            num2 = Integer.valueOf(treeMap.size());
                            treeMap.put(c4945ea0, num2);
                        }
                    } else {
                        C4945ea0 c4945ea03 = c6663ja0.k;
                        num2 = (Integer) treeMap.get(c4945ea03);
                        if (num2 == null) {
                            num2 = Integer.valueOf(treeMap.size());
                            treeMap.put(c4945ea03, num2);
                        }
                        c6663ja0.m = num2;
                    }
                    ReentrantReadWriteLock reentrantReadWriteLock = c6663ja0.d;
                    reentrantReadWriteLock.readLock().lock();
                    writeLock.unlock();
                    writeLock = reentrantReadWriteLock.readLock();
                    b(num2.intValue(), j);
                } finally {
                    writeLock.unlock();
                }
            }
            if (this.e.f <= 0 || this.e.h != null) {
                return;
            }
            this.e.b();
        } finally {
            this.e.d.readLock().unlock();
        }
    }

    public final void b(int i, long j) {
        synchronized (this.b) {
            C3487aJ1 c3487aJ1 = (C3487aJ1) this.c.d(i);
            if (c3487aJ1 == null) {
                c3487aJ1 = new C3487aJ1();
                this.c.g(i, c3487aJ1);
            }
            int i2 = this.d;
            int i3 = this.e.b;
            if (i2 >= i3) {
                if (i2 == i3) {
                    Log.i("Counters", "exceeded sample count in " + this.a);
                }
                return;
            }
            this.d = i2 + 1;
            long[] jArr = (long[]) c3487aJ1.d(j);
            if (jArr == null) {
                jArr = new long[]{0};
                c3487aJ1.i(j, jArr);
            }
            jArr[0] = jArr[0] + 1;
            this.e.getClass();
        }
    }
}
