package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class A0 {
    public transient C11964z0 a;

    public abstract C11964z0 a();

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract C3972bj3 d();

    public final void c(A0 a0) {
        Iterator it = a0.a().iterator();
        while (true) {
            C2773Vi3 c2773Vi3 = (C2773Vi3) it;
            if (!c2773Vi3.hasNext()) {
                return;
            }
            AE3 ae3 = (AE3) ((AbstractC12048zE3) c2773Vi3.next());
            b(ae3.a, ae3.g, ae3.h);
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return d().toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            return a().equals(((A0) obj).a());
        }
        return false;
    }
}
