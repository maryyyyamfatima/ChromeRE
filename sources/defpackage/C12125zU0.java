package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zU0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12125zU0 {
    public final float a;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public int c = 60;
    public int d = 0;
    public long e = 0;
    public int f = 0;

    public C12125zU0(float f) {
        this.a = f;
        b();
    }

    public final int a() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            return Math.max(0, this.c);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public final void b() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int a = a();
            this.d = a == 0 ? 0 : Math.max(1, Math.round(this.a / a));
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
