package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FE implements InterfaceC9911t04 {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock(false);
    public HashMap b = new HashMap();
    public final AtomicInteger c = new AtomicInteger();
    public ArrayList d = new ArrayList();
    public int e;
    public InterfaceC9911t04 f;

    public final void g(Map map, int i) {
        int size;
        int size2 = map.size();
        int i2 = 0;
        for (DE de : map.values()) {
            InterfaceC9911t04 interfaceC9911t04 = this.f;
            synchronized (de) {
                int i3 = de.a;
                if (i3 == 1) {
                    for (int i4 = 0; i4 < de.f.size(); i4++) {
                        interfaceC9911t04.a(de.b, ((Integer) de.f.get(i4)).intValue() != 0);
                    }
                } else if (i3 == 2) {
                    for (int i5 = 0; i5 < de.f.size(); i5++) {
                        interfaceC9911t04.c(((Integer) de.f.get(i5)).intValue(), de.c, de.d, de.e, de.b);
                    }
                } else if (i3 == 3) {
                    for (int i6 = 0; i6 < de.f.size(); i6++) {
                        interfaceC9911t04.e(((Integer) de.f.get(i6)).intValue(), de.c, de.d, de.e, de.b);
                    }
                } else if (i3 == 4) {
                    for (int i7 = 0; i7 < de.f.size(); i7++) {
                        interfaceC9911t04.d(((Integer) de.f.get(i7)).intValue(), de.b);
                    }
                }
                size = de.f.size();
                de.f.clear();
            }
            i2 += size;
        }
        AbstractC4851eH1.d("CachingUmaRecorder", "Flushed %d samples from %d histograms.", Integer.valueOf(i2), Integer.valueOf(size2));
        this.f.c(i, 1, 1000000, 50, "UMA.JavaCachingRecorder.DroppedHistogramSampleCount");
        this.f.c(size2, 1, 100000, 50, "UMA.JavaCachingRecorder.FlushedHistogramCount");
        this.f.c(i2 + i, 1, 1000000, 50, "UMA.JavaCachingRecorder.InputHistogramSampleCount");
    }

    public final void h(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EE ee = (EE) it.next();
            this.f.b(ee.b, ee.a);
        }
        this.f.c(i, 1, 1000, 50, "UMA.JavaCachingRecorder.DroppedUserActionCount");
        this.f.c(list.size() + i, 1, 10000, 50, "UMA.JavaCachingRecorder.InputUserActionCount");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r10, java.lang.String r11, int r12, int r13, int r14, int r15) {
        /*
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            t04 r1 = r9.f     // Catch: java.lang.Throwable -> La9
            java.util.concurrent.atomic.AtomicInteger r2 = r9.c
            if (r1 == 0) goto L13
            r9.i(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> La9
            goto L2f
        L13:
            java.util.HashMap r1 = r9.b     // Catch: java.lang.Throwable -> La9
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> La9
            DE r1 = (defpackage.DE) r1     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto L26
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.unlock()
            r1 = 0
            goto L37
        L26:
            boolean r1 = r1.a(r12)     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto L2f
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> La9
        L2f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.unlock()
            r1 = 1
        L37:
            if (r1 == 0) goto L3a
            return
        L3a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.writeLock()
            r1.lock()
            t04 r1 = r9.f     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto L7e
            java.util.HashMap r1 = r9.b     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> La0
            DE r1 = (defpackage.DE) r1     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto L6d
            java.util.HashMap r1 = r9.b     // Catch: java.lang.Throwable -> La0
            int r1 = r1.size()     // Catch: java.lang.Throwable -> La0
            r3 = 256(0x100, float:3.59E-43)
            if (r1 < r3) goto L5d
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> La0
            goto L76
        L5d:
            DE r1 = new DE     // Catch: java.lang.Throwable -> La0
            r3 = r1
            r4 = r10
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La0
            java.util.HashMap r10 = r9.b     // Catch: java.lang.Throwable -> La0
            r10.put(r11, r1)     // Catch: java.lang.Throwable -> La0
        L6d:
            boolean r10 = r1.a(r12)     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto L76
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> La0
        L76:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r10 = r0.writeLock()
            r10.unlock()
            return
        L7e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()     // Catch: java.lang.Throwable -> La0
            r1.lock()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.writeLock()
            r1.unlock()
            r9.i(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r0.readLock()
            r10.unlock()
            return
        L97:
            r10 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r0.readLock()
            r11.unlock()
            throw r10
        La0:
            r10 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r0.writeLock()
            r11.unlock()
            throw r10
        La9:
            r10 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r0.readLock()
            r11.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FE.f(int, java.lang.String, int, int, int, int):void");
    }

    public final void i(int i, String str, int i2, int i3, int i4, int i5) {
        if (i == 1) {
            this.f.a(str, i2 != 0);
            return;
        }
        if (i == 2) {
            this.f.c(i2, i3, i4, i5, str);
        } else if (i == 3) {
            this.f.e(i2, i3, i4, i5, str);
        } else {
            if (i == 4) {
                this.f.d(i2, str);
                return;
            }
            throw new UnsupportedOperationException(AbstractC9076qb1.a("Unknown histogram type ", i));
        }
    }

    @Override // defpackage.InterfaceC9911t04
    public final void a(String str, boolean z) {
        f(1, str, z ? 1 : 0, 0, 0, 0);
    }

    @Override // defpackage.InterfaceC9911t04
    public final void c(int i, int i2, int i3, int i4, String str) {
        f(2, str, i, i2, i3, i4);
    }

    @Override // defpackage.InterfaceC9911t04
    public final void e(int i, int i2, int i3, int i4, String str) {
        f(3, str, i, i2, i3, i4);
    }

    @Override // defpackage.InterfaceC9911t04
    public final void d(int i, String str) {
        f(4, str, i, 0, 0, 0);
    }

    @Override // defpackage.InterfaceC9911t04
    public final void b(long j, String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            InterfaceC9911t04 interfaceC9911t04 = this.f;
            if (interfaceC9911t04 != null) {
                interfaceC9911t04.b(j, str);
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (this.f == null) {
                    if (this.d.size() < 256) {
                        this.d.add(new EE(str, j));
                    } else {
                        this.e++;
                    }
                } else {
                    reentrantReadWriteLock.readLock().lock();
                    try {
                        this.f.b(j, str);
                    } finally {
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
        }
    }
}
