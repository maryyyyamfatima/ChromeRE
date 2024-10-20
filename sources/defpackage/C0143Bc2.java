package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143Bc2 {
    public final Runnable a;
    public final ArrayDeque b = new ArrayDeque();

    public C0143Bc2(Runnable runnable) {
        this.a = runnable;
    }

    public final C0013Ac2 b(AbstractC11826yc2 abstractC11826yc2) {
        this.b.add(abstractC11826yc2);
        C0013Ac2 c0013Ac2 = new C0013Ac2(this, abstractC11826yc2);
        abstractC11826yc2.b.add(c0013Ac2);
        return c0013Ac2;
    }

    public final void a(JA1 ja1, AbstractC11826yc2 abstractC11826yc2) {
        LA1 Z = ja1.Z();
        if (Z.b == EnumC11683yA1.DESTROYED) {
            return;
        }
        abstractC11826yc2.b.add(new C12169zc2(this, Z, abstractC11826yc2));
    }

    public final void c() {
        Iterator descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC11826yc2 abstractC11826yc2 = (AbstractC11826yc2) descendingIterator.next();
            if (abstractC11826yc2.a) {
                abstractC11826yc2.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
