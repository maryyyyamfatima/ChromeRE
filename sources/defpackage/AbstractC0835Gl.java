package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0835Gl extends AbstractC0668Fd2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0835Gl.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = AbstractC0705Fl.a;

    public abstract void b(Object obj, Object obj2);

    public abstract C2823Vs3 c(Object obj);

    @Override // defpackage.AbstractC0668Fd2
    public final Object a(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        C2823Vs3 c2823Vs3 = AbstractC0705Fl.a;
        if (obj2 == c2823Vs3) {
            C2823Vs3 c = c(obj);
            obj2 = this._consensus;
            if (obj2 == c2823Vs3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c2823Vs3, c)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c2823Vs3) {
                        z = false;
                        break;
                    }
                }
                obj2 = z ? c : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }
}
