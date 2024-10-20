package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Uu4 extends WeakReference {
    public final int a;

    public Uu4(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Uu4.class) {
            if (this == obj) {
                return true;
            }
            Uu4 uu4 = (Uu4) obj;
            if (this.a == uu4.a && get() == uu4.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
