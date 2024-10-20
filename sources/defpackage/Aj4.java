package defpackage;

import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Aj4 {
    public static final long n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService o = null;
    public static final Object p = new Object();
    public static volatile C11870yj4 q = new C11870yj4();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public C11916yr2 h;
    public final C9808sj0 i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Aj4(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Aj4.<init>(android.content.Context):void");
    }

    public final void a(long j) {
        this.l.incrementAndGet();
        q.getClass();
        long max = Math.max(Math.min(Long.MAX_VALUE, n), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        boolean z = max == j;
        synchronized (this.a) {
            if (!c()) {
                q.getClass();
                q.getClass();
                this.h = C11916yr2.a;
                this.b.acquire();
                this.i.getClass();
                SystemClock.elapsedRealtime();
            }
            this.c++;
            if (this.g) {
                TextUtils.isEmpty(null);
            }
            b(null);
            g(max, z);
        }
    }

    public final void d() {
        Runnable runnable;
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", this.j + " release without a matched acquire!");
        }
        synchronized (this.a) {
            if (this.g) {
                TextUtils.isEmpty(null);
            }
            if (!this.k.containsKey(null)) {
                Log.w("WakeLock", this.j + " counter does not exist");
            } else {
                HashMap hashMap = this.k;
                C12213zj4 c12213zj4 = (C12213zj4) hashMap.get(null);
                if (c12213zj4 != null) {
                    boolean z = true;
                    int i = c12213zj4.a - 1;
                    c12213zj4.a = i;
                    if (i == 0 && (runnable = c12213zj4.b) != null) {
                        runnable.run();
                        c12213zj4.b = null;
                    }
                    if (c12213zj4.a != 0) {
                        z = false;
                    }
                    if (z) {
                        hashMap.remove(null);
                    }
                }
            }
            f();
        }
    }

    public final void e() {
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:            if (r7.h != null) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:            r7.h = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:            if (r7.h != null) goto L39;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            boolean r1 = r7.c()     // Catch: java.lang.Throwable -> Lbc
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        Lb:
            boolean r1 = r7.g     // Catch: java.lang.Throwable -> Lbc
            r2 = 0
            if (r1 == 0) goto L17
            int r1 = r7.c     // Catch: java.lang.Throwable -> Lbc
            int r1 = r1 + (-1)
            r7.c = r1     // Catch: java.lang.Throwable -> Lbc
            goto L19
        L17:
            r7.c = r2     // Catch: java.lang.Throwable -> Lbc
        L19:
            int r1 = r7.c     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        L1f:
            r7.e()     // Catch: java.lang.Throwable -> Lbc
            java.util.HashMap r1 = r7.k     // Catch: java.lang.Throwable -> Lbc
            java.util.Collection r3 = r1.values()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lbc
        L2c:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lbc
            r5 = 0
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lbc
            zj4 r4 = (defpackage.C12213zj4) r4     // Catch: java.lang.Throwable -> Lbc
            r4.a = r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.Runnable r6 = r4.b     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto L2c
            r6.run()     // Catch: java.lang.Throwable -> Lbc
            r4.b = r5     // Catch: java.lang.Throwable -> Lbc
            goto L2c
        L45:
            r1.clear()     // Catch: java.lang.Throwable -> Lbc
            java.util.concurrent.ScheduledFuture r1 = r7.d     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L55
            r1.cancel(r2)     // Catch: java.lang.Throwable -> Lbc
            r7.d = r5     // Catch: java.lang.Throwable -> Lbc
            r1 = 0
            r7.e = r1     // Catch: java.lang.Throwable -> Lbc
        L55:
            yj4 r1 = defpackage.Aj4.q     // Catch: java.lang.Throwable -> Lbc
            r1.getClass()     // Catch: java.lang.Throwable -> Lbc
            android.os.PowerManager$WakeLock r1 = r7.b     // Catch: java.lang.Throwable -> Lbc
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto La2
            android.os.PowerManager$WakeLock r1 = r7.b     // Catch: java.lang.Throwable -> L6c java.lang.RuntimeException -> L6e
            r1.release()     // Catch: java.lang.Throwable -> L6c java.lang.RuntimeException -> L6e
            yr2 r1 = r7.h     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto Lba
            goto L97
        L6c:
            r1 = move-exception
            goto L9b
        L6e:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L6c
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L9a
            java.lang.String r2 = "WakeLock"
            java.lang.String r3 = r7.j     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L6c
            r4.append(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = " failed to release!"
            r4.append(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L6c
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L6c
            yr2 r1 = r7.h     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto Lba
        L97:
            r7.h = r5     // Catch: java.lang.Throwable -> Lbc
            goto Lba
        L9a:
            throw r1     // Catch: java.lang.Throwable -> L6c
        L9b:
            yr2 r2 = r7.h     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto La1
            r7.h = r5     // Catch: java.lang.Throwable -> Lbc
        La1:
            throw r1     // Catch: java.lang.Throwable -> Lbc
        La2:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r7.j     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r3.<init>()     // Catch: java.lang.Throwable -> Lbc
            r3.append(r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = " should be held!"
            r3.append(r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lbc
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lbc
        Lba:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        Lbc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Aj4.f():void");
    }

    public final void g(long j, boolean z) {
        this.i.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE - elapsedRealtime > j ? elapsedRealtime + j : Long.MAX_VALUE;
        if (j2 > this.e) {
            this.e = j2;
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.d = this.m.schedule(new Runnable() { // from class: xj4
                @Override // java.lang.Runnable
                public final void run() {
                    Aj4 aj4 = Aj4.this;
                    synchronized (aj4.a) {
                        if (aj4.c()) {
                            Log.e("WakeLock", aj4.j + " ** IS FORCE-RELEASED ON TIMEOUT **");
                            aj4.e();
                            if (aj4.c()) {
                                aj4.c = 1;
                                aj4.f();
                            }
                        }
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        C12213zj4 c12213zj4 = (C12213zj4) this.k.get(str);
        if (c12213zj4 == null) {
            c12213zj4 = new C12213zj4();
            this.k.put(str, c12213zj4);
        }
        q.getClass();
        Runnable runnable = c12213zj4.b;
        if (runnable != null && runnable != null) {
            runnable.run();
            c12213zj4.b = null;
        }
        c12213zj4.b = null;
        c12213zj4.a++;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }
}
