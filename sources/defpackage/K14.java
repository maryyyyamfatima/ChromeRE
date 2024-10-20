package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K14 {
    public final Class a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());

    public K14(Class cls) {
        this.a = cls;
    }

    public final void a(H14 h14, J14 j14) {
        Objects.requireNonNull(h14);
        j14.a.getClass();
        j14.b.getClass();
        if (j14.d.containsKey(this) && !h14.equals(j14.a(this))) {
            c(j14);
        }
        j14.d.put(this, new WeakReference(h14));
        if (e(j14) != null) {
            return;
        }
        this.b.add(j14);
    }

    public final H14 e(J14 j14) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (j14.equals((J14) it.next())) {
                return j14.a(this);
            }
        }
        return null;
    }

    public final void c(J14 j14) {
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            J14 j142 = (J14) it.next();
            if (j14.equals(j142)) {
                d(j142);
            }
        }
    }

    public final void b(H14 h14) {
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            J14 j14 = (J14) it.next();
            if (h14.equals(j14.a(this))) {
                d(j14);
            }
        }
    }

    public final void d(final J14 j14) {
        final H14 h14;
        j14.a.getClass();
        j14.b.getClass();
        WeakReference weakReference = (WeakReference) j14.d.remove(this);
        if (weakReference != null && (h14 = (H14) weakReference.get()) != null) {
            h14.x();
            j14.c.post(new Runnable() { // from class: I14
                @Override // java.lang.Runnable
                public final void run() {
                    j14.getClass();
                    h14.t();
                }
            });
        }
        this.b.remove(j14);
    }
}
