package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3471aG0 {
    public final C10093tZ1 a;
    public final Object b;
    public final HashSet c = new HashSet();

    public C3471aG0(C10093tZ1 c10093tZ1, Object obj) {
        this.a = c10093tZ1;
        this.b = obj;
    }

    public final void d() {
        HashSet hashSet = this.c;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.a.g(((Long) it.next()).longValue());
        }
        hashSet.clear();
    }

    public final void a(long j, boolean z) {
        if (c(j)) {
            throw new IllegalStateException("Cannot acquire the same reference more than once.");
        }
        this.c.add(Long.valueOf(j));
        C10093tZ1 c10093tZ1 = this.a;
        if (!z) {
            c10093tZ1.a(j);
        } else {
            c10093tZ1.a(j);
            c10093tZ1.c.f(j);
        }
    }

    public final void e(long j, boolean z) {
        Integer num;
        if (!c(j)) {
            throw new IllegalStateException("Trying to release a reference that wasn't acquired.");
        }
        this.c.remove(Long.valueOf(j));
        C10093tZ1 c10093tZ1 = this.a;
        if (!z) {
            c10093tZ1.g(j);
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = !c10093tZ1.f || ((num = (Integer) c10093tZ1.a.d(j)) != null && num.intValue() > 0);
        c10093tZ1.g(j);
        if (z4) {
            if (c10093tZ1.f) {
                Integer num2 = (Integer) c10093tZ1.a.d(j);
                if (num2 != null && num2.intValue() > 0) {
                    z2 = true;
                }
                z3 = z2;
            }
            if (z3) {
                return;
            }
            c10093tZ1.c.b(j);
        }
    }

    public final boolean c(long j) {
        return this.c.contains(Long.valueOf(j));
    }

    public final J91 b() {
        C11122wZ1 a = this.a.c.a();
        if (a != null) {
            return (J91) a.a;
        }
        return null;
    }
}
