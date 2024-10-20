package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nz0 */
/* loaded from: classes.dex */
public final class C8187nz0 extends AbstractC6125hz0 {
    public final /* synthetic */ C7843mz0 a;

    public C8187nz0(C7843mz0 c7843mz0) {
        this.a = c7843mz0;
    }

    @Override // defpackage.AbstractC6125hz0
    public final void a() {
        AbstractC8530oz0.b = true;
        C7843mz0 c7843mz0 = this.a;
        ReentrantReadWriteLock reentrantReadWriteLock = c7843mz0.a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            c7843mz0.b.remove(this);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
