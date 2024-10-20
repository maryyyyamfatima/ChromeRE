package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class XG1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(XG1.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new ZG1(8, false);

    public final int c() {
        return ((ZG1) this._cur).c();
    }

    public final void b() {
        while (true) {
            ZG1 zg1 = (ZG1) this._cur;
            if (zg1.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            ZG1 e = zg1.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, zg1, e) && atomicReferenceFieldUpdater.get(this) == zg1) {
            }
        }
    }

    public final boolean a(Object obj) {
        while (true) {
            ZG1 zg1 = (ZG1) this._cur;
            int a2 = zg1.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                ZG1 e = zg1.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, zg1, e) && atomicReferenceFieldUpdater.get(this) == zg1) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final Object d() {
        while (true) {
            ZG1 zg1 = (ZG1) this._cur;
            Object f = zg1.f();
            if (f != ZG1.g) {
                return f;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            ZG1 e = zg1.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, zg1, e) && atomicReferenceFieldUpdater.get(this) == zg1) {
            }
        }
    }
}
