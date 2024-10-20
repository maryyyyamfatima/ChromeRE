package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025Hx extends AbstractC0204Bo3 {
    public static final Object[] l = new Object[0];
    public static final C0895Gx[] m = new C0895Gx[0];
    public static final C0895Gx[] n = new C0895Gx[0];
    public final AtomicReference a;
    public final AtomicReference g;
    public final Lock h;
    public final Lock i;
    public final AtomicReference j;
    public long k;

    public static C1025Hx j(C7188l43 c7188l43) {
        C1025Hx c1025Hx = new C1025Hx();
        AtomicReference atomicReference = c1025Hx.a;
        if (c7188l43 == null) {
            throw new NullPointerException("defaultValue is null");
        }
        atomicReference.lazySet(c7188l43);
        return c1025Hx;
    }

    public C1025Hx() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.h = reentrantReadWriteLock.readLock();
        this.i = reentrantReadWriteLock.writeLock();
        this.g = new AtomicReference(m);
        this.a = new AtomicReference();
        this.j = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:            r8 = r8.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:            if (r8 == null) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:            r1 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0093, code lost:            if (r1 >= 4) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0095, code lost:            r3 = r8[r1];     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0097, code lost:            if (r3 != null) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:            if (r0.test(r3) == false) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a1, code lost:            r1 = r1 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a4, code lost:            r8 = r8[4];     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.X82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.InterfaceC11128wa2 r8) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1025Hx.i(wa2):void");
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (this.j.get() != null) {
            interfaceC6416iq0.dispose();
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.j.get() != null) {
            return;
        }
        Lock lock = this.i;
        lock.lock();
        this.k++;
        this.a.lazySet(obj);
        lock.unlock();
        for (C0895Gx c0895Gx : (C0895Gx[]) this.g.get()) {
            c0895Gx.a(this.k, obj);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        int i;
        boolean z;
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        AtomicReference atomicReference = this.j;
        while (true) {
            if (!atomicReference.compareAndSet(null, th)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            W62 w62 = new W62(th);
            AtomicReference atomicReference2 = this.g;
            C0895Gx[] c0895GxArr = n;
            C0895Gx[] c0895GxArr2 = (C0895Gx[]) atomicReference2.getAndSet(c0895GxArr);
            if (c0895GxArr2 != c0895GxArr) {
                Lock lock = this.i;
                lock.lock();
                this.k++;
                this.a.lazySet(w62);
                lock.unlock();
            }
            for (C0895Gx c0895Gx : c0895GxArr2) {
                c0895Gx.a(this.k, w62);
            }
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        int i;
        boolean z;
        AtomicReference atomicReference = this.j;
        YD0 yd0 = ZD0.a;
        while (true) {
            if (!atomicReference.compareAndSet(null, yd0)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            X62 x62 = X62.a;
            AtomicReference atomicReference2 = this.g;
            C0895Gx[] c0895GxArr = n;
            C0895Gx[] c0895GxArr2 = (C0895Gx[]) atomicReference2.getAndSet(c0895GxArr);
            if (c0895GxArr2 != c0895GxArr) {
                Lock lock = this.i;
                lock.lock();
                this.k++;
                this.a.lazySet(x62);
                lock.unlock();
            }
            for (C0895Gx c0895Gx : c0895GxArr2) {
                c0895Gx.a(this.k, x62);
            }
        }
    }

    public final boolean k() {
        return this.a.get() == X62.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(C0895Gx c0895Gx) {
        boolean z;
        C0895Gx[] c0895GxArr;
        do {
            AtomicReference atomicReference = this.g;
            C0895Gx[] c0895GxArr2 = (C0895Gx[]) atomicReference.get();
            int length = c0895GxArr2.length;
            if (length == 0) {
                return;
            }
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c0895GxArr2[i] == c0895Gx) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c0895GxArr = m;
            } else {
                C0895Gx[] c0895GxArr3 = new C0895Gx[length - 1];
                System.arraycopy(c0895GxArr2, 0, c0895GxArr3, 0, i);
                System.arraycopy(c0895GxArr2, i + 1, c0895GxArr3, i, (length - i) - 1);
                c0895GxArr = c0895GxArr3;
            }
            while (true) {
                if (atomicReference.compareAndSet(c0895GxArr2, c0895GxArr)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != c0895GxArr2) {
                    break;
                }
            }
        } while (!z);
    }
}
